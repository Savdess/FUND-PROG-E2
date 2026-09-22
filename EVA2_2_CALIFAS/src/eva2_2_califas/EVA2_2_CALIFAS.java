/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int calif;
        Scanner cap = new Scanner(System.in);
        System.out.println("Que calificacion sacaste en esta unidad?");
        calif = cap.nextInt();
        if (calif >= 70) { //QUE HACEMOS SI ES VERDADERO
            System.out.println("Pasaste la Unidad");
              System.out.println("Felicidades!! :)");
        } else { //QUE HACEMOS SI ES FALSO(OPCIONAL)
            System.out.println("Lo siento,no tienes la calificacion suficiente,reprobaste");
            System.out.println("Buena suerte a la proxima");
        }
    }
}
