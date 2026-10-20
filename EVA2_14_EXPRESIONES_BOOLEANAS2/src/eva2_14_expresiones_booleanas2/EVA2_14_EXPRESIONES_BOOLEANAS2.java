/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BECA
        //Promedio --> 85
        //Esta en un equipo representativo?
        Scanner cap = new Scanner(System.in);
        String EstaEnEquipoRep;
        int promedio;
           System.out.println("Estas en el equipo representativo(S/N)?");
           EstaEnEquipoRep = cap.nextLine();
           System.out.println("Cual es tu promedio?");
           promedio = cap.nextInt();
           
           //CONDICIONES PARA DAR BECA
           if((promedio >= 85 )|| EstaEnEquipoRep.equals("S")){
               System.out.println("Beca Concedida");
           }else{
               System.out.println("Beca Denegada");
           }
    }
    
}
