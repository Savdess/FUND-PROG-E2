/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios_3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingresa tu numero");
        num1 = cap.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println("3x" + i + "="  + num1 * i);
        }
    }
    
}