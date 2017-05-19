/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aula;
import Model.DAO.DAOManager;
import Model.TablaAulas;
import View.MainView;
import View.SolicitudView;
import com.github.lgooddatepicker.components.TimePicker;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.text.TabableView;

/**
 *
 * @author javilubz
 */
public class MainViewcontroller implements ActionListener{
    
    private DAOManager dao;
    private MainView view;
    private aulasTableModel aulatbModel;
    private TablaAulas aula;
    
    private List<TablaAulas> data = new ArrayList<>();
    private List<Aula> dataAula = new ArrayList<>();
    private List<String> dias = asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"); 
    
    private JButton btSolicitar;
    private JButton btActualizar;
    private JButton btAula;
    private JButton btEdificio;
    private JButton btProfesor;
    private TimePicker tpHoraInicio;
    private TimePicker tpHoraFinal;
    private JComboBox cbEdificio;
    private JComboBox cbDias;
    private JTable    tablaAulas;
    private JPanel    panelRegistros;
    
    private String dia;
    private String edif;
    private Time   hrI;
    private Time   hrF;
    
    public MainViewcontroller(MainView view) throws SQLException{
        this.view = view;
        this.dao = new DAOManager();
        
        this.cbDias       = view.getCbDia();
        this.cbDias.setModel(new DefaultComboBoxModel(dias.toArray()));
        this.cbEdificio   = view.getCbEdificio();
        this.cbEdificio.setModel(new DefaultComboBoxModel(dao.getEdificioDAO().readAll().toArray()));
        this.tpHoraInicio = view.getTpHoraInicio();
        this.tpHoraFinal  = view.getTpHoraFinal();
        this.tpHoraInicio.setTimeToNow();
        this.tpHoraFinal.setTime(LocalTime.parse("21:00"));
        
        this.dia = getDiaFormat(this.cbDias.getSelectedItem().toString());
        this.edif = this.cbEdificio.getSelectedItem().toString();
        this.hrI = Time.valueOf(this.tpHoraInicio.getTime());
        this.hrF = Time.valueOf(this.tpHoraFinal.getTime());
        
        this.btActualizar = view.getBtActualizar();
        this.btAula       = view.getBtAula();
        this.btEdificio   = view.getBtEdificio();
        this.btProfesor   = view.getBtProfesor();
        this.btSolicitar  = view.getBtSolicitud();
        
        this.btActualizar.addActionListener(this);
        this.btAula.addActionListener(this);
        this.btEdificio.addActionListener(this);
        this.btProfesor.addActionListener(this);
        this.btSolicitar.addActionListener(this);
       
        this.aulatbModel = new aulasTableModel(dao);
        this.aulatbModel.updateTable(this.getDia(),this.getEdif(),this.getHrI(),this.getHrF());
        this.tablaAulas = view.getTablaAulas();
        this.tablaAulas.setModel(aulatbModel);
        
        this.panelRegistros = view.getPanelRegistros();
        
    }
    
    private TablaAulas getAulaSelect() throws SQLException{
        TablaAulas temp = null;
        if(tablaAulas.getSelectedRow() != -1){
            int    id   = (int) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),0);
            String clave = (String) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),1);
            String nombre = (String) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),2);
            byte status = (byte) tablaAulas.getValueAt(tablaAulas.getSelectedRow(),7);
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
        Object source = e.getSource();
        if(source == btActualizar){
            try {
                actualizarPerformed();
            } catch (SQLException ex) {
                Logger.getLogger(MainViewcontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (source == btAula)
            aulaPerformed();
        else if (source == btEdificio)
            edificioPerformed();
        else if(source == btProfesor)
            profesorPerformed();
        else if (source == btSolicitar)
            solicitarPerformed();
    }
    
    private void actualizarPerformed() throws SQLException{
        setDia(getDiaFormat(this.cbDias.getSelectedItem().toString()));
        setEdif(this.cbEdificio.getSelectedItem().toString());
        setHrI(Time.valueOf(this.tpHoraInicio.getTime()));
        setHrF(Time.valueOf(this.tpHoraFinal.getTime()));
        
        data = dao.getLista_HorariosDAO().getTablaAulas(getEdif(), getHrI(), getHrF(), getDia()); // Aulas ocupadas
        dataAula = dao.getAulaDAO().readAllForInput(getEdif()); // todas las aulas de un edificio seleccionado
        
        
        List<Aula> ocupados = new ArrayList<>();
        List<TablaAulas> aulasDisponibles = new ArrayList<>();
        
        for(TablaAulas tbAula : data)
            for(Aula aula : dataAula)
                if(aula.getNumero().equals(tbAula.getAula())){
                    ocupados.add(aula);
                }
        
        
        ocupados = deleteDuplicate(ocupados);
        dataAula.removeAll(ocupados);
        
        for(Aula aulaDisponible : dataAula){
            TablaAulas temp = new TablaAulas(getHrI(), getHrF(), getDia(), aulaDisponible.getNumero(), Byte.valueOf("1"));
            aulasDisponibles.add(temp);
        }
        
        aulatbModel.updateTable(getDia(),getEdif(),getHrI(),getHrF());
        aulatbModel.updateTable(aulasDisponibles);
        aulatbModel.fireTableDataChanged();
        tablaAulas.setRowSelectionInterval(0, 0);
    }
    private void aulaPerformed(){
        
    }
    private void edificioPerformed(){
        
    }
    private void profesorPerformed(){
        
    }
    private void solicitarPerformed(){
        
        try {
            aula = getAulaSelect();
        } catch (SQLException ex) {
            Logger.getLogger(MainViewcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolicitudView view = null;
        if(aula != null){
            view  = new SolicitudView(aula,getEdif());
            this.panelRegistros.removeAll();
            panelRegistros.updateUI();
            view.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
            panelRegistros.add(view.getContentPane(),BorderLayout.PAGE_START);
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna aula!");
        }
    }
    private String getDiaFormat(String dia){
        switch (dia) {
            case "Lunes":
                return "L";
            case "Martes":
                return "M";
            case "Miercoles":
                return "I";
            case "Jueves":
                return "J";
            case "Viernes":
                return "V";
            case "Sabado":
                return "Sabado";
            default: return "";
        }
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEdif() {
        return edif;
    }

    public void setEdif(String edif) {
        this.edif = edif;
    }

    public Time getHrI() {
        return hrI;
    }

    public void setHrI(Time hrI) {
        this.hrI = hrI;
    }

    public Time getHrF() {
        return hrF;
    }

    public void setHrF(Time hrF) {
        this.hrF = hrF;
    }
    
    public List deleteDuplicate(List list){
        Set linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(list);
		list.clear();
        list.addAll(linkedHashSet);
        return list;
    }

    public TablaAulas getAula() {
        return aula;
    }

    public void setAula(TablaAulas aula) {
        this.aula = aula;
    }
    
}
