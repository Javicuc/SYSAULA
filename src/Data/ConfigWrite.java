/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.List;

/**
 *
 * @author javilubz
 */
public class ConfigWrite {
    
    private Properties properties = null;
    private final static String CONFIG_FILE_NAME = "config.properties";
    
    private String Centro;
    private String AcronimoCentro;
    private String Ciclo;
    private String LetraCentro;
    private List<String> EdificiosCentro;

    private ConfigWrite() {
        this.properties = new Properties();
        try {
            properties.load(ConfigWrite.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ConfigWrite(String Centro, String AcronimoCentro, String Ciclo, String LetraCentro, List<String> EdificiosCentro) {
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
