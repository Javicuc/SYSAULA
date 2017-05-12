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
public class MateriaHorario {
    private int FK_Materia;
    private int FK_Horario;
    
    public MateriaHorario(){
      
    }

    public MateriaHorario(int FK_Materia, int FK_Horario) {
        this.FK_Materia = FK_Materia;
        this.FK_Horario = FK_Horario;
    }

    @Override
    public String toString() {
        return "MateriaHorario{" + "FK_Materia=" + FK_Materia + ", FK_Horario=" + FK_Horario + '}';
    }

    public int getFK_Materia() {
        return FK_Materia;
    }

    public void setFK_Materia(int FK_Materia) {
        this.FK_Materia = FK_Materia;
    }

    public int getFK_Horario() {
        return FK_Horario;
    }

    public void setFK_Horario(int FK_Horario) {
        this.FK_Horario = FK_Horario;
    }
    
    
}
