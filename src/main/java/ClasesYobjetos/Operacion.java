/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */
public class Operacion {
    
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    //Método para leer los dos números que se piden al usuario
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));
    }
    
    public void sumar(){
        suma = numero1 + numero2;
    }
    
    public void restar(){
        resta = numero1 - numero2;
    }
    
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    
    public void dividir(){
        division = numero1 / numero2;
    }
    
    public void imprimirResultados(){
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
    }   
}


