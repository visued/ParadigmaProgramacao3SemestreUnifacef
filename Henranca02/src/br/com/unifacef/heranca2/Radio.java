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
public class Radio extends Produto{
    private float estacao;
    private String banda;

    public Radio(float estacao, String banda, int volume, int serial, float preco) {
        super(volume, serial, preco);
        this.estacao = estacao;
        this.banda = banda;
    }

    public Radio() {
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "Radio{" + "estacao=" + estacao + ", banda=" + banda + super.toString() +'}';
    }
    
    
    
}
