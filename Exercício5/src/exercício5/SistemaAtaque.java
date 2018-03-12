/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício5;

/**
 *
 * @author Acer
 * FAZER DECORATOR
 */
public class SistemaAtaque {
    public Buster buster;
    public Canhao canhao;
    
    public SistemaAtaque(){
        buster = new Buster();
        canhao = null;
    }
    
    public void Atirar(){
        buster.Atirar();
        if (canhao != null) {
            canhao.Atirar();
        }
    }
    public void AcoplarCanhao(int c){
        switch(c){
            case 1:{
                canhao = new ObusLeve();
            }
            case 2:{
                canhao = new ObusMedio();
            }
            case 3:{
                canhao = new ObusPesado();
            }
            case 4:{
                canhao = new LaserMedio();
            }
            case 5:{
                canhao = new LaserPesado();                
            }
            default :{
                canhao = new ObusLeve();
            }
        }
    }
}
