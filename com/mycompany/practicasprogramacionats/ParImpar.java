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
public class ParImpar {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        while(numero != 0){
            if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número es par");     
        } else {
                JOptionPane.showMessageDialog(null, "El número es impar");      
            }        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
      }
        JOptionPane.showMessageDialog(null, "El bucle terminó ya que ingresaste el número cero"); 
    }
}
