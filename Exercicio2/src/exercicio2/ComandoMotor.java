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
public class ComandoMotor implements ComandoEquipamento{
    private Motor motor;
    
    public ComandoMotor(){
        motor = new Motor();
    }
    
    @Override
    public void Ligar() {
        this.motor.LigarMotor();
    }

    @Override
    public void Desligar() {
        this.motor.DesligarMotor();
    }
    
}
