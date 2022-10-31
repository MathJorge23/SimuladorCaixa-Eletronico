
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
String CPFC = "12345678900", CPF;
        int senhaC = 01020304, senha = 0, contador = 0, saldo = 1000, saque;
        int opçao = 0, deposito, saldoAtual=0;
        Scanner ler = new Scanner(System.in);
        Scanner scr = new Scanner(System.in);
//-------------------------------------------------------------------------------/
        System.out.println("Bem-vindo ao Bank NNS");
        System.out.println();
//-------------------------------------------------------------------------------/
        System.out.print("Digite o seu CPF: ");
        CPF = scr.next();
//-------------------------------------------------------------------------------/
        while (CPFC.equals(CPF)){
            System.out.print("Digite a sua senha: ");
            senha = scr.nextInt();
//-------------------------------------------------------------------------------/            
            if (senha == senhaC && contador <= 2){
                System.out.println("-----------------------------------------------");
                System.out.print("Senha incorreta, tente novamnete: ");
                contador++; 
                senha = scr.nextInt();
//-------------------------------------------------------------------------------/                
            } else if (senha != senhaC){
                System.out.println("-----------------------------------------------");
                System.out.println("ACESSO PERMITIDO.");
//-------------------------------------------------------------------------------/               
                do {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Escolha uma das opções: ");
                    System.out.println();
                    System.out.println("Digite 1 para ver seu saldo");
                    System.out.println("Digite 2 para realizar um deposito");
                    System.out.println("Digite 3 para realizar um saque");
                    System.out.println("Digite 0 para sair");
                    System.out.println();
                    System.out.print("Digite a sua opção: ");
                    opçao = scr.nextInt();
                } while(opçao > 4);
//-------------------------------------------------------------------------------/                
                switch(opçao){
                    case 1: System.out.println("O seu saldo é de R$ " + saldo);
                    break; 
//-------------------------------------------------------------------------------/                    
                    case 2: System.out.println("Saldo atual é de R$ " + saldo);
                        System.out.println();                        
                        System.out.println("Qual o valor desejado para depósito?");
                        deposito = ler.nextInt();
                        System.out.println("O valor atual é " + (deposito+saldo));
                        break;
//-------------------------------------------------------------------------------/                        
                    case 3: System.out.println("Seu saldo atual é de R$ " + saldo);
                        System.out.println();
//-------------------------------------------------------------------------------/                        
                        System.out.print("Quanto você dseja sacar? ");
                        saque = ler.nextInt();
                        System.out.println("O valor atual é de R$ " + (saldo-saque));
                        break;
//-------------------------------------------------------------------------------/
                    case 0: System.out.println("Sair"); 
                        return;
//-------------------------------------------------------------------------------/
                    default: 
                        System.out.println("-----------------------------------------------");
                        System.out.println("Opção invalida");
                        System.out.println("-----------------------------------------------");
                }
            } else {
                System.out.println("ACESSO BLOQUEADO");
            }
        }
    }
}
