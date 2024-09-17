
package Cursos;


import Estudiantes.SesionEstudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoescuela.ConectorBD;

public class ListarCursos extends javax.swing.JInternalFrame {
        ConectorBD CC = new ConectorBD();
        Connection conectar = CC.Conexion();
    public ListarCursos() {
          initComponents();
        setLocation(73, 17);

        // Obtén el ID del estudiante que ha iniciado sesión
        int estudianteId = SesionEstudiante.getInstance().getEstudianteId();

        // Muestra los cursos del estudiante al cargar la ventana
         int usuarioId = SesionEstudiante.getInstance().getEstudianteId();
        mostrarCursos(usuarioId);
    }
 void mostrarCursos(int usuarioId) {
       // Verifica si el ID del usuario es vÃ¡lido
        if (usuarioId > 0) {
            // Crea un nuevo modelo de tabla
            DefaultTableModel modelo = new DefaultTableModel();

            // Agrega las columnas al modelo de la tabla
            modelo.addColumn("Nombre del Curso");
            modelo.addColumn("Nombre del Profesor");
            modelo.addColumn("Especialidad del Profesor");

            // Establece el modelo de la tabla en el componente jTCursos
            jTable1.setModel(modelo);

            // Define la consulta SQL para obtener la informaciÃ³n de los cursos
            String sql = "SELECT \n" +
                            "    c.nombre AS 'Nombre del Curso',\n" +
                            "    c.codigo AS 'Código del Curso',\n" +
                            "    c.cupo AS 'Cupo del Curso',\n" +
                            "    p.nombre AS 'Nombre del Profesor',\n" +
                            "    p.especialidad AS 'Especialidad del Profesor'\n" +
                            "FROM \n" +
                            "    estudiante e\n" +
                            "INNER JOIN \n" +
                            "    curso c ON e.curso_id = c.id\n" +
                            "INNER JOIN \n" +
                            "    profesor p ON c.profesor_id = p.id\n" +
                            "WHERE \n" +
                            "    e.usuario_id = ?;";

            try (Connection conectar = new ConectorBD().Conexion(); PreparedStatement pst = conectar.prepareStatement(sql)) {

                // Establece el parÃ¡metro del ID del usuario
                pst.setInt(1, usuarioId);

                System.out.println("Ejecutando consulta: " + pst.toString());

                // Ejecuta la consulta
                try (ResultSet rs = pst.executeQuery()) {
                    boolean hasResults = false;
                    while (rs.next()) {
                        String[] datos = new String[3];
                        datos[0] = rs.getString("Nombre del Curso");
                        datos[1] = rs.getString("Nombre del Profesor");
                        datos[2] = rs.getString("Especialidad del Profesor");
                        modelo.addRow(datos);
                        hasResults = true;
                    }

                    // Si no se encontraron resultados, muestra un mensaje en la tabla
                    if (!hasResults) {
                        modelo.addRow(new String[]{"No hay datos", "", "", "", ""});
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar los cursos: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID de usuario no valido.");
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
        jLabel1.setText("LISTA DE CURSOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(136, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

