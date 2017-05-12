package sysaula;


import SQL.InitBD;
import Scraping.SIIAU;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Javicuc
 */
public class SYSAULA {

    public static void main(String[] args) throws IOException {
        
        SIIAU scrap = new SIIAU();
        try {
            scrap.initScrap();
        } catch (IOException ex) {
            Logger.getLogger(SYSAULA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        scrap.getListHorarios()
                .stream().forEach((e) -> {
                    System.out.println(e);
        });
        
    }
}
