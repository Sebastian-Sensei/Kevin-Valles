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
public class OtraTarea extends Thread{
    
    @Override
    public void run()
    {
        String nombre = getName();
        System.out.println("Soy el segundo Thread y me llamo :" + nombre);
    }
}
