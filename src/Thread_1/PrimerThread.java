/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_1;

/**
 *
 * @author T-
 */

// Paso 1: Heredamos la clase Threas
public class PrimerThread extends Thread{
    // Conciste en heredar la clase Thread
    
    // Paso 2: sobre escribimos el metodo RUN
    @Override
    public void run()
    {
        System.out.println("Soy un thread que no hace nada");
    }
}
