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
public class LetraMayuscula {
    
    public static void main(String[] args) {
        char caracter;
        
        caracter = JOptionPane.showInputDialog("Ingresa una letra: ").charAt(0);
        
        if (Character.isUpperCase(caracter)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
        }
        else {
             JOptionPane.showMessageDialog(null, "Es una letra minúscula");
        }
    }    
}
