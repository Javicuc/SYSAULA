/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Edificio;
import Model.InterfaceDAO.iEdificioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import SQL.Tablas.COLEDIFICIO;
import SQL.Tablas.Tabla;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class EdificioDAO implements iEdificioDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.EDIFICIO + " (" + COLEDIFICIO.ID_NOMBRE + ", " + COLEDIFICIO.FK_UNIVERSIDAD + ") VALUES (?,?)";
    final String UPDATE = "UPDATE " + Tabla.EDIFICIO + " SET "+ COLEDIFICIO.ID_NOMBRE + " = ?," + COLEDIFICIO.FK_UNIVERSIDAD + " = ? "
            + "WHERE " + COLEDIFICIO.ID_NOMBRE + " = ?";
    final String GETONE = "SELECT * FROM " + Tabla.EDIFICIO + " WHERE " + COLEDIFICIO.ID_NOMBRE + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.EDIFICIO + " ORDER BY " + COLEDIFICIO.ID_NOMBRE;
    final String DELETE = "DELETE FROM " + Tabla.EDIFICIO + " WHERE " + COLEDIFICIO.ID_NOMBRE + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.EDIFICIO + " ORDER BY %s";
    
    public EdificioDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Edificio obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setString(1, obj.getID_Nombre());
            ps.setString(2, obj.getFK_Universidad());
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
    public List<Edificio> readAll() throws SQLException {
        List<Edificio> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Edificio e = convertirRS(rs);
                list.add(e);
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
    public List<Edificio> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Edificio raadByID(String primaryKey) throws SQLException {
        Edificio obj = null;
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
    public boolean update(Edificio obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, obj.getFK_Universidad());
            ps.setString(2, obj.getID_Nombre());
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
    public boolean delete(Edificio obj) throws SQLException {
         boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setString(1, obj.getID_Nombre());
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
    public boolean alreadyExisting(Edificio obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Edificio convertirRS(ResultSet rs) {
        Edificio edif = null;
        try {
            String id_edif = rs.getString(COLEDIFICIO.ID_NOMBRE);
            String fk_univ  = rs.getString(COLEDIFICIO.FK_UNIVERSIDAD);
            edif = new Edificio(id_edif,fk_univ);
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return edif;
    }
    
}
