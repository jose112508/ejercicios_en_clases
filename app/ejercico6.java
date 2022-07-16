/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercicio6: Aplicaion que valide el servicio de parquimetro de vehiculos
package app;


public class ejercico6 {

    
    public static void main(String[] args) {
       //entrada
       String vehiculo="auto";
       //proceso
        if (vehiculo.equals("autos") ||vehiculo.equals("suv") || vehiculo.equals("camieones")) {
         //salida
            System.out.print("Tiene acceso al parquimetro");
        }else{
            System.out.print("No tiene acceso al parquimetro");
        }
    }
    
}
