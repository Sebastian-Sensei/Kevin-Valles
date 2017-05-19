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
public class Imc {
    
    /* se declara la funcion clacular y espera como atributo la clase Usuario para realizar sus operacion*/
    public float calcular( Usuario u)
    {
        /* realiza el calculo del IMC */
        float resultado =  u.peso / ( u.altura * u.altura );
        return resultado;
    } // fin de la funcion calcular
}
