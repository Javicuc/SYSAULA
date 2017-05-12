/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Horario;
import Model.InterfaceDAO.iHorarioDAO;
import SQL.Tablas.COLUNIVERSIDAD;
import SQL.Tablas.Tabla;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public class UniversidadDAO implements iHorarioDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.UNIVERSIDAD + " (" + COLUNIVERSIDAD.ID_CENTRO + ", " + COLUNIVERSIDAD.NOMBRE + ", " + COLUNIVERSIDAD.ACRONIMO 
            + ") VALUES (?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.UNIVERSIDAD + " SET " + COLUNIVERSIDAD.NOMBRE + " = ?, " + COLUNIVERSIDAD.ACRONIMO + " = ? WHERE " + COLUNIVERSIDAD.ID_CENTRO + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.UNIVERSIDAD + " ORDER BY " + COLUNIVERSIDAD.ACRONIMO;
    final String DELETE = "DELETE FROM " + Tabla.UNIVERSIDAD + " WHERE " + COLUNIVERSIDAD.ID_CENTRO + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.UNIVERSIDAD + " ORDER BY %s";
    
    public UniversidadDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Horario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Horario> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Horario> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Horario raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Horario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Horario obj) throws SQLException {
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
    public boolean alreadyExisting(Horario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
