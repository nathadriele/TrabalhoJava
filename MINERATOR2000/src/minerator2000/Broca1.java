/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerator2000;

/**
 *
 * @author Tamara
 */
public class Broca1 {
    private ConfiguracaoBroca b;    
    
    public Broca1 (ConfiguracaoBroca broca) {        
        this.b = new ConfiguracaoBroca(broca.rpm, broca.bar);
    }    
    public void rpm () {
        System.out.println ("Broca 1 : Perjuração do rpm concluida com rpm "+b.rpm);    
    }    
    public void bar () {
        System.out.println ("Broca 1 : Perjuração do bar atingida com bar "+b.bar);    
    }
}
