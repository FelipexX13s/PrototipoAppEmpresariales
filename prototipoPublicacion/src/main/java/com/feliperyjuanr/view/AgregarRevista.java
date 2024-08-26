/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.feliperyjuanr.view;

import com.feliperyjuanr.services.ServicioEditoriales;
import com.feliperyjuanr.services.ServicioPublicaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class AgregarRevista extends javax.swing.JFrame {
    private ServicioPublicaciones servicioPublicacion;
    private ServicioEditoriales servicioEditorial;
    /**
     * Creates new form AgregarRevista
     */
    public AgregarRevista(ServicioPublicaciones servicioPublicacion, ServicioEditoriales servicioEditorial) {
        this.servicioPublicacion = servicioPublicacion;
        this.servicioEditorial = servicioEditorial;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        lblEditorial = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        chxSuscrito = new javax.swing.JCheckBox();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblAgregarLibro = new javax.swing.JLabel();
        btnAgregarRevista = new javax.swing.JButton();
        lblPrecio1 = new javax.swing.JLabel();
        txtVolumen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Revista");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(76, 175, 80), 2, true));

        lblEditorial.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblEditorial.setText("Volumen");

        chxSuscrito.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        chxSuscrito.setText("Suscrito");
        chxSuscrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxSuscritoActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTitulo.setText("Titulo");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblAutor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblAutor.setText("Autor");

        lblAgregarLibro.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAgregarLibro.setForeground(new java.awt.Color(76, 175, 80));
        lblAgregarLibro.setText("Agregar Revista");

        btnAgregarRevista.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAgregarRevista.setText("Agregar Revista");
        btnAgregarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRevistaActionPerformed(evt);
            }
        });

        lblPrecio1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblPrecio1.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chxSuscrito)
                            .addComponent(lblAgregarLibro))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregarRevista)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblEditorial)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtVolumen))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblPrecio1)
                                            .addGap(34, 34, 34)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgregarLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditorial)
                    .addComponent(txtVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chxSuscrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarRevista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, Short.MAX_VALUE)
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

    private void chxSuscritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxSuscritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxSuscritoActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnAgregarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRevistaActionPerformed
        // TODO add your handling code here:
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        int volumen = Integer.parseInt(txtVolumen.getText());
        boolean suscrito = chxSuscrito.isSelected();
        

        if (servicioPublicacion.agregarRevista(titulo, autor, precio,volumen,suscrito)) {
            JOptionPane.showMessageDialog(this, "Revista agregada exitosamente!", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            txtTitulo.setText("");
            txtAutor.setText("");
            txtPrecio.setText("");
            txtVolumen.setText("");
            chxSuscrito.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error: Esa Revista ya existe!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarRevistaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRevista;
    private javax.swing.JCheckBox chxSuscrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgregarLibro;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVolumen;
    // End of variables declaration//GEN-END:variables
}
