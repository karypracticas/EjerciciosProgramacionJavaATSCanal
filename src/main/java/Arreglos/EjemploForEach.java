/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author kary
 */
public class EjemploForEach {
    public static void main(String[] args) {
         String [] nombres = {"Juan", "Pedro", "Luis", "Yiya", "Kary"};
         
         //Método común con for
         for(int i=0;i<nombres.length;i++){
             System.out.println(nombres[i]);
         }
         //For each
         for(String nombre:nombres){
             System.out.println("Nombre: " + nombre);
         }
    }
   
}
