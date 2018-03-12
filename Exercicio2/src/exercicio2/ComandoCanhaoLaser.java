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
public class ComandoCanhaoLaser implements ComandoEquipamento{
    private CanhaoLaser c;
    
    public ComandoCanhaoLaser(){
        this.c = new CanhaoLaser();
    }
    
    @Override
    public void Ligar() {
        this.c.Ativar();
    }

    @Override
    public void Desligar() {
        this.c.Desativar();
    }
    
}
