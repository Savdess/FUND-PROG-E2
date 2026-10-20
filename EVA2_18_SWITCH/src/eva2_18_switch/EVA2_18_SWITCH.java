/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce un numero de un dia de la semana (1-7)");
        int dia = cap.nextInt();
        switch(dia){ //Evalua enteros,if,not,byte,short,texto,string,ENUM
            case 1:
            System.out.println("Domingo");
            //Aqui podemos poner las que queramos
            break;//El break interrumpe la estructura donde se ejecuta
            case 2:
            System.out.println("Lunes");
            break;
            case 3:
            System.out.println("Martes");
            break;
            case 4:
            System.out.println("Miercoles");
            break;
            case 5:
            System.out.println("Jueves");
            break;
            case 6:
            System.out.println("Viernes");
            break;
            case 7:
            System.out.println("Sabado");
            break;
            default: //Opcional: Va tomar un valor predeterminado cuando no sea ninguna de las opciones anteriores
                System.out.println("Opcion no valida");
        }
    }
    
}
