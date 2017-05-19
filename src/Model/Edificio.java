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
public class Edificio {
    
    private String ID_Nombre;
    private String FK_Universidad;

    public Edificio() {
    }
    
    public Edificio(String ID_Nombre, String FK_Universidad) {
        this.ID_Nombre = ID_Nombre;
        this.FK_Universidad = FK_Universidad;
    }

    @Override
    public String toString() {
        return ID_Nombre;
    }

    public String getID_Nombre() {
        return ID_Nombre;
    }

    public void setID_Nombre(String ID_Nombre) {
        this.ID_Nombre = ID_Nombre;
    }

    public String getFK_Universidad() {
        return FK_Universidad;
    }

    public void setFK_Universidad(String FK_Universidad) {
        this.FK_Universidad = FK_Universidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.ID_Nombre);
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
        final Edificio other = (Edificio) obj;
        if (!Objects.equals(this.ID_Nombre, other.ID_Nombre)) {
            return false;
        }
        return true;
    }
    
    
}
