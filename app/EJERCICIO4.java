/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ejercicio4:Verificaión de numeros par con operadores logicos 
package app;


public class EJERCICIO4 {

    public static void main(String[] args) {
     //entrada
     int numero1=4;
     int numero2=8;
     int residuo1=0;
     int residuo2=0;
     //proceso
     residuo1=numero1 %2;
     residuo2=numero2%2;
        if (residuo1==0 && residuo2==0) {
    //salida
            System.out.println("los dos numero  son pares");
            }else{
            System.out.println("los dos numeros No son pares");
       
        }



    }

}
