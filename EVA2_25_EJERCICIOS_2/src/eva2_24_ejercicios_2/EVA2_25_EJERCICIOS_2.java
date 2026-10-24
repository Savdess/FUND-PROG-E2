/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        String acum = "";
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        num1 = cap.nextInt();
        for(int i = 1; i <= num1 ; i++){
            acum += "*";
           System.out.println(acum);
        }
    }
    
}
