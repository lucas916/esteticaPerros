/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.vista;

import javax.swing.table.DefaultTableModel;


public class JIFTablaDePrecios extends javax.swing.JFrame {

    
    public JIFTablaDePrecios() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("TAMAÑO");
        model.addColumn("BAÑO");
        model.addColumn("MOTILADA");
        model.addColumn("PROFILAXIS");

        model.addRow(new Object []{"PEQUEÑO" , "$ 20.000" , "$ 10.000" ,  "$ 80.000"});
        model.addRow(new Object []{"MEDIANO" , "$ 35.000" , "$ 15.000" , "$ 115.000"});
        model.addRow(new Object []{"GRANDE" ,  "$ 50.000" , "$ 20.000" , "$ 135.000"});
        
        JTableListadoDePrecios.setModel(model);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jifTabladePrecios = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableListadoDePrecios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuInicio = new javax.swing.JMenu();
        mnusalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifTabladePrecios.setTitle("TABLA DE PRECIOS SIN DESCUENTOS");
        jifTabladePrecios.setVisible(true);

        JTableListadoDePrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TAMAÑO", "BAÑO", "MOTILADA", "PROFILAXIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableListadoDePrecios.getTableHeader().setResizingAllowed(false);
        JTableListadoDePrecios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTableListadoDePrecios);

        javax.swing.GroupLayout jifTabladePreciosLayout = new javax.swing.GroupLayout(jifTabladePrecios.getContentPane());
        jifTabladePrecios.getContentPane().setLayout(jifTabladePreciosLayout);
        jifTabladePreciosLayout.setHorizontalGroup(
            jifTabladePreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifTabladePreciosLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jifTabladePreciosLayout.setVerticalGroup(
            jifTabladePreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifTabladePreciosLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        mnuInicio.setText("INICIO");

        mnusalir.setText("SALIR");
        mnusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusalirActionPerformed(evt);
            }
        });
        mnuInicio.add(mnusalir);

        jMenuBar1.add(mnuInicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jifTabladePrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jifTabladePrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusalirActionPerformed
       dispose();
    }//GEN-LAST:event_mnusalirActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableListadoDePrecios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JInternalFrame jifTabladePrecios;
    private javax.swing.JMenu mnuInicio;
    private javax.swing.JMenuItem mnusalir;
    // End of variables declaration//GEN-END:variables
}
