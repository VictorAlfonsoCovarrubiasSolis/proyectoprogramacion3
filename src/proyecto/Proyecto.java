/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *  Covarrubias Solís Víctor Alfonso – 177294
    Puente Sánchez Erick Emmanuel – 174662
 * 
 */
public class Proyecto {

    public static void main(String[] args)throws FileNotFoundException, SQLException{
        
        Conexion obj =  new Conexion();
        Connection con = obj.Conexion();
        if(con!=null){
            new Login(con).setVisible(true);
        }
    }
    
}
