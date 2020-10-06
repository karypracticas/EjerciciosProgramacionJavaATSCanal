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
public class Horas {
    
    /* 1 semana -> 168 horas
       1 día -> 24 horas
    */
    int horasUsuario,semanas,dias,horas,equivalente;
    
    public void mostrarEquivalentes(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique el número de horas: ");
        horasUsuario = entrada.nextInt();
        
       semanas = horasUsuario / 168;
       dias = (horasUsuario % 168) / 24;
       horas = horasUsuario % 24;
       
        System.out.println("El total de semanas son: " + semanas + " semanas " + dias + " dias" + " y " + horas + " horas");
    }
    
    public static void main(String[] args) {
        Horas obj = new Horas();
        obj.mostrarEquivalentes();
        
    }
    
}
