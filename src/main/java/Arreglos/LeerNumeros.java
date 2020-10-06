package Arreglos;

import java.util.Scanner;

/**
 *
 * @author kary
 */
public class LeerNumeros {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[5] ;
        
        //Llenar el arreglo
        for(int i=0;i<5;i++){
            System.out.println((i+1) + ". Digite un número");
            numeros[i] = entrada.nextInt(); 
        } 
        
        //Imprimir arreglo en el orden inverso al introducido
        System.out.println("Imprimir arreglo en el orden inverso al introducido");
        for(int j=4;j>=0;j--){
            System.out.println(numeros[j]);
        } 
        //Imprimir arreglo de acuerdo a como fueron introducidos
        //for(int numero:numeros){
         //   System.out.println("Imprimir arreglo de acuerdo a como fueron introducidos");
           // System.out.println(numero);
        //}  
        
        
        
    }   
}
