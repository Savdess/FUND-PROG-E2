/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner cap = new Scanner(System.in);
        System.out.println("QUE EDAD TIENES");
        edad = cap.nextInt();
        if (edad >= 18) { //QUE HACEMOS SI ES VERDADERO
            System.out.println("Puedes entrar al Antro");
              System.out.println("Felicidades Disfruta del antro :)");
        } else { //QUE HACEMOS SI ES FALSO(OPCIONAL)
            System.out.println("Lo siento,no tienes la edad suficiente,no tienes pe1rmitido entrar");
            System.out.println("Vuelve cuando tengas la edad permitida");
        }
    }
}