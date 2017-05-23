/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EdificioController;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author TOLOSAS
 */
public class EdificioView extends javax.swing.JFrame {

    private EdificioController controller;
    public EdificioView() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.controller = new EdificioController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoEdificio = new javax.swing.JPanel();
        cabezalEdificio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollTabla = new javax.swing.JScrollPane();
        tablaEdificios = new javax.swing.JTable();
        lbNombreEdificio = new javax.swing.JLabel();
        tfEdificio = new javax.swing.JTextField();
        lineaNomberEdificio = new javax.swing.JSeparator();
        lbCentro = new javax.swing.JLabel();
        cbCentro = new javax.swing.JComboBox<>();
        btAgregar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        fondoEdificio.setBackground(new java.awt.Color(255, 255, 255));
        fondoEdificio.setMaximumSize(new java.awt.Dimension(800, 32767));
        fondoEdificio.setMinimumSize(new java.awt.Dimension(600, 600));
        fondoEdificio.setPreferredSize(new java.awt.Dimension(610, 610));

        cabezalEdificio.setBackground(new java.awt.Color(21, 101, 192));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/24px/Edificio.24px.png"))); // NOI18N
        jLabel1.setText("Agregar edificio");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setIconTextGap(8);

        javax.swing.GroupLayout cabezalEdificioLayout = new javax.swing.GroupLayout(cabezalEdificio);
        cabezalEdificio.setLayout(cabezalEdificioLayout);
        cabezalEdificioLayout.setHorizontalGroup(
            cabezalEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezalEdificioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cabezalEdificioLayout.setVerticalGroup(
            cabezalEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezalEdificioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaEdificios.setBackground(new java.awt.Color(255, 255, 255));
        tablaEdificios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Centro universitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEdificios.setGridColor(new java.awt.Color(245, 245, 245));
        tablaEdificios.setSelectionBackground(new java.awt.Color(187, 222, 251));
        scrollTabla.setViewportView(tablaEdificios);
        if (tablaEdificios.getColumnModel().getColumnCount() > 0) {
            tablaEdificios.getColumnModel().getColumn(1).setPreferredWidth(180);
            tablaEdificios.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        lbNombreEdificio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNombreEdificio.setForeground(new java.awt.Color(8, 47, 107));
        lbNombreEdificio.setText("Nombre:");

        tfEdificio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEdificio.setToolTipText("Escriba el nombre del profesor que solicita el aula");
        tfEdificio.setBorder(null);
        tfEdificio.setEnabled(false);

        lineaNomberEdificio.setForeground(new java.awt.Color(8, 47, 107));

        lbCentro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCentro.setForeground(new java.awt.Color(8, 47, 107));
        lbCentro.setText("Centro universitario");

        cbCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCentro.setBorder(null);
        cbCentro.setNextFocusableComponent(btAgregar);

        btAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btAgregar.setText("Nuevo");
        btAgregar.setBorder(null);
        btAgregar.setBorderPainted(false);
        btAgregar.setContentAreaFilled(false);
        btAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgregar.setFocusPainted(false);
        btAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAgregar.setIconTextGap(0);
        btAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        btGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setBorder(null);
        btGuardar.setBorderPainted(false);
        btGuardar.setContentAreaFilled(false);
        btGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGuardar.setEnabled(false);
        btGuardar.setFocusPainted(false);
        btGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGuardar.setIconTextGap(0);
        btGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        btCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(null);
        btCancelar.setBorderPainted(false);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.setEnabled(false);
        btCancelar.setFocusPainted(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setIconTextGap(0);
        btCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        javax.swing.GroupLayout fondoEdificioLayout = new javax.swing.GroupLayout(fondoEdificio);
        fondoEdificio.setLayout(fondoEdificioLayout);
        fondoEdificioLayout.setHorizontalGroup(
            fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabezalEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoEdificioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoEdificioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTabla)
                    .addGroup(fondoEdificioLayout.createSequentialGroup()
                        .addGroup(fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lineaNomberEdificio)
                            .addComponent(tfEdificio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreEdificio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        fondoEdificioLayout.setVerticalGroup(
            fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoEdificioLayout.createSequentialGroup()
                .addComponent(cabezalEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreEdificio)
                    .addComponent(lbCentro))
                .addGap(5, 5, 5)
                .addGroup(fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(lineaNomberEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(fondoEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(fondoEdificio, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JPanel cabezalEdificio;
    private javax.swing.JComboBox<String> cbCentro;
    private javax.swing.JPanel fondoEdificio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCentro;
    private javax.swing.JLabel lbNombreEdificio;
    private javax.swing.JSeparator lineaNomberEdificio;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaEdificios;
    private javax.swing.JTextField tfEdificio;
    // End of variables declaration//GEN-END:variables

    public JButton getBtAgregar() {
        return btAgregar;
    }

    public void setBtAgregar(JButton btAgregar) {
        this.btAgregar = btAgregar;
    }

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public void setBtCancelar(JButton btCancelar) {
        this.btCancelar = btCancelar;
    }
    public JButton getBtGuardar() {
        return btGuardar;
    }

    public void setBtGuardar(JButton btGuardar) {
        this.btGuardar = btGuardar;
    }

    public JComboBox<String> getCbCentro() {
        return cbCentro;
    }

    public void setCbCentro(JComboBox<String> cbCentro) {
        this.cbCentro = cbCentro;
    }

    public JTable getTablaEdificios() {
        return tablaEdificios;
    }

    public void setTablaEdificios(JTable tablaEdificios) {
        this.tablaEdificios = tablaEdificios;
    }

    public JTextField getTfEdificio() {
        return tfEdificio;
    }

    public void setTfEdificio(JTextField tfEdificio) {
        this.tfEdificio = tfEdificio;
    }




}
