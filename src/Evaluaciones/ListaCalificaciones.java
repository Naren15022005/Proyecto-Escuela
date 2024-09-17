
package Evaluaciones;

import Estudiantes.SesionEstudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoescuela.ConectorBD;

public class ListaCalificaciones extends javax.swing.JInternalFrame {
           ConectorBD CC = new ConectorBD();
           Connection conectar = CC.Conexion();

    public ListaCalificaciones(int studentId) { // Constructor que recibe el ID del estudiante
       initComponents();
        setLocation(71, 14); // Coloca la ventana en una posición específica
        
        // Obtén el ID del estudiante que ha iniciado sesión
        int estudianteId = SesionEstudiante.getInstance().getEstudianteId();
        
        // Muestra las calificaciones del estudiante al cargar la ventana
        mostrarCalificaciones(estudianteId, null);
    }    
 
    private void mostrarCalificaciones(int usuarioId, String nombreEvaluacion) {
     DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre del Alumno");
        modelo.addColumn("Nombre de la Evaluación");
        modelo.addColumn("Calificación");
        jTable1.setModel(modelo);

        int estudianteId = SesionEstudiante.getInstance().getEstudianteId();
            System.out.println("Estudiante ID: " + estudianteId);

            String sql = "SELECT e.nombre AS 'Nombre del Alumno', ev.titulo AS 'Nombre de la Evaluación', c.calificacion AS 'Calificación' " +
                 "FROM calificacion c " +
                 "INNER JOIN Estudiante e ON c.estudianteId = e.id " +
                 "INNER JOIN Evaluacion ev ON c.evaluacionId = ev.id " +
                 "INNER JOIN Usuario u ON e.usuario_Id = u.id " +
                 "WHERE u.id = ?";
            System.out.println("Consulta SQL: " + sql);

        if (nombreEvaluacion != null && !nombreEvaluacion.isEmpty()) {
            sql += " AND ev.titulo LIKE ?";
        }

        String[] datos = new String[3];

        try (Connection conectar = new ConectorBD().Conexion();
             PreparedStatement pst = conectar.prepareStatement(sql)) {

            // Configura el ID del usuario en el primer parámetro de la consulta
            pst.setInt(1, usuarioId);

            if (nombreEvaluacion != null && !nombreEvaluacion.isEmpty()) {
                pst.setString(2, "%" + nombreEvaluacion + "%");
            }

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    datos[0] = rs.getString("Nombre del Alumno");
                    datos[1] = rs.getString("Nombre de la Evaluación");
                    datos[2] = rs.getString("Calificación");
                    modelo.addRow(datos);
                }

                if (modelo.getRowCount() == 0) {
                    modelo.addRow(new String[]{"No hay datos", "", ""});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las calificaciones: " + e.getMessage());
        }
    }

 



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("Lista De Calificaciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(15, 15, 15))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
