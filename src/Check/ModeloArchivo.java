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
public class ModeloArchivo {
    
    // metodo para escribirlo
    public void escribirArchivo()throws FileNotFoundException, IOException
    {
        // paso 1: generar el archivo
        File file = new File("Archivaldo");
        
        // paso 2: primer check exception
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream cos = new ObjectOutputStream(fos);
        String miObjeto = "Este es un objeto de la clase String muy simple";
        cos.writeObject(miObjeto);
        
        System.out.println("Se guardo tu string con exito");
    }
    
}
