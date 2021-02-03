/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author erik
 */
public class Conection {

    private static String ip = "localhost";
    private static String nombreBase = "conexion_java";
    private static String usuario = "root";
    private static String contrasena = "12345";

    public static Connection conexion() throws SQLException {
        Connection conectar = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
           conectar = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + nombreBase + "?user=" + usuario + "&password=" + contrasena + "&useSSL=false");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conectar;
    }

//    public static void main(String[] args) {
//        try {
//            Conection c = new Conection();
//            Connection con = c.conexion();
//            System.out.println("Conexión exitosa...");
//        } catch (Exception e) {
//            System.err.println("No se realizo conexión...");
//            System.out.println(e.getMessage());
//        }
//    }
}