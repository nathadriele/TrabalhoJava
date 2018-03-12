/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
DECORATOR
 */
package exercício5;

/**
 *
 * @author Acer
 */
public class Exercício5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nave nave = new Nave();
        
        nave.Atirar();
        nave.PegarPower(0);
        nave.Atirar();
        nave.PegarPower(2);
        nave.Atirar();
        nave.PegarPower(3);
        nave.Atirar();
        nave.PegarPower(4);
        nave.Atirar();
        nave.PegarPower(5);
        nave.Atirar();
        
        nave.Spawn();
        nave.Atirar();
    }
    
}
