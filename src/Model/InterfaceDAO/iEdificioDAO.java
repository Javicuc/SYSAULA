/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Edificio;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iEdificioDAO {
    public boolean crear(Edificio obj) throws SQLException;

    public List<Edificio> readAll() throws SQLException;

    public List<Edificio> readAllForInput(String searchValue) throws SQLException;

    public Edificio raadByID(String primaryKey) throws SQLException;

    public boolean update(Edificio obj) throws SQLException;

    public boolean delete(Edificio obj) throws SQLException;

    public boolean deleteByID(String primaryKey) throws SQLException;

    public boolean alreadyExisting(String primaryKey) throws SQLException;

    public boolean alreadyExisting(Edificio obj) throws SQLException;
}
