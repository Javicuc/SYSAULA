/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iProfesorDAO;
import Model.Profesor;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import SQL.Tablas.Tabla;
import SQL.Tablas.COLPROFESOR;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class ProfesorDAO implements iProfesorDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.PROFESOR + " (" + COLPROFESOR.NOMBRE + ", " + COLPROFESOR.DEPARTAMENTO + ", " + COLPROFESOR.FK_CENTRO + ") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.PROFESOR + " SET " + COLPROFESOR.NOMBRE + " = ?, " +COLPROFESOR.DEPARTAMENTO +" = ?, "
                          + COLPROFESOR.FK_CENTRO + " = ? WHERE " + COLPROFESOR.ID_PROFESOR + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.PROFESOR + " ORDER BY " + COLPROFESOR.NOMBRE;
    final String GETONE = "SELECT * FROM " + Tabla.PROFESOR + " WHERE " + COLPROFESOR.ID_PROFESOR + " = ?";
    final String DELETE = "DELETE FROM " + Tabla.PROFESOR + " WHERE " + COLPROFESOR.ID_PROFESOR + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.PROFESOR + " ORDER BY %s";
    
    public ProfesorDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Profesor obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDepartamento());
            ps.setString(3, obj.getFK_Universidad());
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
    public List<Profesor> readAll() throws SQLException {
        List<Profesor> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Profesor obj = convertirRS(rs);
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
    public List<Profesor> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor raadByID(int primaryKey) throws SQLException {
        Profesor obj = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(GETONE);
            ps.setInt(1, primaryKey);
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
    public boolean update(Profesor obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDepartamento());
            ps.setString(3, obj.getFK_Universidad());
            ps.setInt(4, obj.getID_Profesor());
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
    public boolean delete(Profesor obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setInt(1, obj.getID_Profesor());
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
    public boolean deleteByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alreadyExisting(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alreadyExisting(Profesor obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Profesor convertirRS(ResultSet rs) {
        Profesor obj = null;
        try {
            int    id_prof = rs.getInt(COLPROFESOR.ID_PROFESOR);
            String nombre  = rs.getString(COLPROFESOR.NOMBRE);
            String dpto    = rs.getString(COLPROFESOR.DEPARTAMENTO);
            String centro  = rs.getString(COLPROFESOR.FK_CENTRO);
            obj = new Profesor(id_prof, nombre, dpto,centro);
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
}
