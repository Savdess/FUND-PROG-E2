/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_11_ACCESO {
final static String USUARIO = "Sav";
final static String CONTRASEÑA = "Sav";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Usuario,passw;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce Tu Usuario");
        Usuario = cap.nextLine();
        System.out.println("Introduce la password");
        passw = cap.nextLine();
        //usuario.equals(USUARIO) alternativa segura para comparar cadenas
        if(Usuario.equals(USUARIO)&& passw.equals(CONTRASEÑA)){
                System.out.println("ACCESO CONCEDIDO!!!");
            }else{
                System.out.println("ACCESO DENEGADO");
            }
            }
        }
