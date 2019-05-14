/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.carro;

/**
 *
 * @author vsued
 */
public class Ex01Carro {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Carro obj1 = new Carro(10, true);
        Carro obj2 = new Carro(0, false);
        obj1.acelerar(10);
        obj2.ligar();
        obj2.acelerar(60);
        
    }
    
    
}
