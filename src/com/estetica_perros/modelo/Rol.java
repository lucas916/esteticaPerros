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
public class Rol implements Serializable{
    private byte rol;
    private String descripcion;

    public Rol(byte rol, String descripcion) {
        this.rol = rol;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the rol
     */
    public byte getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(byte rol) {
        this.rol = rol;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
