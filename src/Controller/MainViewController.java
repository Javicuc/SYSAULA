/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aula;
import Model.DAO.DAOManager;
import Model.TablaAulas;
import View.AulaView;
import View.ConfigView;
import View.EdificioView;
import View.MainView;
import View.ProfesorView;
import View.SolicitarView;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.optionalusertools.TimeChangeListener;
import com.github.lgooddatepicker.zinternaltools.TimeChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author javilubz
 */
public class MainViewController implements ActionListener{
    
    private DAOManager dao;
    private MainView view;
    private HorariosTableModel aulatbModel;
    private TablaAulas aula;
    
    private List<TablaAulas> data = new ArrayList<>();
    private List<Aula> dataAula = new ArrayList<>();
    private List<String> dias = asList("Domingo","Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"); 
    
    private JButton btSolicitar;
    private JButton btActualizar;
    private JButton btAula;
    private JButton btEdificio;
    private JButton btProfesor;
    private JButton btEliminar;
    private JButton btBuscar;
    private JButton btConfig;
    private TimePicker tpHoraInicio;
    private TimePicker tpHoraFinal;
    private JComboBox cbEdificio;
    private JComboBox cbDias;
    private JTable    tablaAulas;
    
    private String dia;
    private String edif;
    private Time   hrI;
    private Time   hrF;
    
    public MainViewController(MainView view) throws SQLException{
        this.view = view;
        this.dao = new DAOManager();
        
        this.cbDias       = view.getCbDia();
        this.cbDias.setModel(new DefaultComboBoxModel(dias.toArray()));
        this.cbEdificio   = view.getCbEdificio();
        this.cbEdificio.setModel(new DefaultComboBoxModel(dao.getEdificioDAO().readAll().toArray()));
        this.tpHoraInicio = view.getTpHoraInicio();
        this.tpHoraFinal  = view.getTpHoraFin();
        this.tpHoraInicio.setTime(LocalTime.of(LocalTime.now().getHour(), 0));
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
                else if(tpHoraFinal.getTime().getHour() < tpHoraInicio.getTime().getHour())
                    tpHoraFinal.setTime(LocalTime.of(tpHoraInicio.getTime().getHour()+1,0));
                else if(tpHoraInicio.getTime().getHour() > tpHoraFinal.getTime().getHour())
                    tpHoraFinal.setTime(LocalTime.of(tpHoraInicio.getTime().getHour()+1,0));
            }
        });
        this.tpHoraFinal.setTime(LocalTime.of(this.tpHoraInicio.getTime().getHour()+1, 0));
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
                else if(tpHoraFinal.getTime().getHour() < tpHoraInicio.getTime().getHour())
                    tpHoraFinal.setTime(LocalTime.of(tpHoraInicio.getTime().getHour()+1,0));
            }
        });
        
        
        this.cbDias.setSelectedIndex(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)-1);
        this.dia = getDiaFormat(this.cbDias.getSelectedItem().toString());
        this.edif = this.cbEdificio.getSelectedItem().toString();
        this.hrI = Time.valueOf(this.tpHoraInicio.getTime());
        this.hrF = Time.valueOf(this.tpHoraFinal.getTime());
        
        this.btActualizar = view.getBtRecargar();
        this.btAula       = view.getBtAula();
        this.btEdificio   = view.getBtEdificio();
        this.btProfesor   = view.getBtProfesor();
        this.btSolicitar  = view.getBtSolicitar();
        this.btBuscar     = view.getBtBuscar();
        this.btConfig     = view.getBtConfigurar();
        
        this.btActualizar.addActionListener(this);
        this.btAula.addActionListener(this);
        this.btEdificio.addActionListener(this);
        this.btProfesor.addActionListener(this);
        this.btSolicitar.addActionListener(this);
        this.btBuscar.addActionListener(this);
        this.btConfig.addActionListener(this);
       
        this.aulatbModel = new HorariosTableModel(dao);
        this.aulatbModel.updateTable(this.getDia(),this.getEdif(),this.getHrI(),this.getHrF());
        this.tablaAulas = view.getTablaHorarios();
        this.tablaAulas.setModel(aulatbModel);
        this.tablaAulas.setDefaultRenderer(Object.class, new HorariosTablaRender());
        this.tablaAulas.getColumnModel().getColumn(8).setWidth(0);
        this.tablaAulas.getColumnModel().getColumn(8).setMinWidth(0);
        this.tablaAulas.getColumnModel().getColumn(8).setMaxWidth(0); 
        
        
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
            if(source == btActualizar)
                actualizarPerformed();
            else if (source == btAula)
                aulaPerformed();
            else if (source == btEdificio)
                edificioPerformed();
            else if(source == btProfesor)
                profesorPerformed();
            else if (source == btSolicitar)
                solicitarPerformed();
            else if (source == btConfig)
                configurarPerformed();
            else if (source == btBuscar)
                actualizarPerformed();
            else if(source == btEliminar)
                eliminarPerformed();
        } catch (SQLException ex) {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                if(aula.getNumero().equals(tbAula.getAula()))
                    ocupados.add(aula);
        
        
        ocupados = deleteDuplicate(ocupados);
        dataAula.removeAll(ocupados);
        
        for(Aula aulaDisponible : dataAula){
            TablaAulas temp = new TablaAulas(getHrI(), getHrF(), getDia(), aulaDisponible.getNumero(),true);
            aulasDisponibles.add(temp);
        }
        
        aulatbModel.updateTable(getDia(),getEdif(),getHrI(),getHrF());
        aulatbModel.updateTable(aulasDisponibles);
        aulatbModel.fireTableDataChanged();
    }
    private void aulaPerformed() throws SQLException{
        new AulaView();
    }
    private void edificioPerformed() throws SQLException{
        new EdificioView();
    }
    private void profesorPerformed() throws SQLException{
        new ProfesorView();
    }
    private void solicitarPerformed(){
        
        try {
            aula = getAulaSelect();
            System.out.println(aula);
        } catch (SQLException ex) {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolicitarView view = null;
        if(aula != null && aula.getStatus() == true){
            view  = new SolicitarView(aula,getEdif());
            view.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un aula disponible!");
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
                return "S";
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

    private void configurarPerformed() throws IOException {
        new ConfigView();
    }

    private void buscarPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void eliminarPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
