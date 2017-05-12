/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javicuc
 */
public class ScrapMateria implements Comparator<ScrapMateria>{
    private String NRC;
    private String Clave;
    private String Nombre;
    private String Hora_Inicio;
    private String Hora_Fin;
    private String Dias;
    private String Aula;
    
    public ScrapMateria(){
        this.Dias = "";
        this.Hora_Fin = "";
        this.Hora_Inicio = "";
    }

    public ScrapMateria(String NRC, String Clave, String Nombre, String Hora_Inicio, String Hora_Fin, String Dias, String Aula) {
        this.NRC = NRC;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Hora_Inicio = Hora_Inicio;
        this.Hora_Fin = Hora_Fin;
        this.Dias = Dias;
        this.Aula = Aula;
    }
    

    @Override
    public String toString() {
        return  "\n\nNRC:" + NRC + "| Clave:" + Clave + "| Nombre:" + Nombre + 
                "\nHora_Inicio:" + Hora_Inicio + ", Hora_Fin:" + Hora_Fin 
                + "\nDias:" + Dias 
                + "\nAula:" + Aula;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(String Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public String getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(String Hora_Fin) {
        this.Hora_Fin = Hora_Fin;
    }


    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String Dias) {
        this.Dias = Dias.replaceAll("\\.", "").replaceAll("\\s","");
    }

    public void setHorario(String horario){
        StringBuilder hora_inicio = new StringBuilder(horario.substring(0, 4)).insert(2, ":");
        StringBuilder hora_fin    = new StringBuilder(horario.substring(5,7)).insert(2, ":55");
        
        setHora_Inicio(new String(hora_inicio));
        setHora_Fin(new String(hora_fin));
    }
    /*
    public void setDiaHorario(String dia){
        String Day = dia;
        String firstDay;
        Pattern p = Pattern.compile("[LMIJVS]");  // insert your pattern here
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
                    if(getDia1().isEmpty())
                        setDia1("Lunes");
                    else if(getDia2().isEmpty())
                        setDia2("Lunes");
                    else if(getDia3().isEmpty())
                        setDia3("Lunes");
                    break;
                case "M":
                    if(getDia1().isEmpty())
                        setDia1("Martes");
                    else if(getDia2().isEmpty())
                        setDia2("Martes");
                    else if(getDia3().isEmpty())
                        setDia3("Martes");
                    break;
                case "I":
                    if(getDia1().isEmpty())
                        setDia1("Miercoles");
                    else if(getDia2().isEmpty())
                        setDia2("Miercoles");
                    else if(getDia3().isEmpty())
                        setDia3("Miercoles");
                    break;
                case "J":
                    if(getDia1().isEmpty())
                        setDia1("Jueves");
                    else if(getDia2().isEmpty())
                        setDia2("Jueves");
                    else if(getDia3().isEmpty())
                        setDia3("Jueves");
                    break;
                case "V":
                    if(getDia1().isEmpty())
                        setDia1("Viernes");
                    else if(getDia2().isEmpty())
                        setDia2("Viernes");
                    else if(getDia3().isEmpty())
                        setDia3("Viernes");
                    break;
                case "S":
                    if(getDia1().isEmpty())
                        setDia1("Sabado");
                    else if(getDia2().isEmpty())
                        setDia2("Sabado");
                    else if(getDia3().isEmpty())
                        setDia3("Sabado");
                    break;
            }
        }
    }
    */

    

    public static Comparator<ScrapMateria> MateriaNombre = new Comparator<ScrapMateria>() {
        @Override
        public int compare(ScrapMateria o1, ScrapMateria o2) {
            String nombre1 = o1.getNombre();
            String nombre2 = o2.getNombre();
            
            return nombre1.compareTo(nombre2);
        }
        
    };

    @Override
    public int compare(ScrapMateria o1, ScrapMateria o2) {
        String nombre1 = o1.getNombre();
        String nombre2 = o2.getNombre();
            
        return nombre1.compareTo(nombre2);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.NRC);
        hash = 67 * hash + Objects.hashCode(this.Clave);
        hash = 67 * hash + Objects.hashCode(this.Nombre);
        hash = 67 * hash + Objects.hashCode(this.Hora_Inicio);
        hash = 67 * hash + Objects.hashCode(this.Hora_Fin);
        hash = 67 * hash + Objects.hashCode(this.Dias);
        hash = 67 * hash + Objects.hashCode(this.Aula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ScrapMateria other = (ScrapMateria) obj;
        if (!Objects.equals(this.NRC, other.NRC)) {
            return false;
        }
        if (!Objects.equals(this.Clave, other.Clave)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Hora_Inicio, other.Hora_Inicio)) {
            return false;
        }
        if (!Objects.equals(this.Hora_Fin, other.Hora_Fin)) {
            return false;
        }
        if (!Objects.equals(this.Dias, other.Dias)) {
            return false;
        }
        if (!Objects.equals(this.Aula, other.Aula)) {
            return false;
        }
        return true;
    }

   

    
    
    
}
 