/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.vista;

import com.estetica_perros.controlador.ControladorUsuario;
import com.estetica_perros.modelo.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File; 
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author MARTINA
 */
public class JIFRegistroUsuarios extends javax.swing.JFrame {

    //private ControladorUsuario llenado = new ControladorUsuario();
    ArrayList<Usuario> lista = new ArrayList<Usuario>();
    public JIFRegistroUsuarios() {
        initComponents();
        model =(DefaultTableModel)this.jTableRegistroPersonas.getModel();
    }
    DefaultTableModel model ;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistroPersonas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        lblCelular = new javax.swing.JLabel();
        txtNombrePersona = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lblNombrePersona = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnMostrarRegistro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInicio = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("REGISTRO PERSONAS");
        jInternalFrame1.setEnabled(false);
        jInternalFrame1.setVisible(true);

        jTableRegistroPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CORREO", "CONTRASEÑA", "CELULAR", "CÉDULA", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRegistroPersonas.getTableHeader().setResizingAllowed(false);
        jTableRegistroPersonas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableRegistroPersonas);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblCelular.setText("* CELULAR:");

        lblNombrePersona.setText("NOMBRE DE LA PERSONA:");

        lblCorreo.setText("* CORREO:");

        lblContrasenia.setText("* CONTRASEÑA:");

        lblCedula.setText("* CÉDULA:");

        lblFecha.setText("* FECHA DEL REGISTRO:");

        btnAgregar.setText("AGREGAR A LA TABLA");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrarRegistro.setText("MOSTRAR REGISTRO");
        btnMostrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCorreo)
                    .addComponent(lblNombrePersona)
                    .addComponent(lblCelular)
                    .addComponent(lblContrasenia)
                    .addComponent(lblCedula)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePersona)
                            .addComponent(txtCorreo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                .addGap(74, 74, 74)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(77, Short.MAX_VALUE))))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnMostrarRegistro)
                        .addGap(110, 110, 110)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePersona)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasenia)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarRegistro)
                    .addComponent(btnGuardar))
                .addContainerGap(156, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    try{
        FileWriter guardar = new FileWriter("src/datosUsuio.txt");
        for(int i= 0; i < this.jTableRegistroPersonas.getRowCount(); i++){   
//            guardar.write(lista.get(i).toString() + "\n");
            guardar.write(model.getValueAt(i, 0) + "\n");
            guardar.write(model.getValueAt(i, 1) + "\n");
            guardar.write(model.getValueAt(i, 2) + "\n");
            guardar.write(model.getValueAt(i, 3) + "\n");
            guardar.write(model.getValueAt(i, 4) + "\n");
            guardar.write(model.getValueAt(i, 5) + "\n");
        }
        guardar.close();
        JOptionPane.showMessageDialog(rootPane, "Datos guardados");
        JIFRegistroPerros abrir = new JIFRegistroPerros();
        abrir.setVisible(true);
    }catch(Exception x){
        JOptionPane.showMessageDialog(rootPane, "Error al intentar guardar el archivo " );
    
    }
        
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if ((txtNombrePersona.getText().equals("")) || (txtCedula.getText().equals(""))
                || (txtContrasenia.getText().equals("")) || (txtCorreo.getText().equals(""))
                || (txtCelular.getText().equals("")) || (txtFecha.getText().equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "Debe de diligencia todos los campos");
        }else{
            model.addRow(new Object[]{txtContrasenia.getText(), txtCorreo.getText(), 
                txtNombrePersona.getText(), txtCedula.getText() , txtCelular.getText(), txtFecha.getText()});
        }
        txtContrasenia.setText("");
        txtCedula.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        txtNombrePersona.setText("");
        txtFecha.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistroActionPerformed
        String aux = "src/datosUsuio.txt";
        String nombre = txtNombrePersona.getText();
        String correo = txtCorreo.getText();
        String contrasenia = txtContrasenia.getText();
        String cedula = txtCedula.getText();
        String celular = txtCedula.getText();
        String fecha = txtFecha.getText();
        Scanner linea = null;

        File doc = new File(aux);
        try {
            linea = new Scanner(doc);

            while (linea.hasNextLine()) {
                nombre = linea.nextLine();
                correo = linea.nextLine();
                contrasenia = linea.nextLine();
                cedula = linea.nextLine();
                celular = linea.nextLine();
                fecha = linea.nextLine();

                model.addRow(new Object[]{nombre, correo, contrasenia, cedula, celular, fecha});

            }
            JIFRegistroPerros abrir = new JIFRegistroPerros();
            abrir.setVisible(true);
        } catch (Exception x) {
            JOptionPane.showMessageDialog(rootPane, "Error al intenta abrir el archivo");

        }
    }//GEN-LAST:event_btnMostrarRegistroActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarRegistro;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistroPersonas;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JMenu mnuInicio;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombrePersona;
    // End of variables declaration//GEN-END:variables
}
