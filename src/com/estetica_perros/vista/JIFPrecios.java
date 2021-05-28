/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.vista;

import ServicioExcepcion.ServicioExcepcion;
import com.estetica_perros.controlador.ControladorServicios;
import com.estetica_perros.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTINA
 */
public class JIFPrecios extends javax.swing.JFrame {

    private ControladorServicios controlServicio = new ControladorServicios();
    private Usuario usuarioAutenticado;
    public JIFPrecios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jifCotizarPrecios = new javax.swing.JInternalFrame();
        jifServicios = new javax.swing.JInternalFrame();
        chcBaño = new java.awt.Checkbox();
        chcMotilada = new java.awt.Checkbox();
        chcProfilaxis = new java.awt.Checkbox();
        jifTamaños = new javax.swing.JInternalFrame();
        chcPequeño = new java.awt.Checkbox();
        chcMediano = new java.awt.Checkbox();
        chcGrande = new java.awt.Checkbox();
        btnCotizacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInicio = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifCotizarPrecios.setResizable(true);
        jifCotizarPrecios.setTitle("COTIZACIÓN DE PRECIOS");
        jifCotizarPrecios.setVisible(true);

        jifServicios.setResizable(true);
        jifServicios.setTitle("LISTADO DE SERVICIOS");
        jifServicios.setVisible(true);

        chcBaño.setLabel("BAÑO");

        chcMotilada.setLabel("MOTILADO");

        chcProfilaxis.setLabel("PROFILAXIS");

        javax.swing.GroupLayout jifServiciosLayout = new javax.swing.GroupLayout(jifServicios.getContentPane());
        jifServicios.getContentPane().setLayout(jifServiciosLayout);
        jifServiciosLayout.setHorizontalGroup(
            jifServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifServiciosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jifServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(chcProfilaxis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chcMotilada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chcBaño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jifServiciosLayout.setVerticalGroup(
            jifServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifServiciosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(chcBaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcMotilada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcProfilaxis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jifTamaños.setResizable(true);
        jifTamaños.setTitle("LISTADO DE TAMAÑOS");
        jifTamaños.setVisible(true);

        chcPequeño.setLabel("PEQUEÑO");

        chcMediano.setLabel("MEDIANO");

        chcGrande.setLabel("GRANDE");

        javax.swing.GroupLayout jifTamañosLayout = new javax.swing.GroupLayout(jifTamaños.getContentPane());
        jifTamaños.getContentPane().setLayout(jifTamañosLayout);
        jifTamañosLayout.setHorizontalGroup(
            jifTamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifTamañosLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jifTamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chcGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chcMediano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chcPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jifTamañosLayout.setVerticalGroup(
            jifTamañosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifTamañosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(chcPequeño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcMediano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chcGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCotizacion.setText("COTIZAR");
        btnCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jifCotizarPreciosLayout = new javax.swing.GroupLayout(jifCotizarPrecios.getContentPane());
        jifCotizarPrecios.getContentPane().setLayout(jifCotizarPreciosLayout);
        jifCotizarPreciosLayout.setHorizontalGroup(
            jifCotizarPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifCotizarPreciosLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jifServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jifTamaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifCotizarPreciosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        jifCotizarPreciosLayout.setVerticalGroup(
            jifCotizarPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifCotizarPreciosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jifCotizarPreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jifTamaños)
                    .addComponent(jifServicios))
                .addGap(27, 27, 27)
                .addComponent(btnCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        mnuInicio.setText("INICIO");

        mnuSalir.setText("SALIR");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuInicio.add(mnuSalir);

        jMenuBar1.add(mnuInicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jifCotizarPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jifCotizarPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void btnCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizacionActionPerformed
        // TODO add your handling code here:
        
            //JOptionPane.showMessageDialog(rootPane,"Si adquiere solo 1 servicio no obtendrá descuento");
            controlServicio.calcularPrecioPerroGrande(chcBaño.getState(), chcMotilada.getState(), chcProfilaxis.getState(), chcGrande.getState(), chcMediano.getState(), chcPequeño.getState());
            controlServicio.calcularPrecioPerroPequeño(chcBaño.getState(), chcMotilada.getState(), chcProfilaxis.getState(), chcGrande.getState(), chcMediano.getState(), chcPequeño.getState());
            controlServicio.calcularPrecioPerroMediano(chcBaño.getState(), chcMotilada.getState(), chcProfilaxis.getState(), chcGrande.getState(), chcMediano.getState(), chcPequeño.getState());
    }//GEN-LAST:event_btnCotizacionActionPerformed


   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCotizacion;
    private java.awt.Checkbox chcBaño;
    private java.awt.Checkbox chcGrande;
    private java.awt.Checkbox chcMediano;
    private java.awt.Checkbox chcMotilada;
    private java.awt.Checkbox chcPequeño;
    private java.awt.Checkbox chcProfilaxis;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JInternalFrame jifCotizarPrecios;
    private javax.swing.JInternalFrame jifServicios;
    private javax.swing.JInternalFrame jifTamaños;
    private javax.swing.JMenu mnuInicio;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
