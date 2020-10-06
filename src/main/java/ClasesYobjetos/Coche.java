/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

/**
 *
 * @author kary
 */
public class Coche {
    
    //Propiedades
    String color;
    String marca;
    int km;
    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.color = "Negro";
        coche1.marca = "Mazda";
        coche1.km = 90000;
        
        Coche coche2 = new Coche();
        coche2.color = "Gris";
        coche2.marca = "Jeep Sahara";
        coche2.km = 0;
        
        System.out.println("Propiedades del coche1: Color " + coche1.color + " marca " + coche1.marca + " kilometraje " + coche1.km);
        System.out.println("Propiedades del coche2: Color " + coche2.color + " marca " + coche2.marca + " kilometraje " + coche2.km);
    }
    
}
