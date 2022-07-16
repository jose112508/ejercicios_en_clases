
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//ejercicio3: inicializar un numero que permita verificar si es multiplo de 7 
package app;

public class ejercicio3 {

    static void main(String[] args) {
        //entrada
        int numero1 = 49;
        int residuo = 0;
//proceso 
        residuo = numero1 % 7;

        if (residuo == 0) {
            //salida
            System.out.println("Si es mmultiplo de 7");
        } else {
            System.out.println("No es multiplo de 7");
        }
    }

}
