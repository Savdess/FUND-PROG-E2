/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_for;

/**
 *
 * @author bisonte
 */
public class EVA2_21_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ACCESO POR INDICES --> 1
        //IMPPRIMIR UN LISTADO DEL 1 AL 10:
        //3 PARAMETROS
        //PUNTO DE PARTIDA
        //CONDICION PARA DETENERSE
        //AVANCE--> DE UNO EN UNO EN ESTE CASO
        for(int i = 1; i <= 10; i++){
           //INSTRUCCION A REPETIR
           System.out.print(i +  " - " );
        }
        System.out.println();
        //20,22,24,26,28,30,32,34,36,38
        for(int i = 20; i <= 38; i+=2){
           System.out.print(i +  " - " );
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
           System.out.print(i +  " - " );
        }
        System.out.println();
        for(int i = 10; i >= 1; i--){
           System.out.print(i +  " - " );
        }
        System.out.println();
        for(int i = 0; i <=20; i+=2){
           System.out.print(i +  " - " );
        }
    }
}
