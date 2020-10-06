/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasprogramacionats;

import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class BusquedaSecuencial {
    
    public static void main(String[] args) {
        int miArreglo[] = {4,1,9,2,5};
        int dato;
        boolean bandera = false;
        
      
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número a buscar: "));
        
          //Búsqueda Secuencial
          int i = 0;
          while((i < 5) && (bandera == false) ){
              if(miArreglo[i] == dato){
                  bandera = true;
              }
              
              i++;
          }
          
          if(bandera == true){
              JOptionPane.showMessageDialog(null, "Encontramos tu número, está en la posición " + (i-1));
          }
          else{
               JOptionPane.showMessageDialog(null, "El número no está en el arreglo");
          }
    }
    
}
