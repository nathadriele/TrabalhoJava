/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author Tamara
 */
public class AdapterDESTRUCTOR20007XMax implements DESTRUCTOR2000SUPER3DMonster{
    DESTRUCTOR20007XMax DESTRUCTOR20007XMax; 
    boolean verdadeiro = true;
    
    public AdapterDESTRUCTOR20007XMax (DESTRUCTOR20007XMax DESTRUCTOR20007XMax){ 
        this.DESTRUCTOR20007XMax = DESTRUCTOR20007XMax; 
    }
    
    @Override
    public void direita() {
        DESTRUCTOR20007XMax.direita(); 
    }

    @Override
    public void esquerda() {
        DESTRUCTOR20007XMax.esquerda();
    }

    @Override
    public void acima() {
        DESTRUCTOR20007XMax.acima();
    }

    @Override
    public void abaixo() {
        DESTRUCTOR20007XMax.abaixo();
    }

    @Override
    public void diagonalSupEsq() {
        DESTRUCTOR20007XMax.acima();
        DESTRUCTOR20007XMax.esquerda();
    }

    @Override
    public void diagonalSupDir() {
        DESTRUCTOR20007XMax.acima();
        DESTRUCTOR20007XMax.direita();
    }

    @Override
    public void diagonalInfDir() {
        DESTRUCTOR20007XMax.abaixo();
        DESTRUCTOR20007XMax.direita();
    }

    @Override
    public void diagonalInfEsq() {
        DESTRUCTOR20007XMax.abaixo();
        DESTRUCTOR20007XMax.esquerda();
    }

    @Override
    public void perfurar() {
        DESTRUCTOR20007XMax.perfurar();
    }
    @Override
    public void perfurarDuplo() {
        DESTRUCTOR20007XMax.perfurar();
        DESTRUCTOR20007XMax.perfurar();
    }
}
