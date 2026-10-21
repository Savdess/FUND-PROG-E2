/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        boolean enfCronica = false;
        double peso,estatura,imc;
        Scanner cap = new Scanner(System.in);
        System.out.println("Cual es tu edad?");
        edad = cap.nextInt();
        System.out.println("Tienes alguna enfermedad cronica? (true = si / false = no)");
        enfCronica = cap.nextBoolean();
        System.out.println("Cual es tu peso en kg?");
        peso = cap.nextDouble();
        System.out.println("Cual es tu estatura en metros?");
        estatura = cap.nextDouble();
        imc = peso / (estatura * estatura);
        if (edad > 65 || enfCronica || imc >= 25) {
            System.out.println("Eres persona en riesgo si llegas a tener covid(Tu IMC es: " + imc + ")");
        } else {
            System.out.println("No eres persona en riesgo si llegas a tener covid (Tu IMC es: " + imc + ")");
        }
    }
}