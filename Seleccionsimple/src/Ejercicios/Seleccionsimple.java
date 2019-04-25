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
public class Seleccionsimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int nota1;
        int nota2;
        
        System.out.printf("Ingrese por favor la primera nota por favor \n");
        nota1 = entrada.nextInt();
        
        System.out.printf("Ingrese por favor la segunda nota por favor \n");
        nota2 = entrada.nextInt();
        
        if (nota1 >= 85){
            System.out.printf("%s %d",Operacion.miMensaje, nota1 );   
        }
          if (nota2 >= 85){
            System.out.printf("%s %d",Operacion.miMensaje, nota2 );   
        }        
        
    }
    
}
