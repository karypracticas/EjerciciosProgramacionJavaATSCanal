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
public class MayorAmenor {
    
    int primerNumero,segundoNumero,tercerNumero,numerosOrdenados;
   
    
    public void ordenarNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        primerNumero = sc.nextInt();
        System.out.println("Segundo número");
        segundoNumero = sc.nextInt();
        System.out.println("Tercer número");
        tercerNumero = sc.nextInt();
        
        if ((primerNumero > segundoNumero) && (primerNumero > tercerNumero) ) {
            System.out.println("El primer numero es el mayor");
        }
        else if ((segundoNumero > primerNumero) && (segundoNumero > tercerNumero)) {
            System.out.println("El segundo número es el mayor");
        }
    
        else {
            System.out.println("El tercer número es el mayor");
        }     
    }
    
    public static void main(String[] args) {
        MayorAmenor obj = new MayorAmenor();
        obj.ordenarNumeros();
    }
    
}
