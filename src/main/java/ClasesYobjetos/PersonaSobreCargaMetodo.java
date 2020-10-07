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
public class PersonaSobreCargaMetodo {
    
    String nombre;
    int edad;
    String ine;
    
    //Método constructor

    public PersonaSobreCargaMetodo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Sobrecarga de método constructor

    public PersonaSobreCargaMetodo(String ine) {
        this.ine = ine;
    }

    //Sobrecarga de método normal
    
    public void correr(){
        System.out.println("Soy " + nombre + " y mi edad es " + edad +" años, y estoy corriendo un maratón");
    }
    
    public void correr(int km){
        System.out.println("He corrido " + km + " kilometros y mi ine es " + ine);
    }
    
    public static void main(String[] args) {
        
        PersonaSobreCargaMetodo kary =  new PersonaSobreCargaMetodo("Kary" ,34);
        kary.correr(40);
        kary.correr();     
        
        PersonaSobreCargaMetodo kary2 =  new PersonaSobreCargaMetodo("ROAK860923");
        kary2.correr(100);
    }  
}
