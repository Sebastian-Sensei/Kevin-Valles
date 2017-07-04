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
public class Aplicacion {
    public static void main(String[] args){
        // ciclo de vida del Thread
        
        // Nace
        
        PrimerThread t1 = new PrimerThread();
        OtraTarea t2 = new OtraTarea();
        TareaRelog t3 = new TareaRelog();
        
        // lo ponemos en estado de iniciado: estado Runable
        t1.start();
        t2.start();
        t3.start();
        // System.out.println(5/0);
        
        // El siguiente pasa es meterlo a la cpu(esto lo hace el administrador de Threas)
    }
    
}
