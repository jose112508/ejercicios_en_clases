/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercicio13:converciones tipo menu
package app;

import javax.swing.JOptionPane;

public class ejercicio13 {

    public static void main(String[] args) {
      //entrada
      char sexo='M';
       String numeroEnteroString="10";
       String numeroDecimalString="5.5";
       int numeroEnteroConvertido=0; 
       double numeroDecimalConvertido=0.0;
       String sexoStringConvertido="";
       int opcion=0;
       //proceso
        JOptionPane.showInputDialog(null,"(MENU DE OPCIONES"+"\n" + "1.CONVERTIR DE STRING A ENTERO"+"\n"+"2.CONVERCION DE STRING A DOUBLE"+"\n"+"3.CONVERTIR DE CHAR A STRING");
       
        if (opcion==1) {
            numeroEnteroConvertido=Integer.parseInt(numeroEnteroString);
            JOptionPane.showMessageDialog(null,"la convercion es: " + numeroEnteroConvertido);
       }else if (opcion==2) {
           numeroDecimalConvertido=Double.parseDouble(numeroEnteroString);
          JOptionPane.showMessageDialog(null,"la convercion es: " + numeroDecimalConvertido);
        } else if (opcion==3) {
            sexoStringConvertido=String.valueOf(sexo);
          JOptionPane.showMessageDialog(null,"la convercion es: " + sexoStringConvertido);  
        }
 
            
        
    
    
    
    
    }
    
}
