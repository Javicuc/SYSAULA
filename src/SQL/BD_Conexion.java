/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Data.ConfigLoad;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class BD_Conexion {
static Connection conex;
    private static BD_Conexion INSTANCE;

    private BD_Conexion(){
        try {
            performConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BD_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static synchronized void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BD_Conexion();
        }
    }

    public static Connection getInstance() {    
        if (INSTANCE == null) createInstance();
        return conex;
    }

    public static void delInstance() {
        INSTANCE = null;
        closeConnection();
    }

    private void performConnection() throws ClassNotFoundException {
        ConfigLoad load = ConfigLoad.getInstance();
        
        String host = load.getProperty(ConfigLoad.DATABASE_SERVER);//host de la base de datos
        String dtbs = load.getProperty(ConfigLoad.DATABASE_CATALOG);//nombre de la base de datos
        String user = load.getProperty(ConfigLoad.DATABASE_USER);//usuario de la base de datos
        String pass = load.getProperty(ConfigLoad.DATABASE_PSWD);//contraseña de la base de datos
        int    port = Integer.valueOf(load.getProperty(ConfigLoad.DATABASE_PORT)); // Puerto de la base de datos
        
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            String newConnectionURL = "jdbc:mysql://" + host + ":" + port + "/" + dtbs + "?&useSSL=false";
            conex = DriverManager.getConnection(newConnectionURL,user,pass);
        } catch (SQLException e) {
            Logger.getLogger(BD_Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void closeConnection() {
       try {
            conex.close();
        } catch (SQLException e) {
            Logger.getLogger(BD_Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
