/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        String host = "127.0.0.1";//host de la base de datos
        String user = "root";//usuario de la base de datos
        String pass = "";//contraseña de la base de datos
        String dtbs = "sysaulaBD";//nombre de la base de datos
        int    port = 3306;
 
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
