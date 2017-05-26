/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MainViewController;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.time.LocalTime;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author TOLOSAS
 */
public class MainView extends javax.swing.JFrame {

    private MainViewController controller;
    
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
        this.controller = new MainViewController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        PanelCabezal = new javax.swing.JPanel();
        lbNombreAplicacion = new javax.swing.JLabel();
        btAula = new javax.swing.JButton();
        btConfigurar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btEdificio = new javax.swing.JButton();
        btProfesor = new javax.swing.JButton();
        PanelBusqueda = new javax.swing.JPanel();
        lbBusq = new javax.swing.JLabel();
        lbEdificio = new javax.swing.JLabel();
        cbEdificio = new javax.swing.JComboBox<>();
        lbDia = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        lbHoraInicio = new javax.swing.JLabel();
        lbHoraFin = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TimePickerSettings timeSettings;
        timeSettings = new TimePickerSettings();
        timeSettings.setAllowEmptyTimes(false);
        timeSettings.setDisplaySpinnerButtons(true);
        timeSettings.generatePotentialMenuTimes(TimeIncrement.OneHour, LocalTime.of(7, 00), LocalTime.of(20, 00));
        tpHoraInicio = new com.github.lgooddatepicker.components.TimePicker(timeSettings);
        TimePickerSettings timeSettings2;
        timeSettings2 = new TimePickerSettings();
        timeSettings2.setAllowEmptyTimes(false);
        timeSettings2.setDisplaySpinnerButtons(true);
        timeSettings2.generatePotentialMenuTimes(TimeIncrement.OneHour, LocalTime.of(8, 00), LocalTime.of(21, 00));
        tpHoraFin = new com.github.lgooddatepicker.components.TimePicker(timeSettings2);
        ScrollTablaAulas = new javax.swing.JScrollPane();
        tablaHorarios = new javax.swing.JTable();
        lbCabeceraTabla = new javax.swing.JLabel();
        btSolicitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        PanelCabezal.setBackground(new java.awt.Color(21, 101, 192));

        lbNombreAplicacion.setText("SysAula");
        lbNombreAplicacion.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        lbNombreAplicacion.setForeground(new java.awt.Color(255, 255, 255));

        btAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/clase_boton.png"))); // NOI18N
        btAula.setBackground(new java.awt.Color(21, 101, 192));
        btAula.setBorder(null);
        btAula.setContentAreaFilled(false);
        btAula.setFocusable(false);
        btAula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAula.setForeground(new java.awt.Color(255, 255, 255));
        btAula.setIconTextGap(0);
        btAula.setOpaque(true);
        btAula.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/clase_pressed.png"))); // NOI18N
        btAula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/clase_rollover.png"))); // NOI18N
        btAula.setToolTipText("Agregar nueva clase");

        btConfigurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/config_boton.jpg"))); // NOI18N
        btConfigurar.setBackground(new java.awt.Color(21, 101, 192));
        btConfigurar.setBorder(null);
        btConfigurar.setContentAreaFilled(false);
        btConfigurar.setFocusable(false);
        btConfigurar.setForeground(new java.awt.Color(255, 255, 255));
        btConfigurar.setOpaque(true);
        btConfigurar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/config_pressed.jpg"))); // NOI18N
        btConfigurar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/config_rollover.jpg"))); // NOI18N
        btConfigurar.setToolTipText("Configuración");

        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/recarga_boton.jpg"))); // NOI18N
        btActualizar.setBackground(new java.awt.Color(21, 101, 192));
        btActualizar.setBorder(null);
        btActualizar.setContentAreaFilled(false);
        btActualizar.setFocusable(false);
        btActualizar.setOpaque(true);
        btActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/recarga_pressed.jpg"))); // NOI18N
        btActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/recarga_rollover.jpg"))); // NOI18N
        btActualizar.setToolTipText("Recargar clases");

        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/eliminar_boton.jpg"))); // NOI18N
        btEliminar.setBackground(new java.awt.Color(21, 101, 192));
        btEliminar.setBorder(null);
        btEliminar.setContentAreaFilled(false);
        btEliminar.setFocusable(false);
        btEliminar.setIconTextGap(0);
        btEliminar.setOpaque(true);
        btEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/eliminar_pressed.jpg"))); // NOI18N
        btEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/eliminar_rollover.jpg"))); // NOI18N
        btEliminar.setToolTipText("Eliminar clase");

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/salir_boton.jpg"))); // NOI18N
        btSalir.setBackground(new java.awt.Color(21, 101, 192));
        btSalir.setBorder(null);
        btSalir.setContentAreaFilled(false);
        btSalir.setFocusable(false);
        btSalir.setIconTextGap(0);
        btSalir.setOpaque(true);
        btSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/salir_pressed.jpg"))); // NOI18N
        btSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/salir_rollover.jpg"))); // NOI18N
        btSalir.setToolTipText("Salir de la aplicación");
        btSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalirMouseClicked(evt);
            }
        });

        btEdificio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/edificio_boton.png"))); // NOI18N
        btEdificio.setBackground(new java.awt.Color(21, 101, 192));
        btEdificio.setBorder(null);
        btEdificio.setContentAreaFilled(false);
        btEdificio.setFocusable(false);
        btEdificio.setForeground(new java.awt.Color(255, 255, 255));
        btEdificio.setIconTextGap(0);
        btEdificio.setOpaque(true);
        btEdificio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/edificio_pressed.png"))); // NOI18N
        btEdificio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/edificio_rollover.png"))); // NOI18N
        btEdificio.setToolTipText("Agregar edificio");

        btProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/profe_boton.png"))); // NOI18N
        btProfesor.setBackground(new java.awt.Color(21, 101, 192));
        btProfesor.setBorder(null);
        btProfesor.setContentAreaFilled(false);
        btProfesor.setFocusable(false);
        btProfesor.setForeground(new java.awt.Color(255, 255, 255));
        btProfesor.setIconTextGap(0);
        btProfesor.setOpaque(true);
        btProfesor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/profePressed.png"))); // NOI18N
        btProfesor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/50px/profeRollover.png"))); // NOI18N
        btProfesor.setToolTipText("Agregar profesor");

        javax.swing.GroupLayout PanelCabezalLayout = new javax.swing.GroupLayout(PanelCabezal);
        PanelCabezal.setLayout(PanelCabezalLayout);
        PanelCabezalLayout.setHorizontalGroup(
            PanelCabezalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCabezalLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbNombreAplicacion)
                .addGap(11, 11, 11)
                .addComponent(btAula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEliminar)
                .addGap(0, 0, 0)
                .addComponent(btActualizar)
                .addGap(0, 0, 0)
                .addComponent(btConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btSalir))
        );
        PanelCabezalLayout.setVerticalGroup(
            PanelCabezalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNombreAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelCabezalLayout.createSequentialGroup()
                .addGroup(PanelCabezalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConfigurar)
                    .addComponent(btActualizar)
                    .addComponent(btEliminar)
                    .addComponent(btSalir))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabezalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btProfesor))
        );

        PanelBusqueda.setBackground(new java.awt.Color(236, 246, 253));

        lbBusq.setText("Buscar aula");
        lbBusq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbBusq.setForeground(new java.awt.Color(8, 47, 107));

        lbEdificio.setText("Edificio");
        lbEdificio.setForeground(new java.awt.Color(8, 47, 107));

        cbEdificio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbDia.setText("Día");
        lbDia.setForeground(new java.awt.Color(8, 47, 107));

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbHoraInicio.setText("Hora  de inicio");
        lbHoraInicio.setForeground(new java.awt.Color(8, 47, 107));

        lbHoraFin.setText("Hora  de finalización");
        lbHoraFin.setForeground(new java.awt.Color(8, 47, 107));

        btBuscar.setBackground(new java.awt.Color(233, 30, 99));
        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setAlignmentY(0.0F);
        btBuscar.setBorder(null);
        btBuscar.setBorderPainted(false);
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscar.setFocusPainted(false);
        btBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscar.setIconTextGap(0);
        btBuscar.setMaximumSize(new java.awt.Dimension(120, 26));
        btBuscar.setMinimumSize(new java.awt.Dimension(120, 26));
        btBuscar.setPreferredSize(new java.awt.Dimension(120, 26));
        btBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(182, 205, 221));
        jPanel1.setMinimumSize(new java.awt.Dimension(135, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(135, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelBusquedaLayout = new javax.swing.GroupLayout(PanelBusqueda);
        PanelBusqueda.setLayout(PanelBusquedaLayout);
        PanelBusquedaLayout.setHorizontalGroup(
            PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(PanelBusquedaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(lbDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEdificio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpHoraInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador)
                    .addComponent(lbHoraInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbBusq, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PanelBusquedaLayout.setVerticalGroup(
            PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusquedaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbBusq)
                .addGap(20, 20, 20)
                .addComponent(lbEdificio)
                .addGap(5, 5, 5)
                .addComponent(cbEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbDia)
                .addGap(6, 6, 6)
                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lbHoraInicio)
                .addGap(5, 5, 5)
                .addComponent(tpHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbHoraFin)
                .addGap(5, 5, 5)
                .addComponent(tpHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelBusquedaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbDia, cbEdificio});

        ScrollTablaAulas.setBackground(new java.awt.Color(255, 255, 255));

        tablaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Edificio", "Aula", "Hora de Inicio", "Hora de Finalización", "Disponiblidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHorarios.setAlignmentX(0.0F);
        tablaHorarios.setAlignmentY(0.0F);
        tablaHorarios.setBackground(new java.awt.Color(255, 255, 255));
        tablaHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaHorarios.setFocusable(false);
        tablaHorarios.setFont(tablaHorarios.getFont());
        tablaHorarios.setForeground(new java.awt.Color(21, 101, 192));
        tablaHorarios.setGridColor(new java.awt.Color(245, 245, 245));
        tablaHorarios.setName(""); // NOI18N
        tablaHorarios.setRowHeight(40);
        tablaHorarios.setSelectionBackground(new java.awt.Color(187, 222, 251));
        tablaHorarios.setSelectionForeground(new java.awt.Color(102, 102, 255));
        ScrollTablaAulas.setViewportView(tablaHorarios);

        lbCabeceraTabla.setText("Aulas Disponibles");
        lbCabeceraTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCabeceraTabla.setForeground(new java.awt.Color(13, 71, 161));

        btSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btSolicitar.setText("Solicitar aula");
        btSolicitar.setBackground(new java.awt.Color(233, 30, 99));
        btSolicitar.setBorder(null);
        btSolicitar.setBorderPainted(false);
        btSolicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSolicitar.setFocusPainted(false);
        btSolicitar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSolicitar.setForeground(new java.awt.Color(255, 255, 255));
        btSolicitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSolicitar.setIconTextGap(0);
        btSolicitar.setMaximumSize(new java.awt.Dimension(120, 26));
        btSolicitar.setMinimumSize(new java.awt.Dimension(120, 26));
        btSolicitar.setPreferredSize(new java.awt.Dimension(120, 26));
        btSolicitar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btSolicitar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCabezal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(PanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(lbCabeceraTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollTablaAulas, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(PanelCabezal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbCabeceraTabla))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(ScrollTablaAulas, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        getContentPane().add(Fondo, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void btSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirMouseClicked
        SalirView dialog = new SalirView(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btSalirMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelCabezal;
    private javax.swing.JScrollPane ScrollTablaAulas;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btAula;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btConfigurar;
    private javax.swing.JButton btEdificio;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btProfesor;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btSolicitar;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbEdificio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBusq;
    private javax.swing.JLabel lbCabeceraTabla;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbEdificio;
    private javax.swing.JLabel lbHoraFin;
    private javax.swing.JLabel lbHoraInicio;
    private javax.swing.JLabel lbNombreAplicacion;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tablaHorarios;
    private com.github.lgooddatepicker.components.TimePicker tpHoraFin;
    private com.github.lgooddatepicker.components.TimePicker tpHoraInicio;
    // End of variables declaration//GEN-END:variables
    
    public JButton getBtAula() {
        return btAula;
    }

    public void setBtAula(JButton btAula) {
        this.btAula = btAula;
    }
    
    public JButton getBtRecargar() {
        return btActualizar;
    }

    public void setBtRecargar(JButton btRecargar) {
        this.btActualizar = btRecargar;
    }
    
    public JButton getBtEliminar() {
        return btEliminar;
    }

    public void setBtEliminar(JButton btEliminar) {
        this.btEliminar = btEliminar;
    }
    
    public JLabel getLbNombreAplicacion() {
        return lbNombreAplicacion;
    }
    
    public void setLbNombreAplicacion(JLabel lbNombreAplicacion) {
        this.lbNombreAplicacion = lbNombreAplicacion;
    }
    
    public JComboBox getCbEdificio() {
        return cbEdificio;
    }
    public void setCbEdificio(JComboBox cbEdificio) {
        this.cbEdificio = cbEdificio;
    }
    
    public JComboBox getCbDia() {
        return cbDia;
    }
    public void setCbDia(JComboBox cbDia) {
        this.cbDia = cbDia;
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
    
    public JButton getBtBuscar() {
        return btBuscar;
    }

    public void setBtBuscar(JButton btBuscar) {
        this.btBuscar = btBuscar;
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

    public JButton getBtSolicitar() {
        return btSolicitar;
    }

    public void setBtSolicitar(JButton btSolicitar) {
        this.btSolicitar = btSolicitar;
    }

    public JTable getTablaHorarios() {
        return tablaHorarios;
    }

    public void setTablaHorarios(JTable tablaHorarios) {
        this.tablaHorarios = tablaHorarios;
    }

    public JButton getBtConfigurar() {
        return btConfigurar;
    }

    public void setBtConfigurar(JButton btConfigurar) {
        this.btConfigurar = btConfigurar;
    }
    
    
}
