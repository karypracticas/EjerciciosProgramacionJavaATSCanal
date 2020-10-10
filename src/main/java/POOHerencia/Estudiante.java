package POOHerencia;

/**
 *
 * @author Karina
 */

//Subclase o Clase hija
public class Estudiante extends Persona {
    
    //Atributos
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad); //Estos ya están inicializados en el constructor de la clase padre.
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
 
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() +
                           "\nApellido: " + getApellido() +
                           "\nEdad: " + getEdad() +
                           "\nCodigo: " + codigoEstudiante +
                           "\nNota Final: " + notaFinal);
    }
    
}
