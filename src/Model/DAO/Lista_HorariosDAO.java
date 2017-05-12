/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iLista_HorariosDAO;
import Model.Lista_Horarios;
import SQL.Tablas.Tabla;
import SQL.Tablas.COLLISTAHORARIOS;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public class Lista_HorariosDAO implements iLista_HorariosDAO{
    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.LISTA_HORARIOS + " (" + COLLISTAHORARIOS.FK_AULA + ", " + COLLISTAHORARIOS.FK_MATERIA + ", " 
            + COLLISTAHORARIOS.FK_PROFESOR + ", " + COLLISTAHORARIOS.STATUS + ") VALUES (?,?,?,?)";
    final String UPDATE = "UPDATE " + Tabla.LISTA_HORARIOS + " SET " + COLLISTAHORARIOS.STATUS + " = ? WHERE " 
            + COLLISTAHORARIOS.FK_AULA + " = ? AND " + COLLISTAHORARIOS.FK_MATERIA + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.LISTA_HORARIOS + " ORDER BY " + COLLISTAHORARIOS.STATUS;
    final String DELETE = "DELETE FROM " + Tabla.LISTA_HORARIOS +" WHERE " + COLLISTAHORARIOS.FK_AULA + " = ? AND " + COLLISTAHORARIOS.FK_MATERIA + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.LISTA_HORARIOS + " ORDER BY %s";
    
    public Lista_HorariosDAO(Connection con){
        this.con = con;
    }
    @Override
    public boolean crear(Lista_Horarios obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lista_Horarios> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lista_Horarios> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lista_Horarios raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Lista_Horarios obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Lista_Horarios obj) throws SQLException {
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
    public boolean alreadyExisting(Lista_Horarios obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
