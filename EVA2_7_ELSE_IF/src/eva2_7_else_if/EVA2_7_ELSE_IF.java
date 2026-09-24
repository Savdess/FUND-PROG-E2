/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TEMPERATURA
        //35 CALLOR
        //20 AGRADABLE
        //10 FRESCO
        //FRIO
        int temp;
        Scanner cap = new Scanner(System.in);
        System.out.println("Cual es la temperatura");
        temp = cap.nextInt();
        if(temp >= 35) {
        System.out.println("El clima esta calido(hace calor)");
        }else if(temp >= 20) 
        System.out.println("El clima esta agradable(no esta caluroso)");
        else if(temp >= 10)
        System.out.println("El clima esta fresco");
        else
        System.out.println("El clima esta demasiado frio");
      }
}
