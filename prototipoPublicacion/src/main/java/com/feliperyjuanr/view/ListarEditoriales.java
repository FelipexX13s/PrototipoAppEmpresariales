/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.feliperyjuanr.view;

import com.feliperyjuanr.services.ServicioEditoriales;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanp
 */
public class ListarEditoriales extends javax.swing.JFrame implements IEditorialInteresado {

    private ServicioEditoriales servicioEditorial;

    /**
     * @param servicioEditorial
     */
    public ListarEditoriales(ServicioEditoriales servicioEditorial) {
        this.servicioEditorial = servicioEditorial;
        servicioEditorial.addInteresadaD(this);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void cambioEditoriales()
    {
        DefaultTableModel model = (DefaultTableModel) tblEditoriales.getModel();
        model.setRowCount(0);
        
        for (int i = 0; i < servicioEditorial.listarEditoriales().size(); i++) 
        {
            model.addRow(new Object[]{
                servicioEditorial.listarEditoriales().get(i).getNombre(),
                servicioEditorial.listarEditoriales().get(i).getDireccion()
            });
        }
        if (tblEditoriales.getRowCount() > 0) {
        tblEditoriales.setRowSelectionInterval(tblEditoriales.getRowCount() - 1, tblEditoriales.getRowCount() - 1);
        tblEditoriales.setSelectionBackground(new java.awt.Color(156, 39, 176));
        tblEditoriales.setSelectionForeground(Color.WHITE);

        // Crear un Timer que cambiará el color a blanco después de 1 segundo
        javax.swing.Timer timer = new javax.swing.Timer(2000, e -> {
            tblEditoriales.setSelectionBackground(Color.WHITE);
            tblEditoriales.setSelectionForeground(Color.BLACK);
            tblEditoriales.clearSelection(); // Limpiar la selección para quitar el resaltado
        });
        timer.setRepeats(false); // El Timer solo debe ejecutarse una vez
        timer.start(); // Iniciar el Timer
        }
        
    }
    
    @Override
    public void dispose()
    {
        servicioEditorial.deleteInteresadaD(this);
        super.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLibrosPublicados = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEditoriales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Editoriales");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(156, 39, 176), 2, true));

        lblLibrosPublicados.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblLibrosPublicados.setForeground(new java.awt.Color(156, 39, 176));
        lblLibrosPublicados.setText("Editoriales");

        btnListar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tblEditoriales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(156, 39, 176), 1, true));
        tblEditoriales.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tblEditoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEditoriales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLibrosPublicados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLibrosPublicados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tblEditoriales.getModel();
        model.setRowCount(0);
        if (servicioEditorial.listarEditoriales().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: No hay Editoriales para mostrar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for (int i = 0; i < servicioEditorial.listarEditoriales().size(); i++) {
                model.addRow(new Object[]{
                    servicioEditorial.listarEditoriales().get(i).getNombre(),
                    servicioEditorial.listarEditoriales().get(i).getDireccion()});
            }
        }

    }//GEN-LAST:event_btnListarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLibrosPublicados;
    private javax.swing.JTable tblEditoriales;
    // End of variables declaration//GEN-END:variables
}
