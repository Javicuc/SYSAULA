/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TablaAulas;
import Data.ConfigLoad;
import Model.Aula;
import Model.DAO.DAOManager;
import Model.Horario;
import Model.Materia;
import SQL.BD_Conexion;
import Scraping.ScrapToBD;
import View.AulaView;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.optionalusertools.TimeChangeListener;
import com.github.lgooddatepicker.zinternaltools.TimeChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author javilubz
 */
public class AulaController implements ActionListener{

    private HorariosTableModel aulatbModel;
    private TablaAulas aula;
    
    private String universidad;
    private AulaView view;
    private DAOManager dao;
    private JComboBox cbEdificio;
    private JComboBox cbAula;
    private JButton btAgregar;
    private JTable tablaAulas;
    private JCheckBox cbxLunes;
    private JCheckBox cbxMartes;
    private JCheckBox cbxMiercoles;
    private JCheckBox cbxJueves;
    private JCheckBox cbxViernes;
    private JCheckBox cbxSabado;
    private TimePicker tpHoraInicio;
    private TimePicker tpHoraFinal;
    
    
    public AulaController(AulaView aView) throws SQLException {
        this.view = aView;
        this.dao = new DAOManager();
        this.universidad = ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CUACTUAL);
        
        this.btAgregar   = view.getBtAgregar(); 
        this.btAgregar.addActionListener(this);
        
        
        this.cbAula     = view.getCbAula();
        this.cbEdificio = view.getCbEdificio();
        this.cbEdificio.setModel(new DefaultComboBoxModel(dao.getEdificioDAO().raadAllByID(this.universidad).toArray()));
        cbAula.setModel(new DefaultComboBoxModel(dao.getAulaDAO().readAllForInput(this.cbEdificio.getSelectedItem().toString()).toArray()));
        this.cbEdificio.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    try {
                        System.out.println(e.getItem().toString());
                        cbAula.setModel(new DefaultComboBoxModel(dao.getAulaDAO().readAllForInput(e.getItem().toString()).toArray()));
                    } catch (SQLException ex) {
                        Logger.getLogger(AulaController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
                
        
        this.cbxLunes  = view.getCbLunes();
        this.cbxMartes = view.getCbMartes();
        this.cbxMiercoles = view.getCbMiercoles();
        this.cbxJueves = view.getCbJueves();
        this.cbxViernes = view.getCbViernes();
        this.cbxSabado = view.getCbSabado();
        
        this.aulatbModel = new HorariosTableModel(dao);
        this.aulatbModel.updateTable();
        this.tablaAulas = view.getTablaAulas();
        this.tablaAulas.setModel(aulatbModel);
        this.tablaAulas.getColumnModel().getColumn(8).setWidth(0);
        this.tablaAulas.getColumnModel().getColumn(8).setMinWidth(0);
        this.tablaAulas.getColumnModel().getColumn(8).setMaxWidth(0);
        this.tablaAulas.getColumnModel().getColumn(7).setWidth(0);
        this.tablaAulas.getColumnModel().getColumn(7).setMinWidth(0);
        this.tablaAulas.getColumnModel().getColumn(7).setMaxWidth(0);
        this.tablaAulas.getColumnModel().getColumn(0).setWidth(0);
        this.tablaAulas.getColumnModel().getColumn(0).setMinWidth(0);
        this.tablaAulas.getColumnModel().getColumn(0).setMaxWidth(0);
        this.tablaAulas.getColumnModel().getColumn(1).setWidth(0);
        this.tablaAulas.getColumnModel().getColumn(1).setMinWidth(0);
        this.tablaAulas.getColumnModel().getColumn(1).setMaxWidth(0); 
        
        this.tpHoraInicio = view.getTpHoraInicio();
        this.tpHoraFinal  = view.getTpHoraFin();
        this.tpHoraInicio.addTimeChangeListener(new TimeChangeListener() {
            @Override
            public void timeChanged(TimeChangeEvent tce) {
                if(tpHoraInicio.getTime().getHour() > 20){
                    tpHoraInicio.setTime(LocalTime.of(20, 0));
                    tpHoraFinal.setTime(LocalTime.of(21, 0));
                }
                else if(tpHoraInicio.getTime().getHour() < 7){
                    tpHoraInicio.setTime(LocalTime.of(7, 0));
                    tpHoraFinal.setTime(LocalTime.of(8,0));
                }else if(tpHoraInicio.getTime() == tpHoraFinal.getTime())
                    tpHoraFinal.setTime(LocalTime.of(tpHoraInicio.getTime().getHour() + 1,0));
            }
        });
        this.tpHoraInicio.setTime(LocalTime.of(7, 0));
        this.tpHoraFinal.addTimeChangeListener(new TimeChangeListener() {
            @Override
            public void timeChanged(TimeChangeEvent tce) {
                if(tpHoraFinal.getTime().getHour() > 21 ){
                    tpHoraFinal.setTime(LocalTime.of(21, 0));
                    tpHoraInicio.setTime(LocalTime.of(20, 0));
                }else if(tpHoraFinal.getTime().getHour() < 8){
                    tpHoraFinal.setTime(LocalTime.of(8, 0));
                    tpHoraInicio.setTime(LocalTime.of(7, 0));
                }else if(tpHoraFinal.getTime() == tpHoraInicio.getTime())
                    tpHoraInicio.setTime(LocalTime.of(tpHoraFinal.getTime().getHour()+1,0));
            }
        });
        this.tpHoraFinal.setTime(LocalTime.of(8, 0));
    }
    
    private List<String> getDiasSelect(){
        List<String> dias = new ArrayList<>();
        if(cbxLunes.isSelected())
            dias.add("L");
        else if(cbxMartes.isSelected())
            dias.add("M");
        else if(cbxMiercoles.isSelected())
            dias.add("I");
        else if(cbxJueves.isSelected())
            dias.add("J");
        else if(cbxViernes.isSelected())
            dias.add("V");
        else if(cbxSabado.isSelected())
            dias.add("S");
        return dias;
    }
    
    private TablaAulas getAulaSelect() throws SQLException{
        TablaAulas temp = null;
        if(tablaAulas.getSelectedRow() != -1){
            int    id   = (int) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),0);
            String clave = (String) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),1);
            String nombre = (String) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),2);
            boolean status = (boolean) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),7);
            String aula = (String) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),6);
            Time   horaInicio = (Time) tablaAulas.getValueAt(tablaAulas.getSelectedRow(), 3);
            Time   horaFinal  = (Time) tablaAulas.getValueAt(tablaAulas.getSelectedRow(), 4);
            String dia        = (String) tablaAulas.getValueAt(tablaAulas.getSelectedRow(), 5);
            int idListaHorario = (int) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),8);
            temp = new TablaAulas(id, clave, nombre, horaInicio, horaFinal, dia, aula, status, idListaHorario);
        }
        return temp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object source = e.getSource();
            if(source == btAgregar)
                btAgregarPerformed();
        } catch (SQLException ex) {
            Logger.getLogger(AulaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btAgregarPerformed() throws SQLException {
        String materia = view.getTfNombreMateria().getText().trim();
        String nrc     = view.getTfNrc().getText().trim();
        String clave   = view.getTfClave().getText().trim();
        String edif    = cbEdificio.getSelectedItem().toString();
        String aula    = cbAula.getSelectedItem().toString();
        List<String> listdias = getDiasSelect();
        String dias = String.join("", listdias);
        Time horaInicio = Time.valueOf(tpHoraInicio.getTime());
        Time horaFinal  = Time.valueOf(tpHoraFinal.getTime());
        if(!materia.isEmpty() || !clave.isEmpty() || !dias.isEmpty() || !nrc.isEmpty()){
            
            Aula    tempAula    = new Aula(edif+aula, aula, edif);
            Materia tempMat     = new Materia(Integer.valueOf(nrc), clave, materia);
            Horario tempHorario = new Horario(horaInicio, horaFinal, dias, Integer.valueOf(nrc));
            System.out.println(tempAula);
            System.out.println(tempMat);
            System.out.println(tempHorario);
            
            Connection con = BD_Conexion.getInstance();
            
            String paInsertAulaFull = "{CALL PA_insertAulaFull (?,?,?,?,?,?,?,?,?)}";
            CallableStatement cst = con.prepareCall(paInsertAulaFull);
            try {
                cst.setString(1,edif+aula);
                cst.setString(2,aula);
                cst.setString(3, edif);
                cst.setInt(4, Integer.valueOf(nrc));
                cst.setString(5,clave);
                cst.setString(6,materia);
                cst.setTime(7, horaInicio);
                cst.setTime(8, horaFinal);
                cst.setString(9, dias);
                if(cst.execute())
                    JOptionPane.showMessageDialog(null, "Aula Registrada", "Registrada", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ScrapToBD.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                if(cst != null)
                    cst.close();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Complete el formulario", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
