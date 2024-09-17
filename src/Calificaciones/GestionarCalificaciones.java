
package Calificaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoescuela.ConectorBD;

public class GestionarCalificaciones extends javax.swing.JInternalFrame {
          ConectorBD CC = new ConectorBD();
          Connection conectar = CC.Conexion();
            private int estudianteId;
            private int tipoId;
            private int titulo;

    public GestionarCalificaciones() {
        initComponents();
        llenarComboEstudiante();
        llenarComboTipoEvaluacion();
        llenarComboTituloEvaluacion();
         mostrar();
    }
    
     private void obtenerIdEstudiante() {
        estudianteId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
    }

 void mostrar() {
     
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("estudianteId");
        modelo.addColumn("calificacion");
        modelo.addColumn("evaluacionId");
        modelo.addColumn("tipoEvaluacionId");

        
        jTable1.setModel(modelo);
        String sql = "SELECT*FROM calificacion";
        String datos[] = new String[4];
        Statement st;

        try {
            st = conectar.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                        modelo.addRow(datos);
            }

} catch (SQLException ex) {
    Logger.getLogger(GestionarCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
}
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Buscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        llenarComboBoxTipoEvaluacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        llenarComboBoxEvaluacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        llenarComboBoxEstudiante = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Buscar.setBackground(new java.awt.Color(204, 204, 204));
        Buscar.setText("BUSCAR");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Eliminar.setBackground(new java.awt.Color(204, 204, 204));
        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(204, 204, 204));
        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(204, 204, 204));
        Actualizar.setText("ACTUALIZAR");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel5.setText("Gestionar Calificaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(390, 390, 390))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Modificar estudianteId:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Modificar calificacion:");

        llenarComboBoxTipoEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Modificar evaluacionId:");

        llenarComboBoxEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Modificar TipoEvaluacion:");

        llenarComboBoxEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(llenarComboBoxTipoEvaluacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(llenarComboBoxEvaluacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(txtCalificacion)
                                .addComponent(llenarComboBoxEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addComponent(llenarComboBoxEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(llenarComboBoxEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llenarComboBoxTipoEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
 String busqueda = txtBuscar.getText();
    
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("estudianteId");
        modelo.addColumn("calificacion");
        modelo.addColumn("evaluacionId");
        modelo.addColumn("tipoEvaluacionId");
    
    jTable1.setModel(modelo);
    
    String sql = "SELECT * FROM calificacion WHERE calificacion LIKE ?";
    String datos[] = new String[4];
    
    try {
        PreparedStatement pst = conectar.prepareStatement(sql);
        pst.setString(1, "%" + busqueda + "%");
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            datos[0] = rs.getString(1);  // Id
            datos[1] = rs.getString(2);  // Título
            datos[2] = rs.getString(3);  // Fecha de entrega
            datos[3] = rs.getString(4);  // CursoId
            modelo.addRow(datos);
        }
    } catch (SQLException ex) {
        Logger.getLogger(GestionarCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila = jTable1.getSelectedRow();
        String Valor = jTable1.getValueAt(fila, 0).toString();

        if (fila>=0) {
            try{
                PreparedStatement pss = conectar.prepareStatement("DELETE FROM calificacion WHERE id='"+Valor+"'");
                pss.executeUpdate();
                JOptionPane.showMessageDialog(this, "Fila eliminada en la base de datos correctamente.");
            }catch(SQLException ex){
                Logger.getLogger(GestionarCalificaciones.class.getName()).log(Level.SEVERE,null,ex);

                mostrar();
            }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila >= 0) {

            int numColumnas = jTable1.getColumnCount();
            if (numColumnas >=4) {

                estudianteId = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
                txtCalificacion.setText(jTable1.getValueAt(fila, 1).toString());
                titulo = Integer.parseInt(jTable1.getValueAt(fila, 2).toString());
                tipoId = Integer.parseInt(jTable1.getValueAt(fila, 3).toString());
                
            } else {
                JOptionPane.showMessageDialog(null, "Numero de columnas en la tabla insuficiente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fila seleccionada.");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        int fila = jTable1.getSelectedRow();  // Obtener la fila seleccionada

if (fila >= 0) {  // Verificar si se ha seleccionado una fila
    try {
        // Consulta SQL para actualizar
        String sql = "UPDATE calificacion SET calificacion = ?, evaluacionId = ?, tipoevaluacionId = ? WHERE id = ?";
        PreparedStatement pps = conectar.prepareStatement(sql);

        // Obtener el ID del estudiante de la JTable (asumiendo que está en la primera columna)
        String id = jTable1.getValueAt(fila, 0).toString();

        // Obtener el estudianteId, evaluacionId, y tipoevaluacionId desde los ComboBox
        int estudianteId = Integer.parseInt(((String) llenarComboBoxEvaluacion.getSelectedItem()).split("\\. ")[0]);
        int tipoId = Integer.parseInt(((String) llenarComboBoxTipoEvaluacion.getSelectedItem()).split("\\. ")[0]);
        int titulo = Integer.parseInt(((String) llenarComboBoxEvaluacion.getSelectedItem()).split("\\. ")[0]);

        // Establecer los parámetros en la consulta preparada
        pps.setString(1, txtCalificacion.getText());  // Actualizar la calificación
        pps.setInt(2, estudianteId);  // Actualizar el evaluacionId
        pps.setInt(3, tipoId);  // Actualizar el tipoevaluacionId
        pps.setInt(4, Integer.parseInt(id));  // Condición WHERE estudianteId = ?

        // Ejecutar la actualización
        pps.executeUpdate();

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "Los datos fueron actualizados correctamente");
        
        // Actualizar la JTable (suponiendo que la función mostrar() actualiza la tabla)
        mostrar();

    } catch (SQLException ex) {
        Logger.getLogger(GestionarCalificaciones.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }

    // Refrescar la interfaz de la JTable
    jTable1.updateUI();
} else {
    // Si no hay ninguna fila seleccionada, mostrar un mensaje de advertencia
    JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para actualizar.");
}


    }//GEN-LAST:event_ActualizarActionPerformed
private void llenarComboEstudiante(){
        //Prepara una consulta SQL para obtener los nombres de los departamentos desde la tabla "departamento"
        llenarComboBoxEstudiante.removeAllItems();
        String sql = "SELECT * FROM estudiante";

        try {
            Statement st = conectar.createStatement(); //Crea la consulta y la pasa a una declaración Statement
            ResultSet rs = st.executeQuery(sql); //Ejecutar la consulta SQL y almacenar los resultados en un ResultSet

            //Itera a través de cada fila de resultados en el ResultSet
            while (rs.next()) {

                // Agrega el valor de la columna "NombreDepartamento" al "jcDepartamento" 
                // El bucle continuará hasta que no haya más filas en el conjunto de resultados (ResultSet)
                String txt = rs.getInt(1) + ". " + rs.getString(2);
                llenarComboBoxEstudiante.addItem(txt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar el ComboBox de estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private int obtenerIdComboBoxEstudiante() {
        String seleccionado = ((String) llenarComboBoxEstudiante.getSelectedItem());
        String[] seleccionadoArr = seleccionado.split(". ");
        String idStr = seleccionadoArr[0];
        return Integer.parseInt(idStr);}

    
    private void llenarComboTipoEvaluacion(){
        //Prepara una consulta SQL para obtener los nombres de los departamentos desde la tabla "departamento"
        llenarComboBoxTipoEvaluacion.removeAllItems();
        String sql = "SELECT * FROM tipoevaluacion";

        try {
            Statement st = conectar.createStatement(); //Crea la consulta y la pasa a una declaración Statement
            ResultSet rs = st.executeQuery(sql); //Ejecutar la consulta SQL y almacenar los resultados en un ResultSet

            //Itera a través de cada fila de resultados en el ResultSet
            while (rs.next()) {

                // Agrega el valor de la columna "NombreDepartamento" al "jcDepartamento" 
                // El bucle continuará hasta que no haya más filas en el conjunto de resultados (ResultSet)
                String txt = rs.getInt(1) + ". " + rs.getString(2);
                llenarComboBoxTipoEvaluacion.addItem(txt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar el ComboBox de tipoevaluacion.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private int obtenerIdComboBoxTipo() {
        String seleccionado = ((String) llenarComboBoxTipoEvaluacion.getSelectedItem());
        String[] seleccionadoArr = seleccionado.split(". ");
        String idStr = seleccionadoArr[0];
        return Integer.parseInt(idStr);}
    
 private void llenarComboTituloEvaluacion(){
        //Prepara una consulta SQL para obtener los nombres de los departamentos desde la tabla "departamento"
        llenarComboBoxEvaluacion.removeAllItems();
        String sql = "SELECT * FROM evaluacion";

        try {
            Statement st = conectar.createStatement(); //Crea la consulta y la pasa a una declaración Statement
            ResultSet rs = st.executeQuery(sql); //Ejecutar la consulta SQL y almacenar los resultados en un ResultSet

            //Itera a través de cada fila de resultados en el ResultSet
            while (rs.next()) {

                // Agrega el valor de la columna "NombreDepartamento" al "jcDepartamento" 
                // El bucle continuará hasta que no haya más filas en el conjunto de resultados (ResultSet)
                String txt = rs.getInt(1) + ". " + rs.getString(2);
                llenarComboBoxEvaluacion.addItem(txt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar el ComboBox de evaluacion.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private int obtenerIdComboBoxTitulo() {
        String seleccionado = ((String) llenarComboBoxEvaluacion.getSelectedItem());
        String[] seleccionadoArr = seleccionado.split(". ");
        String idStr = seleccionadoArr[0];
        return Integer.parseInt(idStr);}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> llenarComboBoxEstudiante;
    private javax.swing.JComboBox<String> llenarComboBoxEvaluacion;
    private javax.swing.JComboBox<String> llenarComboBoxTipoEvaluacion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCalificacion;
    // End of variables declaration//GEN-END:variables
}
