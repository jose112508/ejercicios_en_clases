/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ejercicio9:Aplicacion que permite valida el lugar de votacion, la edad, la mesa de un proceso de elecciones
package app;

public class ejercicio9 {
    public static void main(String[] args) {
      //entrada
      String nombre="jospeh";
      boolean lugar=true;
      boolean edad=true;
      boolean mesa=false;
    //proceso 
        if (lugar==true) {
            if (edad== true) {
                if (mesa == true) {
                    //salida
                    System.out.println(nombre+ "Si esta acto para votar");
                    System.out.println(nombre+"No estano esta en la mesa indicada");
                   
                }
                
            }else{
                System.out.println(nombre+ "no tiene edad indicada para votar ");
                System.out.println("la edad minima es de 16 años "); 
            }
            
        }else{
            System.out.println("no se encuentra en el lugar correccto");
        }
       
    }
            
}
    
    
    

