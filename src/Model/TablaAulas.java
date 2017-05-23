/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;

/**
 *
 * @author javilubz
 */
public class TablaAulas {
   
    private int ID_NRC;
    private String Clave;
    private String Nombre;
    private Time HoraInicio;
    private Time HoraFinal;
    private String Dia;
    private String Aula;
    private boolean Status;
    private int ID_ListaHorario;

    public TablaAulas() {
    }
    public TablaAulas(Time HoraInicio, Time HoraFinal, String Dia,String Aula,boolean Status){
        this.ID_NRC = 0;
        this.Clave  = "XXXXX";
        this.Nombre = "No Registrado";
        this.HoraInicio = HoraInicio;
        this.HoraFinal = HoraFinal;
        this.Dia = Dia;
        this.Aula = Aula;
        this.Status = Status;
        
    }
    public TablaAulas(int ID_NRC, String Clave, String Nombre, Time HoraInicio, Time HoraFinal, String Dia, String Aula, boolean Status, int ID_ListaHorario) {
        this.ID_NRC = ID_NRC;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.HoraInicio = HoraInicio;
        this.HoraFinal = HoraFinal;
        this.Dia = Dia;
        this.Aula = Aula;
        this.Status = Status;
        this.ID_ListaHorario = ID_ListaHorario;
    }

    @Override
    public String toString() {
        return "TablaAulas{" + "ID_NRC=" + ID_NRC + ", Clave=" + Clave + ", Nombre=" + Nombre + ", HoraInicio=" + HoraInicio + ", HoraFinal=" + HoraFinal + ", Dia=" + Dia + ", Aula=" + Aula + ", Status=" + Status + ", ID_ListaHorario=" + ID_ListaHorario + '}';
    }
    
    public int getID_NRC() {
        return ID_NRC;
    }

    public void setID_NRC(int ID_NRC) {
        this.ID_NRC = ID_NRC;
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

    public Time getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Time HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public Time getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(Time HoraFinal) {
        this.HoraFinal = HoraFinal;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String Aula) {
        this.Aula = Aula;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public int getID_ListaHorario() {
        return ID_ListaHorario;
    }

    public void setID_ListaHorario(int ID_ListaHorario) {
        this.ID_ListaHorario = ID_ListaHorario;
    }
    
    
   
}
