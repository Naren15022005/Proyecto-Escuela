
package Evaluaciones;

import Profesor.AgregarProfesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoescuela.ConectorBD;

public class AgregarEvaluaciones extends javax.swing.JInternalFrame {
        ConectorBD CC = new ConectorBD();
        Connection conectar = CC.Conexion();
    public AgregarEvaluaciones() {
        initComponents();
        llenarComboCurso();
        llenarComboTipoEvaluacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        llenarComboBoxTipoEvaluacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        llenarComboBoxCurso = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR EVALUACION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Titulo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha Entrega:");

        Enviar.setText("ENVIAR");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        llenarComboBoxTipoEvaluacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Curso id:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TipoEvaluacion id:");

        llenarComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(llenarComboBoxCurso, 0, 281, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo)
                    .addComponent(txtFechaEntrega)
                    .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(llenarComboBoxTipoEvaluacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(llenarComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(llenarComboBoxTipoEvaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
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

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
   
          int Idcurso = obtenerIdComboBoxCurso();
            int Idtipo = obtenerIdComboBoxTipo();


        try{
            PreparedStatement pss = conectar.prepareCall("INSERT INTO evaluacion(titulo,fecha_entrega,curso_id,tipoevaluacionId)VALUES (?,?,?,?)");


            pss.setString(1, txtTitulo.getText());
            pss.setString(2, txtFechaEntrega.getText());
            pss.setInt(3,Idcurso );
            pss.setInt(4,Idtipo );


            pss.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS");
        }
        catch(SQLException ex){
            Logger.getLogger(AgregarProfesor.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        txtTitulo.setText("");
        txtFechaEntrega.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed
private void llenarComboCurso(){
        //Prepara una consulta SQL para obtener los nombres de los departamentos desde la tabla "departamento"
        llenarComboBoxCurso.removeAllItems();
        String sql = "SELECT * FROM curso";

        try {
            Statement st = conectar.createStatement(); //Crea la consulta y la pasa a una declaración Statement
            ResultSet rs = st.executeQuery(sql); //Ejecutar la consulta SQL y almacenar los resultados en un ResultSet

            //Itera a través de cada fila de resultados en el ResultSet
            while (rs.next()) {

                // Agrega el valor de la columna "NombreDepartamento" al "jcDepartamento" 
                // El bucle continuará hasta que no haya más filas en el conjunto de resultados (ResultSet)
                String txt = rs.getInt(1) + ". " + rs.getString(2);
                llenarComboBoxCurso.addItem(txt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar el ComboBox de departamentos.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private int obtenerIdComboBoxCurso() {
        String seleccionado = ((String) llenarComboBoxCurso.getSelectedItem());
        String[] seleccionadoArr = seleccionado.split(". ");
        String idStr = seleccionadoArr[0];
        return Integer.parseInt(idStr);
    }

    
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
            JOptionPane.showMessageDialog(this, "Error al llenar el ComboBox de departamentos.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private int obtenerIdComboBoxTipo() {
        String seleccionado = ((String) llenarComboBoxTipoEvaluacion.getSelectedItem());
        String[] seleccionadoArr = seleccionado.split(". ");
        String idStr = seleccionadoArr[0];
        return Integer.parseInt(idStr);}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> llenarComboBoxCurso;
    private javax.swing.JComboBox<String> llenarComboBoxTipoEvaluacion;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
