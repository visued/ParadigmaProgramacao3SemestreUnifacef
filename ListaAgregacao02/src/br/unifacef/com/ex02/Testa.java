/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unifacef.com.ex02;

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
        Passageiro p1 = new Passageiro("Victor Sued", "4018289846");
        Passageiro p2 = new Passageiro("Goku", "0292734");
        Passageiro p3 = new Passageiro("Gratien", "0292734");
        Passageiro p4 = new Passageiro("Tiazinha", "0292734");
        Passageiro p5 = new Passageiro("Lola", "0292734");
        Passageiro p6= new Passageiro("Sued", "0292734");

        Onibus on1 = new Onibus(1, "Mercedes Benz");
        Onibus on2 = new Onibus(2, "Honda");
        Rodoviaria tiete = new Rodoviaria("Tietê", "São Paulo");
        tiete.adicionaOnibus(on1);
        tiete.adicionaOnibus(on2);
        tiete.adicionaPassageiroOnibus(on1, p1);
        tiete.adicionaPassageiroOnibus(on1, p2);
        tiete.adicionaPassageiroOnibus(on2, p3);
        tiete.adicionaPassageiroOnibus(on2, p5);
        JOptionPane.showMessageDialog(null, tiete.toString());
        on1.removePassageiro(p2);
        JOptionPane.showMessageDialog(null, tiete.toString());
        tiete.atualizaOnibusPassageiro(on1, p6);
        JOptionPane.showMessageDialog(null, tiete.toString());
    }
    
}
