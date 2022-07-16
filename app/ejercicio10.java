/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class ejercicio10 {

    public static void main(String[] args) {
        // entrada
    String empleado="Joseph";
    String cargo="Jefe de Sistemas";
    double pagoHora=15.0;
    int NumeroHora=160;
    double sueldo=0.0;
    double IESS=0.0;
    double netoRecibido=0.0;
    //sueldo
    sueldo=pagoHora* NumeroHora;
    IESS= sueldo*0.095;
    netoRecibido =sueldo-IESS;
    //salida
        System.out.println("empleado:" + empleado);
        System.out.println("cargo:" + cargo);
        System.out.println("sueldo:" + sueldo );
        System.out.println("Descuento IESS:" + IESS);
        System.out.println("el neto a recibir es: "+netoRecibido);
    
    
    
       

    
    
    }
}