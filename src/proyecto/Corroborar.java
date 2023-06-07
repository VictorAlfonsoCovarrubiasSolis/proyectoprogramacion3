/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *  Covarrubias Solís Víctor Alfonso – 177294
    Puente Sánchez Erick Emmanuel – 174662
 * 
 */
public class Corroborar{

    public static void validarnombre(String nombre) throws Exception{
        if (!nombre.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "ERROR. El nombre no debe contener numeros, caracteres especiales o espacios", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception();
        }
    }

    public static void validartelefono(String numero) throws Exception{
        if (!numero.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "ERROR. solo deben ser numeros y tienes que ser justamente 10 digitos", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception();
        }
    }
    
    public static void validarcorreo(String correo) throws Exception{
        String expresion = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern patron = Pattern.compile(expresion, Pattern.CASE_INSENSITIVE);
        Matcher matcher = patron.matcher(correo);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "ERROR. la direccion de correo electronico esta mal escrita", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
            throw new Exception();
        }
    }
    public static void validarcantidad(String cantidad)throws Exception{
        char cant[]=cantidad.toCharArray();
        for (int i = 0; i < cantidad.length(); i++) {
            if(cant[i]!='1' ||cant[i]!='2' ||cant[i]!='3' ||cant[i]!='4' ||cant[i]!='5' ||cant[i]!='6' ||cant[i]!='7' ||cant[i]!='8' ||cant[i]!='9'||cant[i]!='0'){
                JOptionPane.showMessageDialog(null, "ERROR. debe ser un numero", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
                 throw new Exception();
            }
        }
    }
    
}



