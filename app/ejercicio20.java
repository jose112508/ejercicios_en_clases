/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio20 {

    public static void main(String[] args) {
        // NUMERO PERFECTO
        int numero = 2;
        int antecesores = 0;
        int acumuladodivisibles = 0;
        //proceso
        antecesores = numero - 1;
        while (antecesores > 0) {
            if (numero % antecesores == 0) {
                acumuladodivisibles = acumuladodivisibles + antecesores;

            }
            antecesores--;
        }
        //SALIDA
        if (numero == acumuladodivisibles) {
            JOptionPane.showMessageDialog(null, "Es perfecto");

        } else {
            JOptionPane.showMessageDialog(null, "NO perfecto");

        }
    }

}
