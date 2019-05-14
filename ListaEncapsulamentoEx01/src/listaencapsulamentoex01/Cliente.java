/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencapsulamentoex01;

/**
 *
 * @author vsued
 */
public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public Cliente(){}
    
    public void realizarDeposito(float x){
        this.saldo = this.saldo + x;
    
    }
    
    public void realizarSaque(float x){
        this.saldo = this.saldo - x;
    }
    
    public String mostrar(){
        return "Conta: " + this.numeroConta + "\n" 
             + "Agência: " + this.numeroAgencia +"\n" 
             + "Nome: " + this.nome + "\n" 
             + "Saldo: " + this.saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if((numeroConta.length() == 8) && (numeroConta.startsWith("-", 6))){
            this.numeroConta = numeroConta;
        }else{
            this.numeroConta = "Conta inválido";
        }
        
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if((numeroAgencia.length() == 6) && (numeroAgencia.startsWith("-", 4))){
            this.numeroAgencia = numeroAgencia;
        }else{
            this.numeroAgencia = "Número inválido";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }else{
            this.nome = "Nome inválido";
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
