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
    private String Centro;
    private String Departamento;

    public ScrapProfesor(String Nombre, String Centro, String Departamento) {
        this.Nombre = Nombre;
        this.Centro = Centro;
        this.Departamento = Departamento;
    }

    public ScrapProfesor() {
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

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.Nombre);
        hash = 41 * hash + Objects.hashCode(this.Centro);
        hash = 41 * hash + Objects.hashCode(this.Departamento);
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
        if (!Objects.equals(this.Centro, other.Centro)) {
            return false;
        }
        if (!Objects.equals(this.Departamento, other.Departamento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ScrapProfesor{" + "Nombre=" + Nombre + ", Centro=" + Centro + ", Departamento=" + Departamento + '}';
    }
    
    
    
}
