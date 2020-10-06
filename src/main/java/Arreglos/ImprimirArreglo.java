/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */
public class ImprimirArreglo {
    public static void main(String[] args) {
        
      
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        //Solicitar al usuario la cantidad de elementos a ingresar en arreglo
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de letras que desea mostrar en el arreglo"));
        
        //Crear aareglo, pasando la variable nElementos como tamaño de arreglo
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos del arreglo");
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1) + ". Digite un caracter: ");
            //Llenar arreglo letras, el iterador i , se pone entre corchetes para indicar la posición en la que se guardará cada elemento
            letras[i] = entrada.next().charAt(0);
        }
        
        //Recorrer e imprimir el arreglo para mostrar los elementos previamente agregados
        System.out.println("Los caracteres del arreglo son: ");
        for(int i=0;i<nElementos;i++){
            System.out.println(letras[i]+" ");
        }   
    }
}
