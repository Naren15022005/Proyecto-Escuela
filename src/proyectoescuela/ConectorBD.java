package proyectoescuela;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectorBD {

    Connection conectar;
    Statement st;

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/proyectoe", "root", "1063616908");
            //JOptionPane.showMessageDialog(null, "Se ha conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar" + " " + e.getMessage());
        }
        return conectar;
    }
}
