/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasprogramacionats;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Calificaciones {
    /*Participación 10%
      Primer parcial 25%
      Segundo parcial 25%
      Examen final 40%
   */
    float participacion,primerParcial,segundoParcial,examenFinal,promedioFinal;
   
    
    public void calcularCalificacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Participación: ");
        participacion = sc.nextFloat();
        System.out.println("Primer parcial: ");
        primerParcial = sc.nextFloat();
        System.out.println("Segundo parcial");
        segundoParcial = sc.nextFloat();
        System.out.println("Examen final");
        examenFinal = sc.nextFloat();
        
        promedioFinal = (participacion * .10f) + (primerParcial * .25f) + (segundoParcial * .25f) + (examenFinal * .40f);
        System.out.println("Tu promedio final es: " + promedioFinal);
    }
    
    public static void main(String[] args) {
        Calificaciones obj = new Calificaciones();
        obj.calcularCalificacion();
    }
}
