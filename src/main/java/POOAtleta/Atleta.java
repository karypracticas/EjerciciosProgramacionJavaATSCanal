package POOAtleta;

/**
 *
 * @author Karina
 */
public class Atleta {
    
    //Atributos
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;
    
    //Método Constructor

    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    public String mostrarDatos(){
        return "número del atleta " + numeroAtleta + " nombre " + nombre + " tiempo realizado en la carrera " + tiempoCarrera;
    }
    
    
}
