/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio19 {

    public static void main(String[] args) {
    //NUMEROS PRIMOS Y NO PRIMOS 
        //ENTRADA
        int numero=5;
        int antecesores=0;
        int residuo=0;
        int contadordivisibles=0;
        //PROCESO
        antecesores=numero-1;
        while (antecesores>1) {
            if (numero% antecesores==0) {
                contadordivisibles++;
                
            }
            antecesores--;
            
        }
        //VALIDAR SI ES PRIMO
        if (contadordivisibles==0) {
            JOptionPane.showMessageDialog(null, "Es primo");
            
        }else{
            JOptionPane.showMessageDialog(null, "No es primo");
        }
    }
    
}
