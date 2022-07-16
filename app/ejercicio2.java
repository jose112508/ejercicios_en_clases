/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//ejercicio2: validar si un numero es par/impar
package app;

public class ejercicio2 {

    public static void main(String[] args) {
        //entrada
        int numero1 = 2;
        int residuo = 0;
        //proceso
        residuo = numero1 % 2;
        if (residuo == 0) {
            //salida-resultado
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
    }
}
