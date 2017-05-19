/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Aula;
import Model.InterfaceDAO.iMateriaDAO;
import Model.Materia;
import SQL.Tablas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import SQL.Tablas.Tabla;
import SQL.Tablas.COLMATERIA;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javilubz
 */
public class MateriaDAO implements iMateriaDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.MATERIA + " (" + COLMATERIA.ID_NRC + ", " + COLMATERIA.CLAVE + ", " + COLMATERIA.NOMBRE 
            + ") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.MATERIA + " SET " + COLMATERIA.CLAVE + " = ?, " + COLMATERIA.NOMBRE + " = ? WHERE " + COLMATERIA.ID_NRC + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.MATERIA + " ORDER BY " + COLMATERIA.NOMBRE;
    final String GETONE = "SELECT * FROM " + Tabla.MATERIA + " WHERE " + COLMATERIA.ID_NRC + " = ?";
    final String DELETE = "DELETE FROM " + Tabla.MATERIA + " WHERE " + COLMATERIA.ID_NRC + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.MATERIA + " ORDER BY %s";
    
    public MateriaDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Materia obj) throws SQLException {
        boolean insertar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(INSERT);
            ps.setInt(1, obj.getID_NRC());
            ps.setString(2, obj.getClave());
            ps.setString(3, obj.getNombre());
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
    public List<Materia> readAll() throws SQLException {
        List<Materia> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(GETALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Materia obj = convertirRS(rs);
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
    public List<Materia> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia raadByID(int primaryKey) throws SQLException {
        Materia obj = null;
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
    public boolean update(Materia obj) throws SQLException {
        boolean actualizar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(UPDATE);
            ps.setString(1, obj.getClave());
            ps.setString(2, obj.getNombre());
            ps.setInt(3, obj.getID_NRC());
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
    public boolean delete(Materia obj) throws SQLException {
        boolean eliminar = false;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(DELETE);
            ps.setInt(1, obj.getID_NRC());
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
    public boolean alreadyExisting(Materia obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Materia convertirRS(ResultSet rs) {
        Materia mat = null;
        try {
            int    id_nrc = rs.getInt(COLMATERIA.ID_NRC);
            String clave   = rs.getString(COLMATERIA.CLAVE);
            String nombre  = rs.getString(COLMATERIA.NOMBRE);
            mat = new Materia(id_nrc, clave, nombre);
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mat;
    }
    
}
