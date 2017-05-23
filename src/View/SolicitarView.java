/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.DAOManager;
import Model.DAO.SolicitudDAO;
import Model.Solicitud;
import Model.TablaAulas;
import SQL.BD_Conexion;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author TOLOSAS
 */
public class SolicitarView extends javax.swing.JFrame {
    java.awt.Color colorBtPalEntered=new java.awt.Color(239, 105, 149);
    java.awt.Color colorBtPalExited=new java.awt.Color(233, 30, 99);
    java.awt.Color colorBtPalPressed=new java.awt.Color(253, 50, 119);
    java.awt.Color colorBtPalReleased=new java.awt.Color(239, 105, 149);
    
    //////////////////////////////////
    java.awt.Color colorBtSecEntered=new java.awt.Color(240, 240, 240);
    java.awt.Color colorBtSecExited=new java.awt.Color(230, 230, 230);
    java.awt.Color colorBtSecPressed=new java.awt.Color(220, 220, 220);
    java.awt.Color colorBtSecReleased=new java.awt.Color(230, 230, 230);
    
    private TablaAulas aulaActual;
    
    public SolicitarView(TablaAulas aula, String edificio) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.aulaActual = aula;
        this.setResizable(false);
        this.setTitle("Solicitar Aula");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.tfAula.setText(aulaActual.getAula());
        this.tfEdificio.setText(edificio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfTitulo = new javax.swing.JLabel();
        lbProfesor = new javax.swing.JLabel();
        tfProfesor = new javax.swing.JTextField();
        lbAsunto = new javax.swing.JLabel();
        tfAsunto = new javax.swing.JTextField();
        lbDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescripcion = new javax.swing.JTextArea();
        lbAulaSolicitada = new javax.swing.JLabel();
        tfAula = new javax.swing.JTextField();
        lbEdificio = new javax.swing.JLabel();
        tfEdificio = new javax.swing.JTextField();
        btGenerarReporte = new javax.swing.JButton();
        lineaAsunto = new javax.swing.JSeparator();
        lineaProf = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMinimumSize(new java.awt.Dimension(400, 450));
        fondo.setName(""); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(400, 400));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 101, 192));

        tfTitulo.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        tfTitulo.setForeground(new java.awt.Color(255, 255, 255));
        tfTitulo.setText("Solicitar Aula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(tfTitulo)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        lbProfesor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProfesor.setForeground(new java.awt.Color(8, 47, 107));
        lbProfesor.setText("Profesor");
        fondo.add(lbProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, -1));

        tfProfesor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfProfesor.setToolTipText("Escriba el nombre del profesor que solicita el aula");
        tfProfesor.setBorder(null);
        fondo.add(tfProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 360, 22));

        lbAsunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAsunto.setForeground(new java.awt.Color(8, 47, 107));
        lbAsunto.setText("Asunto");
        fondo.add(lbAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 129, 360, -1));

        tfAsunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAsunto.setBorder(null);
        fondo.add(tfAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 149, 360, 22));

        lbDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDescripcion.setForeground(new java.awt.Color(8, 47, 107));
        lbDescripcion.setText("Descripción");
        fondo.add(lbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 198, 360, -1));

        taDescripcion.setColumns(20);
        taDescripcion.setRows(5);
        taDescripcion.setPreferredSize(new java.awt.Dimension(165, 95));
        taDescripcion.setSelectionColor(new java.awt.Color(33, 150, 243));
        jScrollPane1.setViewportView(taDescripcion);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 218, 360, 79));

        lbAulaSolicitada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAulaSolicitada.setForeground(new java.awt.Color(8, 47, 107));
        lbAulaSolicitada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAulaSolicitada.setText("Aula solicitada");
        fondo.add(lbAulaSolicitada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 317, 162, -1));

        tfAula.setEditable(false);
        tfAula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAula.setBorder(null);
        tfAula.setFocusable(false);
        fondo.add(tfAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 337, 162, -1));

        lbEdificio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEdificio.setForeground(new java.awt.Color(8, 47, 107));
        lbEdificio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEdificio.setText("Edificio Solicitado");
        fondo.add(lbEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 317, 180, -1));

        tfEdificio.setEditable(false);
        tfEdificio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEdificio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEdificio.setBorder(null);
        tfEdificio.setFocusable(false);
        fondo.add(tfEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 337, 180, -1));

        btGenerarReporte.setBackground(new java.awt.Color(233, 30, 99));
        btGenerarReporte.setForeground(new java.awt.Color(255, 255, 255));
        btGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btGenerarReporte.setText("Generar reporte");
        btGenerarReporte.setBorder(null);
        btGenerarReporte.setBorderPainted(false);
        btGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGenerarReporte.setFocusPainted(false);
        btGenerarReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGenerarReporte.setIconTextGap(0);
        btGenerarReporte.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btGenerarReporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N
        btGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarReporteActionPerformed(evt);
            }
        });
        fondo.add(btGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, 26));
        btGenerarReporte.getAccessibleContext().setAccessibleDescription("");

        lineaAsunto.setForeground(new java.awt.Color(8, 47, 107));
        fondo.add(lineaAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 171, 360, -1));

        lineaProf.setForeground(new java.awt.Color(8, 47, 107));
        fondo.add(lineaProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 360, -1));

        getContentPane().add(fondo, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarReporteActionPerformed
        Connection con = BD_Conexion.getInstance();
        SolicitudDAO dao = new DAOManager().getSolicitudDAO();
        String asunto = this.tfAsunto.getText();
        String prof   = this.tfProfesor.getText();
        String desc   = this.taDescripcion.getText();
        String aula   = this.tfAula.getText();
        String edif   = this.tfEdificio.getText();
        if(asunto.isEmpty()||prof.isEmpty()||desc.isEmpty()||aula.isEmpty()||edif.isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos!");
        }else{
              File miDir = new File (".");
            try{
                Solicitud nueva = new Solicitud(asunto, desc, new Timestamp(System.currentTimeMillis()), 1, edif+aula);
                dao.crear(nueva);
                Solicitud SolicitudID = dao.getLastID();
                System.out.println(SolicitudID.getID_Solicitud());
                String archivo = miDir.getCanonicalPath() + "/src/View/Reporte/Solicitud.jasper";
                Map parametro = new HashMap();
                parametro.put("ID_Solicitud", SolicitudID.getID_Solicitud());
                JasperPrint  jp = JasperFillManager.fillReport(archivo,parametro,con);
                JasperViewer jv = new JasperViewer(jp,false);
                jv.setVisible(true);
                jv.setTitle("Solicitud-Aula");
            } catch (JRException ex) {
                Logger.getLogger(SolicitudView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SolicitudView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SolicitudView.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        }
    }//GEN-LAST:event_btGenerarReporteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGenerarReporte;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAsunto;
    private javax.swing.JLabel lbAulaSolicitada;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbEdificio;
    private javax.swing.JLabel lbProfesor;
    private javax.swing.JSeparator lineaAsunto;
    private javax.swing.JSeparator lineaProf;
    private javax.swing.JTextArea taDescripcion;
    private javax.swing.JTextField tfAsunto;
    private javax.swing.JTextField tfAula;
    private javax.swing.JTextField tfEdificio;
    private javax.swing.JTextField tfProfesor;
    private javax.swing.JLabel tfTitulo;
    // End of variables declaration//GEN-END:variables

    public JButton getBtGenerarReporte() {
        return btGenerarReporte;
    }

    public void setBtGenerarReporte(JButton btGenerarReporte) {
        this.btGenerarReporte = btGenerarReporte;
    }
    
    public JTextField getTfProfesor() {
        return tfProfesor;
    }

    public void setTfProfesor(JTextField tfProfesor) {
        this.tfProfesor = tfProfesor;
    }
    
    public JTextField getTfAsunto() {
        return tfAsunto;
    }

    public void setTfAsunto(JTextField tfAsunto) {
        this.tfAsunto = tfAsunto;
    }
    
    public JTextArea getTaDescripcion() {
        return taDescripcion;
    }

    public void setTaDescripcion(JTextArea taDescripcion) {
        this.taDescripcion = taDescripcion;
    }
    
    public JTextField getTfAulaSolicitada() {
        return tfAula;
    }

    public void setTfAulaSolicitada(JTextField tfAulaSolicitada) {
        this.tfAula = tfAulaSolicitada;
    }
    
    public JTextField getTfEdificioSolicitado() {
        return tfEdificio;
    }

    public void setTfEdificioSolicitado(JTextField tfEdificioSolicitado) {
        this.tfEdificio = tfEdificioSolicitado;
    }
}
