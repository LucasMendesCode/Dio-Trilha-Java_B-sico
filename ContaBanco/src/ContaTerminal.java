import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeTitular = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("indique a sua agencia:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Saldo disponivel:");
        Double saldoConta = scanner.nextDouble();
        
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                    nomeTitular, numeroAgencia, numeroConta, saldoConta);

    }
}
