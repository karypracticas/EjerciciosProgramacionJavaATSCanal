/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosOrdenamiento;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Insercion {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int miArreglo[],nElementos,posicion,aux;
        
        System.out.print("Ingrese la cantidad de enteros a guardar en el arreglo: ");
        nElementos = entrada.nextInt();
        miArreglo = new int[nElementos];
        
        //Llenar arreglo
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1) + ". Digite el número:");
            miArreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por inserción
        for(int i=0;i<nElementos;i++){
          posicion = i;
          aux = miArreglo[posicion];
          
          while((posicion > 0) && (miArreglo[posicion - 1] > aux) ){
              miArreglo[posicion] = miArreglo[posicion - 1];
              posicion --;
          }
          miArreglo[posicion] = aux;
         
        }
        
        //Imprimir arreglo
        System.out.print("Orden Ascendente:");
        for(int i=0;i<nElementos;i++){
            System.out.print(miArreglo[i] + " - ");
        }
    }
    
}
