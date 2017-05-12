/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.Horario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iHorarioDAO {
    public boolean crear(Horario obj) throws SQLException;

    public List<Horario> readAll() throws SQLException;

    public List<Horario> readAllForInput(String searchValue) throws SQLException;

    public Horario raadByID(int primaryKey) throws SQLException;

    public boolean update(Horario obj) throws SQLException;

    public boolean delete(Horario obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(Horario obj) throws SQLException;
}
