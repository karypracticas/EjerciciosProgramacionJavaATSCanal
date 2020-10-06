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
public class AlturasEdades {
    
    public static void main(String[] args) {
        int edad,sumaEdad = 0;
        float altura,sumaAltura = 0;
        int contador = 1;
        int mayoresEdad = 0;
        int alumnosAltos = 0;
        
        
        
        while(contador <= 5){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + contador + " ingresa tu edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno " + contador + " ingresa tu estatura: "));
            
            if(edad > 18) {
                mayoresEdad ++;
                sumaEdad += edad; //Suma iterativa de edades      
            }         
            if (altura > 1.75) {
                alumnosAltos ++;
                sumaAltura += altura; //Suma iterativa de las alturas     
            }
            contador ++;
        }
        JOptionPane.showMessageDialog(null, "El total de alumnos mayores de edad es igual a: " + mayoresEdad);
        JOptionPane.showMessageDialog(null, "El total de alumnos que miden más de 1.75 es igual a: " + alumnosAltos);   
        JOptionPane.showMessageDialog(null, "El promedio de edad es igual a: " + (sumaEdad / 5));
        JOptionPane.showMessageDialog(null, "El promedio de estatura es igual a: " + (sumaAltura / 5));      //Pendiente de verificar el resultado de el promedio de altura
    }   
}
