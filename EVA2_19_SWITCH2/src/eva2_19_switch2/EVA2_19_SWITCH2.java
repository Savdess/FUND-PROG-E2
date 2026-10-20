/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_switch2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_19_SWITCH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        String carrera;
        System.out.println("Introduce la carrera (SISTEMAS, INFORMATICA, ADMINISTRACION");
        carrera = cap.nextLine();
        switch(carrera){ //if(carrera.equals("SISTEMAS))
            case "SISTEMAS":
                System.out.println("ISC");
                break;
            case "INFORMATICA":
                System.out.println("INF");
                break;
            case "ADMINISTRACION":
                System.out.println("IA");
                break;
        }
    }
    
}
