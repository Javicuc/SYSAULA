/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AulaController;
import com.github.lgooddatepicker.components.TimePicker;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author TOLOSAS
 */
public class AulaView extends javax.swing.JFrame {

    
    private AulaController controller;
    
    public AulaView() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Registrar Aula");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.controller = new AulaController(this);
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        cabezalAula = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tpHoraFin = new com.github.lgooddatepicker.components.TimePicker();
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker();
        lbDias = new javax.swing.JLabel();
        lbHoraFin1 = new javax.swing.JLabel();
        cbJueves = new javax.swing.JCheckBox();
        lbNrc = new javax.swing.JLabel();
        cbLunes = new javax.swing.JCheckBox();
        cbMiercoles = new javax.swing.JCheckBox();
        lbHoraFin2 = new javax.swing.JLabel();
        cbSabado = new javax.swing.JCheckBox();
        cbEdificio = new javax.swing.JComboBox<>();
        lbHoraInicio = new javax.swing.JLabel();
        cbViernes = new javax.swing.JCheckBox();
        lbNombreMateria = new javax.swing.JLabel();
        tfNrc = new javax.swing.JTextField();
        tfClave = new javax.swing.JTextField();
        cbMartes = new javax.swing.JCheckBox();
        tfNombreMateria = new javax.swing.JTextField();
        cbAula = new javax.swing.JComboBox<>();
        lbHoraFin = new javax.swing.JLabel();
        lbClave = new javax.swing.JLabel();
        lineaNombreMateria = new javax.swing.JSeparator();
        lineaNombreMateria1 = new javax.swing.JSeparator();
        lineaNombreMateria2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        scrollTablaAulas = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();
        btAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMinimumSize(new java.awt.Dimension(500, 500));
        fondo.setPreferredSize(new java.awt.Dimension(500, 500));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cabezalAula.setBackground(new java.awt.Color(21, 101, 192));

        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/24px/Aula_24px.png"))); // NOI18N
        lbTitulo.setText("Agregar aula");
        lbTitulo.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbTitulo.setIconTextGap(8);

        javax.swing.GroupLayout cabezalAulaLayout = new javax.swing.GroupLayout(cabezalAula);
        cabezalAula.setLayout(cabezalAulaLayout);
        cabezalAulaLayout.setHorizontalGroup(
            cabezalAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezalAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cabezalAulaLayout.setVerticalGroup(
            cabezalAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezalAulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo.add(cabezalAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 722, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbDias.setText("Días que se imparte");
        lbDias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDias.setForeground(new java.awt.Color(8, 47, 107));

        lbHoraFin1.setText("Edificio");
        lbHoraFin1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraFin1.setForeground(new java.awt.Color(8, 47, 107));

        cbJueves.setText("J");
        cbJueves.setOpaque(false);

        lbNrc.setText("NRC");
        lbNrc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNrc.setForeground(new java.awt.Color(8, 47, 107));

        cbLunes.setText("L");
        cbLunes.setOpaque(false);

        cbMiercoles.setText("I");
        cbMiercoles.setOpaque(false);

        lbHoraFin2.setText("Aula");
        lbHoraFin2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraFin2.setForeground(new java.awt.Color(8, 47, 107));

        cbSabado.setText("S");
        cbSabado.setNextFocusableComponent(btAgregar);
        cbSabado.setOpaque(false);

        cbEdificio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbHoraInicio.setText("Hora inicio");
        lbHoraInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraInicio.setForeground(new java.awt.Color(8, 47, 107));

        cbViernes.setText("V");
        cbViernes.setOpaque(false);

        lbNombreMateria.setText("Materia que se imparte");
        lbNombreMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNombreMateria.setForeground(new java.awt.Color(8, 47, 107));

        tfNrc.setBorder(null);
        tfNrc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNrc.setToolTipText("Escriba el nombre del profesor que solicita el aula");
        tfNrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNrcKeyTyped(evt);
            }
        });

        tfClave.setBorder(null);
        tfClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfClave.setToolTipText("Escriba el nombre del profesor que solicita el aula");

        cbMartes.setText("M");
        cbMartes.setOpaque(false);

        tfNombreMateria.setBorder(null);
        tfNombreMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNombreMateria.setToolTipText("Escriba el nombre del profesor que solicita el aula");

        cbAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbHoraFin.setText("Hora fin");
        lbHoraFin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraFin.setForeground(new java.awt.Color(8, 47, 107));

        lbClave.setText("Clave");
        lbClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbClave.setForeground(new java.awt.Color(8, 47, 107));

        lineaNombreMateria.setForeground(new java.awt.Color(8, 47, 107));

        lineaNombreMateria1.setForeground(new java.awt.Color(8, 47, 107));

        lineaNombreMateria2.setForeground(new java.awt.Color(8, 47, 107));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbHoraFin1)
                                .addGap(48, 48, 48)
                                .addComponent(lbHoraFin2)
                                .addGap(65, 65, 65)
                                .addComponent(lbHoraInicio)
                                .addGap(50, 50, 50)
                                .addComponent(lbHoraFin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cbAula, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tpHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDias)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbLunes)
                                .addGap(6, 6, 6)
                                .addComponent(cbMartes)
                                .addGap(6, 6, 6)
                                .addComponent(cbMiercoles)
                                .addGap(6, 6, 6)
                                .addComponent(cbJueves)
                                .addGap(6, 6, 6)
                                .addComponent(cbViernes)
                                .addGap(6, 6, 6)
                                .addComponent(cbSabado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbNrc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbClave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfNrc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lineaNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(lineaNombreMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(lineaNombreMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombreMateria)
                    .addComponent(lbNrc)
                    .addComponent(lbClave))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNrc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lineaNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineaNombreMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineaNombreMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHoraFin1)
                    .addComponent(lbHoraFin2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbHoraInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbHoraFin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbDias)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tpHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 700, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NRC", "Clave", "Nombre", "Hora Inicio", "Hora Fin", "Dias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAulas.setBackground(new java.awt.Color(255, 255, 255));
        tablaAulas.setGridColor(new java.awt.Color(245, 245, 245));
        tablaAulas.setSelectionBackground(new java.awt.Color(187, 222, 251));
        scrollTablaAulas.setViewportView(tablaAulas);
        if (tablaAulas.getColumnModel().getColumnCount() > 0) {
            tablaAulas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaAulas.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaAulas.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaAulas.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaAulas.getColumnModel().getColumn(3).setMaxWidth(100);
            tablaAulas.getColumnModel().getColumn(4).setMaxWidth(100);
            tablaAulas.getColumnModel().getColumn(5).setPreferredWidth(100);
            tablaAulas.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btAgregar.setText("Agregar");
        btAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btAgregar.setBorder(null);
        btAgregar.setBorderPainted(false);
        btAgregar.setContentAreaFilled(false);
        btAgregar.setFocusPainted(false);
        btAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAgregar.setIconTextGap(0);
        btAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("BUSCAR:");

        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAgregar))
                    .addComponent(scrollTablaAulas, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTablaAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 698, 288));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNrcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNrcKeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar)) 
                || (vchar == KeyEvent.VK_BACK_SPACE) || (vchar == KeyEvent.VK_DELETE) || getTfNrc().getText().length() > 7)
            evt.consume();
    }//GEN-LAST:event_tfNrcKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JPanel cabezalAula;
    private javax.swing.JComboBox<String> cbAula;
    private javax.swing.JComboBox<String> cbEdificio;
    private javax.swing.JCheckBox cbJueves;
    private javax.swing.JCheckBox cbLunes;
    private javax.swing.JCheckBox cbMartes;
    private javax.swing.JCheckBox cbMiercoles;
    private javax.swing.JCheckBox cbSabado;
    private javax.swing.JCheckBox cbViernes;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbClave;
    private javax.swing.JLabel lbDias;
    private javax.swing.JLabel lbHoraFin;
    private javax.swing.JLabel lbHoraFin1;
    private javax.swing.JLabel lbHoraFin2;
    private javax.swing.JLabel lbHoraInicio;
    private javax.swing.JLabel lbNombreMateria;
    private javax.swing.JLabel lbNrc;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator lineaNombreMateria;
    private javax.swing.JSeparator lineaNombreMateria1;
    private javax.swing.JSeparator lineaNombreMateria2;
    private javax.swing.JScrollPane scrollTablaAulas;
    private javax.swing.JTable tablaAulas;
    private javax.swing.JTextField tfClave;
    private javax.swing.JTextField tfNombreMateria;
    private javax.swing.JTextField tfNrc;
    private com.github.lgooddatepicker.components.TimePicker tpHoraFin;
    private com.github.lgooddatepicker.components.TimePicker tpHoraInicio;
    // End of variables declaration//GEN-END:variables
   
    public JLabel getlbTitulo() {
        return lbTitulo;
    }

    public void setlbTitulo(JLabel lbTitulo) {
        this.lbTitulo = lbTitulo;
    }
    
    public JLabel getlbNombreMateria() {
        return lbNombreMateria;
    }

    public void setlbNombreMateria(JLabel lbNombreMateria) {
        this.lbNombreMateria = lbNombreMateria;
    }
    
    public JTextField getTfNombreMateria() {
        return tfNombreMateria;
    }

    public void setTfNombreMateria(JTextField tfNombreMateria) {
        this.tfNombreMateria = tfNombreMateria;
    }
    
    public JTextField getTfNrc() {
        return tfNrc;
    }

    public void setTfNrc(JTextField tfNrc) {
        this.tfNrc = tfNrc;
    }
    
    public JTextField getTfClave() {
        return tfClave;
    }

    public void setTfClave(JTextField tfClave) {
        this.tfClave = tfClave;
    }
    
    public JComboBox getCbEdificio() {
        return cbEdificio;
    }

    public void setCbEdificio(JComboBox cbEdificio) {
        this.cbEdificio = cbEdificio;
    }
    
    public TimePicker getTpHoraInicio() {
        return tpHoraInicio;
    }

    public void setTpHoraInicio(TimePicker tpHoraInicio) {
        this.tpHoraInicio = tpHoraInicio;
    }
    
    public TimePicker getTpHoraFin() {
        return tpHoraFin;
    }

    public void setTpHoraFin(TimePicker tpHoraFin) {
        this.tpHoraFin = tpHoraFin;
    }
    
    public JCheckBox getCbLunes() {
        return cbLunes;
    }

    public void setCbLunes(JCheckBox cbLunes) {
        this.cbLunes = cbLunes;
    }
    
    public JCheckBox getCbMartes() {
        return cbMartes;
    }

    public void setCbMartes(JCheckBox cbMartes) {
        this.cbMartes = cbMartes;
    }
    
    public JCheckBox getCbMiercoles() {
        return cbMiercoles;
    }

    public void setCbMiercoles(JCheckBox cbMiercoles) {
        this.cbMiercoles = cbMiercoles;
    }
    
    public JCheckBox getCbJueves() {
        return cbJueves;
    }

    public void setCbJueves(JCheckBox cbJueves) {
        this.cbJueves = cbJueves;
    }
    
    public JCheckBox getCbViernes() {
        return cbViernes;
    }

    public void setCbViernes(JCheckBox cbViernes) {
        this.cbViernes = cbViernes;
    }
    
    public JCheckBox getCbSabado() {
        return cbSabado;
    }

    public void setCbSabado(JCheckBox cbSabado) {
        this.cbSabado = cbSabado;
    }
    
    public JButton getBtAgregar() {
        return btAgregar;
    }

    public void setBtAgregar(JButton btAgregar) {
        this.btAgregar = btAgregar;
    }
    
    public JTable getTablaAulas() {
        return tablaAulas;
    }

    public void setTablaAulas(JTable tablaAulas) {
        this.tablaAulas = tablaAulas;
    }

    public JComboBox<String> getCbAula() {
        return cbAula;
    }

    public void setCbAula(JComboBox<String> cbAula) {
        this.cbAula = cbAula;
    }
    
    
}
