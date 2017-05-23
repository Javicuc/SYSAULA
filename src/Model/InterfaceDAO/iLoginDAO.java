/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Login;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iLoginDAO {
    
    public boolean crear(Login obj) throws SQLException;

    public List<Login> readAll() throws SQLException;

    public List<Login> readAllForInput(String searchValue) throws SQLException;

    public Login raadByID(int primaryKey) throws SQLException;

    public boolean update(Login obj) throws SQLException;

    public boolean delete(Login obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(Login obj) throws SQLException;
}
