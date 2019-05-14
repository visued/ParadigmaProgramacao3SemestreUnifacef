/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.agregacaoex01;

/**
 *
 * @author victor-sued
 */
public class Voo {
    private String destino;
    private String numero;

    public Voo() {
    }

    public Voo(String destino, String numero) {
        this.destino = destino;
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Voo{" + "destino=" + destino + ", numero=" + numero + '}';
    }
    
    
}
