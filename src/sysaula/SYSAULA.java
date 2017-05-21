package sysaula;


import Scraping.SIIAU;
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

    public static void main(String[] args) throws IOException, SQLException {
        
        /*try {
            MainView mainView = new MainView();*/
            
            SIIAU scrap = new SIIAU();
            try {
            scrap.initScrap();
            } catch (IOException ex) {
            Logger.getLogger(SYSAULA.class.getName()).log(Level.SEVERE, null, ex);
            }/*
            scrap.getListHorarios()
            .stream().forEach((e) -> {
            System.out.println(e);
            });*/
        /*} catch (SQLException ex) {
            Logger.getLogger(SYSAULA.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
