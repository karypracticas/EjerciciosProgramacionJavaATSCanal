package POOVehiculo;

import java.util.Scanner;

/**
 *
 * @author kary
 */

public class Main {
    
    public static int indiceAutoMBarato(Vehiculo autos[]){
        float precio;
        int indice = 0;
        
        precio = autos[0].getPrecio();
        for(int i=1;i<autos.length;i++){
            if(autos[i].getPrecio()<precio){
                precio = autos[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    }
    
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       String marca,modelo;
       float precio;
       int numeroVehiculos,indiceBarato;
       
       System.out.print("Digite la cantidad de vehículos:");
       numeroVehiculos = entrada.nextInt();
       
       //Creamos los objetos para los autos
       Vehiculo autos[] = new Vehiculo[numeroVehiculos];
        
       //Llenar el arreglo con la información de los autos
       for(int i=0;i<autos.length;i++){
           entrada.nextLine();
           System.out.println("Ingrese los datos del auto " + (i+1) + ":");
           System.out.print("Ingrese la marca: ");
           marca = entrada.nextLine();
           System.out.print("Ingrese el modelo: ");
           modelo = entrada.nextLine();
           System.out.print("Ingrese el precio:");
           precio = entrada.nextFloat();
           
           autos[i] = new Vehiculo(marca,modelo,precio);
       }
       
       indiceBarato = indiceAutoMBarato(autos);
        System.out.println("El auto más barato es: ");
        System.out.println(autos[indiceBarato].mostrarDatos());
        
    }
    
}
