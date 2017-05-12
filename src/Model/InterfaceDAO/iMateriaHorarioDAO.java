/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.InterfaceDAO;

import Model.MateriaHorario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author javilubz
 */
public interface iMateriaHorarioDAO {
    public boolean crear(MateriaHorario obj) throws SQLException;

    public List<MateriaHorario> readAll() throws SQLException;

    public List<MateriaHorario> readAllForInput(String searchValue) throws SQLException;

    public MateriaHorario raadByID(int primaryKey) throws SQLException;

    public boolean update(MateriaHorario obj) throws SQLException;

    public boolean delete(MateriaHorario obj) throws SQLException;

    public boolean deleteByID(int primaryKey) throws SQLException;

    public boolean alreadyExisting(int primaryKey) throws SQLException;

    public boolean alreadyExisting(MateriaHorario obj) throws SQLException;
}
