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
public class Burbuja {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int miArreglo[], nElementos,aux;
        
        System.out.print("Ingrese la cantidad de elementos que tendrá el arreglo: ");
        nElementos = entrada.nextInt();
        
        miArreglo = new int[nElementos];
        
        //Llenar arreglo
        for(int i=0;i < nElementos; i++){
            System.out.print(i +1 + ". Digite el elemento: ");
            miArreglo[i] = entrada.nextInt();
        }
        
        //Método Burbuja
        for(int i=0;i<nElementos;i++){
            for(int j=0;j<nElementos -1;j++){
                if(miArreglo[j] > miArreglo[j +1]){
                    aux = miArreglo[j];
                    miArreglo[j] = miArreglo[j+1];
                    miArreglo[j+1] = aux;
                }
            }
        }
        
       //Mostrar el arreglo ordenado de forma creciente
        System.out.println("Arreglo ordenado por método burbuja de forma creciente");
       for(int i=0;i<nElementos;i++){
           System.out.print(miArreglo[i] + "-");
       }
    }
    
}
