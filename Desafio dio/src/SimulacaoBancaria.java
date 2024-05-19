import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0.0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            int opcao = scanner.nextInt(); 
              
             switch (opcao) {
               
               case 1 :
                 
                 double deposito = scanner.nextDouble();
                 saldo += deposito;
                 System.out.println("Saldo atual: " + saldo);
                 
                 break;
                 
               case 2 : 
                 
                  double saque = scanner.nextDouble();
                 
                  if (saque > saldo) {
                   System.out.println("Saldo insuficiente.");}
                  else {
                    saldo -= saque;
                   System.out.println("Saldo atual: " + saque);
                   
                    
                  }
                 
                 break;
                 
               case 3 : 
                 System.out.println("Saldo atual: " + saldo);
                 break;
                 
               case 0 : 
                 System.out.println("Programa encerrado.");
                  scanner.close();
                  return;
               default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}
