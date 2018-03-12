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
public class CarregadorEquipamento {
    public ComandoEquipamento getComando(int x){
        ComandoEquipamento comando;
        switch(x){
            case (1):
                comando = new ComandoCanhaoLaser();
                break;
            case (2):
                comando = new ComandoMotorPropulsao();
                break;
            case (3):
                comando = new ComandoMotor();
                break;
            case (4):
                comando = new ComandoAsas();
                break;
            case (5):
                comando = new ComandoMotorArranque();
                break;
            case (6):
                comando = new ComandoCanhaoMm();
                break;
            default:
                comando = new ComandoMotor();
        }
        return comando;
    }
    public int getTotalComandos(){
        return (6);
    }
}
