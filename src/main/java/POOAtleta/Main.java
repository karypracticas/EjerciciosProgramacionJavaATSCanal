package POOAtleta;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Main {
    
      public static int atletaGanador(Atleta atletas[]){
        float tiempo;
        int indice = 0;
        
        
        tiempo = atletas[0].getTiempoCarrera();
        for(int i=1;i<atletas.length;i++){
            if(atletas[i].getTiempoCarrera()<tiempo){
                tiempo = atletas[i].getTiempoCarrera();
                indice = i;
                
            }
        }
        
        return indice;
    }
    
    public static void main(String[] args) {
        
        int cantidadAtletas,numero,indiceGanador;
        String nombre;
        float tiempo;
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la cantidad de atletas participantes: ");
        cantidadAtletas = entrada.nextInt();
        
        //Creación de objetos que se guardarán en un arreglo
        Atleta atletas[] = new Atleta[cantidadAtletas];
        for(int i=0;i<atletas.length;i++){
            System.out.println("Ingrese los datos del atleta " + (i+1) + " :");
            System.out.print("Número: ");
            numero = entrada.nextInt();
            
            System.out.print("Nombre: ");
            entrada.nextLine(); //Se agrega esta línea para limpiar el buffer de la clase Scanner, después de haber pedido un int y después solicitar un string
            nombre = entrada.nextLine();
            System.out.print("Tiempo de carrera: ");
            tiempo = entrada.nextFloat();
            
            atletas[i] = new Atleta(numero,nombre,tiempo);
        }
        
         indiceGanador = atletaGanador(atletas);
        System.out.println("El corredor más veloz es : ");
        System.out.println(atletas[indiceGanador ].mostrarDatos());
        
    }
    
}
