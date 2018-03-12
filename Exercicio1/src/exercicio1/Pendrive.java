/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Pendrive {
    List<Conexao> Conexoes = new LinkedList<Conexao>();
    Joystick joystick;
        int contador = 0;
        
    public void add(){
        Conexao c;
        if (contador < 3) {
            if(contador == 0){
                c = joystick.getInstancia();
                System.out.println("Joystick colocado!");
            }else{
                c = new Conexao();
                System.out.println("Outro dispositivo colocado!");
            }
            Conexoes.add(contador,c);
            System.out.println("Conectado!");
            contador++;
        }else
            System.out.println("Conexões esgotadas!");
    }
}
