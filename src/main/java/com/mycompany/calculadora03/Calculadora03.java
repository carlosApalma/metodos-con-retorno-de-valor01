/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora03;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Calculadora03 {

    public static void main(String[] args) {
          int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita un num 1: "));
          int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita un num 2: "));
        
        Operaciones op=new Operaciones();
        int suma=op.sumar(n1, n2);
        int resta=op.restar(n1, n2);
        int multiplicacion=op.multiplicar(n1,n2);
        int division=op.dividir(n1, n2);
        op.mostrarResultados(suma,resta,multiplicacion,division);
        }
    }

