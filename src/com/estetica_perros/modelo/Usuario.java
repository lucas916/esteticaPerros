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
public class Usuario extends Persona implements Serializable { 
    
    private String contrasenia;
    private String correo;
    private Rol rol;
    private String fecha;

    public Usuario(String contrasenia, String correo, Rol rol, String nombre, String id, String celular) {
        super(nombre, id, celular);
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.rol = rol;
    }

    public Usuario(String contrasenia, String correo, String nombre, String id, String celular, String fecha) {
        super(nombre, id, celular);
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.fecha = fecha;
    }
    
    
    
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the rol
     */
    public Rol getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(Rol rol) {
        this.rol = rol;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
     
    
}
