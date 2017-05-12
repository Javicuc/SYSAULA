/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iMateriaDAO;
import Model.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import SQL.Tablas.Tabla;
import SQL.Tablas.COLMATERIA;

/**
 *
 * @author javilubz
 */
public class MateriaDAO implements iMateriaDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.MATERIA + " (" + COLMATERIA.ID_NRC + ", " + COLMATERIA.Clave + ", " + COLMATERIA.NOMBRE 
            + ") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.MATERIA + " SET " + COLMATERIA.Clave + " = ?, " + COLMATERIA.NOMBRE + " = ? WHERE " + COLMATERIA.ID_NRC + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.MATERIA + " ORDER BY " + COLMATERIA.NOMBRE;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Materia> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Materia obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Materia obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
