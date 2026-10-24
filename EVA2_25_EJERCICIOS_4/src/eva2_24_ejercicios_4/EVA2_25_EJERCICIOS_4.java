/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,resul = 1;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingresa tu numero base");
        num1 = cap.nextInt();
        System.out.println("Ingresa su exponente");
        num2 = cap.nextInt();
        for(int i = 1; i <= num2; i++){
            resul = resul * num1;
        }
        System.out.println("Tu resultado es:"+ resul);
    }
    
}