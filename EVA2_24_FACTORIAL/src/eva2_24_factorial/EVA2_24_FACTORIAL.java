/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,fac = 1;
        Scanner cap = new Scanner(System.in);
        System.out.println("Que numero quieres calcular");
        num = cap.nextInt();
        cap.nextLine();
        //Caso 1 : 5 x 4 x 3 x 2 x 1 = 120
        for(int i = num; i >= 1; i--){
            fac = fac * i;
        }
        System.out.println("Factorial de "+ num + " = " + fac);
        //caso 2 : 1 x 2 x 3 x 4 x 5= 120
        for(int i = num; i <= 1; i++){
            fac = fac * i;
        }
        System.out.println("Factorial de "+ num + " = " + fac);
        }
    }
    
