/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacionats.EjemplosCiclos;

import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */
public class IdentificarNegativo {
    public static void main(String[] args) {
        
        boolean esNegativo = false;
        int numero = 0;
        
        for(int i=1; i<=10;i++){
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de la iteración " +i));
            
            if(numero < 0) {
                esNegativo = true;  
            }           
        }     
         if(esNegativo == true){
                JOptionPane.showMessageDialog(null, "Si existe al menos un número negativo");
            }else {
                JOptionPane.showMessageDialog(null, "No hay números negativos");
            }    
    }
}
