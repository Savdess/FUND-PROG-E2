/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios_1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingresa un tu primer numero");
        num1 = cap.nextInt();
        System.out.println("Ingresa un tu segundo numero");
        num2 = cap.nextInt();
        for(int i = num1; i <= num2; i++){
           System.out.print(i +  " - " );
        }
    }
    
}
