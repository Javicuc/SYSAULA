/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javicuc
 */
public class Profesor {
    private int ID_Profesor;
    private String Nombre;
    
    public Profesor(){
        
    }

    public Profesor(int ID_Profesor, String Nombre) {
        this.ID_Profesor = ID_Profesor;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Profesor{" + "ID_Profesor=" + ID_Profesor + ", Nombre=" + Nombre + '}';
    }

    public int getID_Profesor() {
        return ID_Profesor;
    }

    public void setID_Profesor(int ID_Profesor) {
        this.ID_Profesor = ID_Profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.ID_Profesor;
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
        final Profesor other = (Profesor) obj;
        if (this.ID_Profesor != other.ID_Profesor) {
            return false;
        }
        return true;
    }
    
    
    
}
