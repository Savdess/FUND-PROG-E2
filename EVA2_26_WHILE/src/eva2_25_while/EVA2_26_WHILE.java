/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_while;

/**
 *
 * @author bisonte
 */
public class EVA2_26_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //WHILE --> MIENTRAS(QUE?)
        //CERO --> N VECES
        //IMPRIMIR LOS NUMEROS DEL 1 AL 10
        int i = 1;
        while(i <= 10){ //SE REPITE MIENTRAS LA CONCIDICION SEA VERDADERA
            System.out.print(i + " - ");
            i++;
        }
        System.out.println("");
            //AHORA DEL 10 AL 1
         i= 10;
         while(i >= 1){ //SE REPITE MIENTRAS LA CONCIDICION SEA VERDADERA
              System.out.print(i + " - ");
              i--;
        }
    }
  }
