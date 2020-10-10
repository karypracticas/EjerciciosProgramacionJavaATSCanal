package POOCuadrilatero;

import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */

public class Main {
    public static void main(String[] args) {
    
    Cuadrilatero c1;
    float lado1, lado2;
        
     lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el lado 1: "));
     lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el lado 2: "));
     
     if(lado1 == lado2){ //Es un cuadrado
         c1 = new Cuadrilatero(lado1);
     }
     else { //Es un cuadrilatero
         c1 = new Cuadrilatero(lado1,lado2);
     }
     
        System.out.println("El perímetro es: " + c1.getPerimetro());
        System.out.println("EL área es: " + c1.getArea());
    }
}
