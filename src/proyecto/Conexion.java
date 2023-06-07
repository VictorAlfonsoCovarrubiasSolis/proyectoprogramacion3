/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *  Covarrubias Solís Víctor Alfonso – 177294
    Puente Sánchez Erick Emmanuel – 174662
 * 
 */
public class Conexion {

    Connection con;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zonewar","root", "");               
        }catch(ClassNotFoundException|SQLException e){
            System.out.println("Error" +e);
        }
        return con;
    }
}
