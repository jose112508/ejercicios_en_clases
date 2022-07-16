/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercicio11:Aplicaicon para la generacion de una venta de productos por consola 
package app;

import java.util.Scanner;


public class ejercicio11 {

    public static void main(String[] args) {
        //entrada
      Scanner entrada= new Scanner(System.in);
      String producto="";
      int cantidad=0;
      double precio=0.0;
      double subtotal=0.0;
      double iva =0.0;
      double total =0.0;
      //proceso
        System.out.print(" producto: ");
      producto= entrada.next();
        System.out.print("cantidad:");
     cantidad=entrada.nextInt();
        System.out.print("precio: ");
        precio= entrada.nextDouble();
        subtotal=cantidad * precio;
        iva= subtotal * 0.12;
        total= subtotal + iva;
        //salida
        System.out.println("producto:" + producto);
        System.out.println("subtotal:"+ subtotal);
        System.out.println("preccio: "+precio);
        System.out.println("total: "+ total);
        
    }
    
}
