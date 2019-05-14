/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe0;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vsued
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta("123-4", "567-8", "Sued", 2000);
        Cartao cartao = new Cartao(123, 1234, 6666, "Visa", new Date(), conta);

        JOptionPane.showMessageDialog(null, cartao.toString());

        if (!cartao.saque(800, 6666)) {
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        } else {
            JOptionPane.showMessageDialog(null, cartao.toString());
        }
    }

}
