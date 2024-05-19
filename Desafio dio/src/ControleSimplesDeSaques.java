import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        
      
      for (int i = 1; ; i++) {
        double primeiroSaque = scanner.nextDouble();
        
          if (primeiroSaque > limiteDiario) {
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        
        break;
      } 
      else if (primeiroSaque == 0) {
        System.out.println("Transacoes encerradas.");
        break;
      }
        else {
        limiteDiario -= primeiroSaque;
        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        
      }
      
       
      }
    scanner.close(); }
  }
        
