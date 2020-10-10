package POOVehiculo;

/**
 *
 * @author kary
 */

public class Vehiculo {
    
    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    //Método constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca " + marca + " Modelo " + modelo + " precio $" + precio;
    }   
}
