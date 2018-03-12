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
public class SUPER3DMonster implements DESTRUCTOR2000SUPER3DMonster{

    @Override
    public void direita() {
        System.out.println("SUPER3DMonster Direita");
    }

    @Override
    public void esquerda() {
        System.out.println("SUPER3DMonster Esquerda");
    }

    @Override
    public void acima() {
        System.out.println("SUPER3DMonster Acima");
    }

    @Override
    public void abaixo() {
        System.out.println("SUPER3DMonster Abaixo");
    }

    @Override
    public void diagonalSupEsq() {
        System.out.println("SUPER3DMonster DiagonalSupEsq");
    }

    @Override
    public void diagonalSupDir() {
        System.out.println("SUPER3DMonster DiagonalSupDir");
    }

    @Override
    public void diagonalInfDir() {
        System.out.println("SUPER3DMonster DiagonalInfDir");
    }

    @Override
    public void diagonalInfEsq(){
        System.out.println("SUPER3DMonster DiagonalInfEsq");
    }

    @Override
    public void perfurar() {
        System.out.println("SUPER3DMonster Perfurar");
    }
    @Override
    public void perfurarDuplo() {
        System.out.println("SUPER3DMonster PerfurarDuplo");
    }
}
