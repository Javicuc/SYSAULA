/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.DAOManager;
import Model.Edificio;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author javilubz
 */
public class EdificiosTablaModel extends AbstractTableModel{

    private DAOManager dao;
    private List<Edificio> data;

    public EdificiosTablaModel(DAOManager dao) {
        this.dao = dao;
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Edificio";
            case 1: return "Universidad";
            default: return "";
        }
    }
    
    public void updateTable() throws SQLException{
        data = dao.getEdificioDAO().readAll();
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Edificio getData = data.get(rowIndex);
        switch(columnIndex){
            case 0: return getData.getID_Nombre();
            case 1: return getData.getFK_Universidad();
            default: return "";
        }}
    
}
