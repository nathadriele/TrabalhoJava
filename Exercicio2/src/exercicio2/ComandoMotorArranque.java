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
public class ComandoMotorArranque implements ComandoEquipamento{
    private MotorArranque m;
    
    public ComandoMotorArranque(){
        this.m = new MotorArranque();
    }
            
    @Override
    public void Ligar() { 
       this.m.Ativar();
    }

    @Override
    public void Desligar() {
        this.m.Desativar();
    }
    
}
