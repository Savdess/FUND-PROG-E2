/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int edad;
      boolean estEstud = false;
      boolean credINSEN = false;
      Scanner cap = new Scanner(System.in);
      System.out.println("Cual es tu edad?");
      edad = cap.nextInt();
      cap.nextLine();
      System.out.println("Eres estudiante con credencial vigente(true = si/false = no");
      estEstud = cap.nextBoolean();
      System.out.println("Cuentas con credencial del INSEN?(true = si/false=no");
      credINSEN = cap.nextBoolean();
      if (edad < 18 || estEstud || edad > 60 || credINSEN) {
            System.out.println("TIENE DESCUENTO");
      } else {
            System.out.println("NO TIENE DESCUENTO");
    }
  }
}