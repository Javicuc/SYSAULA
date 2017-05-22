/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainViewcontroller;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.awt.Color;
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
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setVisible(true);
        setTitle("SYSAULA");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
        
        /*
        lblLogo.setIcon(new ImageIcon(new ImageIcon("Images/logo.png").getImage().getScaledInstance(225, 225, Image.SCALE_DEFAULT)));
        lblLogo.setHorizontalAlignment(JLabel.CENTER);
        lblLogo.setVerticalAlignment(JLabel.CENTER);
        */
        this.controller = new MainViewcontroller(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelViews = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cbEdificio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker();
        tpHoraFinal = new com.github.lgooddatepicker.components.TimePicker();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btEdificio = new javax.swing.JButton();
        btAula = new javax.swing.JButton();
        btProfesor = new javax.swing.JButton();
        btSolicitud = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(3, 169, 244));
        setResizable(false);

        panelViews.setBackground(new java.awt.Color(3, 169, 244));

        jPanel2.setBackground(new java.awt.Color(3, 169, 244));
        jPanel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        cbEdificio.setBackground(new java.awt.Color(255, 255, 255));
        cbEdificio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbEdificio.setForeground(new java.awt.Color(0, 0, 0));
        cbEdificio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEdificio.setBorder(null);
        cbEdificio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbEdificio.setRequestFocusEnabled(false);

        jLabel2.setText("DIA");
        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("HORA INICIO");
        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("EDIFICIO");
        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbDia.setBackground(new java.awt.Color(255, 255, 255));
        cbDia.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbDia.setForeground(new java.awt.Color(0, 0, 0));

        tpHoraInicio.setBackground(new java.awt.Color(255, 255, 255));
        tpHoraInicio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tpHoraInicio.setForeground(new java.awt.Color(0, 0, 0));
        tpHoraInicio.setRequestFocusEnabled(false);

        tpHoraFinal.setBackground(new java.awt.Color(255, 255, 255));
        tpHoraFinal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tpHoraFinal.setForeground(new java.awt.Color(0, 0, 0));
        tpHoraFinal.setRequestFocusEnabled(false);

        jLabel4.setText("HORA FINAL");
        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tpHoraFinal, tpHoraInicio});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbDia, cbEdificio});

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

        jPanel1.setBackground(new java.awt.Color(3, 169, 244));

        btEdificio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edifnor.png"))); // NOI18N
        btEdificio.setBackground(new java.awt.Color(60, 132, 205));
        btEdificio.setBorder(null);
        btEdificio.setBorderPainted(false);
        btEdificio.setContentAreaFilled(false);
        btEdificio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEdificio.setFocusPainted(false);
        btEdificio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btEdificio.setForeground(new java.awt.Color(255, 255, 255));
        btEdificio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edifrol.png"))); // NOI18N

        btAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aulanor.png"))); // NOI18N
        btAula.setBorder(null);
        btAula.setBorderPainted(false);
        btAula.setContentAreaFilled(false);
        btAula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAula.setFocusPainted(false);
        btAula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aularol.png"))); // NOI18N

        btProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profnor.png"))); // NOI18N
        btProfesor.setBorder(null);
        btProfesor.setBorderPainted(false);
        btProfesor.setContentAreaFilled(false);
        btProfesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProfesor.setFocusPainted(false);
        btProfesor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profrol.png"))); // NOI18N

        btSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/solinor.png"))); // NOI18N
        btSolicitud.setBorder(null);
        btSolicitud.setBorderPainted(false);
        btSolicitud.setContentAreaFilled(false);
        btSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSolicitud.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/solirol.png"))); // NOI18N

        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualnor.png"))); // NOI18N
        btActualizar.setBackground(new java.awt.Color(3, 169, 244));
        btActualizar.setBorder(null);
        btActualizar.setBorderPainted(false);
        btActualizar.setContentAreaFilled(false);
        btActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualrol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSolicitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSolicitud, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btProfesor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btAula)
                        .addComponent(btEdificio))
                    .addComponent(btActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btActualizar, btAula, btEdificio, btProfesor, btSolicitud});

        jPanel3.setBackground(new java.awt.Color(2, 136, 209));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SYSAULA");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.setBackground(new java.awt.Color(179, 229, 252));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 229, 252), 2));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gestión de Aula Escolar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(1197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelViewsLayout = new javax.swing.GroupLayout(panelViews);
        panelViews.setLayout(panelViewsLayout);
        panelViewsLayout.setHorizontalGroup(
            panelViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelViewsLayout.setVerticalGroup(
            panelViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewsLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(panelViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Valor", "de", "ejemplo", "1212313"},
                {"valor", "de", "ejemplo", "3234243"},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAulas.setAlignmentX(1.0F);
        tablaAulas.setAlignmentY(1.0F);
        tablaAulas.setBackground(new java.awt.Color(255, 255, 255));
        tablaAulas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaAulas.setForeground(new java.awt.Color(51, 51, 51));
        tablaAulas.setGridColor(new java.awt.Color(255, 255, 255));
        tablaAulas.setRowHeight(45);
        tablaAulas.setSelectionBackground(new java.awt.Color(3, 169, 244));
        tablaAulas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaAulas.setShowHorizontalLines(false);
        tablaAulas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tablaAulas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelViews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelViews, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked


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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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
    public JButton getBtActualizar() {
        return btActualizar;
    }

    public void setBtActualizar(JButton btActualizar) {
        this.btActualizar = btActualizar;
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

    

    
}
