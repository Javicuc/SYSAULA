/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author Javicuc
 */
public class Aula {
    
    private String ID_Aula;
    private String Numero;
    private String FK_Edificio;

    public Aula(){
        
    }
    
    public Aula(String ID_Aula, String Numero, String FK_Edificio) {
        this.ID_Aula = ID_Aula;
        this.Numero = Numero;
        this.FK_Edificio = FK_Edificio;
    }
    
    @Override
    public String toString() {
        return "Aula{" + "ID_Aula=" + ID_Aula + ", Numero=" + Numero + ", FK_Edificio=" + FK_Edificio + '}';
    }

    public String getID_Aula() {
        return ID_Aula;
    }

    public void setID_Aula(String ID_Aula) {
        this.ID_Aula = ID_Aula;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getFK_Edificio() {
        return FK_Edificio;
    }

    public void setFK_Edificio(String FK_Edificio) {
        this.FK_Edificio = FK_Edificio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.ID_Aula);
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
        final Aula other = (Aula) obj;
        if (!Objects.equals(this.ID_Aula, other.ID_Aula)) {
            return false;
        }
        return true;
    }
    
    
    
}
