/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unifacef.com.ex02;

import java.util.ArrayList;

/**
 *
 * @author victor-sued
 */
public class Onibus {
    private int numero;
    private String marca;
    private ArrayList<Passageiro> passageiro;

    public Onibus(int numero, String marca) {
        this.numero = numero;
        this.marca = marca;
        this.passageiro = new ArrayList();
    }

    public Onibus() {
        this.passageiro = new ArrayList();    
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void adicionaPassageiro(Passageiro passageiro) {
        this.passageiro.add(passageiro);    
    }

    public boolean removePassageiro(Passageiro passageiro) {
        return this.passageiro.remove(passageiro);
    }

    @Override
    public String toString() {
        return "\nOnibus{" + "numero=" + numero + ", marca=" + marca + ", passageiro=" + passageiro + '}';
    }

    
//    public int buscaPassageiro(String cpf) {
//        for (int i = 0; i < this.passageiro.size(); i++) {
//            if (this.passageiro.get(i).getCpf() == cpf) {
//                return i;
//            }
//        }
//        return -1;
//    }
//    
    public int buscaPassageiroPosicao(String cpf) {
        for (int i = 0; i < this.passageiro.size(); i++) {
            if (this.passageiro.get(i).getCpf() == cpf) {
                return i;
            }
        }
        return -1;
    }    
    
    public boolean atualizaPassageiro(Passageiro novo){
        int pos = this.buscaPassageiroPosicao(novo.getCpf());
        if(pos != -1){
            this.passageiro.set(pos, novo);
            return true;
        }
        else return false;
    }
    
    
           
}
