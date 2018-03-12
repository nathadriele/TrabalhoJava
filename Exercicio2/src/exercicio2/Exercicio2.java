/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
/* Em um game mobile, são apresentados na tela do jogo diversos botões diferentes, os
quais podem assumir dois estados diferentes: ON – OFF. Esses controles são configuráveis, 
ou seja, o jogador pode atribuí-los a comandos de equipamentos diferenciados durante o jogo,
como por exemplo, motor de arranque, motor, canhão laser, canhão de 20mm, motores de propulsão
com velocidade configurável, controle das asas das naves, com configuração Cruzeiro e Ataque.
Crie o modelo e o código de um padrão que resolva essa atribuição a esse diferente conjunto de
elementos. OBSERVAÇÃO: com o sucesso do jogo, novos elementos podem ser inseridos, com controles 
específicos mas mantendo a mesma interface.*/
/**
 *
 * @author Acer
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     * ARRUMAR OS ON OFF
     */
    public static void main(String[] args) {
        Interface i = new Interface();
        i.MontarComandos();
        i.ligarEquipamento(0);
        i.desligarEquipamento(0);
        i.ligarEquipamento(1);
        i.desligarEquipamento(1);
        i.ligarEquipamento(2);
        i.desligarEquipamento(2);
        i.ligarEquipamento(3);
        i.desligarEquipamento(3);
        i.ligarEquipamento(4);
        i.desligarEquipamento(4);
        i.ligarEquipamento(5);
        i.desligarEquipamento(5);
    }
    
}
