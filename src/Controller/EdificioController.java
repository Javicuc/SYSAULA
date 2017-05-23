/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.DAOManager;
import Model.Edificio;
import View.EdificioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
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
public class EdificioController implements ActionListener{
    private EdificioView view;
    private Edificio objEdificio;
    private DAOManager dao;
    private JButton btAgregar;
    private JButton btGuardar;
    private JButton btCancelar;
    private JComboBox cbCentro;
    private JTable tablaEdificios;
    private EdificiosTablaModel edificiotbModel;
    private boolean tfEdit;
    
    public EdificioController(EdificioView view) throws SQLException{
        this.view = view;
        this.dao = new DAOManager();
        
        this.btAgregar = view.getBtAgregar();
        this.btGuardar = view.getBtGuardar();
        this.btCancelar = view.getBtCancelar();
        this.btGuardar.addActionListener(this);
        this.btAgregar.addActionListener(this);
        this.btCancelar.addActionListener(this);
       
        this.cbCentro = view.getCbCentro();
        this.cbCentro.setModel(new DefaultComboBoxModel(dao.getUniversidadDAO().readAll().toArray()));
        
        this.edificiotbModel = new EdificiosTablaModel(dao);
        this.edificiotbModel.updateTable();
        this.tablaEdificios = view.getTablaEdificios();
        this.tablaEdificios.setModel(edificiotbModel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == btAgregar)
            agregarPerformed();
        else if (source == btCancelar)
            cancelarPerformed();
        else if (source == btGuardar)
            guardarPerformed();
    }

    private void agregarPerformed() {
        setObjEdificio(null);
        loadTextFields();
        setTfEdit(true);
        tablaEdificios.clearSelection();
        view.getTfEdificio().requestFocusInWindow();
        btGuardar.setEnabled(true);
        btCancelar.setEnabled(true);
    }
    private void cancelarPerformed(){
        setObjEdificio(null);
        setTfEdit(false);
        loadTextFields();
        tablaEdificios.clearSelection();
        btGuardar.setEnabled(false);
        btCancelar.setEnabled(false);
    }
    private void guardarPerformed(){
        System.out.println(isEmpty());
        if(!isEmpty()){
            try {
                saveTextFields();
                Edificio temp = getObjEdificio();
                System.out.println(temp.getID_Nombre() + ":" + temp.getFK_Universidad());
                dao.getEdificioDAO().crear(temp);
                
                setObjEdificio(null);
                setTfEdit(false);
                loadTextFields();
                tablaEdificios.clearSelection();
                edificiotbModel.updateTable();
                edificiotbModel.fireTableDataChanged();
                
            } catch (SQLException ex) {
                Logger.getLogger(ProfesorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private Edificio getEdificioSelect() throws SQLException{
        String select = (String) tablaEdificios.getValueAt(tablaEdificios.getSelectedRow(),0);
        return dao.getEdificioDAO().raadByID(select);
    }

    public Edificio getObjEdificio() {
        return objEdificio;
    }

    public void setObjEdificio(Edificio objEdificio) {
        this.objEdificio = objEdificio;
    }

  
    
    private boolean isEmpty(){
        boolean isEmpty = false;
        if(view.getTfEdificio().getText().equals("")){
           isEmpty = true;
        }
        return isEmpty;
    }
    
    /**
     * @return the tfEdit
     */
    public boolean isTfEdit() {
        return tfEdit;
    }

    /**
     * @param tfEdit the tfEdit to set
     */
    public void setTfEdit(boolean tfEdit) {
        this.tfEdit = tfEdit;
        view.getTfEdificio().setEnabled(tfEdit);
    }

    private void loadTextFields() {
         if(getObjEdificio() != null){
            view.getTfEdificio().setText(getObjEdificio().getID_Nombre());
            view.getCbCentro().setSelectedItem(getObjEdificio().getFK_Universidad());
        } else {
            view.getTfEdificio().setText("");
        }
    }
     public void saveTextFields(){
        if(getObjEdificio() == null)
            setObjEdificio(new Edificio());
        getObjEdificio().setID_Nombre(view.getTfEdificio().getText());
        getObjEdificio().setFK_Universidad(cbCentro.getSelectedItem().toString());
    }
}
