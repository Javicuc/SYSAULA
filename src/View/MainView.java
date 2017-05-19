/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainViewcontroller;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author javilubz
 */
public class MainView extends javax.swing.JFrame {

    private MainViewcontroller controller;
    public MainView() throws SQLException {
        //setUndecorated(true);
        
        initComponents();
        setResizable(false);
        setVisible(true);
        setTitle("SYSAULA");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
        
        lblLogo.setIcon(new ImageIcon(new ImageIcon("Images/logo.png").getImage().getScaledInstance(225, 225, Image.SCALE_DEFAULT)));
        lblLogo.setHorizontalAlignment(JLabel.CENTER);
        lblLogo.setVerticalAlignment(JLabel.CENTER);
    
        this.controller = new MainViewcontroller(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelViews = new javax.swing.JPanel();
        panelAulasAll = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btSolicitud = new javax.swing.JButton();
        btEdificio = new javax.swing.JButton();
        btAula = new javax.swing.JButton();
        btProfesor = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cbEdificio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker();
        tpHoraFinal = new com.github.lgooddatepicker.components.TimePicker();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        panelRegistros = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelAulasAll.setBorder(javax.swing.BorderFactory.createTitledBorder("AULAS DISPONIBLES"));

        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAulas);

        javax.swing.GroupLayout panelAulasAllLayout = new javax.swing.GroupLayout(panelAulasAll);
        panelAulasAll.setLayout(panelAulasAllLayout);
        panelAulasAllLayout.setHorizontalGroup(
            panelAulasAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAulasAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelAulasAllLayout.setVerticalGroup(
            panelAulasAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAulasAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar1.setFloatable(false);

        btSolicitud.setText("SOLICITAR AULA");
        btSolicitud.setFocusable(false);
        btSolicitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSolicitud.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btSolicitud);

        btEdificio.setText("REGISTRAR EDIFICIO");
        btEdificio.setFocusable(false);
        btEdificio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEdificio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btEdificio);

        btAula.setText("REGISTRAR AULA");
        btAula.setFocusable(false);
        btAula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btAula);

        btProfesor.setText("REGISTRAR PROFESOR");
        btProfesor.setFocusable(false);
        btProfesor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProfesor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btProfesor);

        btActualizar.setText("ACTUALIZAR");
        btActualizar.setFocusable(false);
        btActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btActualizar);

        cbEdificio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("DIA");

        jLabel3.setText("HORA INICIO");

        jLabel1.setText("EDIFICIO");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("HORA FINAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEdificio, 0, 168, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbDia, cbEdificio});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tpHoraFinal, tpHoraInicio});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbDia, cbEdificio, tpHoraFinal, tpHoraInicio});

        javax.swing.GroupLayout panelViewsLayout = new javax.swing.GroupLayout(panelViews);
        panelViews.setLayout(panelViewsLayout);
        panelViewsLayout.setHorizontalGroup(
            panelViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAulasAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelViewsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelViewsLayout.setVerticalGroup(
            panelViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAulasAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLogo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRegistrosLayout = new javax.swing.GroupLayout(panelRegistros);
        panelRegistros.setLayout(panelRegistrosLayout);
        panelRegistrosLayout.setHorizontalGroup(
            panelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRegistrosLayout.setVerticalGroup(
            panelRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelViews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelViews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btAula;
    private javax.swing.JButton btEdificio;
    private javax.swing.JButton btProfesor;
    private javax.swing.JButton btSolicitud;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbEdificio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panelAulasAll;
    private javax.swing.JPanel panelRegistros;
    private javax.swing.JPanel panelViews;
    private javax.swing.JTable tablaAulas;
    private com.github.lgooddatepicker.components.TimePicker tpHoraFinal;
    private com.github.lgooddatepicker.components.TimePicker tpHoraInicio;
    // End of variables declaration//GEN-END:variables

    public JButton getBtAula() {
        return btAula;
    }

    public void setBtAula(JButton btAula) {
        this.btAula = btAula;
    }

    public JButton getBtEdificio() {
        return btEdificio;
    }

    public void setBtEdificio(JButton btEdificio) {
        this.btEdificio = btEdificio;
    }

    public JButton getBtProfesor() {
        return btProfesor;
    }

    public void setBtProfesor(JButton btProfesor) {
        this.btProfesor = btProfesor;
    }

    public JButton getBtSolicitud() {
        return btSolicitud;
    }

    public void setBtSolicitud(JButton btSolicitud) {
        this.btSolicitud = btSolicitud;
    }

    public JComboBox<String> getCbDia() {
        return cbDia;
    }

    public void setCbDia(JComboBox<String> cbDia) {
        this.cbDia = cbDia;
    }

    public JComboBox<String> getCbEdificio() {
        return cbEdificio;
    }

    public void setCbEdificio(JComboBox<String> cbEdificio) {
        this.cbEdificio = cbEdificio;
    }

    public JPanel getPanelRegistros() {
        return panelRegistros;
    }

    public void setPanelRegistros(JPanel panelRegistros) {
        this.panelRegistros = panelRegistros;
    }

    public JTable getTablaAulas() {
        return tablaAulas;
    }

    public void setTablaAulas(JTable tablaAulas) {
        this.tablaAulas = tablaAulas;
    }

    public TimePicker getTpHoraFinal() {
        return tpHoraFinal;
    }

    public void setTpHoraFinal(TimePicker tpHoraFinal) {
        this.tpHoraFinal = tpHoraFinal;
    }

    public TimePicker getTpHoraInicio() {
        return tpHoraInicio;
    }

    public void setTpHoraInicio(TimePicker tpHoraInicio) {
        this.tpHoraInicio = tpHoraInicio;
    }

    public JButton getBtActualizar() {
        return btActualizar;
    }

    public void setBtActualizar(JButton btActualizar) {
        this.btActualizar = btActualizar;
    }

    
}
