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
public class Persona implements Serializable{
    
    private String nombre;
    private String id;
    //private String correo;
    private String celular;
    //private byte edad;
    //private String contrasenia;

    public Persona(String nombre, String id, String celular) {
        this.nombre = nombre;
        this.id = id;
        this.celular = celular;
        //this.edad = edad;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the edad
     */
//    public byte getEdad() {
//        return edad;
//    }
//
//    /**
//     * @param edad the edad to set
//     */
//    public void setEdad(byte edad) {
//        this.edad = edad;
//    } 
    
}
