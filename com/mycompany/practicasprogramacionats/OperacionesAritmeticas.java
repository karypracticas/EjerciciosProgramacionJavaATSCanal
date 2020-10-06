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
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        int num1,num2,suma,resta,multiplicacion,division;
        char seleccion;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        seleccion = JOptionPane.showInputDialog("Indica que operación quieres realizar: S -> suma, R-> Resta, M-> Multiplicación, D-> División, X -> Salir").charAt(0);
        
        switch(seleccion) {
            //Al agregar la dos opciones de minúsculas y mayúsculas, podrá realizar la operación ya que no existe un break en el primer case.
            case 's':
            case 'S':
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                 resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'm':
            case 'M':
                 multiplicacion = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + multiplicacion);
                break;
            case 'd':
            case 'D':
                 division = num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: " + division);
                break;
            case 'X':
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida");  
                break;
        }
    }
    
}
