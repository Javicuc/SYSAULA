/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.DAOManager;
import Model.Profesor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author javilubz
 */
public class ProfesoresTablaModel extends AbstractTableModel{

    private DAOManager dao;
    private List<Profesor> data;

    public ProfesoresTablaModel(DAOManager dao) {
        this.dao = dao;
    }
    
     @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID";
            case 1: return "Nombre";
            case 2: return "Departamento";
            case 3: return "Universidad";
            default: return "";
        }
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Profesor getData = data.get(rowIndex);
        switch(columnIndex){
            case 0: return getData.getID_Profesor();
            case 1: return getData.getNombre();
            case 2: return getData.getDepartamento();
            case 3: return getData.getFK_Universidad();
            default: return "";
        }
    }
    
    public void updateTable() throws SQLException{
        data = dao.getProfesorDAO().readAll();
    }
    
}
