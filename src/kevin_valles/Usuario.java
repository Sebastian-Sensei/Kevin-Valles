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
public class Usuario {
    
    float peso, altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso)throws NumeroNoNegativoException {
        ValidacionUsuario.ValidarNoNegativo(peso);
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws NumeroNoNegativoException{
        ValidacionUsuario.ValidarNoNegativo(altura);
        this.altura = altura;
    }
}
