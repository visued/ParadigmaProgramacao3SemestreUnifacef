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
public class Aluno {

    private String codigo;
    private float nota;

    public Aluno(String codigo, float nota) {
        this.setCodigo(codigo);
        this.setNota(nota);
    }

    public String passou() {
        if (this.nota >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String qualCurso() {
        if(this.codigo.startsWith("1")){
            return "SI";
        }else if(this.codigo.startsWith("2", 2)){
            return "ES";
        }else return "Não importa";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.length() == 5){
            this.codigo = codigo;
        }
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        if((nota >= 0) && (nota <=10)){
            this.nota = nota;
        }else System.out.println("Nota inválida!");
    }
    
    
}
