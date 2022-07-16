/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercicio14:
package app;

import javax.swing.JOptionPane;

public class ejercicio14 {

    public static void main(String[] args) {
        //entrada
        String palabra="";
        int longitud=0;
        int contadorValores=0;
        //proceso
        palabra=JOptionPane.showInputDialog("ingrese la palabra");
        
        longitud = palabra.length();
        for(int indice =0; indice < longitud; indice ++ ){
            //condicon para contar el  nummero de valores
            if (palabra.charAt(indice)== 'a' || palabra.charAt(indice)=='e' 
                    || palabra.charAt(indice) == 'i' || palabra.charAt(indice)== 'o' 
                    || palabra.charAt(indice)== 'u') {
               
               
                
            }
        }

    }

}
