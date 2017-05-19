/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.DAOManager;
import Model.TablaAulas;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author javilubz
 */
public class aulasTableModel extends AbstractTableModel{

    private DAOManager dao;
    private List<TablaAulas> data;

    public aulasTableModel(DAOManager dao) {
        this.dao  = dao;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "NRC";
            case 1: return "Clave";
            case 2: return "Nombre";
            case 3: return "Hora Inicio";
            case 4: return "Hora Final";
            case 5: return "Dia";
            case 6: return "Aula";
            case 7: return "Status";
            case 8: return "ID";
            default: return "";
        }
    }
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TablaAulas getData = data.get(rowIndex);
        switch(columnIndex){
            case 0: return getData.getID_NRC();
            case 1: return getData.getClave();
            case 2: return getData.getNombre();
            case 3: return getData.getHoraInicio();
            case 4: return getData.getHoraFinal();
            case 5: return getData.getDia();
            case 6: return getData.getAula();
            case 7: return getData.getStatus();
            case 8: return getData.getID_ListaHorario();
            default: return "";
        }
    }

    void updateTable(String dia, String edif, Time hrI, Time hrF) throws SQLException {
        data = dao.getLista_HorariosDAO().getTablaAulas(edif, hrI, hrF, dia);
    }
    void updateTable(List<TablaAulas> listDisponibles){
        for(TablaAulas disponible : listDisponibles)
            data.add(disponible);
    }
}
