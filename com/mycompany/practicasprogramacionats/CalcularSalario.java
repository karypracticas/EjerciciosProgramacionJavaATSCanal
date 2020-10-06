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
public class CalcularSalario {
    
    public static void main(String[] args) {
        int horasTrabajadas,salarioSemanal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de horas trabajadas esta semana:"));
        
        
        if(horasTrabajadas <= 40){
            JOptionPane.showMessageDialog(null, "Su salario de esta semana es de: $" + (horasTrabajadas * 16));
        }
       else {
            JOptionPane.showMessageDialog(null, "Su salario de esta semana es de: $" + (((40 * 16) + ((horasTrabajadas - 40) * 20 ))));
        }       
    }
    
}
