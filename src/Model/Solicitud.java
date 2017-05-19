/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;

/**
 *
 * @author javilubz
 */
public class Solicitud {
    private int    ID_Solicitud;
    private String Asunto;
    private String Descripcion;
    private Timestamp FechaHora;
    private int    FK_Profesor;
    private String FK_Aula;

    public Solicitud() {
    }

    public Solicitud(int ID_Solicitud, String Asunto, String Descripcion, Timestamp FechaHora, int FK_Profesor, String FK_Aula) {
        this.ID_Solicitud = ID_Solicitud;
        this.Asunto = Asunto;
        this.Descripcion = Descripcion;
        this.FechaHora = FechaHora;
        this.FK_Profesor = FK_Profesor;
        this.FK_Aula = FK_Aula;
    }

    public Solicitud(String Asunto, String Descripcion, Timestamp FechaHora, int FK_Profesor, String FK_Aula) {
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

    
    
    public Timestamp getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(Timestamp FechaHora) {
        this.FechaHora = FechaHora;
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

    
}
