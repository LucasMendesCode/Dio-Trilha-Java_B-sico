
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
   
    public static void main(String[] args) throws Exception {
        
        Scanner scanner= new Scanner(System.in);
        
        try{ 
            System.out.println("Informe o primeiro valor de entrada:");
            int entrada1 = scanner.nextInt();

            System.out.println("Informe o segundo valor de entrada:");
            int entrada2 = scanner.nextInt();

            count(entrada1, entrada2);
    
    } 
    catch(ParametrosInvalidosException e) {
        System.out.println(e.getMessage());
    }
    catch(InputMismatchException e) {
        System.out.println("Entrada inválida, informe um número inteiro.");
    }
    }
static void count(int p1, int p2) throws ParametrosInvalidosException {
    int numeroDeEntradas = p2 - p1;
    for(int i = 1; i <= numeroDeEntradas; i++) {
    System.out.println("imprima o número :" +i);}


    if(numeroDeEntradas < 0)
            throw new ParametrosInvalidosException();

    }
    }    

