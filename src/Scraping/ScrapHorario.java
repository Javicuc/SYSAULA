/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author javilubz
 */
public class ScrapHorario {
    
    private String Hora_Inicio;
    private String Hora_Final;
    private String Dia;

    public ScrapHorario() {
        this.Hora_Inicio = "";
        this.Hora_Final  = "";
        this.Dia         = "";
    }

    public ScrapHorario(String Hora_Inicio, String Hora_Final, String Dia) {
        this.Hora_Inicio = Hora_Inicio;
        this.Hora_Final = Hora_Final;
        this.Dia = Dia;
    }

    @Override
    public String toString() {
        return "ScrapHorario{" + "Hora_Inicio: " + Hora_Inicio + ", Hora_Final: " + Hora_Final + ", Dia: " + Dia + '}';
    }
    
    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }
    
    public String getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(String Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public String getHora_Final() {
        return Hora_Final;
    }

    public void setHora_Final(String Hora_Final) {
        this.Hora_Final = Hora_Final;
    }

    
    public void setHorario(String horario){
        StringBuilder hora_inicio = new StringBuilder(horario.substring(0, 4)).insert(2, ":");
        StringBuilder hora_fin    = new StringBuilder(horario.substring(5,7)).insert(2, ":55");
        
        setHora_Inicio(new String(hora_inicio));
        setHora_Final(new String(hora_fin));
    }
    public void setDiaHorario(String dia){
        String Day = dia;
        String firstDay;
        Pattern p = Pattern.compile("[LMIJVS]");
        Matcher m = p.matcher(Day);
        int pos = 0;
        
        while(!Day.isEmpty()){
            if (m.find())
                pos = m.start();
            else
                break;
            
            firstDay = Day.substring(pos, pos+1);

            switch(firstDay){
                case "L":
                    if(getDia().isEmpty())
                        setDia("Lunes");
                    break;
                case "M":
                    if(getDia().isEmpty())
                        setDia("Martes");
                   break;
                case "I":
                    if(getDia().isEmpty())
                        setDia("Miercoles");
                    break;
                case "J":
                    if(getDia().isEmpty())
                        setDia("Jueves");
                    break;
                case "V":
                    if(getDia().isEmpty())
                        setDia("Viernes");
                    break;
                case "S":
                    if(getDia().isEmpty())
                        setDia("Sabado");
                    break;
            }
        }
    }
    
    
}
