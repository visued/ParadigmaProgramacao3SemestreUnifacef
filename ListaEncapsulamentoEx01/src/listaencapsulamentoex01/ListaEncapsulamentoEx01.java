/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencapsulamentoex01;

import javax.swing.JOptionPane;

/**
 *
 * @author vsued
 */
public class ListaEncapsulamentoEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("12345608", "123898", "Sued", 90);
        Cliente cliente = new Cliente("123456-8", "1238-8", "Sued", 90);
        JOptionPane.showMessageDialog(null,cliente.mostrar());
    }
    
}
