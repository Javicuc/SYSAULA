/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author javilubz
 */
public class Lista_Horarios {
    private int ID_ListaHorario;
    private String FK_Aula;
    private int    FK_Materia;
    private boolean   Status;

    public Lista_Horarios() {
    }

    public Lista_Horarios(String FK_Aula, int FK_Materia, boolean Status) {
        this.FK_Aula = FK_Aula;
        this.FK_Materia = FK_Materia;
        this.Status = Status;
    }

    public Lista_Horarios(int ID_ListaHorario, String FK_Aula, int FK_Materia, boolean Status) {
        this.ID_ListaHorario = ID_ListaHorario;
        this.FK_Aula = FK_Aula;
        this.FK_Materia = FK_Materia;
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Lista_Horarios{" + "ID_ListaHorario=" + ID_ListaHorario + ", FK_Aula=" + FK_Aula + ", FK_Materia=" + FK_Materia + ", Status=" + Status + '}';
    }

    

    public int getID_ListaHorario() {
        return ID_ListaHorario;
    }

    public void setID_ListaHorario(int ID_ListaHorario) {
        this.ID_ListaHorario = ID_ListaHorario;
    }

    public String getFK_Aula() {
        return FK_Aula;
    }

    public void setFK_Aula(String FK_Aula) {
        this.FK_Aula = FK_Aula;
    }

    public int getFK_Materia() {
        return FK_Materia;
    }

    public void setFK_Materia(int FK_Materia) {
        this.FK_Materia = FK_Materia;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    
    
}
