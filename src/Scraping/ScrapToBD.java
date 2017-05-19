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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
       

/**
 *
 * @author javilubz
 */
public class ScrapToBD implements Runnable{
    private Connection con;
    private List<ScrapAula> list;
    
    public ScrapToBD(){
        this.con = BD_Conexion.getInstance();
    }
    public ScrapToBD(List<ScrapAula> list){
        this.con = BD_Conexion.getInstance();
        this.list = list;
    }
    private final String paInsertMateriaHorarios = "{CALL PA_insertMateriasHorarios (?,?,?,?,?,?,?)}";
    private final String paInsertEdificio        = "{CALL PA_insertEdificio (?,?)}";
    private final String paInsertAula            = "{CALL PA_insertAula (?,?,?)}";
    private final String paInsertMaterias        = "{CALL PA_insertMaterias (?,?,?)}";
    private final String paInsertHorario         = "{CALL PA_insertHorario (?,?,?,?)}";
    
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
    public void insertMaterias(ScrapMateria obj){
        try {
            CallableStatement cst = con.prepareCall(paInsertMaterias);
            cst.setInt(1, Integer.valueOf(obj.getNRC()));
            cst.setString(2, obj.getClave());
            cst.setString(3, obj.getNombre());
            cst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public void insertHorario(ScrapMateria obj){
        try {
            CallableStatement cst = con.prepareCall(paInsertHorario);
            cst.setString(1, obj.getHora_Inicio());
            cst.setString(2, obj.getHora_Fin());
            cst.setString(3, obj.getDias());
            cst.setString(4, obj.getNRC());
            cst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertMateriaHoras(List<ScrapAula> list) throws SQLException{
        CallableStatement cst = null;
        try {
            cst = con.prepareCall(paInsertMateriaHorarios);
            for(ScrapAula aula : list){
                int i = 0;
                String id = aula.getEdificio() + aula.getNumero();
                for(ScrapMateria mat: aula.getListMaterias()){
                    cst.setInt(1, Integer.valueOf(mat.getNRC()));
                    cst.setString(2, mat.getClave());
                    cst.setString(3, mat.getNombre());
                    cst.setString(4, mat.getHora_Inicio());
                    cst.setString(5, mat.getHora_Fin());
                    cst.setString(6, mat.getDias());
                    cst.setString(7, id);
                    cst.addBatch();
                    i++;
                    if(i%30 == 0){
                        System.out.println("batch-> " + i);
                        cst.executeBatch();
                    }else
                        cst.executeBatch();
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(cst!=null)
                cst.close();
        }
    }

    @Override
    public void run() {
        try {
            insertMateriaHoras(this.list);
        } catch (SQLException ex) {
            Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
