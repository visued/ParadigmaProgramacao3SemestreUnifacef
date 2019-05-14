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
public class Tesoura extends Mao{

//    @Override
//    public String compara(Mao mao) {
//        if(mao.equals("0")){
//            return "Tesoura ganha!";
//        }
//        else if(mao.equals("1")){
//            return "Tesoura perdeu!";
//        }else return "Empate!";
//    }
    public String quemSouEu() {
        return "1";
    }

    @Override
    public String compara(Mao mao) {
        return mao.quemSouEu();
    }
}
