/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Anidamiento
        int edad,cred;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Cual es tu edad?");
        edad = cap.nextInt();
        if(edad>=18) {
            System.out.println("Tienes credencial de elector? (1 == si, 0 == no):");
            cred = cap.nextInt();
            if(cred == 1) {//cuenta con credencial
                System.out.println("Puedes pasar,disfruta!!");
            }else{ 
                System.out.println("No puedes pasar");
        }
        }else{
            System.out.println("No puedes entrar,vete");
        }
    }
    
}
