/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.agregacaoex01;

import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author victor-sued
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("Victor Sued", "401.825.898-46");
        Voo voo = new Voo("New York", "15478");
        Reserva reserva = new Reserva(1258, new Date(), passageiro, voo); 
        voo.setDestino("São Joaquim da barra!");
        Mala m1 = new Mala(1, 10, "Rosa");
        Mala m2 = new Mala(2, 12, "Azul");
        Mala m3 = new Mala(3, 5, "Azul");
        
        
        //C - Create
        passageiro.adicionaMala(m1);
        JOptionPane.showMessageDialog(null, passageiro.toString());
        
        //D = Delete
        passageiro.adicionaMala(m2);
        JOptionPane.showMessageDialog(null, passageiro.toString());
        
        //U = Update
        Mala m4 = new Mala(3, 5, "Azul");
        passageiro.adicionaMala(m3);
        JOptionPane.showMessageDialog(null, passageiro.toString());        
    }
    
}
