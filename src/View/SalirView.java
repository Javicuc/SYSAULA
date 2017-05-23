/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author TOLOSAS
 */
public class SalirView extends javax.swing.JDialog {

    public SalirView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dSalir = new javax.swing.JPanel();
        lbMensajeSalir = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        dSalir.setBackground(new java.awt.Color(255, 255, 255));
        dSalir.setMinimumSize(new java.awt.Dimension(350, 100));
        dSalir.setPreferredSize(new java.awt.Dimension(350, 100));

        lbMensajeSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMensajeSalir.setText("¿Estás seguro que deseas salir?");

        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setContentAreaFilled(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setPreferredSize(new java.awt.Dimension(110, 26));
        btCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/button110x26_pressed.png"))); // NOI18N
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/buttonPal110x26_rollover.png"))); // NOI18N
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/botonsec110x25.png"))); // NOI18N
        btSalir.setText("Salir");
        btSalir.setContentAreaFilled(false);
        btSalir.setFocusable(false);
        btSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalir.setPreferredSize(new java.awt.Dimension(110, 26));
        btSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/botonsec110x25_pressed.png"))); // NOI18N
        btSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/botones/botonsec110x25_rollover.png"))); // NOI18N
        btSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dSalirLayout = new javax.swing.GroupLayout(dSalir);
        dSalir.setLayout(dSalirLayout);
        dSalirLayout.setHorizontalGroup(
            dSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dSalirLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(dSalirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbMensajeSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dSalirLayout.setVerticalGroup(
            dSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dSalirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbMensajeSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(dSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(dSalir, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
       dispose();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void btSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel dSalir;
    private javax.swing.JLabel lbMensajeSalir;
    // End of variables declaration//GEN-END:variables
}
