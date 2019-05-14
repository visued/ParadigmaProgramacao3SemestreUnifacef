/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.carro;

import javax.swing.JOptionPane;

/**
 *
 * @author vsued
 */
public class Carro {
    private float vel;
    private boolean motor;
    
    public Carro(float vel, boolean motor){
        this.vel = vel;
        this.motor = motor;
    }
    
    public void ligar(){
        this.motor = true;
        JOptionPane.showMessageDialog(null,"Motor: ligado! ");
    }
    
    public void desligar(){
        if(this.motor == true && this.vel <= 0){
            JOptionPane.showMessageDialog(null,"Motor: desligado! ");
        }else{
            JOptionPane.showMessageDialog(null,"Motor: você precisa frear antes de desligar, velocidade atual " + this.vel + " KM/h");
        }
        
    }
    
    public void acelerar(float x){
        if(this.motor != false){
            this.vel = this.vel + x;
            JOptionPane.showMessageDialog(null,"Acelerando carro: velocide atual " + this.vel + " KM/h");
        }else{
            JOptionPane.showMessageDialog(null,"Freando carro: você precisa ligar o carro antes para acelerar!");
        }
            
    }
    
    public void frear(float x){
        this.vel = this.vel - x;
        if(this.motor != false){
            if(this.vel > 0){
                JOptionPane.showMessageDialog(null,"Freando carro: velocidade atual " + this.vel + " KM/h");
            }else if(this.vel < 0) {
                JOptionPane.showMessageDialog(null,"Freando carro: valor digitado maior que a velocidade atual!!");
            }else if(this.vel == 0){
                JOptionPane.showMessageDialog(null,"Freando carro: velocidade atual " + this.vel + " KM/h");
            }else{
                JOptionPane.showMessageDialog(null,"Freando carro: você precisa ligar o carro e acelerar antes para frear!!! ");
            }
        }
        
    }
    
}
