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
    
    private int  ID_Horario;
    private Time Hora_Inicio;
    private Time Hora_Final;
    private String Dia;
    private int    FK_Materia;
    
    public Horario(){
        
    }
    public Horario(Time horaInicio, Time horaFinal, String dias, int fkm){
        this.Hora_Inicio = horaInicio;
        this.Hora_Final  = horaFinal;
        this.Dia         = dias;
        this.FK_Materia  = fkm;
    }

    public Horario(int ID_Horario, Time Hora_Inicio, Time Hora_Final, String Dia, int FK_Materia) {
        this.ID_Horario = ID_Horario;
        this.Hora_Inicio = Hora_Inicio;
        this.Hora_Final = Hora_Final;
        this.Dia = Dia;
        this.FK_Materia = FK_Materia;
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

    public Time getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(Time Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public Time getHora_Final() {
        return Hora_Final;
    }

    public void setHora_Final(Time Hora_Final) {
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
        hash = 37 * hash + this.ID_Horario;
        hash = 37 * hash + Objects.hashCode(this.Hora_Inicio);
        hash = 37 * hash + Objects.hashCode(this.Hora_Final);
        hash = 37 * hash + Objects.hashCode(this.Dia);
        hash = 37 * hash + this.FK_Materia;
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
        if (!Objects.equals(this.Dia, other.Dia)) {
            return false;
        }
        if (!Objects.equals(this.Hora_Inicio, other.Hora_Inicio)) {
            return false;
        }
        if (!Objects.equals(this.Hora_Final, other.Hora_Final)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
