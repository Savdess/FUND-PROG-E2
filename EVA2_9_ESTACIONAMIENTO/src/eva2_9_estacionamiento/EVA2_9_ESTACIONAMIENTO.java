/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas,total,pago,cambio;
        int costoX2hr = 25;
        int costoX5hr = 20;
        int costoX10hr = 15;
        int costoX15hr = 150;
        Scanner cap = new Scanner(System.in);
        System.out.println(">>>BIENVENIDO A NUESTRO ESTACIONAMIENTO<<<");
        System.out.println("¿Cuanto tiempo estuviste en nuestro estacionamiento?(en horas)");
        horas = cap.nextInt();
        if(horas<=2) {
            System.out.println("Estuviste " + horas +  " horas en el estacionamiento por lo que se te cobrara a $25 x hr");
            total = horas * costoX2hr;
            System.out.println("El total es " + total);
            System.out.println("¿Cuanto vas a pagar?");
            pago = cap.nextInt();
            cambio = pago - total;
            System.out.println("Perfecto!! tu cambio es: " + cambio);
        }else if(horas<=5){
            System.out.println("Estuviste " + horas +  " horas en el estacionamiento por lo que se te cobrara a $20 x hr");
            total = horas * costoX5hr;
            System.out.println("El total es " + total);
            System.out.println("¿Cuanto vas a pagar?");
            pago = cap.nextInt();
            cambio = pago - total;
            System.out.println("Perfecto!! tu cambio es: " + cambio);
        }else if(horas<=10){
            System.out.println("Estuviste " + horas + " horas en el estacionamiento por lo que se te cobrara a $15 x hr");
            total = horas * costoX10hr;
            System.out.println("El total es " + total);
            System.out.println("¿Cuanto vas a pagar?");
            pago = cap.nextInt();
            cambio = pago - total;
            System.out.println("Perfecto!! tu cambio es: " + cambio);
        }else if(horas>=15){
            System.out.println("Estuviste " + horas + " horas en el estacionamiento por lo que se te cobrara una tarifa fija de $150");
            total = costoX15hr;
            System.out.println("El total es " + total);
            System.out.println("¿Cuanto vas a pagar?");
            pago = cap.nextInt();
            cambio = pago - total;
            System.out.println("Perfecto!! tu cambio es: " + cambio);
        }
    }
    
}
