/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.controlador;

import com.estetica_perros.modelo.Perro;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTINA
 */
public class ControladorPerro {
    
    private List<Perro> perro;
    
    
    private void inicializarColeccionesPerro(){
    
        perro = new ArrayList<>();
        //acà es donde se carga el archivo plano-bases de datos-etc
        perro.add(new Perro("Martina" , "25.6" , "Criolla" , "Tamaño Mediano", "2" ));
        perro.add(new Perro("Paco" , "10.5" , "Criollo" , "Tamaño pequeño", "1" ));
        //String nombre, byte edad, double peso, String raza, String tamaño, boolean carnetVacunas
    }    
    
//     public void escribirFichero() throws IOException{
//        
//        FileWriter fichero = null;
//        
//        try{
//            fichero = new FileWriter("scr/AlmacenmientoPerros.txt");
//            PrintWriter prinW = new PrintWriter(fichero);
//            
//            //printW.println();
//            
//        } catch (IOException ex){
//            System.out.println("Error al guardar el archivo" + ex.getMessage());
//        } finally{
//            try{
//                fichero.close();
//            } catch(IOException ex){
//                    System.out.println("Error al cerrar el archivo" + ex.getMessage());
//                }
//        }
//    }

}
