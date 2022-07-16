/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// HACER UNA APLICACION QUE RECORRA CON NUMEROS LAS PALABRAS MAYUSCULAS
package app;

import javax.swing.JOptionPane;

public class ejercicio16 {

    public static void main(String[] args) {
        // HACER UNA APLICACION QUE RECORRA CON NUMEROS LAS PALABRAS MAYUSCULAS
        String palabra = "";
        int longitud = 0;
        int indice = 0;
        //Proceso
        palabra = JOptionPane.showInputDialog("Ingrese una palabra");
        longitud = palabra.length();
        do {
            JOptionPane.showMessageDialog(null, palabra.toUpperCase().charAt(indice));
            indice++;

        } while (indice < longitud);
    }

}
