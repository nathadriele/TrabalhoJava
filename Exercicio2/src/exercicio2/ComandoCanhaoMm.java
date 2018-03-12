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
public class ComandoCanhaoMm implements ComandoEquipamento{
    private CanhaoMm c;
    
    public ComandoCanhaoMm(){
        this.c = new CanhaoMm();
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
