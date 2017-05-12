/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iMateriaHorarioDAO;
import Model.MateriaHorario;
import java.sql.SQLException;
import java.util.List;
import SQL.Tablas.Tabla;
import SQL.Tablas.COLMATERIAHORARIO;
import java.sql.Connection;
/**
 *
 * @author javilubz
 */
public class MateriaHorarioDAO implements iMateriaHorarioDAO{
    
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.MATERIAHORARIO + " (" + COLMATERIAHORARIO.FK_MATERIA + ", " + COLMATERIAHORARIO.FK_HORARIO + ") VALUES (?,?)";
    final String UPDATE = "UPDATE " + Tabla.MATERIAHORARIO + " SET " + COLMATERIAHORARIO.FK_MATERIA + " = ?, " + COLMATERIAHORARIO.FK_HORARIO 
            + " = ? WHERE " + COLMATERIAHORARIO.FK_MATERIA + " = ? AND " + COLMATERIAHORARIO.FK_HORARIO + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.MATERIAHORARIO + " ORDER BY " + COLMATERIAHORARIO.FK_MATERIA;
    final String DELETE = "DELETE FROM " + Tabla.MATERIAHORARIO + " WHERE " + COLMATERIAHORARIO.FK_MATERIA + " = ? AND " + COLMATERIAHORARIO.FK_HORARIO + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.MATERIAHORARIO + " ORDER BY %s";
    
    public MateriaHorarioDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(MateriaHorario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MateriaHorario> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MateriaHorario> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MateriaHorario raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(MateriaHorario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(MateriaHorario obj) throws SQLException {
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
    public boolean alreadyExisting(MateriaHorario obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
