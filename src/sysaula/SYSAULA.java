package sysaula;


import Data.ConfigLoad;
import Data.ConfigSysAula;
import Data.ConfigWrite;
import Scraping.SIIAU;
import Scraping.initScrapping;
import View.LoginView;
import View.MainView;
import View.MainView2;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Javicuc
 */
public class SYSAULA {

    public static void main(String[] args) throws IOException {
        
        ConfigWrite writeProperties = new ConfigWrite(); // Creamos una nueva configuracion de properties
        writeProperties.writeConfig(new ConfigSysAula()); // Escribimos los calendarios y centros universitarios
        System.out.println("CU: "+ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CUACTUAL));
            
        SIIAU siiau = new SIIAU();
        try {
            siiau.scrapSIIAU();
            //new LoginView();
            new MainView();
            
        } catch (SQLException ex) {
            Logger.getLogger(SYSAULA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
