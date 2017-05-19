/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin_valles;

/**
 *
 * @author T-
 */
public class Kevin_Valles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Hola Mundo Cruel");    
        
        // probaremos la solucion
        // crear un usuario hipotetico
        Usuario u = new Usuario();
        
        // se asigna el valor de altura
        u.altura = 1.68f;
        // se asigna el valor de peso
        u.peso = 64f;
        
        // genera el modelo
        Imc imc = new Imc();
        
        // se inicializa el metodo calcular
        imc.calcular(u);
        // muestra el resultado de la operacion
        System.out.println("El valor del IMC es " + imc.calcular(u));
    }
    
}
