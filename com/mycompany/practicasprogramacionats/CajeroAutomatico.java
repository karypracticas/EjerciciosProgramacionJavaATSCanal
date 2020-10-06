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
public class CajeroAutomatico {
    public static void main(String[] args) {
        int saldo=1000;
        int ingresar,retirar,salir,opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Ingresar, 2. Retirar, 3. Salir"));

        if(opcion == 1) {
            ingresar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea ingresar: "));
            saldo += ingresar;
            JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo);  
            }else if(opcion == 2){
                retirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar: "));
                if (retirar <= saldo){
                saldo -= retirar;
                JOptionPane.showMessageDialog(null, "Su saldo actual es de: " + saldo);    
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente"); 
                }
            } else if(opcion == 3) {
                
            }        
        }
    }    
    

