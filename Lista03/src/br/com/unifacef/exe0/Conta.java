/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unifacef.exe0;

/**
 *
 * @author vsued
 */
public class Conta {
    private String nro, agencia, nome;
    private float saldo;
    
    public Conta(){}
    
    public Conta(String nro, String agencia, String nome, float saldo){
        this.nro = nro;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "nro=" + nro + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
    
}
