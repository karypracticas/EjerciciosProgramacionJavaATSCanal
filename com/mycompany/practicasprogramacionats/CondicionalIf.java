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
public class CondicionalIf {
    
    public static void main(String[] args) {
        int numero,dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero: "));
        
        if(numero == dato) {
            JOptionPane.showMessageDialog(null, "El número es igual a 5");
        }
        else {
             JOptionPane.showMessageDialog(null, "El número es diferente a 5");
        }       
    }    
}
