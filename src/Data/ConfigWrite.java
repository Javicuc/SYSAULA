/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Scraping.initScrapping;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class ConfigWrite {
    
    public ConfigWrite() throws IOException {
    }
    
    public void writeConfig(ConfigSysAula objConfig){
        
        String centros = ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_UNIVERSIDAD);
        String ciclos = ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CALENDARIO);
        
        if(ciclos.isEmpty() || centros.isEmpty()){
            initScrapping initScrap = null;
            try {
                initScrap = new initScrapping();
            } catch (IOException ex) {
                Logger.getLogger(ConfigWrite.class.getName()).log(Level.SEVERE, null, ex);
            }
            ciclos = String.join(",", initScrap.getListCiclos());
            centros = String.join(",", initScrap.getListCentros());
        }
        //List<String> ciclos  = Arrays.asList( ciclos.split( "," ) );
        //List<String> centros = Arrays.asList( centros.split( "," ) );
        
        FileInputStream in = null;
        Properties props = null;
        
        try {
            in = new FileInputStream(new File("nbproject/config.properties").getAbsolutePath().replace('\\', '/'));
            props = new Properties();
            props.load(in);
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigWrite.class.getName()).log(Level.SEVERE, null, ex);
        }

        FileOutputStream out;
        try {
            out = new FileOutputStream(new File("nbproject/config.properties").getAbsolutePath().replace('\\', '/'));
            if(ConfigLoad.getInstance().getProperty(ConfigLoad.DATABASE_SERVER).isEmpty())
                props.setProperty(ConfigLoad.DATABASE_SERVER , objConfig.getServidor()); // Servidor de la BD
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_MOSTRARCON).isEmpty())
                props.setProperty(ConfigLoad.SIIAU_MOSTRARCON , objConfig.getMostrarRegConsulta()); // Mostrar la cantidad de reg en consulta
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.DATABASE_CATALOG).isEmpty())
                props.setProperty(ConfigLoad.DATABASE_CATALOG , objConfig.getBaseDatos()); // Nombre base de datos
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_ORDENCON).isEmpty())
                props.setProperty(ConfigLoad.SIIAU_ORDENCON , objConfig.getOrdenConsulta()); // Orden a mostrar de la consulta
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_UNIVERSIDAD).isEmpty())
                props.setProperty(ConfigLoad.SIIAU_UNIVERSIDAD, centros); // Centros de la oferta academica
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.DATABASE_PORT).isEmpty())
                props.setProperty(ConfigLoad.DATABASE_PORT , objConfig.getPuerto()); // Puerto base de datos
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CALACTUAL).isEmpty())
                props.setProperty(ConfigLoad.SIIAU_CALACTUAL , objConfig.getCalendario()); // Calendario actual con el que trabaja el sistema
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.DATABASE_PSWD).isEmpty())
                props.setProperty(ConfigLoad.DATABASE_PSWD , objConfig.getClave()); // Clave del usuario
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.DATABASE_USER).isEmpty())
                props.setProperty(ConfigLoad.DATABASE_USER , objConfig.getUsuario()); // Usuario de la BD
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CUACTUAL).isEmpty())
                props.setProperty(ConfigLoad.SIIAU_CUACTUAL , objConfig.getUniversidad()); // Universidad actual con el que trabaja el sistema
            else if(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CALENDARIO).isEmpty())
                props.setProperty(ConfigLoad.SIIAU_CALENDARIO, ciclos); // Calendarios de la oferta academica
            else 
                System.out.println("El archivo de configuración no tuvo cambios");
                       
            props.store(out, null);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfigWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
