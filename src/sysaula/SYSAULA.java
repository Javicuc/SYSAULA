package sysaula;


import Scraping.SIIAU;
import Scraping.initScrapping;
import View.MainView;
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
        initScrapping init = new initScrapping();
        init.getCentros();
        init.getCiclos();
    }
}
