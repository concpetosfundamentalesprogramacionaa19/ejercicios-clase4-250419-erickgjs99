/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import Paquetedos.Operacion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class SeleccionDoble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //declaracion de variables
        int nota1;
        int nota2;
        //ingreso de datos
        System.out.printf("Ingrese por favor la primera nota por favor \n");
        nota1 = entrada.nextInt();
        
        System.out.printf("Ingrese por favor la segunda nota por favor \n");
        nota2 = entrada.nextInt();
        //condicionales
        if (nota1 >= 85){
            System.out.printf("%s %d",Operacion.miMensaje, nota1 );   
            //si no cumple la condicion
        } else {
              System.out.printf("%s &d", Operacion.miMensaje2, nota1);
          }     
          if (nota2 >= 85){
            System.out.printf("%s %d",Operacion.miMensaje, nota2 );   
            //si no cumple la condicion
        }  else {
              System.out.printf("%s &d", Operacion.miMensaje2, nota2);
          }     
        
    }}
    



