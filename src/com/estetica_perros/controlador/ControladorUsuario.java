/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.controlador;

import UsuarioExcepcion.UsuarioExcepcion;
import com.estetica_perros.modelo.Rol;
import com.estetica_perros.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTINA
 */
public class ControladorUsuario {
    
    private Rol [] roles;
    private List<Usuario> usuarios;

    public ControladorUsuario() {
        inicializarColecciones();
    }
    
    private void inicializarColecciones(){
    
        roles = new Rol [2];
        roles [0] = new Rol ((byte)1, "Administrador");
        roles [1] = new Rol ((byte)2, "Consulta");
        usuarios = new ArrayList<>();
        //acà es donde se carga el archivo plano-bases de datos-etc
        usuarios.add(new Usuario("12345" , "lucaslopez@umanizales.edu.co" , roles [0] , "Lucas López" , "1002652223" , "312 673 5468"));
        usuarios.add(new Usuario("1234567" , "andream@umanizales.edu.co" , roles [1] , "Andrea Marín" , "1009871234" , "312 333 7755"));
        
        //String contrasenia, String correo, Rol rol, String nombre, String id, String celular, byte edad      
    }
    
    
    public boolean verificarUsuario(String correo, String contrasenia){
            for(Usuario usu: usuarios){
                if(usu.getCorreo().equals(correo)&& usu.getContrasenia().equals(contrasenia)){
                    return true;
                }
            } return false;
            
    }    
    
    private boolean validarCorreo(String email) {
        boolean espacios = true;

        Pattern pattern = Pattern.compile("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");

        Matcher matcher = pattern.matcher(email);

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ' ') {
                espacios = false;
                break;
            }
        }

        return matcher.find() && espacios;
    }
  
}
