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
public class CondicionalSwitch {
    
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número en un rango del 1 al 5"));
        
        switch(dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "El número es 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El número es 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El número es 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El número es 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El número es 5");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número fuera de rango");  
                break;
        }
    }
    
}
