/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scraping;

import SQL.BD_Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import Scraping.ScrapAula;
import Scraping.ScrapEdif;
import Scraping.ScrapMateria;
import java.util.logging.Level;
import java.util.logging.Logger;
       

/**
 *
 * @author javilubz
 */
public class ScrapToBD {
    private Connection con;
    
    public ScrapToBD(){
        this.con = BD_Conexion.getInstance();
    }
    private final String paInsertMateriaHorarios = "{CALL PA_insertMateriasHorarios (?,?,?,?,?,?,?)}";
    private final String paInsertEdificio        = "{CALL PA_insertEdificio (?,?)}";
    private final String paInsertAula            = "{CALL PA_insertAula (?,?,?)}";
    
    void insertEdificio(ScrapEdif obj){
        try {
            CallableStatement cst = con.prepareCall(paInsertEdificio);
            cst.setString(1, obj.getNombre());
            cst.setString(2, obj.getCentro());
            cst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertAula(ScrapAula obj){
        try {
            CallableStatement cst = con.prepareCall(paInsertAula);
            cst.setString(1, obj.getEdificio()+obj.getNumero());
            cst.setString(2, obj.getNumero());
            cst.setString(3, obj.getEdificio());
            cst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertMateriaHorarios(ScrapMateria obj, String id){
        try {
            CallableStatement cst = con.prepareCall(paInsertMateriaHorarios);
            cst.setInt(1, Integer.valueOf(obj.getNRC()));
            cst.setString(2, obj.getClave());
            cst.setString(3, obj.getNombre());
            cst.setString(4, obj.getHora_Inicio());
            cst.setString(5, obj.getHora_Fin());
            cst.setString(6, obj.getDias());
            cst.setString(7, id);
            cst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
