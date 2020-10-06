/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacionats.EjemplosCiclos;

import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */
public class NotasAlumnos {
    public static void main(String[] args) {
        int calificacion;
        int alumnosAprobados = 0;
        int alumnosCondicionados = 0;
        int alumnosSuspendidos = 0;
        
        for(int i=1;i <=6;i++){
            do {
                calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la calificación entre 0 y 10 del alumno  " + i));
            }while(calificacion < 0 || calificacion > 10 );
        
            
            if(calificacion >= 5){
                alumnosAprobados ++;
            }
            
            if(calificacion == 4 ) {
                alumnosCondicionados ++;
            }
            
            if(calificacion < 4){
                alumnosSuspendidos ++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Alumnos Aprobados: " + alumnosAprobados);
        JOptionPane.showMessageDialog(null, "Alumnos Condicionados: " + alumnosCondicionados);
        JOptionPane.showMessageDialog(null, "Alumnos Suspendidos: " + alumnosSuspendidos);
    }   
}
