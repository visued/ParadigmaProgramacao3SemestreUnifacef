/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author vsued
 */
public class Lista_Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto obj1 = new Produto(1, (float) 9.00, 10);
        obj1.comprar(20);
        obj1.vender(10);
        obj1.subir(100);
        obj1.descer(10);
        JOptionPane.showMessageDialog(null, obj1.mostra());
    }
    
}
