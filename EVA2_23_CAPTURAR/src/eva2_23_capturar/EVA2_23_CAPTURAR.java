/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_23_CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SOLICITAR CALIFICACIONES Y PROMEDIAR
        int cant,calif = 0;
        double promedio;
        Scanner cap = new Scanner(System.in);
        System.out.println("Cuantas calificaciones vas a capturar?");
        cant = cap.nextInt();
        cap.nextLine();
        for(int i = 0; i < cant; i++){//for (int i = 1; i <= cant; i++)   FUNCIONA IGUAL
            System.out.println("Captura la calificacion");
            calif = calif + cap.nextInt(); //ACUMULADOR
            cap.nextLine();
        }
            System.out.println("Acumulador = " + calif);
            promedio = calif / (cant * 1.0);
            System.out.println("Promedio =" + promedio);
        }
        
    }
