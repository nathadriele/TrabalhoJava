/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

ARRUMAR INSTANCIAÇÃO
 */
package minerator2000;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */

public class MINERATOR2000 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        int opcao;
        System.out.println("Jogo Minarador 2000\n");
      
        Minerador2000 funcao = new Minerador2000();
        System.out.println("Selecione uma das opções:");
        System.out.println("1. para Solo Rocha");
        System.out.println("2. para Sol Macio");
        System.out.println("3. para Solo Seco");
        System.out.print("Sua opção: ");
        opcao = teclado.nextInt(); 
        funcao.Minerador2000(opcao);
    
    }
}
       
    
    

