/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Universidad;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iUniversidadDAO {
    public boolean crear(Universidad obj) throws SQLException;

    public List<Universidad> readAll() throws SQLException;

    public List<Universidad> readAllForInput(String searchValue) throws SQLException;

    public Universidad raadByID(String primaryKey) throws SQLException;

    public boolean update(Universidad obj) throws SQLException;

    public boolean delete(Universidad obj) throws SQLException;

    public boolean deleteByID(String primaryKey) throws SQLException;

    public boolean alreadyExisting(String primaryKey) throws SQLException;

    public boolean alreadyExisting(Universidad obj) throws SQLException;
}
