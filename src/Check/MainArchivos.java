/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Check;
import java.io.*;
/**
 *
 * @author T-
 */
public class MainArchivos {
    
    public static void main(String[] args) {
        try{
            // generamos un objeto de tipo ModeloArchivo
            ModeloArchivo modelo = new ModeloArchivo();
            
            // invocamos al metodo para escribir al archivo
            modelo.escribirArchivo();
            System.out.println("Se genero exitosamente");
        }catch( FileNotFoundException a ){
            System.out.println(a.getMessage());      
        }catch( IOException a){
            System.out.println(a.getMessage());        
        }catch (Exception a){
            System.out.println(a.getMessage());                                                                                                        
        } finally{
             
        }
    }
    
}
