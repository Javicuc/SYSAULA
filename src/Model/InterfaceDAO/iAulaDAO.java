/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Aula;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iAulaDAO {
    
    public boolean crear(Aula obj) throws SQLException;

    public List<Aula> readAll() throws SQLException;

    public List<Aula> readAllForInput(String searchValue) throws SQLException;

    public Aula raadByID(String primaryKey) throws SQLException;

    public boolean update(Aula obj) throws SQLException;

    public boolean delete(Aula obj) throws SQLException;

    public boolean deleteByID(String primaryKey) throws SQLException;

    public boolean alreadyExisting(String primaryKey) throws SQLException;

    public boolean alreadyExisting(Aula obj) throws SQLException;

}
