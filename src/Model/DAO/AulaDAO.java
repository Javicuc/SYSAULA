/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Aula;
import Model.InterfaceDAO.iAulaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import SQL.Tablas.COLAULA;
import SQL.Tablas.Tabla;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author javilubz
 */
public class AulaDAO implements iAulaDAO{
    
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.AULA + " (" + COLAULA.ID_AULA + ", " + COLAULA.NUMERO + ", " + COLAULA.FK_EDIFICIO +") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.AULA + " SET " + COLAULA.NUMERO + " = ?, " + COLAULA.FK_EDIFICIO + " = ? WHERE " + COLAULA.ID_AULA + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.AULA + " ORDER BY " + COLAULA.NUMERO;
    final String GETBYEDIF = "SELECT * FROM " + Tabla.AULA + " WHERE " + COLAULA.FK_EDIFICIO + " = ?";
    final String GETONE = "SELECT * FROM " + Tabla.AULA + " WHERE " + COLAULA.ID_AULA + " = ?";
    final String DELETE = "DELETE FROM " + Tabla.AULA + " WHERE " + COLAULA.ID_AULA + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.AULA + " ORDER BY %s";
    
    public AulaDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Aula obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setString(1, obj.getID_Aula());
            ps.setString(2, obj.getNumero());
            ps.setString(3, obj.getFK_Edificio());
            ps.executeUpdate();
            insertar = true;
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch(SQLException e) {
                    throw new SQLException(e);
                }
            }
        }
        return insertar;
    }

    @Override
    public List<Aula> readAll() throws SQLException {
        List<Aula> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Aula a = convertirRS(rs);
                list.add(a);
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }    
            }
        }
        return list;
    }

    @Override
    public List<Aula> readAllForInput(String searchValue) throws SQLException {
        List<Aula> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETBYEDIF);
            ps.setString(1, searchValue);
            rs = ps.executeQuery();
            while(rs.next()){
                Aula a = convertirRS(rs);
                list.add(a);
            }
        }catch(SQLException e){
            throw new SQLException(e);
        }finally{
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }    
            }
        }
        return list;
    }

    @Override
    public Aula raadByID(String primaryKey) throws SQLException {
        Aula obj = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETONE);
            ps.setString(1, primaryKey);
            rs = ps.executeQuery();
            while (rs.next()) 
                obj = convertirRS(rs);
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new SQLException(e);
                }    
            }
        }
        return obj;
    }

    @Override
    public boolean update(Aula obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, obj.getNumero());
            ps.setString(2, obj.getFK_Edificio());
            ps.setString(3, obj.getID_Aula());
            ps.executeUpdate();
            actualizar = true;
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch(SQLException e) {
                    throw new SQLException(e);
                }
            }
        }
        return actualizar;
    }

    @Override
    public boolean delete(Aula obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setString(1, obj.getID_Aula());
            if(ps.executeUpdate() != 0)
                eliminar = true;
        } catch (SQLException e) {
            throw new SQLException(e);
        } finally {
            if(ps != null){
                try {
                    ps.close();
                } catch(SQLException e) {
                    throw new SQLException(e);
                }
            }
        }
        return eliminar;
    }

    @Override
    public boolean deleteByID(String primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alreadyExisting(String primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alreadyExisting(Aula obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Aula convertirRS(ResultSet rs) {
        Aula aula = null;
        try {
            String id_aula = rs.getString(COLAULA.ID_AULA);
            String numero  = rs.getString(COLAULA.NUMERO);
            String fk_edif = rs.getString(COLAULA.FK_EDIFICIO);
            aula = new Aula(id_aula, numero, fk_edif);
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aula;
    }

    
}
