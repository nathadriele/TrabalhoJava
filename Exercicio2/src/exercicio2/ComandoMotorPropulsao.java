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
public class ComandoMotorPropulsao implements ComandoEquipamento{
    

    @Override
    public void Ligar() {
        System.out.println("Motor de Propulsão ligado com sucesso!");
    }

    @Override
    public void Desligar() {
        System.out.println("Motor de Propulsão deslugado com sucesso!");
    }
    
}
