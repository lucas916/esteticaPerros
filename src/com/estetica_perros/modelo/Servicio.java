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
public class Servicio implements Serializable{
    
    private boolean baño ;
    private boolean motilada;
    private boolean profilaxis;
    private boolean grande; 
    private boolean mediano; 
    private boolean pequeño ;

    public Servicio(boolean baño, boolean motilada, boolean profilaxis, boolean grande, boolean mediano, boolean pequeño) {
        this.baño = baño;
        this.motilada = motilada;
        this.profilaxis = profilaxis;
        this.grande = grande;
        this.mediano = mediano;
        this.pequeño = pequeño;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the baño
     */
    public boolean isBaño() {
        return baño;
    }

    /**
     * @param baño the baño to set
     */
    public void setBaño(boolean baño) {
        this.baño = baño;
    }

    /**
     * @return the motilada
     */
    public boolean isMotilada() {
        return motilada;
    }

    /**
     * @param motilada the motilada to set
     */
    public void setMotilada(boolean motilada) {
        this.motilada = motilada;
    }

    /**
     * @return the profilaxis
     */
    public boolean isProfilaxis() {
        return profilaxis;
    }

    /**
     * @param profilaxis the profilaxis to set
     */
    public void setProfilaxis(boolean profilaxis) {
        this.profilaxis = profilaxis;
    }

    /**
     * @return the grande
     */
    public boolean isGrande() {
        return grande;
    }

    /**
     * @param grande the grande to set
     */
    public void setGrande(boolean grande) {
        this.grande = grande;
    }

    /**
     * @return the mediano
     */
    public boolean isMediano() {
        return mediano;
    }

    /**
     * @param mediano the mediano to set
     */
    public void setMediano(boolean mediano) {
        this.mediano = mediano;
    }

    /**
     * @return the pequeño
     */
    public boolean isPequeño() {
        return pequeño;
    }

    /**
     * @param pequeño the pequeño to set
     */
    public void setPequeño(boolean pequeño) {
        this.pequeño = pequeño;
    }

    
    
   
    

    
    
    

    
    
    
}
