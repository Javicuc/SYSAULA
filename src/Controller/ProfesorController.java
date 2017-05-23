/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.DAOManager;
import Model.Profesor;
import View.ProfesorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
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
public class ProfesorController implements ActionListener{
    
    private ProfesorView view;
    private Profesor objProfesor;
    private DAOManager dao;
    private JButton btAgregar;
    private JButton btModificar;
    private JButton btEliminar;
    private JButton btGuardar;
    private JButton btCancelar;
    private JComboBox cbCentro;
    private JTable tablaProfesores;
    private ProfesoresTablaModel profesortbModel;
    private boolean tfEdit;
    
    public ProfesorController(ProfesorView view) throws SQLException{
        this.view = view;
        this.dao = new DAOManager();
        
        this.btAgregar = view.getBtAgregar();
        this.btEliminar = view.getBtEliminar();
        this.btModificar = view.getBtModificar();
        this.btGuardar = view.getBtGuardar();
        this.btCancelar = view.getBtCancelar();
        this.btGuardar.addActionListener(this);
        this.btAgregar.addActionListener(this);
        this.btEliminar.addActionListener(this);
        this.btModificar.addActionListener(this);
        this.btCancelar.addActionListener(this);
       
        this.cbCentro = view.getCbCentro();
        this.cbCentro.setModel(new DefaultComboBoxModel(dao.getUniversidadDAO().readAll().toArray()));
        
        this.profesortbModel = new ProfesoresTablaModel(dao);
        this.profesortbModel.updateTable();
        this.tablaProfesores = view.getTablaProfesores();
        this.tablaProfesores.setModel(profesortbModel);
        
        this.tablaProfesores.getSelectionModel().addListSelectionListener(c ->{
            boolean isSelect = (tablaProfesores.getSelectedRow() != -1);
            btModificar.setEnabled(isSelect);
            btEliminar.setEnabled(isSelect);
            btCancelar.setEnabled(isSelect);
        }); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object source = e.getSource();
            if(source == btAgregar)
                agregarPerformed();
            else if (source == btEliminar)
                eliminarPerformed();
            else if (source == btModificar)
                modificarPerformed();
            else if (source == btCancelar)
                cancelarPerformed();
            else if (source == btGuardar)
                guardarPerformed();
        } catch (SQLException ex) {
            Logger.getLogger(ProfesorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void agregarPerformed() {
        setObjProfesor(null);
        loadTextFields();
        setTfEdit(true);
        tablaProfesores.clearSelection();
        view.getTfProfesor().requestFocusInWindow();
        btGuardar.setEnabled(true);
        btCancelar.setEnabled(true);
    }
    private void cancelarPerformed(){
        setObjProfesor(null);
        setTfEdit(false);
        loadTextFields();
        tablaProfesores.clearSelection();
        btGuardar.setEnabled(false);
        btCancelar.setEnabled(false);
        btModificar.setEnabled(false);
        btEliminar.setEnabled(false);
    }
    private void guardarPerformed(){
        System.out.println(isEmpty());
        if(!isEmpty()){
            try {
                saveTextFields();
                Profesor temp = getObjProfesor();
                System.out.println(temp.toString());
                if(temp.getID_Profesor() == 0)
                    dao.getProfesorDAO().crear(temp);
                else{
                    dao.getProfesorDAO().update(temp);
                }
                
                setObjProfesor(null);
                setTfEdit(false);
                loadTextFields();
                tablaProfesores.clearSelection();
                profesortbModel.updateTable();
                profesortbModel.fireTableDataChanged();
                
            } catch (SQLException ex) {
                Logger.getLogger(ProfesorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void eliminarPerformed() {
         try {
            Profesor temp = getProfesorSelect();
            int sel = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
            if(sel == JOptionPane.YES_OPTION){
                try {
                    if(dao.getProfesorDAO().delete(temp))
                        JOptionPane.showMessageDialog(null, "Profesor eliminado!");
                } catch (SQLException ex) {
                    Logger.getLogger(ProfesorController.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    profesortbModel.updateTable();
                    profesortbModel.fireTableDataChanged();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfesorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void modificarPerformed() throws SQLException {
        try {
            Profesor profesor = getProfesorSelect();
            setObjProfesor(profesor);
            setTfEdit(true);
            loadTextFields();
        } catch (SQLException ex) {
            Logger.getLogger(ProfesorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private Profesor getProfesorSelect() throws SQLException{
        int select = (int) tablaProfesores.getValueAt(tablaProfesores.getSelectedRow(),0);
        return dao.getProfesorDAO().raadByID(select);
    }

    public Profesor getObjProfesor() {
        return objProfesor;
    }

    public void setObjProfesor(Profesor objProfesor) {
        this.objProfesor = objProfesor;
    }
    
    private boolean isEmpty(){
        boolean isEmpty = false;
        if(view.getTfProfesor().getText().equals("") || view.getTfDepartamento().equals("")){
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
        view.getTfProfesor().setEnabled(tfEdit);
        view.getTfDepartamento().setEnabled(tfEdit);
    }

    private void loadTextFields() {
         if(getObjProfesor() != null){
            view.getTfProfesor().setText(getObjProfesor().getNombre());
            view.getTfDepartamento().setText(getObjProfesor().getDepartamento());
            view.getCbCentro().setSelectedItem(getObjProfesor().getFK_Universidad());
        } else {
            view.getTfProfesor().setText("");
            view.getTfDepartamento().setText("");
        }
    }
     public void saveTextFields(){
        if(getObjProfesor() == null)
            setObjProfesor(new Profesor());
        getObjProfesor().setNombre(view.getTfProfesor().getText());
        getObjProfesor().setDepartamento(view.getTfDepartamento().getText());
        getObjProfesor().setFK_Universidad(cbCentro.getSelectedItem().toString());
    }
}
