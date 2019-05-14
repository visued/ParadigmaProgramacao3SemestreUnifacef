/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.heranca2;

/**
 *
 * @author vsued
 */
public class Tv extends Produto{
    private int canal;

    public Tv(int canal, int volume, int serial, float preco) {
        super(volume, serial, preco);
        this.canal = canal;
    }

    public Tv() {
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Tv{" + "canal=" + canal + super.toString() +'}';
    }
    
    
    
}
