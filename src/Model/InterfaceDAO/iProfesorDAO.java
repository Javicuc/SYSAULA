/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Profesor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iProfesorDAO {
    public boolean crear(Profesor obj) throws SQLException;

    public List<Profesor> readAll() throws SQLException;

    public List<Profesor> readAllForInput(String searchValue) throws SQLException;

    public Profesor raadByID(int primaryKey) throws SQLException;

    public boolean update(Profesor obj) throws SQLException;

    public boolean delete(Profesor obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(Profesor obj) throws SQLException;
}
