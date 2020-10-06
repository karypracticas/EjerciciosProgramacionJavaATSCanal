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
public class MultiploDiez {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        if(numero % 10 == 0){
            JOptionPane.showMessageDialog(null, "Es un multiplo de 10");
        }
        else {
             JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }       
    }  
}
