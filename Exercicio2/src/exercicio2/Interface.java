/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Interface {
    ArrayList<ComandoEquipamento> comandos;
    
    CarregadorEquipamento c;
    
    public Interface(){
        this.comandos = new ArrayList<>();
        c = new CarregadorEquipamento();
    }
    
    public void MontarComandos(){
        int x = c.getTotalComandos();
        for (int i = 0; i < x; i++) {
            comandos.add(i, c.getComando(i));
        }
        
    }
    
    public void ligarEquipamento(int tipoEquip){
        comandos.get(tipoEquip).Ligar();
    }
    public void desligarEquipamento(int tipoEquip){
        comandos.get(tipoEquip).Desligar();
    }
}
