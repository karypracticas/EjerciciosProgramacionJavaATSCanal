package POOVehiculo;

import java.util.Scanner;

/**
 *
 * @author kary
 */

public class Main {
    
    //Prueba de hacer push desde asus
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       String marca,modelo;
       float precio;
       int numeroVehiculos;
       
       System.out.println("Digite la cantidad de vehículos");
       numeroVehiculos = entrada.nextInt();
       
       //Creamos los objetos para los autos
       Vehiculo autos[] = new Vehiculo[numeroVehiculos];
        
       //Llenar el arreglo con la información de los autos
       for(int i=0;i<autos.length;i++){
           System.out.println("Ingrese los datos del auto " + (i+1) + ":");
           System.out.println("Ingrese la marca: ");
           marca = entrada.nextLine();
           System.out.println("Ingrese el modelo: ");
           modelo = entrada.nextLine();
           System.out.println("Ingrese el precio:");
           precio = entrada.nextFloat();
           
           autos[i] = new Vehiculo(marca,modelo,precio);
       }
        
    }
    
}
