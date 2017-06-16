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
public class Validaciones {
    public static void main(String[] arg){
     //probramos la exception solito
     float x = 6;
     try{
         ValidacionUsuario.ValidarNoNegativo(x);
            System.out.println("Primero que lanza excepcion");
         Usuario u = new Usuario();
         u.setAltura(-2);
            System.out.println("Exception del ajuste de altura");
         u.setPeso(30);
            System.out.println("Exception del ajuste de peso");
     }catch(NumeroNoNegativoException e){
         System.out.println(e.getMessage());
     }
     
     }
    
}
