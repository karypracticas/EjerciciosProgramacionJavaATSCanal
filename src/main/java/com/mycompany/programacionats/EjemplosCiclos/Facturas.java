/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programacionats.EjemplosCiclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kary
 */
public class Facturas {
    
    public static void main(String[] args) {
        
        int codigoArticulo;
        int precioLitro = 0;
        int litrosVendidoFactura = 0;
        int facturacionTotal = 0;
        int facturasMayores600 = 0;
        int costoVenta = 0;
        
        for(int i = 1; i <= 5;i++) {
       JOptionPane.showMessageDialog(null, "Introduce los datos de la factura " + i);
       litrosVendidoFactura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de litros vendidos en esta factura: "));
       precioLitro = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio por litro: "));  

            costoVenta = litrosVendidoFactura * precioLitro;
            
            if(costoVenta > 600){
                facturasMayores600 ++;
            }
            
            litrosVendidoFactura += litrosVendidoFactura;
            costoVenta += costoVenta;
        }
        
        JOptionPane.showMessageDialog(null, "La facturación total es: " + costoVenta);
        JOptionPane.showMessageDialog(null, "El total de litros vendidos es igual a: " + litrosVendidoFactura);
        JOptionPane.showMessageDialog(null, "Las facturas que tuvieron un total mayor a $600, fueron: " + facturasMayores600);
        JOptionPane.showMessageDialog(null, "Fin del resumen de facturas :)");
    }  
}
