/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasprogramacionats;

import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class CompraSuper {
    
     public static void main(String[] args) {
        int montoCompra,montoApagar;
        
        montoCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de su compra"));
        
        
        if(montoCompra > 300){
            JOptionPane.showMessageDialog(null, "Ya que su compra es mayor a $300, usted se hizo acreedor a un descuento del 20%, su monto total a pagar es de: $" + (montoCompra - (montoCompra * .20)));
        }
       else {
            JOptionPane.showMessageDialog(null, "Su monto a pagar es de: $" + montoCompra);
        }            
    }  
}
