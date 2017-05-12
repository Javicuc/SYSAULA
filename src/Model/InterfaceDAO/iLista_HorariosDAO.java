/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Lista_Horarios;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iLista_HorariosDAO {
    public boolean crear(Lista_Horarios obj) throws SQLException;

    public List<Lista_Horarios> readAll() throws SQLException;

    public List<Lista_Horarios> readAllForInput(String searchValue) throws SQLException;

    public Lista_Horarios raadByID(int primaryKey) throws SQLException;

    public boolean update(Lista_Horarios obj) throws SQLException;

    public boolean delete(Lista_Horarios obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(Lista_Horarios obj) throws SQLException;
}
