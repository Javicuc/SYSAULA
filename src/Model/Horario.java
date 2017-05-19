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
    
    private int    ID_Horario;
    private String Hora_Inicio;
    private String Hora_Final;
    private String Dia;
    private int FK_Materia;
    
    public Horario(){
        
    }
    public Horario(String hri, String hrf, String d, int fkm){
        this.Hora_Inicio = hri;
        this.Hora_Final  = hrf;
        this.Dia         = d;
        this.FK_Materia  = fkm;
    }
    public Horario(int id, String hri, String hrf, String d, int fkm){
        this.ID_Horario  = id;
        this.Hora_Inicio = hri;
        this.Hora_Final  = hrf;
        this.Dia         = d;
        this.FK_Materia  = fkm;
    }

    @Override
    public String toString() {
        return "Horario{" + "ID_Horario=" + ID_Horario + ", Hora_Inicio=" + Hora_Inicio + ", Hora_Final=" + Hora_Final + ", Dia=" + Dia + ", FK_Materia=" + FK_Materia + '}';
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

    public int getFK_Materia() {
        return FK_Materia;
    }

    public void setFK_Materia(int FK_Materia) {
        this.FK_Materia = FK_Materia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.ID_Horario;
        hash = 29 * hash + Objects.hashCode(this.Hora_Inicio);
        hash = 29 * hash + Objects.hashCode(this.Hora_Final);
        hash = 29 * hash + Objects.hashCode(this.Dia);
        hash = 29 * hash + this.FK_Materia;
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
        if (this.ID_Horario != other.ID_Horario) {
            return false;
        }
        if (this.FK_Materia != other.FK_Materia) {
            return false;
        }
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
