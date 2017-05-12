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
    private String FK_Aula;
    private int    FK_Materia;
    private int    FK_Profesor;
    private byte   Status;

    public Lista_Horarios() {
    }

    public Lista_Horarios(String FK_Aula, int FK_Materia, int FK_Profesor, byte Status) {
        this.FK_Aula = FK_Aula;
        this.FK_Materia = FK_Materia;
        this.FK_Profesor = FK_Profesor;
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Lista_Horarios{" + "FK_Aula=" + FK_Aula + ", FK_Materia=" + FK_Materia + ", FK_Profesor=" + FK_Profesor + ", Status=" + Status + '}';
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

    public int getFK_Profesor() {
        return FK_Profesor;
    }

    public void setFK_Profesor(int FK_Profesor) {
        this.FK_Profesor = FK_Profesor;
    }

    public byte getStatus() {
        return Status;
    }

    public void setStatus(byte Status) {
        this.Status = Status;
    }

    
    
}
