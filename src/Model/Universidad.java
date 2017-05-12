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
public class Universidad {
    private String ID_Centro;
    private String Nombre;
    private String Acronimo;
    
    public Universidad(){
        
    }

    public Universidad(String ID_Centro, String Nombre, String Acronimo) {
        this.ID_Centro = ID_Centro;
        this.Nombre = Nombre;
        this.Acronimo = Acronimo;
    }

    public String getID_Centro() {
        return ID_Centro;
    }

    public void setID_Centro(String ID_Centro) {
        this.ID_Centro = ID_Centro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAcronimo() {
        return Acronimo;
    }

    public void setAcronimo(String Acronimo) {
        this.Acronimo = Acronimo;
    }

    @Override
    public String toString() {
        return "Universidad{" + "ID_Centro=" + ID_Centro + ", Nombre=" + Nombre + ", Acronimo=" + Acronimo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.ID_Centro);
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
        final Universidad other = (Universidad) obj;
        if (!Objects.equals(this.ID_Centro, other.ID_Centro)) {
            return false;
        }
        return true;
    }
    
}
