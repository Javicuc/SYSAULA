/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author javilubz
 */
public class Horario {
    
    private int ID_Horario;
    private String Hora_Inicio;
    private String Hora_Final;
    private String Dia;
    
    public Horario(){
        
    }
    public Horario(String hri, String hrf, String d){
        this.Hora_Inicio = hri;
        this.Hora_Final  = hrf;
        this.Dia         = d;
    }
    public Horario(int id, String hri, String hrf, String d){
        this.ID_Horario  = id;
        this.Hora_Inicio = hri;
        this.Hora_Final  = hrf;
        this.Dia         = d;
    }

    /**
     * @return the ID_Horario
     */
    public int getID_Horario() {
        return ID_Horario;
    }

    /**
     * @param ID_Horario the ID_Horario to set
     */
    public void setID_Horario(int ID_Horario) {
        this.ID_Horario = ID_Horario;
    }

    /**
     * @return the Hora_Inicio
     */
    public String getHora_Inicio() {
        return Hora_Inicio;
    }

    /**
     * @param Hora_Inicio the Hora_Inicio to set
     */
    public void setHora_Inicio(String Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    /**
     * @return the Hora_Final
     */
    public String getHora_Final() {
        return Hora_Final;
    }

    /**
     * @param Hora_Final the Hora_Final to set
     */
    public void setHora_Final(String Hora_Final) {
        this.Hora_Final = Hora_Final;
    }

    /**
     * @return the Dia
     */
    public String getDia() {
        return Dia;
    }

    /**
     * @param Dia the Dia to set
     */
    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    @Override
    public String toString() {
        return "Horario{" + "ID_Horario=" + ID_Horario + ", Hora_Inicio=" + Hora_Inicio + ", Hora_Final=" + Hora_Final + ", Dia=" + Dia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.Hora_Inicio);
        hash = 17 * hash + Objects.hashCode(this.Hora_Final);
        hash = 17 * hash + Objects.hashCode(this.Dia);
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
        final Horario other = (Horario) obj;
        if (!Objects.equals(this.Hora_Inicio, other.Hora_Inicio)) {
            return false;
        }
        if (!Objects.equals(this.Hora_Final, other.Hora_Final)) {
            return false;
        }
        if (!Objects.equals(this.Dia, other.Dia)) {
            return false;
        }
        return true;
    }
    
    
}
