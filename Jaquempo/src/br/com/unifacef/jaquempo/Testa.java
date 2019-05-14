/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.jaquempo;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author vsued
 */

public class Testa { 
    public static void mostra(Mao mao){
        //Papel = 0
        //Tesoura = 1
        //Pedra = 2
        Random rd = new Random();
        int random = rd.nextInt(2);
        JOptionPane.showMessageDialog(null, "Computador escolheu: " + random);
        
        if(mao.quemSouEu().equals(Integer.toString(random))){
            JOptionPane.showMessageDialog(null, "Empate!");
        }else if(mao.quemSouEu().equals("1") && random == 0 || mao.quemSouEu().equals("0") && random == 1 ){
            JOptionPane.showMessageDialog(null, "Tesoura ganha!");
        }else if(mao.quemSouEu().equals("2") && random == 1 || mao.quemSouEu().equals("1") && random == 2){
            JOptionPane.showMessageDialog(null, "Pedra ganha!");
        }else if(mao.quemSouEu().equals("0") && random == 2 || mao.quemSouEu().equals("2") && random == 0){
            JOptionPane.showMessageDialog(null, "Papel ganha!");
        }
        
        
        
        
//        if(mao.quemSouEu().equals(random)){
//            
//            JOptionPane.showMessageDialog(null, "Empate");
//        }
        
    }
    
    public static void main(String[] args) {
        Papel papel = new Papel();
        Tesoura tesoura = new Tesoura();
        Pedra pedra = new Pedra();

//        ImageIcon papel0 = new ImageIcon("src/br/com/unifacef/jaquempo/images/papel.jpg");
//        ImageIcon tesoura0 = new ImageIcon("src/br/com/unifacef/jaquempo/images/tesoura.jpg");
//        ImageIcon pedra0 = new ImageIcon("src/br/com/unifacef/jaquempo/images/pedra.jpg");
//        String[] options = {"I adore turtles", "Yes", "Maybe", "Urm...", "No", "Hate them"};
        String escolha = (String)JOptionPane.showInputDialog(null,"Escolha\n0 - Papel\n1 - Tesoura\n2 - Pedra");
        //String n = (String)JOptionPane.showInputDialog(null, "Do you like turtles??", "I like turtles", JOptionPane.QUESTION_MESSAGE, pedra0, options, options[2]);
        //Papel = 0
        //Tesoura = 1
        //Pedra = 2       
        if(escolha.equals("0")){
            mostra(papel);
        }else if(escolha.equals("1")){
            mostra(tesoura);
        }else mostra(pedra);
        
    }
    
}
