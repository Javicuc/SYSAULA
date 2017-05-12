/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.InterfaceDAO.iSolicitudDAO;
import Model.Solicitud;
import SQL.Tablas.COLSOLICITUD;
import SQL.Tablas.Tabla;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public class SolicitudDAO implements iSolicitudDAO{

    private Connection con;
    
    final String INSERT = "INSERT INTO " + Tabla.SOLICITUD + " (" + COLSOLICITUD.ASUNTO + ", " + COLSOLICITUD.DESCRIPCION + ", " + COLSOLICITUD.FECHAHORA 
            + ", " + COLSOLICITUD.FK_PROFESOR + ", " + COLSOLICITUD.FK_Aula +") "+ "VALUES (?,?,?,?,?,?)";
    final String UPDATE = "UPDATE "+ Tabla.SOLICITUD + " SET " + COLSOLICITUD.ASUNTO + " = ?, " + COLSOLICITUD.DESCRIPCION + " = ?, " 
            + COLSOLICITUD.FECHAHORA + " = ?, " + COLSOLICITUD.FK_PROFESOR + " = ?, " + COLSOLICITUD.FK_Aula  + " = ? WHERE " 
            + COLSOLICITUD.ID_SOLICITUD + " = ?";
    final String GETALL = "SELECT * FROM " + Tabla.SOLICITUD + " ORDER BY " + COLSOLICITUD.ID_SOLICITUD;
    final String DELETE = "DELETE FROM " + Tabla.SOLICITUD + " WHERE " + COLSOLICITUD.ID_SOLICITUD + " = ?";
    final String GETALLORDERBY = "SELECT * FROM " + Tabla.SOLICITUD + " ORDER BY %s";
    
    public SolicitudDAO(Connection con){
        this.con = con;
    }
    
    @Override
    public boolean crear(Solicitud obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Solicitud> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Solicitud> readAllForInput(String searchValue) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Solicitud raadByID(int primaryKey) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Solicitud obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Solicitud obj) throws SQLException {
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
    public boolean alreadyExisting(Solicitud obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
