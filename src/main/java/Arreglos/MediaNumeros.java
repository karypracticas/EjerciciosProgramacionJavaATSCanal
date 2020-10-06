/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author kary
 */
public class MediaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[5];
        int totalPositivos = 0;
        int mediaPositivos = 0;
        int sumaPositivos = 0;
        int totalNegativos = 0;
        int mediaNegativos = 0;
        int sumaNegativos = 0;
        int totalCeros = 0;
        
        //Llenar el arreglo
        for(int i=0;i<5;i++){
            System.out.println((i+1) + ". Digite un número");
            numeros[i] = entrada.nextInt(); 
            
            if(numeros[i] >= 0){
                totalPositivos += numeros[i];
                sumaPositivos ++;
                mediaPositivos = totalPositivos / sumaPositivos;                
            }
            
            if(numeros[i] < 0){
                totalNegativos += numeros[i];
                sumaNegativos ++;
                mediaNegativos = totalNegativos / sumaNegativos;                
            }
            
            if(numeros[i] == 0){
                totalCeros ++;                
            }
            
        }  
        
         System.out.println("La media de números positivos es: " + mediaPositivos);
         System.out.println("La media de números negativos es: " + mediaNegativos);
         System.out.println("El total de ceros introducidos es: " + totalCeros);
        } 
    }
    

