package ClasesYobjetos;

/**
 *
 * @author kary
 */

public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    
    //Método Constructor
    public Persona(String nombre,int edad){
        this.nombre = nombre; //Al utilizar "this" le indica al método que se trata del atributo de la clase, no del parámetro del método.
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("ELa edad es: " + edad);
    }
    
    public static void main(String[] args) {
        Persona yiya = new Persona("Yiya", 34);
        yiya.mostrarDatos();
    }
    
}
