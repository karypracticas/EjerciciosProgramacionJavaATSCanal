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
public class ParesImparesArreglos {
    public static void main(String[] args) {
        int [] arregloPrincipal = new int [10]; 
        int par = 0;
        int impar = 0;
        
        
        Scanner entrada = new Scanner(System.in);
        
        //Llenar arreglo General
        System.out.println("Llenar Arreglo");
        for(int i=0;i<10;i++){
            System.out.print((i +1) + " .Ingresa un número para el arreglo Principal:");
            arregloPrincipal[i] = entrada.nextInt();
        }
        
        //Identifica cuantos pares y cuantos impares tenemos
        for(int i=0;i<10;i++){
            //System.out.println(i);
            if( arregloPrincipal[i] % 2 == 0){//Número Par
            par ++;
        }      
            else{//Número Impar
                impar ++;
            }
        }
             
        int [] arregloPares = new int[par];
        int [] arregloImpares = new int[impar];
        
        //Reutilizar variables
        par = 0;
        impar = 0;
        
        //Almacenar los números pares en su arreglo y los impares también
        for(int i=0;i<10;i++){
            if(arregloPrincipal[i] % 2 == 0){
                arregloPares[par] = arregloPrincipal[i];
                par ++;
            }
            else {
                arregloImpares[impar] = arregloPrincipal[i];
                impar ++;
            }
        }
        
        //Imprimir arreglos
        System.out.println("Arreglo con números pares:");
        for(int i=0;i < par;i++){
            System.out.println(arregloPares[i]);
        }
        
        System.out.println("Arreglo con números impares:");
        for(int i=0;i < impar;i++){
            System.out.println(arregloImpares[i]);
        }
    }
    
}
