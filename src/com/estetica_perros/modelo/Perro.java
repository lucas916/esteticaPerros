/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.modelo;

import java.io.Serializable;

/**
 *
 * @author MARTINA
 */
public class Perro implements Serializable {
    private String nombre;
    private String peso;
    private String raza;
    private String tamaño;
    private String carnetVacunas;

    public Perro(String nombre, String peso, String raza, String tamaño, String carnetVacunas) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.tamaño = tamaño;
        this.carnetVacunas = carnetVacunas;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the carnetVacunas
     */
    public String isCarnetVacunas() {
        return carnetVacunas;
    }

    /**
     * @param carnetVacunas the carnetVacunas to set
     */
    public void setCarnetVacunas(String carnetVacunas) {
        this.carnetVacunas = carnetVacunas;
    }
    
    
    
}
