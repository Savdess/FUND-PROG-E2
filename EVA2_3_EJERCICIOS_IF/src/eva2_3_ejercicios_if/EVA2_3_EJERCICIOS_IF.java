/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        double desc,subt,precio,total;
        Scanner cap = new Scanner(System.in);
        System.out.println("Cual es el precio del producto?");
        precio = cap.nextDouble();
        System.out.println("Que cantidad de este producto compraste?");
        cant = cap.nextInt();
        subt = precio * cant;
        if (subt >= 1000) { 
            System.out.println("Felicidades por tu compra mayor a $1000 has ganado un descuento total de 10%,tu nuevo precio es.....");
            desc = subt * 0.10;
            total = subt - desc;
              System.out.println("Felicidades!! :)");
              System.out.println("subtotal " + subt);
               System.out.println("desc " + desc);
                System.out.println("Total " + total);
        } else { 
            desc = 0;
            total = subt;
            System.out.println("No obtienes descuento");
        }
    }
}
