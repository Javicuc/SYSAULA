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
public class Materia {
    private int ID_NRC;
    private String Clave;
    private String Nombre;

    public Materia() {
    }

    public Materia(int ID_NRC, String Clave, String Nombre) {
        this.ID_NRC = ID_NRC;
        this.Clave = Clave;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Materia{" + "ID_NRC=" + ID_NRC + ", Clave=" + Clave + ", Nombre=" + Nombre + '}';
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.ID_NRC;
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
        final Materia other = (Materia) obj;
        if (this.ID_NRC != other.ID_NRC) {
            return false;
        }
        return true;
    }
    
    
}
