package com.mycompany.veterinaria.igu;

import com.mycompany.veterinaria.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CargarDatos extends javax.swing.JFrame {

    Controladora control;

    
    public CargarDatos() {
        // esto hace que al hacer varios click no se habra muchas veces el programa
        control = new Controladora();
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtenEspe = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomDuenio = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObserva = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 32));

        jLabel3.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel3.setText("Color:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 360, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 360, 32));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 32));

        jLabel6.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel6.setText("Raza:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 360, -1));

        jLabel7.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel7.setText("Alergico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 360, -1));

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        jPanel1.add(cmbAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 360, 32));

        cmbAtenEspe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));
        jPanel1.add(cmbAtenEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 360, 32));

        jLabel4.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel4.setText("Atencion Especial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 360, -1));

        jLabel8.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel8.setText("Nombre Dueño:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 360, -1));
        jPanel1.add(txtNomDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 360, 32));
        jPanel1.add(txtCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 360, 32));

        jLabel10.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel10.setText("Cel Dueño:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 360, -1));

        jLabel9.setFont(new java.awt.Font("Rethink Sans", 0, 12)); // NOI18N
        jLabel9.setText("Observaciones:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, -1));

        txtObserva.setColumns(20);
        txtObserva.setRows(5);
        jScrollPane2.setViewportView(txtObserva);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 360, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rethink Sans", 1, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga Datos");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnLimpiar.setFont(new java.awt.Font("Rethink Sans", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(111, 72, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 72, 255)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCargar.setBackground(new java.awt.Color(111, 72, 255));
        btnCargar.setFont(new java.awt.Font("Rethink Sans", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Guardar");
        btnCargar.setBorder(null);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner-cat.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiesa de los datos de la pantalla
        
        txtNombre.setText("");
        txtColor.setText("");
        txtRaza.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtenEspe.setSelectedIndex(0);
        txtNomDuenio.setText("");
        txtCel.setText("");
        txtObserva.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        //creacion de variables auxiliares 
        String nombreMasco = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observa = txtObserva.getText();
        //ahora los combos les hacemos un casteo con un getSelectedItem
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atenEspe = (String) cmbAtenEspe.getSelectedItem();

        String nombreDuenio = txtNomDuenio.getText();
        String celDuenio = txtCel.getText();

        control.guardar(nombreMasco, raza, color, observa, alergico, atenEspe, nombreDuenio, celDuenio);
        
        JOptionPane optionPane = new JOptionPane("Se guardo correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true); // siempre esta en el medio el mensaje 
        dialog.setVisible(true);     //para que este siempre visible
        
    }//GEN-LAST:event_btnCargarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtenEspe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNomDuenio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObserva;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private static class VerPrincipal {
        // Constructor por defecto de la clase VerPrincipal.
        public VerPrincipal() {
        }
        // Método para establecer la visibilidad de la interfaz.
        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        // Método para establecer la ubicación relativa de la interfaz a un objeto dado.
        private void setLocationRelativeTo(Object object) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
