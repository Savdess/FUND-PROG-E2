/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULADORA
        //DEBE PEDIR DOS VALORES ENTEROS
        //PEDIR LA OPERACION(con switch)
        //SUMA
        //RESTA
        //MULTIPLICACION
        //DIVISION
        //CUALQUIER OTRO.....OPCION INVALIDA
        //REGRESAR EL RESULTADO
        double Resul,valor1,valor2;
        String oper;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        valor1 = cap.nextDouble();
        System.out.println("Introduce el segundo valor");
        valor2 = cap.nextDouble();
        cap.nextLine();
        System.out.println("Que operacion deseas hacer? (Suma, Resta, Multiplicacion, Division");
        oper = cap.nextLine();
        switch(oper){
        case "Suma":
        System.out.println("Tu resultado de la suma es: ");
        Resul = valor1 + valor2;
        System.out.println("Resultado : " + Resul);
        break;
        case "Resta":
        System.out.println("Tu resultado de la resta es: ");
        Resul = valor1 - valor2; 
        System.out.println("Resultado : " + Resul);
        break;
        case "Multiplicacion":
        System.out.println("Tu resultado de la multiplicacion es: ");
        Resul = valor1 * valor2; 
        System.out.println("Resultado : " + Resul);
        break;
        case "Division":
        System.out.println("Tu resultado de la division es: ");
        Resul = valor1 / valor2; 
        System.out.println("Resultado : " + Resul);
        break;
        }
    }
    
}
