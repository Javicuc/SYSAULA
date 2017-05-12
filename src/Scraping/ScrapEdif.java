/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author javilubz
 */
public class ScrapEdif {
    private String Nombre;
    private String Centro;
    private List<ScrapAula> listAulas;

    public ScrapEdif(String nombre, String centro, List<ScrapAula> listAulas) {
        this.Nombre = nombre;
        this.Centro = centro;
        this.listAulas = listAulas;
    }

    public ScrapEdif(){
        listAulas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ScrapEdif{" + "Nombre=" + Nombre + ", Centro=" + Centro + ", listAulas=" + listAulas + '}';
    }

    
    public List<ScrapAula> getListAulas() {
        return listAulas;
    }

    public void setListAulas(List<ScrapAula> listAulas) {
        this.listAulas = listAulas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCentro() {
        return Centro;
    }

    public void setCentro(String Centro) {
        this.Centro = Centro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Nombre);
        hash = 79 * hash + Objects.hashCode(this.Centro);
        hash = 79 * hash + Objects.hashCode(this.listAulas);
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
        final ScrapEdif other = (ScrapEdif) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Centro, other.Centro)) {
            return false;
        }
        if (!Objects.equals(this.listAulas, other.listAulas)) {
            return false;
        }
        return true;
    }

    
    
}
