/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadSegundaForma;

import java.util.Calendar;

/**
 *
 * @author T-
 */
public class Relog implements Runnable, ComportamintoComer {
    // aqui vamos a usar el polimorfismo esta clase si es polimorfica
    
    public static void main(String[] args)
    {
        //probemos que no podemos crear objetos de las interfaces
        
        // no se pueden creae objetod
        //ComportamintoComer cp = new ComportamintoComer();
            
        // cracion del Thread-Polimorficamente
        Runnable r = new Relog();
        
        // pasar al constructor de la clase Thread
        Thread t1 = new Thread(r);
        
        // implementacion 
        t1.start();
        
    }

    @Override
    public void run() {
        
        int i = 0;
        while(true){
            Calendar cal = Calendar.getInstance();
            
            // aqui vamos a activar varias propiedades relacionadas a los calendarios
            // hora, minuto, segundo.
            int hora = cal.get(Calendar.HOUR_OF_DAY);
            int minuto = cal.get(Calendar.MINUTE);
            int segundo = cal.get(Calendar.SECOND);
            System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            
        }
    }

    @Override
    public String obtenerHabitoAlimentencio() {
        return "Soy relog y no como";
    }
    
}
