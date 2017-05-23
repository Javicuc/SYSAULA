/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author javilubz
 */
public class initScrapping {

    private ScrapHelper helper = new ScrapHelper();
    private final String HostSIIAU = "";
    private final String academicosCucei = "http://www.cucei.udg.mx/es/comunidad/academicos";
    private final String academicosCucea = "";
    private final String academicosCuaad = "";
    private final String academicosCucsh = "";
    private final String academicosCucba = "";
    private final String academicosCucs = "";

    private List<String> listCiclos = new ArrayList<>();
    private List<String> listCentros = new ArrayList<>();

    public initScrapping() throws IOException {
        getCentros();
        getCiclos();
    }
    
    public void getCiclos() throws IOException {
        if (helper.getStatusConnectionCode(helper.getHostSIIAU()) == 200) {
            Document doc = Jsoup.connect(helper.getHostSIIAU()).get();
            Element ciclop = doc.select("td").first();
            Elements data = ciclop.select("option");
            for(Element ciclo : data)
                this.listCiclos.add(ciclo.text().replaceAll(",", "."));
        }
    }
    
    public void getCentros() throws IOException{
        if (helper.getStatusConnectionCode(helper.getHostSIIAU()) == 200) {
            Document doc = Jsoup.connect(helper.getHostSIIAU()).get();
            Element cup = doc.select("td").get(1);
            Elements data = cup.select("option");
            for(Element centro : data)
                this.listCentros.add(centro.text().replaceAll(",", "."));
        }
    }

    public List<String> getListCiclos() {
        return listCiclos;
    }

    public List<String> getListCentros() {
        return listCentros;
    }

}