/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.agregacaoex01;

import java.util.ArrayList;

/**
 *
 * @author victor-sued
 */
public class Passageiro {

    private String nome;
    private String cpf;
    private ArrayList<Mala> malas;

    public Passageiro() {
        this.malas = new ArrayList();
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.malas = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + ", malas=" + malas + '}';
    }


    public void adicionaMala(Mala ... mala) {
        for(int i = 0; i < mala.length; i++){
            this.malas.add(mala[i]);
        }
        
    }

    public boolean removeMala(Mala mala) {
        return this.malas.remove(mala);
    }

    public int buscaMala(int codigo) {
        for (int i = 0; i < this.malas.size(); i++) {
            if (this.malas.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean atualizaMala(Mala nova){
        int pos = this.buscaMala(nova.getCodigo());
        if(pos != -1){
            this.malas.set(pos, nova);
            return true;
        }
        else return false;
    }
}