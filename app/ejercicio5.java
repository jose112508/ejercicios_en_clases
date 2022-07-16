/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercico 5: Aplicaion que permita validar el listado de invitados de unaa fiesta 

package app;

public class ejercicio5 {

    public static void main(String[] args) {
       //entrada
       String nombre1="andrew";
       int edad=15;
      //proceso
        if (edad>=18 && edad<=30)  {
            //salida
            System.out.print(nombre1+ "Tienen acceso a la fiesta");
        }else{
            System.out.print(nombre1 + "no tiene acceso a las fiesta");
        }
        
       
    }

}
