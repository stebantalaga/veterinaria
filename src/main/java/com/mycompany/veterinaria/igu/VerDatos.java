package com.mycompany.veterinaria.igu;

import com.mycompany.veterinaria.logica.Controladora;
import com.mycompany.veterinaria.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    ModificarDatos pantallamodif = null;
    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rethink Sans", 1, 32)); // NOI18N
        jLabel1.setText("Visualizar datos");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        btnEliminar.setFont(new java.awt.Font("Rethink Sans", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(111, 72, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 72, 255)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(111, 72, 255));
        btnEditar.setFont(new java.awt.Font("Rethink Sans", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rethink Sans", 1, 16)); // NOI18N
        jLabel2.setText("Datos de las mascotas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTabla();


    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //primero: controlo que la tabla no este vacia
        if (tablaMascotas.getRowCount() > 0) {
            //segundo : que este seleccionado al menos un registro de mascota
            if (tablaMascotas.getSelectedRow() != -1) {
                //
                int num_cliente = Integer.parseInt(String.valueOf(
                        tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                //llamo al metodo borrar
                control.borrarMascota(num_cliente);

                //aviso al usuario que se borro correctamente 
                mostrarMensaje("Mascota Eliminada correctamente", "info", "borrado de mascota");
                cargarTabla();
                
            } else {
                mostrarMensaje("No selecciono ninguna mascota", "error", "error al eliminar");
            }

        } else {
            mostrarMensaje("No selecciono ninguna columna", "info", "error al eliminar");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        //primero: controlo que la tabla no este vacia
        if (tablaMascotas.getRowCount() > 0) {
            //segundo : que este seleccionado al menos un registro de mascota
            if (tablaMascotas.getSelectedRow() != -1) {
                //obtenemos la id a buscar

                int num_cliente = Integer.parseInt(String.valueOf(
                        tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                pantallamodif = new ModificarDatos(num_cliente);
                pantallamodif.setVisible(true);
                pantallamodif.setLocationRelativeTo(null);
                
                this.dispose();

            } else {
                mostrarMensaje("No selecciono ninguna mascota", "error", "error al eliminar");
            }

        } else {
            mostrarMensaje("No selecciono ninguna columna", "info", "error al eliminar");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true); // siempre esta en el medio el mensaje 
        dialog.setVisible(true);     //para que este siempre visible
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //permite settear por codigo la lista de la tabla 
        DefaultTableModel modeloTable = new DefaultTableModel() {
            //esta linea hace que no sea editable los datos que 
            //estan cargados en la tabla y que solo sea mediante el boton
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };//esto se declaro como parte de la instacia de defaul table model y hay que terminar la ejecucion con ;
        //Establecemos los nombres de la table con un vector 

        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "Aten Especial",
            "Nombre Dueño", "Celular", "Observaciones"};
        //settea los estos nombres 
        modeloTable.setColumnIdentifiers(titulos);

        //cargar los datos desde la base de datos: y hacemos el la estancia para llamar la controladora de la logica
        //guardamos los datos dentro de una lista, una ves que la traigamos la recoremos y la cargamos en la tabla
        List<Mascota> listaMascotas = control.traermascotas();
        //recorrer la lista y mostrar cada elemento en la tabla preguntando si no es null
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                //array de tipo objeto que permite guardar todos los tipos en la clase a manipular

                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(),
                    masco.getRaza(), masco.getAlergico(), masco.getAtencio_especial(),
                    masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCel_duenio(), masco.getObservaciones()};
                modeloTable.addRow(objeto);
                /*
             paso1 crea el modelo de la tabla 
             paso2 establecemos los nombres de la columna 
             paso3 los titulos se los establecemos a la tabla 
             traemos la lista de mascota de la logica y la logica la trae de la base de datos
             lo que traigamos la recoremos una por una que tiene que coincidir y los agrega a un array de tipo 
             objeto que vamos a agregar como fila a la table 
                 */
            }
        }
        tablaMascotas.setModel(modeloTable);
    }
}
