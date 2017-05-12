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

/**
 *
 * @author javilubz
 */
public class ProfesorDAO implements iProfesorDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.PROFESOR + " (" + COLPROFESOR.ID_PROFESOR + ", " + COLPROFESOR.NOMBRE + ", " + COLPROFESOR.FK_CENTRO 
            + ") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.PROFESOR + " SET " + COLPROFESOR.NOMBRE + " = ?, " + COLPROFESOR.FK_CENTRO + " = ? WHERE " + COLPROFESOR.ID_PROFESOR + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.PROFESOR + " ORDER BY " + COLPROFESOR.NOMBRE;
    final String DELETE = "DELETE FROM " + Tabla.PROFESOR + " WHERE " + COLPROFESOR.ID_PROFESOR + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.PROFESOR + " ORDER BY %s";
    
    public ProfesorDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Profesor obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Profesor obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Profesor obj) throws SQLException {
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
    public boolean alreadyExisting(Profesor obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
