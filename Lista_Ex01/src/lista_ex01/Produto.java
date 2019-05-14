/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_ex01;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author vsued
 */
public class Produto {
    private int id;
    private float preco;
    private int qtd;
    private String descricao;

    NumberFormat formatter = new DecimalFormat("#0.00");
    
    //Classe com parâmetros
    public Produto(int id, float preco, int qtd){
        this.id = id;
        this.preco = preco;
        this.qtd = qtd;
        this.descricao = descricao;

    }
    
    //Classe sem parâmetro inicia as variaveis com valor pre definido.
    public Produto(){
        this.id = 1;
        this.preco = 100;
        this.qtd = 200;
    }
    
    //metodo comprar incrementa o estoque.
    public void comprar(int x){
        this.qtd = this.qtd + x;
    }
    
    //metodo vender decrementa o estoque.
    public void vender(int x){
        this.qtd = this.qtd - x;
    }
    
    //metodo subir, aumenta o preço do produto.   
    public void subir(float x){
        this.preco = this.preco + x;
    }

    //metodo descer, diminui o preço do produto.
    public void descer(int x){
        this.preco = this.preco - x;
    }
    
    //metodo mostrar
    public String mostra(){
        return "Id Produto: " + this.id + "\n" + "Qtd Estoque: " + this.qtd + "\n" + "Preço do Produto: R$" + formatter.format(this.preco);
    }
    
}
