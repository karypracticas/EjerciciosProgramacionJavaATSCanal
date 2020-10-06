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
public class CantidadNumerosIntroducidos {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        while(numero >= 0){
            contador++;     
            System.out.println(contador);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
      }
        JOptionPane.showMessageDialog(null, "La cantidad de números introducidos fueron: " + contador); 
    }
    
}
