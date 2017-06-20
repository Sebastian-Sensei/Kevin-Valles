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
public class Nomina {
    String nombre,aPaterno;
    Long numeroSeguro;
    Float sueldoBase;

   public Nomina() {}

   public Nomina(String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.numeroSeguro = numeroSeguro;
        this.sueldoBase = sueldoBase;
    } 
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public Long getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setNumeroSeguro(Long numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public Float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
}
