/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe0;

import javax.swing.JOptionPane;

/**
 *
 * @author vsued
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno("13456", 7);
        System.out.println(aluno.passou());
        System.out.println(aluno.qualCurso());
        
        
    }
    
}
