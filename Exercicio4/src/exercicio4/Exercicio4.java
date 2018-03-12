/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Tamara
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        AdapterDESTRUCTOR20007XMax adapter = null;
        DESTRUCTOR20007XMax controle = null;
        
        int opcao = 0, acao =0;
        
        do{
            System.out.println("Jogo Destructor 2000\n");
            System.out.println("Selecione uma das opções:");
            System.out.println("1. para controle 7XMax");
            System.out.println("2. para controle SUPER3DMonster");
            System.out.println("3. Sair");
            System.out.print("Sua opção: ");
            opcao = teclado.nextInt();
            if (opcao == 1){
                
                System.out.println("Selecione uma das opções:");
                System.out.println("1. Direita");
                System.out.println("2. Esquerda");
                System.out.println("3. Acima");
                System.out.println("4. Abaixo");
                System.out.println("5. Perfurar");
                System.out.println("6. Sair");
                
                acao = teclado.nextInt();
                controle = new O7XMax();
                
                switch (acao) {  

                case 1 : controle.direita();                               
                    break;           
                case 2 : controle.esquerda();                     
                    break;            
                case 3 : controle.acima();                     
                    break;
                case 4 : controle.abaixo();                     
                    break;
                case 5 : controle.perfurar();                     
                    break;
                default :                     
                    System.out.println ("Opção incorreta!!!");
                }
            }
            if (opcao == 2){
                
                System.out.println("Selecione uma das opções:");
                System.out.println("1. Direita");
                System.out.println("2. Esquerda");
                System.out.println("3. Acima");
                System.out.println("4. Abaixo");
                System.out.println("5. Perfurar");
                System.out.println("6. Diagonal Superior Esquerda");
                System.out.println("7. Diagonal Superior Direita");
                System.out.println("8. Diagonal Inferior Direita");
                System.out.println("9. Diagonal Inferior Esquerda");
                System.out.println("10. PerfurarDuplo");
                System.out.print("Sua opção: ");
                acao = teclado.nextInt(); 
                adapter = new AdapterDESTRUCTOR20007XMax(new O7XMax());
                
                switch (acao) {  

                case 1 :  adapter.direita();                               
                    break;           
                case 2 : adapter.esquerda();                     
                    break;            
                case 3 : adapter.acima();                     
                    break;
                case 4 : adapter.abaixo();                     
                    break;
                case 5 : adapter.perfurar();                     
                    break;    
                case 6 :  adapter.diagonalSupEsq();                               
                    break;           
                case 7 : adapter.diagonalSupDir();                     
                    break;            
                case 8 : adapter.diagonalInfDir();                     
                    break;
                case 9 : adapter.diagonalInfEsq();                     
                    break;
                case 10 : adapter.perfurarDuplo();                     
                    break;        
                    
                default :                     
                    System.out.println ("Opção incorreta!!!");
                }
            }
        }while(opcao < 3);       
    }
}
