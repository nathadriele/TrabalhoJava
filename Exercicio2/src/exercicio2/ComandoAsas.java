/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Acer
 */
public class ComandoAsas implements ComandoEquipamento{
    private Asas a;
    
    public ComandoAsas(){
        this.a = new Asas();
    }
    
    @Override
    public void Ligar() {
        this.a.Ataque();
    }

    @Override
    public void Desligar() {
        this.a.Cruzeiro();
    }
}
