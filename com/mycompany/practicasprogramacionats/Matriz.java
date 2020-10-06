/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasprogramacionats;

/**
 *
 * @author Karina
 */
public class Matriz {
    
    public static void main(String[] args) {
        //Creación de una matriz de 3x3
        
        int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<3;i++){ //Número de filas
            for(int j=0;j<3;j++){ //Número de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
