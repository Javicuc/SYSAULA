package Scraping;

import java.io.IOException;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.SQLException;import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
public class SIIAU {
    private String  hostSIIAU = "http://consulta.siiau.udg.mx/wco/sspseca.forma_consulta";  // Host del SIIAU
    private String  formSIIAU = "http://consulta.siiau.udg.mx/wco/sspseca.consulta_oferta"; // Consultas
    private String  _Ciclo;    // ciclop;
    private String  _Centro;   // cup;
    private String  _Carrera;  // majrp;
    private String  _ClaveMat; // crsep;
    private String  _Materia;  // materiap;
    private String  _Hora_Ini; // horaip;
    private String  _Hora_Fin; // horafp;
    private String  _Edificio; // edifp;
    private String  _Aula;     // aulap;
    private String  _Orden;    // ordenp;
    private String  _Mostrar;  // mostrarp;
    private int     _pStart;   // Paginacion

    //private final List<String> _Dia;
    private List<String>       _listEdificios;

    private List<ScrapAula>    listAulas;    // Aulas -> Materias
    private List<ScrapMateria> listMaterias; // Materias
    private List<ScrapEdif>    listHorarios; // Edificios -> Aulas -> Materias
    private ScrapToBD scraptobd;

    public SIIAU() throws IOException {
        //this._Dia = asList("lupM", "mapT", "mipW", "jupR", "vipF", "sapS");
        //this._Dia = asList("lupM");
        //this._listEdificios = asList("DEDV","DEDX","DEDT");
        this._listEdificios = asList("DEDA","DEDCS","DEDD","DEDE","DEDF","DEDG","DEDH","DEDI","DEDK","DEDL","DEDM",
                "DEDN","DEDP","DEDQ","DEDR","DEDS","DEDT","DEDU","DEDV","DEDW","DEDX","DUCT1","DUCT2");
        this._Mostrar  = "500";
        this._Orden    = "0";
        this._Centro   = "D";
        this._Ciclo    = "201710";
        this.listHorarios   = new ArrayList<>();
        this.scraptobd = new ScrapToBD();
    }
    
    public SIIAU(String centro, String ciclo) throws IOException{
        
    }
    
    public void initScrap() throws IOException, SQLException {
        if (getStatusConnectionCode(getHostSIIAU()) == 200) {
            CSVWriter csvEdificio = new CSVWriter(new FileWriter("Edificio.csv"), ',');
            CSVWriter csvAula = new CSVWriter(new FileWriter("Aula.csv"), ',');
            CSVWriter csvMateria = new CSVWriter(new FileWriter("Materia.csv"), ',');
            CSVWriter csvHorario = new CSVWriter(new FileWriter("Horario.csv"), ',');
            CSVWriter csvlhorario = new CSVWriter(new FileWriter("LHorario.csv"), ',');

                for (String edif : _listEdificios) {
                    
                    this.setEdificio(edif);
                    this.listAulas = new ArrayList<>();     // Creamos una lista de aulas por cada recorrido
                    this.listMaterias = new ArrayList<>(); // Creamos una lista de materias por cada recorrido
                    
                    ScrapEdif ded = new ScrapEdif(); // Creamos un nuevo edificio por cada recorrido
                    
                    ded.setNombre(edif);
                    ded.setCentro(getCentro());
                    String path = new File("Edificio.csv").getAbsolutePath();
                    //System.out.println(path);
                    scraptobd.insertEdificioCSV(ded,csvEdificio);
                    //scraptobd.insertEdificio(ded); // Insertamos el objeto edificio en la base de datos
                    
                    System.out.println(edif);
                    
                    boolean isNext = true;
                    setpStart(0);
                    
                    while (isNext) {
                        Document document = getHtmlDocument(getCiclo(), getCentro(), getEdificio(), // Obtenemos el documento
                                getOrden(), getMostrar(), String.valueOf(getpStart())); // con los siguientes parametros
                        Element table = document.select("table").get(0); // Seleccionamos la primera tabla del documento
                        Elements rows = table.select("tr"); // Seleccionamos todas las filas
                        if (rows.size() > 2) { // Si hay más datos después de las cabeceras...
                            for (int i = 2; i < rows.size(); i++) { // Iteramos despues de las cabeceras
                                Element data = rows.get(i); // Guardamos la fila
                                if (data.getElementsByClass("tddatos").hasText() // Si la fila contiene datos y
                                        && data.getElementsByClass("td1").select("td:eq(1)").hasText()) { // si hay horario...
                                    validaData(data); // Validamos la fila y extraemos la
                                }
                            }
                        } else { // Si no hay más datos despues de la cabecera
                            isNext = false;
                        }
                        setpStart(this.getpStart() + 100); // Comprobamos si no hay segunda pagina
                    }
                    assignAulaMateria(csvAula,csvMateria,csvHorario,csvlhorario);            
                    //assignAulaMateria(); // Metodo que vincula las materias(NRC) con su respectiva aula
                    ded.setListAulas(listAulas); // Agregamos la lista de aulas al edificio
                    listHorarios.add(ded); // Agregamos a la lista de edificios
                    
                    //ScrapToBD scraptobd2 = new ScrapToBD(listAulas); // Creamos un nuevo objeto por cada recorrido
                    //Thread t = new Thread(scraptobd2); // El objeto se ejecuta en un nuevo hilo
                    //t.start(); // Inicia el hilo                 
                }
            
            csvEdificio.close();
            csvAula.close();
            csvMateria.close();
            csvHorario.close();
            csvlhorario.close();
            //llenar la base de datos
            scraptobd.Tabla_edificio(new File("Edificio.csv").getAbsolutePath().replace('\\', '/'));
            scraptobd.Tabla_aula(new File("Aula.csv").getAbsolutePath().replace('\\', '/'));
            scraptobd.Tabla_materia(new File("Materia.csv").getAbsolutePath().replace('\\', '/'));
            scraptobd.Tabla_horario(new File("Horario.csv").getAbsolutePath().replace('\\', '/'));
            scraptobd.Tabla_lhorario(new File("LHorario.csv").getAbsolutePath().replace('\\', '/'));  
        } else {
            throw new IOException("Error al generar el documento."); // Crea una excepcion en caso de no generar documento
        }
    }

    private void validaData(Element data){
        if(!data.getElementsByClass("tddatos").select("td:eq(2)").text().isEmpty()){ // Si hay asignatura

            String asig  = data.getElementsByClass("tddatos").select("td:eq(2)").text(); // Obtenemos nombre de la materia
            String nrc   = data.getElementsByClass("tddatos").select("td:eq(0)").get(0).text(); // Obtenemos NRC
            String clave = data.getElementsByClass("tddatos").select("td:eq(1)").get(0).text(); // Obtenemos clave
            /* Obtenemos lista de horas, dias, edificios y aulas en las que se imparte una materia */
            List<String> listHoras = getSelect(data.getElementsByClass("td1"), "td:eq(1)"); 
            List<String> listDias  = getSelect(data.getElementsByClass("td1"), "td:eq(2)");
            List<String> listEdifs = getSelect(data.getElementsByClass("td1"), "td:eq(3)");
            List<String> listAula  = getSelect(data.getElementsByClass("td1"), "td:eq(4)");
            /* Iteramos la cantidad de horarios de la materia */        
            for(int i = 0; i < listHoras.size(); i++){
                if(listEdifs.get(i).contains(getEdificio()) && !listAula.get(i).isEmpty()){
                    // Creamos una materia y un aula por cada recorrido
                    ScrapMateria materia = new ScrapMateria(); 
                    ScrapAula    aula    = new ScrapAula();   
                    // Asignamos los datos en los objetos 
                    materia.setNRC(nrc);
                    materia.setClave(clave);
                    materia.setNombre(asig);
                    materia.setAula(listAula.get(i));
                    materia.setDias(listDias.get(i));
                    materia.setHorario(listHoras.get(i));
                    aula.setEdificio(getEdificio());
                    aula.setNumero(listAula.get(i));
                    // Agregamos la materia en cada lista
                    listMaterias.add(materia);
                    listAulas.add(aula);
                }
            }
        }
    }

    /**
    * Con este método obtenemos los datos de una respectiva selección
    * EJM:
    * 		Data(tddatos)   Select(td:eq(0))    3312404  
    * 		Data(tddatos)   Select(td:eq(2))    SEGURIDAD
    * @param daata
    * @param select
    * @return List<String>
    */
    private List getSelect(Elements data,String select){
        List<String> listObj = new ArrayList<>();
        Elements obj = data.select(select);
        for(int i = 0; i < obj.size(); i++)
            listObj.add(obj.get(i).text().replaceAll("\u00a0",""));
        return listObj;
    }
    /**
    * Con este método asignamos las materias(NRC) a una respectiva aula
    * EJM:
    * 
    *           Aula:   A001    Seguridad, Matematicas, Programacion 
    *           Aula:   A023    Robotica, Algoritmia
    */
    private void assignAulaMateria(CSVWriter Aula,CSVWriter Materia,CSVWriter Horario,CSVWriter Lhorario) {

        listMaterias = deleteDuplicate(listMaterias);
        listAulas = deleteDuplicate(listAulas);
        
        Collections.sort(listAulas, new ScrapAula());
        Collections.sort(listMaterias, new ScrapMateria());
        
        System.out.println(listMaterias.size());
        System.out.println(listAulas.size());

        for (ScrapAula aula : listAulas) {
            String idAula = aula.getEdificio() + aula.getNumero();
            //scraptobd.insertAula(aula);
            scraptobd.insertAulaCsv(aula, Aula);
            for (ScrapMateria mat : listMaterias) {
                if (aula.getNumero().equals(mat.getAula())) {
                    aula.getListMaterias().add(mat);
                    //scraptobd.insertMateriaHorarios(mat, idAula);
                    scraptobd.insertMateriaHorariosCsv(mat, Materia, Horario, Lhorario, idAula);
                }
            }
        }
    }
    
    /**
     * Con este metodo eliminamos duplicados de una lista
     * @return the List
     */
    public List deleteDuplicate(List list){
        Set linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(list);
		list.clear();
        list.addAll(linkedHashSet);
        return list;
    }

    
    /**
    * Con este método obtenemos un documento(JSOUP)
    * EJM:
    *           connect: http://consulta.siiau.udg.mx/wco/sspseca.consulta_oferta
    *           data:    ?ciclop=201710&cup=D&edifp=DEDX&ordenp=0&mostrarp=500&p_start=0	  
    * @param ciclo
    * @param centro
    * @param edificio
    * @param orden
    * @param mostrar
    * @param pStart
    * @return Document
    */
    private Document getHtmlDocument(String ciclo, String centro, String edificio, String orden, String mostrar, String pStart)
            throws IOException{

        Document document;

        document = Jsoup.connect(formSIIAU).data("ciclop",ciclo).data("cup",centro).data("edifp",edificio)
                .data("ordenp",orden).data("mostrarp",mostrar).data("p_start", pStart).post();

        if(!document.hasText())
            throw new IOException("Error al obtener documento.");
        return document;

    }

    /**
    * Con esta método compruebo el Status code de la respuesta que recibo al hacer la petición
    * EJM:
    * 		200 OK			300 Multiple Choicesd
    * 		301 Moved Permanently	305 Use Proxy
    * 		400 Bad Request		403 Forbidden
    * 		404 Not Found		500 Internal Server Error
    * 		502 Bad Gateway		503 Service Unavailable
    * @param url
    * @return Status Code
    */
    private int getStatusConnectionCode(String url) {
        Response response;
        try {
            response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).execute();
            System.out.println("Status: " + response.statusCode());
            return response.statusCode();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
            return 0;
        }
    }

    /**
     * @return the hostSIIAU
     */
    public String getHostSIIAU() {
        return hostSIIAU;
    }

    /**
     * @param hostSIIAU the hostSIIAU to set
     */
    public void setHostSIIAU(String hostSIIAU) {
        this.hostSIIAU = hostSIIAU;
    }

    /**
     * @return the _Ciclo
     */
    public String getCiclo() {
        return _Ciclo;
    }

    /**
     * @param _Ciclo the _Ciclo to set
     */
    public void setCiclo(String _Ciclo) {
        this._Ciclo = _Ciclo;
    }

    /**
     * @return the _Centro
     */
    public String getCentro() {
        return _Centro;
    }

    /**
     * @param _Centro the _Centro to set
     */
    public void setCentro(String _Centro) {
        this._Centro = _Centro;
    }

    /**
     * @return the _Carrera
     */
    public String getCarrera() {
        return _Carrera;
    }

    /**
     * @param _Carrera the _Carrera to set
     */
    public void setCarrera(String _Carrera) {
        this._Carrera = _Carrera;
    }

    /**
     * @return the _ClaveMat
     */
    public String getClaveMat() {
        return _ClaveMat;
    }

    /**
     * @param _ClaveMat the _ClaveMat to set
     */
    public void setClaveMat(String _ClaveMat) {
        this._ClaveMat = _ClaveMat;
    }

    /**
     * @return the _Materia
     */
    public String getMateria() {
        return _Materia;
    }

    /**
     * @param _Materia the _Materia to set
     */
    public void setMateria(String _Materia) {
        this._Materia = _Materia;
    }

    /**
     * @return the _Hora_Ini
     */
    public String getHora_Ini() {
        return _Hora_Ini;
    }

    /**
     * @param _Hora_Ini the _Hora_Ini to set
     */
    public void setHora_Ini(String _Hora_Ini) {
        this._Hora_Ini = _Hora_Ini;
    }

    /**
     * @return the _Hora_Fin
     */
    public String getHora_Fin() {
        return _Hora_Fin;
    }

    /**
     * @param _Hora_Fin the _Hora_Fin to set
     */
    public void setHora_Fin(String _Hora_Fin) {
        this._Hora_Fin = _Hora_Fin;
    }

    /**
     * @return the _Edificio
     */
    public String getEdificio() {
        return _Edificio;
    }

    /**
     * @param _Edificio the _Edificio to set
     */
    public void setEdificio(String _Edificio) {
        this._Edificio = _Edificio;
    }

    /**
     * @return the _Aula
     */
    public String getAula() {
        return _Aula;
    }

    /**
     * @param _Aula the _Aula to set
     */
    public void setAula(String _Aula) {
        this._Aula = _Aula;
    }

    /**
     * @return the _Orden
     */
    public String getOrden() {
        return _Orden;
    }

    /**
     * @param _Orden the _Orden to set
     */
    public void setOrden(String _Orden) {
        this._Orden = _Orden;
    }

    /**
     * @return the _Mostrar
     */
    public String getMostrar() {
        return _Mostrar;
    }

    /**
     * @param _Mostrar the _Mostrar to set
     */
    public void setMostrar(String _Mostrar) {
        this._Mostrar = _Mostrar;
    }

    public String getFormSIIAU() {
        return formSIIAU;
    }

    public void setFormSIIAU(String formSIIAU) {
        this.formSIIAU = formSIIAU;
    }

    public int getpStart() {
        return _pStart;
    }

    public void setpStart(int _pStart) {
        this._pStart = _pStart;
    }

    public List<String> getListEdificios() {
        return _listEdificios;
    }

    public void setListEdificios(List<String> _listEdificios) {
        this._listEdificios = _listEdificios;
    }

    public List<ScrapAula> getListAulas() {
        return listAulas;
    }

    public void setListAulas(List<ScrapAula> listAulas) {
        this.listAulas = listAulas;
    }

    public List<ScrapMateria> getListMaterias() {
        return listMaterias;
    }

    public void setListMaterias(List<ScrapMateria> listMaterias) {
        this.listMaterias = listMaterias;
    }

    public List<ScrapEdif> getListHorarios() {
        return listHorarios;
    }

    public void setListHorarios(List<ScrapEdif> listHorarios) {
        this.listHorarios = listHorarios;
    }



}
