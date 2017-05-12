/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.util.Objects;

/**
 *
 * @author javilubz
 */
public class ScrapProfesor {
    private String Nombre;
    
    public ScrapProfesor(){
        
    }
    public ScrapProfesor(String n){
        this.Nombre = n;
    }

    @Override
    public String toString() {
        return "ScrapProfesor{" + "Nombre=" + Nombre + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.Nombre);
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
        final ScrapProfesor other = (ScrapProfesor) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }
    
}
