/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Horario;
import Model.InterfaceDAO.iHorarioDAO;
import Model.InterfaceDAO.iUniversidadDAO;
import Model.Universidad;
import SQL.Tablas;
import SQL.Tablas.COLUNIVERSIDAD;
import SQL.Tablas.Tabla;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class UniversidadDAO implements iUniversidadDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.UNIVERSIDAD + " (" + COLUNIVERSIDAD.ID_CENTRO + ", " + COLUNIVERSIDAD.NOMBRE + ", " + COLUNIVERSIDAD.ACRONIMO 
            + ") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.UNIVERSIDAD + " SET " + COLUNIVERSIDAD.NOMBRE + " = ?, " + COLUNIVERSIDAD.ACRONIMO + " = ? WHERE " + COLUNIVERSIDAD.ID_CENTRO + " = ?";
    final String GETONE = "SELECT * FROM " + Tabla.UNIVERSIDAD + " WHERE " + COLUNIVERSIDAD.ID_CENTRO + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.UNIVERSIDAD + " ORDER BY " + COLUNIVERSIDAD.ACRONIMO;
    final String DELETE = "DELETE FROM " + Tabla.UNIVERSIDAD + " WHERE " + COLUNIVERSIDAD.ID_CENTRO + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.UNIVERSIDAD + " ORDER BY %s";
    
    public UniversidadDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Universidad obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setString(1, obj.getID_Centro());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getAcronimo());
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
    public List<Universidad> readAll() throws SQLException {
        List<Universidad> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Universidad obj = convertirRS(rs);
                list.add(obj);
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
    public List<Universidad> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Universidad raadByID(String primaryKey) throws SQLException {
        Universidad obj = null;
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
    public boolean update(Universidad obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, obj.getID_Centro());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getAcronimo());
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
    public boolean delete(Universidad obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setString(1, obj.getID_Centro());
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
    public boolean alreadyExisting(Universidad obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Universidad convertirRS(ResultSet rs) {
        Universidad univ = null;
        try {
            String id_univ = rs.getString(COLUNIVERSIDAD.ID_CENTRO);
            String nombre  = rs.getString(COLUNIVERSIDAD.NOMBRE);
            String acron   = rs.getString(COLUNIVERSIDAD.ACRONIMO);
            univ = new Universidad(id_univ, nombre, acron);
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return univ;
    }
    
}
