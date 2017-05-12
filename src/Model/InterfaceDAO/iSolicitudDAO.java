/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Solicitud;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iSolicitudDAO {
    public boolean crear(Solicitud obj) throws SQLException;

    public List<Solicitud> readAll() throws SQLException;

    public List<Solicitud> readAllForInput(String searchValue) throws SQLException;

    public Solicitud raadByID(int primaryKey) throws SQLException;

    public boolean update(Solicitud obj) throws SQLException;

    public boolean delete(Solicitud obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(Solicitud obj) throws SQLException;
}
