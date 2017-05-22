/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author javilubz
 */
public class ScrapHelper {
    
    
    private final String formSIIAU = "http://consulta.siiau.udg.mx/wco/sspseca.consulta_oferta"; // Consultas a SIIAU
    private final String hostSIIAU = "http://consulta.siiau.udg.mx/wco/sspseca.forma_consulta";

    public ScrapHelper(){
        
    }
    
    /**
     * Con este método obtenemos un documento(JSOUP) EJM: connect:
     * http://consulta.siiau.udg.mx/wco/sspseca.consulta_oferta data:
     * ?ciclop=201710&cup=D&edifp=DEDX&ordenp=0&mostrarp=500&p_start=0
     *
     * @param ciclo
     * @param centro
     * @param edificio
     * @param orden
     * @param mostrar
     * @param pStart
     * @return Document
     */
    public Document getHtmlDocument(String ciclo, String centro, String edificio, String orden, String mostrar, String pStart)
            throws IOException {

        Document document;

        document = Jsoup.connect(formSIIAU).data("ciclop", ciclo).data("cup", centro).data("edifp", edificio)
                .data("ordenp", orden).data("mostrarp", mostrar).data("p_start", pStart).post();

        if (!document.hasText()) {
            throw new IOException("Error al obtener documento.");
        }
        return document;

    }

    /**
     * Con esta método compruebo el Status code de la respuesta que recibo al
     * hacer la petición EJM: 200 OK	300 Multiple Choicesd 301 Moved Permanently
     * 305 Use Proxy 400 Bad Request	403 Forbidden 404 Not Found	500 Internal
     * Server Error 502 Bad Gateway	503 Service Unavailable
     *
     * @param url
     * @return Status Code
     */
    public int getStatusConnectionCode(String url) {
        Connection.Response response;
        try {
            response = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(100000).ignoreHttpErrors(true).execute();
            System.out.println("Status: " + response.statusCode());
            return response.statusCode();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
            return 0;
        }
    }

    public String getFormSIIAU() {
        return formSIIAU;
    }

    public String getHostSIIAU() {
        return hostSIIAU;
    }
}
