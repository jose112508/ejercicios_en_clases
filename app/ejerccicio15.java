/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*ejercicio15: Aplicaion utilizadando awitch - case combinado con ciclo repetitivos
evaluar dos excenarios donde el escenario 1: Presente los numeros de forma descente hasta llegar 
a 0 a partir de un numero ingresado


*/
package app;

import javax.swing.JOptionPane;


public class ejerccicio15 {

    public static void main(String[] args) {
      //entrada
      int numero= 0;
      int opcion= 0;
      //preceso
     opcion=Integer.parseInt( JOptionPane.showInputDialog("----menu principal---"+ "\n" +
              "1.GENERAR SECUENCIA DESCENDENTE"+ " \n"+
              "2.GENERAR SECUENCIA ASCENDENTE"));
     numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
    //Proceso de validar secuencias
    switch(opcion){
        case 1:
    //presento de
     for(int indice = numero + 1; indice < 11; indice++ ){
      JOptionPane.showMessageDialog(null,indice);
     }
     break;
    
        case 2:
    //presento de
       for(int indice = numero - 1; indice >=0; indice-- ){
      JOptionPane.showMessageDialog(null,indice);  
         }  
     break;
     default:
         JOptionPane.showMessageDialog(null,"ERROR DIGITE CORRECTAMENTE LAS OPCIONES QUE SE VISUALIZAN");
     break;
   }
  }
}

