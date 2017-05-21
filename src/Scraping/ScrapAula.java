/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Javicuc
 */
public class ScrapAula implements Comparator<ScrapAula>{
    private String Edificio;
    private String Numero;
    private List<ScrapMateria> listMaterias;
    
    public ScrapAula() {
        this.listMaterias = new ArrayList<>();
    }

    public ScrapAula(String Edificio, String Numero, List<ScrapMateria> listMaterias) {
        this.Edificio = Edificio;
        this.Numero = Numero;
        this.listMaterias = listMaterias;
    }
    
    @Override
    public String toString() {
        return "ScrapAula{" + "Edificio=" + Edificio + ", Numero=" + Numero 
                + "\nlista de Materias:" + listMaterias + '}' +"\n______________________________________________________\n" ;
    }
    
    public String getEdificio() {
        return Edificio;
    }

    public void setEdificio(String Edificio) {
        this.Edificio = Edificio;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public List<ScrapMateria> getListMaterias() {
        return listMaterias;
    }

    public void setListMaterias(List<ScrapMateria> listMaterias) {
        this.listMaterias = listMaterias;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.Edificio);
        hash = 19 * hash + Objects.hashCode(this.Numero);
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
        final ScrapAula other = (ScrapAula) obj;
        if (!Objects.equals(this.Edificio, other.Edificio)) {
            return false;
        }
        if (!Objects.equals(this.Numero, other.Numero)) {
            return false;
        }
        return true;
    }

    public static Comparator<ScrapAula> AulaNumero = new Comparator<ScrapAula>() {
        @Override
        public int compare(ScrapAula aula1, ScrapAula aula2) {
            String aulax1 = aula1.getNumero()+aula1.getEdificio();
            String aulax2 = aula2.getNumero()+aula2.getEdificio();
            
            return aulax1.compareTo(aulax2);
        }
    };

    @Override
    public int compare(ScrapAula o1, ScrapAula o2) {
        String aulax1 = o1.getNumero()+o1.getEdificio();
        String aulax2 = o2.getNumero()+o2.getEdificio();
            
        return aulax1.compareTo(aulax2);
    }
}
