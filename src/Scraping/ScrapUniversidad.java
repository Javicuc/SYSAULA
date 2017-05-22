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
public class ScrapUniversidad {
    private String Nombre;
    private String Sigla;
    private String acronimo;

    public ScrapUniversidad(String Nombre, String Sigla, String acronimo) {
        this.Nombre = Nombre;
        this.Sigla = Sigla;
        this.acronimo = acronimo;
    }

    @Override
    public String toString() {
        return "ScrapUniversidad{" + "Nombre=" + Nombre + ", Sigla=" + Sigla + ", acronimo=" + acronimo + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.Nombre);
        hash = 59 * hash + Objects.hashCode(this.Sigla);
        hash = 59 * hash + Objects.hashCode(this.acronimo);
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
        final ScrapUniversidad other = (ScrapUniversidad) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Sigla, other.Sigla)) {
            return false;
        }
        if (!Objects.equals(this.acronimo, other.acronimo)) {
            return false;
        }
        return true;
    }
    
    
}
