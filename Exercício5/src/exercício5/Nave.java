/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício5;

/**
 *
 * @author Acer
 */
public class Nave {
    private SistemaAtaque sistemaAtaque;
    
    public Nave(){
        this.sistemaAtaque = new SistemaAtaque();
    }
    
    public void Spawn(){
        sistemaAtaque = new SistemaAtaque();
        
        System.out.println("Spawn!");
    }
    
    public void Atirar(){
        sistemaAtaque.Atirar();
    }
    
    public void PegarPower(int p){
        sistemaAtaque.AcoplarCanhao(p);
    }
}
