/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author javilubz
 */
public class ConfigOferta implements Serializable{
    private String Centro;
    private String AcronimoCentro;
    private String Ciclo;
    private String LetraCentro;
    private List<String> EdificiosCentro;

    public ConfigOferta() {
    }

    public ConfigOferta(String Centro, String AcronimoCentro, String Ciclo, String LetraCentro, List<String> EdificiosCentro) {
        this.Centro = Centro;
        this.AcronimoCentro = AcronimoCentro;
        this.Ciclo = Ciclo;
        this.LetraCentro = LetraCentro;
        this.EdificiosCentro = EdificiosCentro;
    }

    public String getCentro() {
        return Centro;
    }

    public void setCentro(String Centro) {
        this.Centro = Centro;
    }

    public String getAcronimoCentro() {
        return AcronimoCentro;
    }

    public void setAcronimoCentro(String AcronimoCentro) {
        this.AcronimoCentro = AcronimoCentro;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    public String getLetraCentro() {
        return LetraCentro;
    }

    public void setLetraCentro(String LetraCentro) {
        this.LetraCentro = LetraCentro;
    }

    public List<String> getEdificiosCentro() {
        return EdificiosCentro;
    }

    public void setEdificiosCentro(List<String> EdificiosCentro) {
        this.EdificiosCentro = EdificiosCentro;
    }
    
    
}
