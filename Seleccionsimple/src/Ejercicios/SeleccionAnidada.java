/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Paquetedos.OperacionDos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        int nota1;

        //ingreso de datos
        System.out.printf("Ingrese por favor la primera nota por favor \n");
        nota1 = entrada.nextInt();

        //condicionales
        if (nota1 >= 90) {
            System.out.printf("%s %d", OperacionDos.miMensaje1, nota1);
            //si no cumple la condicion
        } else {
            if (nota1 < 90 && nota1 >= 80) {
                System.out.printf("%s &d", OperacionDos.miMensaje2, nota1);
            } else {
                if (nota1 < 80 && nota1 >= 50) {
                    System.out.printf("%s %d", OperacionDos.miMensaje3, nota1);
                    //si no cumple la condicion
                } else {
                    if (nota1 < 50 && nota1 >= 0) {
                        System.out.printf("%s &d", OperacionDos.miMensaje4, nota1);
                    }
                }
            }
        }
    }
}