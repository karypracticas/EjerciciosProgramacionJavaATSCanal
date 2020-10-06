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
public class DesplazarPosicionArreglo {
    
    public static void main(String[] args) {
        int [] arreglo = new int [10];
        int ultimo = arreglo[9];
        
        Scanner entrada = new Scanner(System.in);
        
        //Llenar arreglo 
        System.out.println("Llenar Arreglo");
        for(int i=0;i<10;i++){
            System.out.print((i +1) + " .Ingresa un número para el arreglo:");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("Impresión de Arreglo");
        //Imprimir arreglo 
        for(int i=0;i<10;i++){
            System.out.print(arreglo[i] + 1);
          
        }
    }
    
}
