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
public class TareaRelog extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(true){
            System.out.println("¡¡TENGO HAMBRE!! ¡¡!AIUUUDAAAAAAAAAAAAA!" + i++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            
        }
    }
}
