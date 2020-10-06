/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasprogramacionats;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class MostrarCuadrado {
    
    public static void main(String[] args) {
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        while(numero >=0){
            cuadrado = numero * numero;
            JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es igual a " + cuadrado);     
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }         
        JOptionPane.showMessageDialog(null, "El bucle terminó ya que ingresaste un número negativo"); 
    }    
}
