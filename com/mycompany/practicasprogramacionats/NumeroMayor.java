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
public class NumeroMayor {
    
    public static void main(String[] args) {
        int num1,num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número"));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "El número " + num1 + " es mayor que " + num2);
        }
        else if(num1 == num2) {
             JOptionPane.showMessageDialog(null, "Los números son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + num1 + " es menor que " + num2);
        }            
    }   
}
