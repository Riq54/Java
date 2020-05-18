
package if_else;

import java.util.Scanner;


public class aula1105 {

    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner (System.in);
         
         //EXERCÍCIO 1
         
            int n1, n2;
            
                System.out.println("Insira um número: ");
                n1 = teclado.nextInt();
                
            n2 = n1 % 2;  
                if (n2 == 0) {                   
                    System.out.println("O número "+n1+" é par.");
                }
                else {
                    System.out.println("O número "+n1+" é ímpar.");
                }
                
                System.out.println("\n");
                
        //EXERCICIO 2
        
            int ano;
            
                System.out.println("Insira um ano: ");
                ano = teclado.nextInt();
            
            if (ano < 2020) {
                System.out.println("O ano "+ano+" é do passado");
            }
            else {
                if (ano > 2020){
                    System.out.println("O ano "+ano+" é do futuro");
                }
                    else {
                    System.out.println("O ano "+ano+" é o atual");
            }
                
            }
          System.out.println("\n");
          
          //EXERCICIO 3
          
            double m, nota1, nota2;
            String nome;
                
                System.out.println("Insira seu nome: ");
                nome = teclado.next();
                
                System.out.println("Insira sua primeira nota: ");
                nota1 = teclado.nextDouble();
                
                System.out.println("Insira sua segunda nota: ");
                nota2 = teclado.nextDouble();
                
                m = (nota1 + nota2) / 2;
                
               if (m <= 3.99) {
                   System.out.println("\nNome: "+nome+"\nMédia: "+m+"\nSituação: Reprovado");
                }
               else{
                   if (m >= 4 && m <= 5.99) {
                       System.out.println("\nNome: "+nome+"\nMédia: "+m+"\nSituação: Recuperação");
                   }
                        else {
                       System.out.println("\nNome: "+nome+"\nMédia: "+m+"\nSituação: Aprovado");
                    }
               }
            
            }
    
    }
    
}
