package Controller;

import java.awt.Color;
import java.awt.Component;
import java.sql.Time;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author javilubz
 */
public class HorariosTablaRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JLabel cellComponent = (JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        cellComponent.setHorizontalAlignment(CENTER);
        if(value instanceof Boolean){
            value  = (Boolean)value;
            if(column == 7){
                if(value.equals(true)){
                    cellComponent.setText("DISPONIBLE");
                    cellComponent.setForeground(Color.GREEN);
                }else{
                    cellComponent.setText("OCUPADO");
                    cellComponent.setForeground(Color.RED);
                }
            }
        }else
            cellComponent.setForeground(new java.awt.Color(102, 102, 255));
        
        return cellComponent;
    }
}
