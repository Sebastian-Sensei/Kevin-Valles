/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColeccionesUno;

/**
 *
 * @author T-
 */

import java.util.*;

public class GenerarNominas {
    public static void main(String[] args){
       // generar el siguiente trabajador por contrato(Juan, Lopez, 1234, 45000)
       NominaContrato nc = new NominaContrato("Juan","Lopez",1234,45000);
       NominaHonorarios nh = new NominaHonorarios("Anna", "Perez",4321,60000,0.16f,0.16f);
       // generamos un ArrayList para meter las dos nominas anteriores
       ArrayList<Nomina> misNominas = new ArrayList<>();
       // agregar un objeto a este arreglo de tipo ArrayList usamos el metodo ADD
       misNominas.add(nc);
       misNominas.add(nh);
       // para recorre(iterar) este arreglo y verificar que se agregaron los obejtos 
       // usamos el for mejorado (Inyeccion de dependencias)
       for(Nomina nomina: misNominas){
           System.out.println("El numero del usuario es " + nomina.getNombre());
       }
    }
}
