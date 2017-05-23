/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProfesorController;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author TOLOSAS
 */
public class ProfesorView extends javax.swing.JFrame {

    private ProfesorController controller;
    
    public ProfesorView() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.controller = new ProfesorController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoProfesor = new javax.swing.JPanel();
        cabezalProfesor = new javax.swing.JPanel();
        lbAgregarProfesor = new javax.swing.JLabel();
        scrollTablaProfesores = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        lbNombreProfesor = new javax.swing.JLabel();
        tfProfesor = new javax.swing.JTextField();
        lineaNombreProf = new javax.swing.JSeparator();
        lbDepartamento = new javax.swing.JLabel();
        lbCentro = new javax.swing.JLabel();
        cbCentro = new javax.swing.JComboBox<>();
        btAgregar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        tfDepartamento = new javax.swing.JTextField();
        lineaNombreProf1 = new javax.swing.JSeparator();
        btEliminar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        fondoProfesor.setBackground(new java.awt.Color(255, 255, 255));
        fondoProfesor.setMaximumSize(new java.awt.Dimension(800, 32767));
        fondoProfesor.setMinimumSize(new java.awt.Dimension(600, 600));
        fondoProfesor.setPreferredSize(new java.awt.Dimension(610, 610));

        cabezalProfesor.setBackground(new java.awt.Color(21, 101, 192));

        lbAgregarProfesor.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lbAgregarProfesor.setForeground(new java.awt.Color(255, 255, 255));
        lbAgregarProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/24px/Profesor_24px.png"))); // NOI18N
        lbAgregarProfesor.setText("Agregar profesor");
        lbAgregarProfesor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbAgregarProfesor.setIconTextGap(8);

        javax.swing.GroupLayout cabezalProfesorLayout = new javax.swing.GroupLayout(cabezalProfesor);
        cabezalProfesor.setLayout(cabezalProfesorLayout);
        cabezalProfesorLayout.setHorizontalGroup(
            cabezalProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezalProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAgregarProfesor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cabezalProfesorLayout.setVerticalGroup(
            cabezalProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezalProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAgregarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablaProfesores.setBackground(new java.awt.Color(255, 255, 255));
        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Departamento", "Centro universitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProfesores.setGridColor(new java.awt.Color(245, 245, 245));
        tablaProfesores.setSelectionBackground(new java.awt.Color(187, 222, 251));
        scrollTablaProfesores.setViewportView(tablaProfesores);
        if (tablaProfesores.getColumnModel().getColumnCount() > 0) {
            tablaProfesores.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablaProfesores.getColumnModel().getColumn(1).setMaxWidth(150);
            tablaProfesores.getColumnModel().getColumn(2).setPreferredWidth(150);
            tablaProfesores.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        lbNombreProfesor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNombreProfesor.setForeground(new java.awt.Color(8, 47, 107));
        lbNombreProfesor.setText("Nombre:");

        tfProfesor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfProfesor.setToolTipText("Escriba el nombre del profesor que solicita el aula");
        tfProfesor.setBorder(null);
        tfProfesor.setEnabled(false);

        lineaNombreProf.setForeground(new java.awt.Color(8, 47, 107));

        lbDepartamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDepartamento.setForeground(new java.awt.Color(8, 47, 107));
        lbDepartamento.setText("Departamento");

        lbCentro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCentro.setForeground(new java.awt.Color(8, 47, 107));
        lbCentro.setText("Centro universitario");

        cbCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        btModificar.setBackground(new java.awt.Color(0, 0, 0));
        btModificar.setForeground(new java.awt.Color(255, 255, 255));
        btModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btModificar.setText("Modificar");
        btModificar.setBorder(null);
        btModificar.setBorderPainted(false);
        btModificar.setContentAreaFilled(false);
        btModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btModificar.setEnabled(false);
        btModificar.setFocusPainted(false);
        btModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btModificar.setIconTextGap(0);
        btModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btModificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        tfDepartamento.setBorder(null);
        tfDepartamento.setEnabled(false);

        lineaNombreProf1.setForeground(new java.awt.Color(8, 47, 107));

        btEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.setBorder(null);
        btEliminar.setBorderPainted(false);
        btEliminar.setContentAreaFilled(false);
        btEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEliminar.setEnabled(false);
        btEliminar.setFocusPainted(false);
        btEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEliminar.setIconTextGap(0);
        btEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

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

        javax.swing.GroupLayout fondoProfesorLayout = new javax.swing.GroupLayout(fondoProfesor);
        fondoProfesor.setLayout(fondoProfesorLayout);
        fondoProfesorLayout.setHorizontalGroup(
            fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabezalProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoProfesorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoProfesorLayout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollTablaProfesores)
                    .addGroup(fondoProfesorLayout.createSequentialGroup()
                        .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lineaNombreProf)
                            .addComponent(tfProfesor)
                            .addComponent(lbNombreProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDepartamento)
                            .addComponent(lineaNombreProf1))
                        .addGap(10, 10, 10)
                        .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        fondoProfesorLayout.setVerticalGroup(
            fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoProfesorLayout.createSequentialGroup()
                .addComponent(cabezalProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreProfesor)
                    .addComponent(lbDepartamento)
                    .addComponent(lbCentro))
                .addGap(4, 4, 4)
                .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lineaNombreProf, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineaNombreProf1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(fondoProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(scrollTablaProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        fondoProfesorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbCentro, tfDepartamento, tfProfesor});

        getContentPane().add(fondoProfesor, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btModificar;
    private javax.swing.JPanel cabezalProfesor;
    private javax.swing.JComboBox<String> cbCentro;
    private javax.swing.JPanel fondoProfesor;
    private javax.swing.JLabel lbAgregarProfesor;
    private javax.swing.JLabel lbCentro;
    private javax.swing.JLabel lbDepartamento;
    private javax.swing.JLabel lbNombreProfesor;
    private javax.swing.JSeparator lineaNombreProf;
    private javax.swing.JSeparator lineaNombreProf1;
    private javax.swing.JScrollPane scrollTablaProfesores;
    private javax.swing.JTable tablaProfesores;
    private javax.swing.JTextField tfDepartamento;
    private javax.swing.JTextField tfProfesor;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCbCentro() {
        return cbCentro;
    }

    public void setCbCentro(JComboBox<String> cbCentro) {
        this.cbCentro = cbCentro;
    }

    public JTable getTablaProfesores() {
        return tablaProfesores;
    }

    public void setTablaProfesores(JTable tablaProfesores) {
        this.tablaProfesores = tablaProfesores;
    }

    public JTextField getTfDepartamento() {
        return tfDepartamento;
    }

    public void setTfDepartamento(JTextField tfDepartamento) {
        this.tfDepartamento = tfDepartamento;
    }

    public JTextField getTfProfesor() {
        return tfProfesor;
    }

    public void setTfProfesor(JTextField tfProfesor) {
        this.tfProfesor = tfProfesor;
    }

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

    public JButton getBtEliminar() {
        return btEliminar;
    }

    public void setBtEliminar(JButton btEliminar) {
        this.btEliminar = btEliminar;
    }

    public JButton getBtGuardar() {
        return btGuardar;
    }

    public void setBtGuardar(JButton btGuardar) {
        this.btGuardar = btGuardar;
    }

    public JButton getBtModificar() {
        return btModificar;
    }

    public void setBtModificar(JButton btModificar) {
        this.btModificar = btModificar;
    }

    

}
