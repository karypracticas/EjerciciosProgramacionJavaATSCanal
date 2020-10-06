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
public class Mezclar2Arreglos {
    public static void main(String[] args) {
        
        int [] arregloA = new int [10];
        int [] arregloB = new int [10];
        int [] arregloC = new int [20];
        
        
        Scanner entrada = new Scanner(System.in);
        
        //Llenar arreglo A
        System.out.println("Llenar Arreglo A");
        for(int i=0;i<10;i++){
            System.out.print((i +1) + " .Ingresa un número para el arreglo A:");
            arregloA[i] = entrada.nextInt();
        }
        
        /*System.out.println("Impresión de Arreglo A:");
        //Imprimir arreglo A
        for(int i:arregloA ){
            System.out.println(i);
        }*/
        
        System.out.println("---------------------------------------------------");
        
         //Llenar arreglo B
        System.out.println("Llenar Arreglo B");
        for(int i=0;i<10;i++){
            System.out.print((i +1) + " .Ingresa un número para el arreglo B:");
            arregloB[i] = entrada.nextInt();
        }
        
        /*System.out.println("Impresión de Arreglo B:");
        //Imprimir arreglo B
        for(int i:arregloB ){
            System.out.println(i);
        }*/
        
        System.out.println("Impresión de Arreglo C (Mezcla de Arreglo A y B):");
        //Imprimir arreglo C
        //i controlará el arreglo A y B 
        //j controlará el arregloc C
        
        int j = 0;
        for(int i=0;i<10;i++){
            arregloC[j] = arregloA[i];
            j++;
            arregloC[j] = arregloB[i];
            j++;
        }
        
        System.out.println("Arreglo C");
        for(int i:arregloC){ 
        System.out.println(i); 
        }
        
    }
    
}
