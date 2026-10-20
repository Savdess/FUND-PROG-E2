/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_booleanas;

/**
 *
 * @author bisonte
 */
public class EVA2_13_EXPRESIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean entrarAntro,tieneCred = false;
        int edad= 15;
        //AND --> PARA QUE SEA VERDAD AMBOS DEBEN SER VERDADEROS(TRUE)
        entrarAntro = (edad>= 18) && (tieneCred == true);
        System.out.println(entrarAntro);
        
        //OR --> PARA QUE SEA VERDAD SOLO UNA DEBE SER VERDADERA(CUALQUIERA)
        boolean estaSoleado = false, tienesDinero = false;
        boolean permisoSalir;
        permisoSalir = (estaSoleado == true) || (tienesDinero == true);
        System.out.println("Permiso para salir de paseo: " + permisoSalir);
    }
    
}
