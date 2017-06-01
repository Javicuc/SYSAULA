/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConfigController;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author TOLOSAS
 */
public class ConfigView extends javax.swing.JFrame {

    private ConfigController controller;
            
    public ConfigView() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.controller = new ConfigController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        cbSysAula = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbUniversidad = new javax.swing.JLabel();
        lbCalendario = new javax.swing.JLabel();
        cbUniversidad = new javax.swing.JComboBox<>();
        cbCalendario = new javax.swing.JComboBox<>();
        cbBaseDatos = new javax.swing.JCheckBox();
        lbServidor = new javax.swing.JLabel();
        tfServidor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lbBaseDatos = new javax.swing.JLabel();
        tfBaseDatos = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lbUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lbPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        lbPuerto = new javax.swing.JLabel();
        tfPuerto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btGuardar = new javax.swing.JButton();
        btAplicar = new javax.swing.JButton();
        btDefault = new javax.swing.JButton();
        tfCalendarioActual = new javax.swing.JTextField();
        tfUniversidadActual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 470));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(8, 47, 107));
        jPanel3.setMaximumSize(new java.awt.Dimension(350, 470));
        jPanel3.setMinimumSize(new java.awt.Dimension(350, 470));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 470));

        cbSysAula.setText("Habilitar configuración de SysAula");
        cbSysAula.setOpaque(false);
        cbSysAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSysAulaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));
        jPanel2.setMinimumSize(new java.awt.Dimension(350, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 50));

        lbTitulo.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/24px/Configuracion_24px.png"))); // NOI18N
        lbTitulo.setText("Configuración");
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbTitulo.setIconTextGap(8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbUniversidad.setForeground(new java.awt.Color(8, 47, 107));
        lbUniversidad.setText("Universidad");
        lbUniversidad.setEnabled(false);

        lbCalendario.setForeground(new java.awt.Color(8, 47, 107));
        lbCalendario.setText("Calendario");
        lbCalendario.setEnabled(false);

        cbUniversidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUniversidad.setEnabled(false);

        cbCalendario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCalendario.setEnabled(false);

        cbBaseDatos.setText("Habilitar configuración de base de datos");
        cbBaseDatos.setOpaque(false);
        cbBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaseDatosActionPerformed(evt);
            }
        });

        lbServidor.setForeground(new java.awt.Color(8, 47, 107));
        lbServidor.setText("Servidor");
        lbServidor.setEnabled(false);

        tfServidor.setEditable(false);
        tfServidor.setBackground(new java.awt.Color(255, 255, 255));
        tfServidor.setBorder(null);
        tfServidor.setEnabled(false);
        tfServidor.setOpaque(false);

        jSeparator6.setForeground(new java.awt.Color(8, 47, 107));

        lbBaseDatos.setForeground(new java.awt.Color(8, 47, 107));
        lbBaseDatos.setText("Base de Datos");
        lbBaseDatos.setEnabled(false);

        tfBaseDatos.setEditable(false);
        tfBaseDatos.setBackground(new java.awt.Color(255, 255, 255));
        tfBaseDatos.setBorder(null);
        tfBaseDatos.setEnabled(false);
        tfBaseDatos.setOpaque(false);

        jSeparator7.setForeground(new java.awt.Color(8, 47, 107));

        lbUsuario.setForeground(new java.awt.Color(8, 47, 107));
        lbUsuario.setText("Usuario");
        lbUsuario.setEnabled(false);

        tfUsuario.setEditable(false);
        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tfUsuario.setBorder(null);
        tfUsuario.setEnabled(false);
        tfUsuario.setOpaque(false);

        jSeparator3.setForeground(new java.awt.Color(8, 47, 107));

        lbPassword.setForeground(new java.awt.Color(8, 47, 107));
        lbPassword.setText("Contraseña");
        lbPassword.setEnabled(false);

        pfPassword.setEditable(false);
        pfPassword.setBorder(null);
        pfPassword.setEnabled(false);
        pfPassword.setOpaque(false);

        jSeparator4.setForeground(new java.awt.Color(8, 47, 107));

        lbPuerto.setForeground(new java.awt.Color(8, 47, 107));
        lbPuerto.setText("Puerto");
        lbPuerto.setEnabled(false);

        tfPuerto.setEditable(false);
        tfPuerto.setBackground(new java.awt.Color(255, 255, 255));
        tfPuerto.setBorder(null);
        tfPuerto.setEnabled(false);
        tfPuerto.setOpaque(false);

        jSeparator5.setForeground(new java.awt.Color(8, 47, 107));

        btGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setBorder(null);
        btGuardar.setBorderPainted(false);
        btGuardar.setContentAreaFilled(false);
        btGuardar.setFocusPainted(false);
        btGuardar.setFocusable(false);
        btGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        btAplicar.setBackground(new java.awt.Color(255, 255, 255));
        btAplicar.setForeground(new java.awt.Color(255, 255, 255));
        btAplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btAplicar.setText("Aplicar");
        btAplicar.setBorder(null);
        btAplicar.setBorderPainted(false);
        btAplicar.setFocusPainted(false);
        btAplicar.setFocusable(false);
        btAplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btAplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        btDefault.setForeground(new java.awt.Color(255, 255, 255));
        btDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btDefault.setText("Default");
        btDefault.setBorder(null);
        btDefault.setBorderPainted(false);
        btDefault.setContentAreaFilled(false);
        btDefault.setFocusPainted(false);
        btDefault.setFocusable(false);
        btDefault.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDefault.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btDefault.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        tfCalendarioActual.setEditable(false);
        tfCalendarioActual.setBackground(new java.awt.Color(255, 255, 255));
        tfCalendarioActual.setBorder(null);
        tfCalendarioActual.setEnabled(false);

        tfUniversidadActual.setEditable(false);
        tfUniversidadActual.setBackground(new java.awt.Color(255, 255, 255));
        tfUniversidadActual.setBorder(null);
        tfUniversidadActual.setEnabled(false);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Universidad Actual");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText(" Calendario Actual");

        jSeparator8.setForeground(new java.awt.Color(8, 47, 107));

        jSeparator9.setForeground(new java.awt.Color(8, 47, 107));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbSysAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(cbBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfPuerto, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(lbPuerto)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(tfUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator3))
                                            .addComponent(lbUsuario))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                                .addComponent(pfPassword, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lbServidor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfServidor, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator6))
                                                .addGap(25, 25, 25)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbBaseDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfBaseDatos, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbUniversidad)
                                .addComponent(cbUniversidad, 0, 147, Short.MAX_VALUE)
                                .addComponent(tfUniversidadActual)
                                .addComponent(jSeparator8))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCalendario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfCalendarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator9))))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cbSysAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCalendarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUniversidadActual, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbBaseDatos)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(lbPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfCalendarioActual, tfUniversidadActual});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSysAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSysAulaActionPerformed
        if(cbSysAula.isSelected()){
            cbCalendario.setEnabled(true);
            cbUniversidad.setEnabled(true);
            tfUniversidadActual.setEnabled(true);
            tfCalendarioActual.setEnabled(true);
        }else{
            cbCalendario.setEnabled(false);
            cbUniversidad.setEnabled(false);
            tfUniversidadActual.setEnabled(false);
            tfCalendarioActual.setEnabled(false);
        }
    }//GEN-LAST:event_cbSysAulaActionPerformed

    private void cbBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaseDatosActionPerformed
        if(cbBaseDatos.isSelected()){
            tfBaseDatos.setEditable(true);
            tfBaseDatos.setEnabled(true);
            tfPuerto.setEditable(true);
            tfPuerto.setEnabled(true);
            tfServidor.setEditable(true);
            tfServidor.setEnabled(true);
            tfUsuario.setEditable(true);
            tfUsuario.setEnabled(true);
            pfPassword.setEditable(true);
            pfPassword.setEnabled(true);
        }else{
            tfBaseDatos.setEditable(false);
            tfBaseDatos.setEnabled(false);
            tfPuerto.setEditable(false);
            tfPuerto.setEnabled(false);
            tfServidor.setEditable(false);
            tfServidor.setEnabled(false);
            tfUsuario.setEditable(false);
            tfUsuario.setEnabled(false);
            pfPassword.setEditable(false);
            pfPassword.setEnabled(false);
        }
    }//GEN-LAST:event_cbBaseDatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAplicar;
    private javax.swing.JButton btDefault;
    private javax.swing.JButton btGuardar;
    private javax.swing.JCheckBox cbBaseDatos;
    private javax.swing.JComboBox<String> cbCalendario;
    private javax.swing.JCheckBox cbSysAula;
    private javax.swing.JComboBox<String> cbUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbBaseDatos;
    private javax.swing.JLabel lbCalendario;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPuerto;
    private javax.swing.JLabel lbServidor;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUniversidad;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfBaseDatos;
    private javax.swing.JTextField tfCalendarioActual;
    private javax.swing.JTextField tfPuerto;
    private javax.swing.JTextField tfServidor;
    private javax.swing.JTextField tfUniversidadActual;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
    
    public JButton getBtGuardar() {
        return btGuardar;
    }

    public void setBtGuardar(JButton btGuardar) {
        this.btGuardar = btGuardar;
    }
    
    public JLabel getLbTitulo() {
        return lbTitulo;
    }

    public void setLbTitulo(JLabel lbTitulo) {
        this.lbTitulo = lbTitulo;
    }
    
    public JLabel getLbUniversidad() {
        return lbUniversidad;
    }
    public void setLbUniversidad(JLabel lbUniversidad) {
        this.lbUniversidad = lbUniversidad;
    }
    
    public JLabel getLbCalendario() {
        return lbCalendario;
    }
    
    public void setLbCalendario(JLabel lbCalendario) {
        this.lbCalendario = lbCalendario;
    }
    
    public JLabel getLbServidor() {
        return lbServidor;
    }

    public void setLbServidor(JLabel lbServidor) {
        this.lbServidor = lbServidor;
    }
    
    public JLabel getLbBaseDatos() {
        return lbBaseDatos;
    }

    public void setLbBaseDatos(JLabel lbBaseDatos) {
        this.lbBaseDatos = lbBaseDatos;
    }
    
    public JLabel getLbUsuario() {
        return lbUsuario;
    }

    public void setLbUsuario(JLabel lbUsuario) {
        this.lbUsuario = lbUsuario;
    }
    
    public JLabel getLbPassword() {
        return lbPassword;
    }

    public void setLbPassword(JLabel lbPassword) {
        this.lbPassword = lbPassword;
    }
    
    public JLabel getLbPuerto() {
        return lbPuerto;
    }

    public void setLbPuerto(JLabel lbPuerto) {
        this.lbPuerto = lbPuerto;
    }
    
    public JCheckBox getCbSysAula() {
        return cbSysAula;
    }

    public void setCbSysAula(JCheckBox cbSysAula) {
        this.cbSysAula = cbSysAula;
    }
    
    public JCheckBox getCbBaseDatos() {
        return cbBaseDatos;
    }

    public void setCbBaseDatos(JCheckBox cbBaseDatos) {
        this.cbBaseDatos = cbBaseDatos;
    }
    
    public JComboBox getCbUniversidad() {
        return cbUniversidad;
    }

    public void setCbUniversidad(JComboBox cbUniversidad) {
        this.cbUniversidad = cbUniversidad;
    }
    
    public JComboBox getCbCalendario() {
        return cbCalendario;
    }

    public void setCbCalendario(JComboBox cbCalendario) {
        this.cbCalendario = cbCalendario;
    }

    public JButton getBtAplicar() {
        return btAplicar;
    }

    public void setBtAplicar(JButton btAplicar) {
        this.btAplicar = btAplicar;
    }

    public JButton getBtDefault() {
        return btDefault;
    }

    public void setBtDefault(JButton btDefault) {
        this.btDefault = btDefault;
    }

    public JPasswordField getPfPassword() {
        return pfPassword;
    }

    public void setPfPassword(JPasswordField pfPassword) {
        this.pfPassword = pfPassword;
    }

    public JTextField getTfBaseDatos() {
        return tfBaseDatos;
    }

    public void setTfBaseDatos(JTextField tfBaseDatos) {
        this.tfBaseDatos = tfBaseDatos;
    }

    public JTextField getTfPuerto() {
        return tfPuerto;
    }

    public void setTfPuerto(JTextField tfPuerto) {
        this.tfPuerto = tfPuerto;
    }

    public JTextField getTfServidor() {
        return tfServidor;
    }

    public void setTfServidor(JTextField tfServidor) {
        this.tfServidor = tfServidor;
    }

    public JTextField getTfUsuario() {
        return tfUsuario;
    }

    public void setTfUsuario(JTextField tfUsuario) {
        this.tfUsuario = tfUsuario;
    }

    public JTextField getTfCalendarioActual() {
        return tfCalendarioActual;
    }

    public void setTfCalendarioActual(JTextField tfCalendarioActual) {
        this.tfCalendarioActual = tfCalendarioActual;
    }

    public JTextField getTfUniversidadActual() {
        return tfUniversidadActual;
    }

    public void setTfUniversidadActual(JTextField tfUniversidadActual) {
        this.tfUniversidadActual = tfUniversidadActual;
    }
    
}
