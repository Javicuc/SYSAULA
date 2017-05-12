/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.io.IOException;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Javicuc
 */
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
  
    private final List<String> _Dia;
    private List<String>       _listEdificios;
    
    private List<ScrapAula>    listAulasEdifs; 
    private List<ScrapMateria> listMaterias; // Materias
    private List<ScrapEdif>    listHorarios; // Edificios -> Aulas -> Materias
    private ScrapToBD scraptobd;
    
    public SIIAU() throws IOException {
        this._Dia = asList("lupM", "mapT", "mipW", "jupR", "vipF", "sapS");
        //this._Dia = asList("lupM");
        //this._listEdificios = asList("DEDX");
        this._listEdificios = asList("DEDA","DEDCS","DEDD","DEDE","DEDF","DEDG","DEDH","DEDI","DEDK","DEDL","DEDM",
                "DEDN","DEDP","DEDQ","DEDR","DEDS","DEDT","DEDU","DEDV","DEDW","DEDX","DUCT1","DUCT2");
        this._Mostrar  = "500";
        this._Orden    = "0";
        this._Centro   = "D";
        this._Ciclo    = "201710";
        this.listHorarios   = new ArrayList<>();
        this.scraptobd = new ScrapToBD();
    }
    
    public void initScrap() throws IOException {
        if (getStatusConnectionCode(getHostSIIAU()) == 200) {
            for (String edif : _listEdificios) {
                
                ScrapEdif ded = new ScrapEdif();
                this.setEdificio(edif);
                ded.setNombre(edif);
                ded.setCentro(getCentro());
                //scraptobd.insertEdificio(ded);
                System.out.println(edif);
                
                this.listAulasEdifs = new ArrayList<>();
                this.listMaterias   = new ArrayList<>();
                
                for (String dia : _Dia) {
                    boolean isNext = true;
                    setpStart(0);
                    System.out.println(dia);
                    while (isNext) {
                        Document document = getHtmlDocument(getCiclo(), getCentro(), getEdificio(), dia,
                                getOrden(), getMostrar(), String.valueOf(getpStart()));
                        Element table = document.select("table").get(0);
                        Elements rows = table.select("tr");
                        if (rows.size() > 2) { // Si hay más datos después de las cabeceras...
                            for (int i = 2; i < rows.size(); i++) {
                                Element data = rows.get(i);
                                if (data.getElementsByClass("tddatos").hasText()
                                        && data.getElementsByClass("td1").select("td:eq(1)").hasText()) { // Si hay horario...
                                    getAllData(data);
                                }
                            }
                        } else {
                            isNext = false;
                        }
                        setpStart(this.getpStart() + 100);
                    }
                }
                assignAulaMateria();
                ded.setListAulas(listAulasEdifs);
                listHorarios.add(ded);
            }
        } else {
            throw new IOException("Error al generar el documento.");
        }
    }
   
    private void getAllData(Element data){
        if(!data.getElementsByClass("tddatos").select("td:eq(2)").text().isEmpty()){
           
            String asig  = data.getElementsByClass("tddatos").select("td:eq(2)").text();
            String nrc   = data.getElementsByClass("tddatos").select("td:eq(0)").get(0).text();
            String clave = data.getElementsByClass("tddatos").select("td:eq(1)").get(0).text();
            
            List<String> listHoras = getSelect(data.getElementsByClass("td1"), "td:eq(1)");
            List<String> listDias  = getSelect(data.getElementsByClass("td1"), "td:eq(2)");
            List<String> listEdifs = getSelect(data.getElementsByClass("td1"), "td:eq(3)");
            List<String> listAulas = getSelect(data.getElementsByClass("td1"), "td:eq(4)");
             
            for(int i = 0; i < listHoras.size(); i++){
                if(listEdifs.get(i).contains(getEdificio()) && !listAulas.get(i).isEmpty()){
                    
                    ScrapMateria materia = new ScrapMateria();
                    ScrapAula    aula    = new ScrapAula();
                    
                    materia.setNRC(nrc);
                    materia.setClave(clave);
                    materia.setNombre(asig);
                    materia.setAula(listAulas.get(i));
                    materia.setDias(listDias.get(i));
                    materia.setHorario(listHoras.get(i));
                    
                    aula.setEdificio(getEdificio());
                    aula.setNumero(listAulas.get(i));
                    
                    listMaterias.add(materia);
                    listAulasEdifs.add(aula);
                }
            }      
        }
    }
    
    
    private List getSelect(Elements data,String select){
        List<String> listObj = new ArrayList<>();
        Elements obj = data.select(select);
        for(int i = 0; i < obj.size(); i++)
            listObj.add(obj.get(i).text().replaceAll("\u00a0",""));
        return listObj;
    }
    
    private void assignAulaMateria(){
        
        listMaterias   = deleteDuplicate(listMaterias);
        listAulasEdifs = deleteDuplicate(listAulasEdifs);
        Collections.sort(listAulasEdifs, new ScrapAula());
        Collections.sort(listMaterias, new ScrapMateria());
        System.out.println(listMaterias.size());
        System.out.println(listAulasEdifs.size());
        for(int i = 0; i < listAulasEdifs.size(); i++){
            String idAula = listAulasEdifs.get(i).getEdificio()+listAulasEdifs.get(i).getNumero();
            scraptobd.insertAula(listAulasEdifs.get(i));
            for(int j = 0; j < listMaterias.size(); j++){
                if(listAulasEdifs.get(i).getNumero().equals(listMaterias.get(j).getAula())){
                    listAulasEdifs.get(i).getListMaterias().add(listMaterias.get(j));
                    scraptobd.insertMateriaHorarios(listMaterias.get(j),idAula);
                }
            }
        
        }
    }
   
    public List deleteDuplicate(List list){
        Set linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(list);
		list.clear();
        list.addAll(linkedHashSet);
        return list;
    }
    
    private Document getHtmlDocument(String ciclo, String centro, String edificio, String dia, String orden, String mostrar, String pStart) 
            throws IOException{
        
        Document document;
        
        document = Jsoup.connect(formSIIAU).data("ciclop",ciclo).data("cup",centro)
                .data(dia.substring(0,3),dia.substring(3,4)).data("edifp",edificio)
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

    public List<ScrapAula> getListAulasEdifs() {
        return listAulasEdifs;
    }

    public void setListAulasEdifs(List<ScrapAula> listAulasEdifs) {
        this.listAulasEdifs = listAulasEdifs;
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
