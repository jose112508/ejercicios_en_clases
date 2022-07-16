/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercicio8:aplicacion que perimita la validacion en forma de pago en efectivo y de documento en la venta
// de un vehiculo a un cliente 
package app;

public class ejercicio8 {

        public static void main(String[] args) {
       //entrada
       String vehiculo="FORD-F150";
       boolean Licencia=true;
       boolean efectivo=true;
       //proceso
       if(Licencia==true){
           //if-anidacion
           if(efectivo==true){
             //salida
             System.out.println("Se ejecuta la venta del vehiculo"+vehiculo);
           }else{
               System.out.println("cumple con la licencia, pero no cumple con el efectivo, no se ejecuta la venta ");
           }
           }else{
                System.out.println("no cumple con el requisito principal(Licencia )");   
                   }
            
       }
    }


