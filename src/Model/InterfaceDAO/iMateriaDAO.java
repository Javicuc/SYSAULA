/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Materia;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iMateriaDAO {
    public boolean crear(Materia obj) throws SQLException;

    public List<Materia> readAll() throws SQLException;

    public List<Materia> readAllForInput(String searchValue) throws SQLException;

    public Materia raadByID(int primaryKey) throws SQLException;

    public boolean update(Materia obj) throws SQLException;

    public boolean delete(Materia obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(Materia obj) throws SQLException;
}
