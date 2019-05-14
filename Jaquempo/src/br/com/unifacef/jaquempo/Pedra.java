/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.jaquempo;

/**
 *
 * @author vsued
 */
public class Pedra extends Mao{

//    public String compara(Mao mao) {
//        if(mao.equals("0")){
//            return "Pedra perdeu!";
//        }
//        else if(mao.equals("1")){
//            return "Empate!";
//        }else return "Pedra ganhou!";
//    }

    public String quemSouEu() {
        return "2";
    }

    @Override
    public String compara(Mao mao) {
        return mao.quemSouEu();
    }  
}
