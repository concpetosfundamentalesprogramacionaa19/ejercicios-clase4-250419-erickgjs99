/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        // Declaracion de variables
        int msj;
        int calc;
        double add;
        double pago;
        double iva = 0.12;
        double pfinal;
        
        // Ingreso de datos
        System.out.printf("Ingrese por favor la cantidad de mensajes enviados \n");
        msj = entrada.nextInt();
        // condicionales para cobro de mensajes
        if (msj <= 40){
            calc =  3;
            pago = calc * iva;
            pfinal = calc + pago;
        System.out.printf("La cantidad a pagar por sus mensajes enviados es por la cantidad de: %2fn",pfinal," USD");
            if (msj > 40 && msj <= 200){
                calc = 3;
                add = calc * 0.05;
                pago = (calc + add)*iva;
                pfinal = pago + add + pago + calc;
        System.out.printf("La cantidad a pagar por sus mensajes enviados es por la cantidad de: %2f\n",pfinal," USD");    
            }else{
                if (msj > 200){
                   calc =  3;
                add = calc * 0.1;
                pago = calc + add;
                pfinal = pago + add + pago +calc;
        System.out.printf("La cantidad a pagar por sus mensajes enviados es por la cantidad de: %2f\n",pfinal," USD");   
                }
            }
        }
        
    }           
}
// FIN