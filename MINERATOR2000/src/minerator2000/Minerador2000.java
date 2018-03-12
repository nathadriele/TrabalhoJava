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


public class Minerador2000 {
    
    boolean verdadeiro = true;    
    Broca1 b1;    
    Broca2 b2;    
    Broca3 b3;
    Broca4 b4;
    
    ConfiguracaoBroca broca1, broca2, broca3, broca4;

    public void Minerador2000 (int funcao) {
        switch (funcao) {
            case 1 : Rocha();                     
            break;           
            case 2 : Macio();                     
            break;            
            case 3 : Seco();                     
            break;
            default :                     
                System.out.println ("Opção incorreta!!!");                     
            verdadeiro = false;
        }
        this.Configurar();
        if (verdadeiro) {            
            b1.rpm();            
            b1.bar();           
            b2.rpm();            
            b2.bar();   
            b3.rpm();            
            b3.bar();           
            b4.rpm();            
            b4.bar();
        }    
        
        
    }

    public void Macio() { 
        broca1 = new ConfiguracaoBroca(500,5);
        broca2= new ConfiguracaoBroca(600,5);
        broca3= new ConfiguracaoBroca(700,5);
        broca4= new ConfiguracaoBroca(450,5);
    }
    
    public void Rocha() {
        broca1 = new ConfiguracaoBroca(1000,10);
        broca2= new ConfiguracaoBroca(1200,12);
        broca3= new ConfiguracaoBroca(1400,10);
        broca4= new ConfiguracaoBroca(800,12);
        
    }
    
    public void Seco() {
        broca1 = new ConfiguracaoBroca(1200,30);
        broca2= new ConfiguracaoBroca(1400,30);
        broca3= new ConfiguracaoBroca(1600,30);
        broca4= new ConfiguracaoBroca(1000,30);
    }
    
    public void Configurar(){
        b1 = new Broca1 (broca1);        
        b2 = new Broca2 (broca2);  
        b3 = new Broca3 (broca3);        
        b4 = new Broca4 (broca4);
    }
}
