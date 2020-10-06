/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosordenados;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */
public class MatrizSimetricaOno {
    //56. Crear y cargar una matriz de tamaño n x m y decidir si es simétrica o no
    
    public static void main(String[] args) {
   
    Scanner entrada =  new Scanner(System.in);
    int matriz[][], nFilas,nColumnas;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Número de filas:"));
    nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Número de Columnas:"));
    matriz = new int[nFilas][nColumnas];
    
    //Llenar arreglo
    //TODO: Verificar este ciclo
        System.out.println("Digite Matriz: ");
    for(int i=0; i<nFilas;i++){
        for(int j=0; j<nColumnas;j++){
            System.out.print("Matriz ["+i+"]["+j+"]: ");
            matriz[i][j] = entrada.nextInt();
        }
    }
    
    
    //Imprimir matriz
      System.out.print("Imprimir Matriz");
    for(int i=0; i<nFilas;i++){ //Filas
        for(int j=0; j<nColumnas;j++){ //Columnas
            System.out.println(matriz[i][j]);
        }
        System.out.println("");
    } 
  } 
}
