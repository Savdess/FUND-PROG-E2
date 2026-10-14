/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int promedio;
        Scanner cap = new Scanner(System.in);
        System.out.println("¿Cual fue tu promedio de esta Unidad?");
        promedio = cap.nextInt();
        if(promedio <0) {
            System.out.println("Dato invalido,Porfavor introuduce un dato valido (mayor a 0 y menor de 100");
        }else if(promedio >100){
            System.out.println("Dato invalido,Porfavor introuduce un dato valido (mayor a 0 y menor de 100");
        }else if(promedio <70){
            System.out.println("Tu promedio es Insuficiente :(");
        }else if(promedio <80){
            System.out.println("Tu promedio es Aceptable");
        }else if(promedio <90){
            System.out.println("Tu promedio es Bueno");
        }else if(promedio >=90){
            System.out.println("Tu promedio es Sobresaliente :),Felicidades!!");
        }
    }
    
}