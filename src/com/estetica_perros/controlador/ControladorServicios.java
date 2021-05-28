/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estetica_perros.controlador;

import ServicioExcepcion.ServicioExcepcion;
import com.estetica_perros.modelo.Servicio;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTINA
 */
public class ControladorServicios {
    
    
    

    public void calcularPrecioPerroPequeño(boolean baño , boolean motilada , boolean profilaxis , boolean grande , boolean mediano , boolean pequeño  ){
        
        double precio= 0;
        double suma=0;
        double descuento= 0;
        double bañoV = 20000;
        double motiladaV = 10000;
        double profilaxisV = 80000;
        
        if(pequeño == true && grande == false && mediano == false){
            if((baño == true) && (profilaxis == false) && (motilada == false)){
                bañoV = 20000;
                precio = bañoV ;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            }else if ((baño == false) && (profilaxis == true) && (motilada == false)){
                profilaxisV = 80000;
                precio = profilaxisV;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            }else if ((baño == false) && (profilaxis == false) && (motilada == true)){
                motiladaV = 10000;
                precio = motiladaV;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio); 
                
                
              /// Verificaciòn de a dos para el 5  
            }else if ((baño == false) && (profilaxis == true) && (motilada == true)){
                suma = profilaxisV + motiladaV;
                descuento= suma *0.05;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);      
            }else if ((baño == true) && (profilaxis == false) && (motilada == true)){
                suma = bañoV + motiladaV;
                descuento= suma *0.05;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);    
            }else if ((baño == true) && (profilaxis == true) && (motilada == false)){
                suma = bañoV + profilaxisV;
                descuento = suma * 0.05;
                precio = suma - descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
                
            // para el 10% descuento    
            } else if ((baño == true) && (profilaxis == true) && (motilada == true)){
                suma= bañoV + profilaxisV + motiladaV;
                descuento = suma * 0.10;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            } 
        }else if((grande == true) && (pequeño == true) && (mediano == true) 
                    || (grande == true) && (pequeño == true) && (mediano == false) 
                    ||(grande == true) && (pequeño == false ) && (mediano == true) 
                    || (grande == false) && (pequeño == true) && (mediano == true) ){
               JOptionPane.showMessageDialog(null, "Acción no permitida" );
            } // cierraconduicional  perro grande
        
    } // cierra el mètodo calcular precio perro pequeño
    
    public void calcularPrecioPerroMediano(boolean baño , boolean motilada , boolean profilaxis , boolean grande , boolean mediano , boolean pequeño  ){
        
        double precio= 0;
        double suma=0;
        double descuento= 0;
        double bañoV = 35000;
        double motiladaV = 15000;
        double profilaxisV = 115000;
        
        if(pequeño == false && grande == false && mediano == true){
            if((baño == true) && (profilaxis == false) && (motilada == false)){
                bañoV = 350000;
                precio = bañoV ;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            }else if ((baño == false) && (profilaxis == true) && (motilada == false)){
                profilaxisV = 115000;
                precio = profilaxisV;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            }else if ((baño == false) && (profilaxis == false) && (motilada == true)){
                motiladaV = 15000;
                precio = motiladaV;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio); 
                
                
              /// Verificaciòn de a dos para el 5  
            }else if ((baño == false) && (profilaxis == true) && (motilada == true)){
                suma = profilaxisV + motiladaV;
                descuento= suma *0.05;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);      
            }else if ((baño == true) && (profilaxis == false) && (motilada == true)){
                suma = bañoV + motiladaV;
                descuento= suma *0.05;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);    
            }else if ((baño == true) && (profilaxis == true) && (motilada == false)){
                suma = bañoV + profilaxisV;
                descuento = suma * 0.05;
                precio = suma - descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
                
            // para el 10% descuento    
            } else if ((baño == true) && (profilaxis == true) && (motilada == true)){
                suma= bañoV + profilaxisV + motiladaV;
                descuento = suma * 0.10;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            } 
        }else if((grande == true) && (pequeño == true) && (mediano == true) 
                    || (grande == true) && (pequeño == true) && (mediano == false) 
                    ||(grande == true) && (pequeño == false ) && (mediano == true) 
                    || (grande == false) && (pequeño == true) && (mediano == true) ){
               JOptionPane.showMessageDialog(null, "Acción no permitida" );
            } // cierraconduicional  perro grande
        
    } // cierra el mètodo  calcular precio perro mediano
    public void calcularPrecioPerroGrande(boolean baño , boolean motilada , boolean profilaxis , boolean grande , boolean mediano , boolean pequeño  ){
        
        double precio= 0;
        double suma=0;
        double descuento= 0;
        double bañoV = 50000;
        double motiladaV = 20000;
        double profilaxisV = 135000;
        
        if(pequeño == false && grande == true && mediano == false){
            if((baño == true) && (profilaxis == false) && (motilada == false)){
                bañoV = 50000;
                precio = bañoV ;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            }else if ((baño == false) && (profilaxis == true) && (motilada == false)){
                profilaxisV = 135000;
                precio = profilaxisV;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            }else if ((baño == false) && (profilaxis == false) && (motilada == true)){
                motiladaV = 20000;
                precio = motiladaV;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio); 
                
                
              /// Verificaciòn de a dos para el 5  
            }else if ((baño == false) && (profilaxis == true) && (motilada == true)){
                suma = profilaxisV + motiladaV;
                descuento= suma *0.05;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);      
            }else if ((baño == true) && (profilaxis == false) && (motilada == true)){
                suma = bañoV + motiladaV;
                descuento= suma *0.05;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);    
            }else if ((baño == true) && (profilaxis == true) && (motilada == false)){
                suma = bañoV + profilaxisV;
                descuento = suma * 0.05;
                precio = suma - descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
                
            // para el 10% descuento    
            } else if ((baño == true) && (profilaxis == true) && (motilada == true)){
                suma= bañoV + profilaxisV + motiladaV;
                descuento = suma * 0.10;
                precio = suma-descuento;
                JOptionPane.showMessageDialog(null, "El precio es: $ " + precio);
            } 
        }else if((grande == true) && (pequeño == true) && (mediano == true) 
                    || (grande == true) && (pequeño == true) && (mediano == false) 
                    ||(grande == true) && (pequeño == false ) && (mediano == true) 
                    || (grande == false) && (pequeño == true) && (mediano == true) ){
               JOptionPane.showMessageDialog(null, "Acción no permitida" );
            } // cierraconduicional  perro grande
        
    } // cierra el mètodo calcular precio perro grande
    
}
