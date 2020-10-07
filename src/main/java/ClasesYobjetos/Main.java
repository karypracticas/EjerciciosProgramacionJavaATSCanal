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
public class Main {
    public static void main(String[] args) {
        
        //Instanciar la clase Operacion
        Operacion misOperaciones = new Operacion();
        
        //Invocar los métodos de la clase
        misOperaciones.leerNumeros();
        misOperaciones.sumar();
        misOperaciones.restar();
        misOperaciones.multiplicar();
        misOperaciones.dividir();
        misOperaciones.imprimirResultados();
        
    }
}
