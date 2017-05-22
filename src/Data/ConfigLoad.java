/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
   
    private ConfigLoad() {
        this.properties = new Properties();
        try {
            properties.load(ConfigLoad.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
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
