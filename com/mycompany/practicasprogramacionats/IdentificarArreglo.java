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
public class IdentificarArreglo {
    
    public static void main(String[] args) {
        int [] miArreglo = new int [5];
        boolean creciente = false,decreciente = false;
        
        Scanner entrada = new Scanner(System.in);
        
        //Llenar arreglo 
        System.out.println("Llenar Arreglo ");
        for(int i=0;i<5;i++){
            System.out.print((i +1) + " .Ingresa un número para el arreglo:");
            miArreglo[i] = entrada.nextInt();
        }
        
        //Leer arreglo e identificar alguno de los siguientes casos:
        //Arreglo creciente -> 1,2,3,4,5...
        //Arreglo decreciente -> 5,4,3,2,1
        //Arreglo desordenado -> 9,4,10,2,0,20
        //Arreglo con números iguales -> 4,4,4,4
       
        
        for(int i=0;i<4;i++){
            if(miArreglo[i] < miArreglo[i] +1){//Arreglo creciente
                creciente = true;
            }
            
            if(miArreglo[i] > miArreglo[i] +1){ //Arreglo decreciente
                decreciente = true;
            }
        }
        
        //TODO: Verificar porque no identifica los otros if, siempre muestra que es un arreglo creciente.
        
        if(creciente == true && decreciente == false){
            System.out.println("Soy un arreglo creciente");
        }
        
        else if(creciente == false && decreciente == true){
             System.out.println("Soy un arreglo decreciente");
        }
        
         else if(creciente == true && decreciente == true){
             System.out.println("Soy un arreglo desordenado");
        }
        else if(creciente == false && decreciente == false){
             System.out.println("Soy un arreglo con números iguales");
        }     
    }
    
}
