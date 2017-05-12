/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Model.DAO.HorarioDAO;
import Model.Horario;
import java.sql.Connection;
import java.sql.SQLException;
import SQL.BD_Conexion;
import Scraping.SIIAU;
import Scraping.ScrapEdif;
import java.io.IOException;
import java.text.SimpleDateFormat;
import static java.util.Arrays.asList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Javicuc
 */
public class InitBD {
    
    private Connection con;
    private List<ScrapEdif> ListaOferta;
    private List<String> listEdificios;
    private SIIAU siiau;
    public InitBD() throws IOException{
        this.con = BD_Conexion.getInstance();
        this.siiau = new SIIAU();
        this.listEdificios = siiau.getListEdificios();
        
    }
    
    public void crearUniversidadEdificios(){
    }
    
    public void crearHorarios(){
        
        HorarioDAO hrdao = new HorarioDAO(con);
        String DATE_FORMAT_NOW = "HH:mm";
        SimpleDateFormat ft = new SimpleDateFormat(DATE_FORMAT_NOW);
        List<String> Dia = asList("Lunes", "Martes", "Miercoles","Jueves","Viernes", "Sabado");
        Horario horario;
        Calendar hr_inicio = Calendar.getInstance();
        Calendar hr_final  = Calendar.getInstance();
        
        for(String dia : Dia){
            
            hr_inicio.set(Calendar.HOUR_OF_DAY, 7); //HOUR esta en formato de 12 horas.
            hr_inicio.set(Calendar.MINUTE, 0);
            hr_inicio.set(Calendar.SECOND, 0);
        
            hr_final.set(Calendar.HOUR_OF_DAY, 7); //HOUR esta en formato de 12 horas.
            hr_final.set(Calendar.MINUTE, 0);
            hr_final.set(Calendar.SECOND, 0);
            
            for (int i = 1; i < 15; i++){
                
                horario = new Horario();
                horario.setHora_Inicio(ft.format(hr_inicio.getTime()));
                
                hr_final.setTime(hr_inicio.getTime());
                hr_final.add(Calendar.MINUTE,55);
                horario.setHora_Final(ft.format(hr_final.getTime()));
                
                hr_inicio.add(Calendar.HOUR, 1);
                
                horario.setDia(dia);
                
                try {
                    hrdao.crear(horario);
                } catch (SQLException ex) {
                    Logger.getLogger(InitBD.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }
    
}
