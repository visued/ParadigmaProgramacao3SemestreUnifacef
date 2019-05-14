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
public class Rodoviaria {

    private String nome, cidade;
    private ArrayList<Onibus> onibus;

    public Rodoviaria(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = new ArrayList();

    }

    public Rodoviaria() {
        this.onibus = new ArrayList();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Rodoviaria{" + "nome=" + nome + ", cidade=" + cidade + ", onibus=" + onibus + '}';
    }

    public int obterOnibus(int numero) {
        for (int i = 0; i < this.onibus.size(); i++) {
            if (this.onibus.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    public void adicionaOnibus(Onibus onibus) {
        this.onibus.add(onibus);
    }

    public void adicionaPassageiroOnibus(Onibus on, Passageiro pas) {
        int pos = this.obterOnibus(on.getNumero());
        if (pos != -1) {
            on.adicionaPassageiro(pas);
        }
    }

    public boolean atualizaOnibus(Onibus on) {
        int pos = this.obterOnibus(on.getNumero());
        if (pos != -1) {
            this.onibus.set(pos, on);
            return true;
        } else {
            return false;
        }
    }

    public boolean atualizaOnibusPassageiro(Onibus on, Passageiro pas) {
        int pos = this.obterOnibus(on.getNumero());
        if (pos != -1) {
            return on.atualizaPassageiro(pas);      
        } else {
            return false;
        }
    }

    public void removeOnibus(Onibus onibus) {
        this.onibus.remove(onibus);
    }

    public boolean removeOnibusPassageiro(Onibus on, Passageiro pas) {
        int pos = this.obterOnibus(on.getNumero());
        if (pos != -1) {
            return on.removePassageiro(pas);
        } else {
            return false;
        }
    }
}
