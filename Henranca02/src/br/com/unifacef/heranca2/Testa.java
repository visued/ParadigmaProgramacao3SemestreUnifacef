/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.heranca2;

import javax.swing.JOptionPane;

/**
 *
 * @author vsued
 */
public class Testa {
    
    public static void mostra(Produto qualquerum){
        JOptionPane.showMessageDialog(null, qualquerum.toString());
    }
    
    public static void main(String[] args) {
        Radio ra = new Radio((float)104.9, "120ghz", 10, 1928272, (float)99.90);
        Tv tv = new Tv(20, 5, 189283, (float)20.99);
        
        mostra(ra);
        mostra(tv);
    
    }
    
}
