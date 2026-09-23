/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA_2_4_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        double salarioM,total,bono;
        Scanner cap = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        nombre = cap.nextLine();
        System.out.println("Cual es tu salario mensual?");
        salarioM = cap.nextDouble();
        if (salarioM < 12000) { //QUE HACEMOS SI ES VERDADERO
            System.out.println("Felicidades por tu salario menor a 12,000 obtuviste un bono de 10%,tu nuevo salario es de.....");
            bono = salarioM * 0.10;
            total = bono + salarioM;
              System.out.println("Felicidades!! :)");
              System.out.println("La persona " + nombre + " gano un bono de ");
               System.out.println("bono " + bono);
                System.out.println("Nuevo salario  " + total);
        } else { //QUE HACEMOS SI ES FALSO(OPCIONAL)
            System.out.println("WOW TUS SALARIO ES MAYOR A 12,000?,TE GANASTE UN BONO DEL 5%!!!");
            bono = salarioM * 0.5;
            total = bono +  salarioM;
            System.out.println("Nombre " + nombre + " gano un bono de ");
            System.out.println("bono " + bono);
            System.out.println("Nuevo salario " + total); 
        }
    }
}
