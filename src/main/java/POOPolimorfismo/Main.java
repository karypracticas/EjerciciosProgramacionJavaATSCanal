/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOPolimorfismo;

/**
 *
 * @author Karina
 */
public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("ABCD", "Mazda", "ZoomZoom");
        misVehiculos[1] = new VehiculoTurismo("DEFG", "Audi", "A89", 1);
        misVehiculos[2] = new VehiculoDeportivo("HIJK", "Mazda" , "M90", 2);
        misVehiculos[3] = new VehiculoFurgoneta("LMNÑ", "Jeep" ,"Sahara",200 );
        
        //Imprimir arreglo
        for(Vehiculo autoIterador: misVehiculos){
            System.out.println(autoIterador.mostrarDatos());
        }
        
    }
    
}
