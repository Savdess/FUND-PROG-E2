/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner cap = new Scanner(System.in);
         int promedio,Ingresos;
           System.out.println("Cuanto es el ingreso mensual de tu familia?");
           Ingresos = cap.nextInt();
           System.out.println("Cual es tu promedio?");
           promedio = cap.nextInt();
           
           //CONDICIONES PARA DAR BECA
           if((promedio > 80 ) &&  Ingresos <10000) {
               System.out.println("Beca Concedida");
           }else{
               System.out.println("Beca Denegada");
           }
    }
    
}
