/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author javilubz
 */
public class ConfigLoad {
    
    Properties properties = null;
 
    /** Archivo de configuracion */
    public final static String CONFIG_FILE_NAME = "config.properties";
 
    /** Servidor base de datos */
    public final static String DATABASE_SERVER = "dataBaseServer";
 
    /** Nombre base de datos */
    public final static String DATABASE_CATALOG = "dataBaseCatalog";
 
    /** Usuario base de datos */
    public final static String DATABASE_USER = "dataBaseUser";
 
    /** Clave base de datos */
    public final static String DATABASE_PSWD = "dataBasePassword";
    
    /** Puerto base de datos */
    public final static String DATABASE_PORT = "dataBasePort";
    
    /** Centro universitario actual */
    public final static String SIIAU_CUACTUAL = "siiauUniversidad";
    
    /** Calendario actual */
    public final static String SIIAU_CALACTUAL = "siiauCalendario";
    
    /** Orden consulta */
    public final static String SIIAU_ORDENCON = "siiauOrden";
    
    /** Mostrar registros consulta */
    public final static String SIIAU_MOSTRARCON = "siiauMostrar";
    
    /** Lista de Calendarios */
    public final static String SIIAU_CALENDARIO = "siiauCalendarios";
    
    /** Lista de Universidades */
    public final static String SIIAU_UNIVERSIDAD = "siiauUniversidades";
    
    /** Lista de Edificios Cucei*/
    public final static String SIIAU_EDIFSCUCEI = "siiauEdifsCucei";
    
   
    public static ConfigSysAula getAllProperties(){
        
        ConfigLoad now = ConfigLoad.getInstance();
        
        ConfigSysAula configNow = new ConfigSysAula();
        configNow.setBaseDatos(now.getProperty(DATABASE_CATALOG));
        configNow.setCalendario(now.getProperty(SIIAU_CALACTUAL));
        configNow.setClave(now.getProperty(DATABASE_PSWD));
        configNow.setMostrarRegConsulta(now.getProperty(SIIAU_MOSTRARCON));
        configNow.setOrdenConsulta(now.getProperty(SIIAU_ORDENCON));
        configNow.setPuerto(now.getProperty(DATABASE_PORT));
        configNow.setServidor(now.getProperty(DATABASE_SERVER));
        configNow.setUniversidad(now.getProperty(SIIAU_CUACTUAL));
        configNow.setUsuario(now.getProperty(DATABASE_USER));
        
        return configNow;
    }
    
    private ConfigLoad() {
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("nbproject/config.properties").getAbsolutePath().replace('\\', '/')));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//Configuration
 
    /**
     * Implementando Singleton
     *
     * @return
     */
    public static ConfigLoad getInstance() {
        return ConfigurationHolder.INSTANCE;
    }
 
    private static class ConfigurationHolder {
 
        private static final ConfigLoad INSTANCE = new ConfigLoad();
    }
 
    /**
     * Retorna la propiedad de configuración solicitada
     *
     * @param key
     * @return
     */
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }//getProperty   
}
