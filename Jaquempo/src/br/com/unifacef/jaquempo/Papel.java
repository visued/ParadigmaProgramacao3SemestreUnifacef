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
public class Papel extends Mao{

    public String quemSouEu() {
        return "0";
    }

    @Override
    public String compara(Mao mao) {
        return mao.quemSouEu();
    }

    
}
