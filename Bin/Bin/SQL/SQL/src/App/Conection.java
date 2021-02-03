/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author erik
 */
public class Conection {
    Connection conectar=null;
    public Connection conexion (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection("jdbc:mysql://localhost/conexion_java","root","12345");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
}
}
