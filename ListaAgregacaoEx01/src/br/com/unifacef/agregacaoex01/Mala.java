/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.agregacaoex01;

/**
 *
 * @author vsued
 */
public class Mala {
    private int codigo;
    private float peso;
    private String cor;

    public Mala() {
    }

    public Mala(int codigo, float peso, String cor) {
        this.codigo = codigo;
        this.peso = peso;
        this.cor = cor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\nMala{" + "codigo=" + codigo + ", peso=" + peso + ", cor=" + cor + '}';
    }
    
    
    
}
