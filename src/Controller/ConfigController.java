/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.ConfigLoad;
import Data.ConfigSysAula;
import Data.ConfigWrite;
import View.ConfigView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author javilubz
 */
public class ConfigController implements ActionListener{
    
    private ConfigView view;
    private ConfigWrite configWrite;
    private ConfigSysAula objConfigSysDefault; 
    
    private JButton btDefault;
    private JButton btGuardar;
    private JButton btAplicar;
    
    private List<String> listCalendarios;
    private JComboBox cbUniversidad;
    private List<String> listCentros;
    private JComboBox cbCalendario;
            
    public ConfigController(ConfigView view) throws IOException{
        this.view = view;
        this.configWrite = new ConfigWrite();
        this.objConfigSysDefault = ConfigLoad.getAllProperties();
        
        this.btAplicar = view.getBtAplicar();
        this.btDefault = view.getBtDefault();
        this.btGuardar = view.getBtGuardar();
        this.btAplicar.addActionListener(this);
        this.btDefault.addActionListener(this);
        this.btGuardar.addActionListener(this);
        
        this.cbCalendario = view.getCbCalendario();
        this.cbUniversidad = view.getCbUniversidad();
        
        getConfigActual();
        System.out.println(objConfigSysDefault);
        saveTextFields();
    }

    public ConfigSysAula getObjConfigSysDefault() {
        return objConfigSysDefault;
    }

    public void setObjConfigSysDefault(ConfigSysAula objConfigSysDefault) {
        this.objConfigSysDefault = objConfigSysDefault;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void getConfigActual(){
        
        this.listCentros = Arrays.asList(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_UNIVERSIDAD).split(","));
        this.cbUniversidad.setModel(new DefaultComboBoxModel(this.listCentros.toArray()));
        
        
        for(int i = 0; i < this.listCentros.size(); i++)
            if(this.listCentros.get(i).matches(objConfigSysDefault.getUniversidad() + ".*"))
                this.cbUniversidad.setSelectedIndex(i);
        
        this.listCalendarios = Arrays.asList(ConfigLoad.getInstance().getProperty(ConfigLoad.SIIAU_CALENDARIO).split(","));
        this.cbCalendario.setModel(new DefaultComboBoxModel(this.listCalendarios.toArray()));
                
         for(int i = 0 ; i < this.listCalendarios.size(); i++)
            if(this.listCalendarios.get(i).matches(objConfigSysDefault.getCalendario() + ".*"))
                this.cbCalendario.setSelectedIndex(i);
        
        
        view.getTfUsuario().setText(getObjConfigSysDefault().getUsuario());
        view.getTfBaseDatos().setText(getObjConfigSysDefault().getBaseDatos());
        view.getTfPuerto().setText(getObjConfigSysDefault().getPuerto());
        view.getTfServidor().setText(getObjConfigSysDefault().getServidor());
        view.getPfPassword().setText(getObjConfigSysDefault().getClave());
        view.getTfUniversidadActual().setText(getObjConfigSysDefault().getUniversidad());
        view.getTfCalendarioActual().setText(getObjConfigSysDefault().getCalendario());
        
    }
    
    public void saveTextFields(){
        String nombreBD = view.getTfBaseDatos().getText();
        String usuario  = view.getTfUsuario().getText();
        String puerto   = view.getTfPuerto().getText();
        String clave    = new String(view.getPfPassword().getPassword());
        String servidor = view.getTfServidor().getText();
        String cuSelect = cbUniversidad.getSelectedItem().toString();
        String caSelect = cbCalendario.getSelectedItem().toString();
        
        System.out.println("Base de datos: " + nombreBD + ", Usuario: " + usuario + ", Clave: " + clave + ", Servidor: " + servidor 
                + ", Puerto: " + puerto + ", cuSelect: " + cuSelect + ", caSelect: " + caSelect);
    }
}
