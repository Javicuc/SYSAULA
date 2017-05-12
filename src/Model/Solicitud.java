/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author javilubz
 */
public class Solicitud {
    private int    ID_Solicitud;
    private String Asunto;
    private String Descripcion;
    private String FechaHora;
    private int    FK_Profesor;
    private String FK_Aula;

    public Solicitud() {
    }

    public Solicitud(int ID_Solicitud, String Asunto, String Descripcion, String FechaHora, int FK_Profesor, String FK_Aula) {
        this.ID_Solicitud = ID_Solicitud;
        this.Asunto = Asunto;
        this.Descripcion = Descripcion;
        this.FechaHora = FechaHora;
        this.FK_Profesor = FK_Profesor;
        this.FK_Aula = FK_Aula;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "ID_Solicitud=" + ID_Solicitud + ", Asunto=" + Asunto + ", Descripcion=" + Descripcion + ", FechaHora=" + FechaHora + ", FK_Profesor=" + FK_Profesor + ", FK_Aula=" + FK_Aula + '}';
    }

    public int getID_Solicitud() {
        return ID_Solicitud;
    }

    public void setID_Solicitud(int ID_Solicitud) {
        this.ID_Solicitud = ID_Solicitud;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(String FechaHora) {
        this.FechaHora = FechaHora;
    }

    public int getFK_Profesor() {
        return FK_Profesor;
    }

    public void setFK_Profesor(int FK_Profesor) {
        this.FK_Profesor = FK_Profesor;
    }

    public String getFK_Aula() {
        return FK_Aula;
    }

    public void setFK_Aula(String FK_Aula) {
        this.FK_Aula = FK_Aula;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.ID_Solicitud;
        hash = 97 * hash + Objects.hashCode(this.Asunto);
        hash = 97 * hash + Objects.hashCode(this.Descripcion);
        hash = 97 * hash + Objects.hashCode(this.FechaHora);
        hash = 97 * hash + this.FK_Profesor;
        hash = 97 * hash + Objects.hashCode(this.FK_Aula);
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
        final Solicitud other = (Solicitud) obj;
        if (this.ID_Solicitud != other.ID_Solicitud) {
            return false;
        }
        if (this.FK_Profesor != other.FK_Profesor) {
            return false;
        }
        if (!Objects.equals(this.Asunto, other.Asunto)) {
            return false;
        }
        if (!Objects.equals(this.Descripcion, other.Descripcion)) {
            return false;
        }
        if (!Objects.equals(this.FechaHora, other.FechaHora)) {
            return false;
        }
        if (!Objects.equals(this.FK_Aula, other.FK_Aula)) {
            return false;
        }
        return true;
    }
    
    
    
}
