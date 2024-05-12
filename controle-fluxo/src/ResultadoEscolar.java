  //GERADOR DE NOTAS ALEATORIAS.
  //implementação de notas aleatorias.
import java.util.Random;

public class ResultadoEscolar {
    //estrutura condicional composta.

    public static void main(String[] args) {
        Random rand = new Random();
        int nota = rand.nextInt (11);
        // essa foi substituida pela nota de cima "int nota = 6;"
        
         if (nota >= 7) {
        System.out.println("Aprovado! Nota: " + nota);
         }
        
        //condiçao encadeada adiciona o "else if" comoterceira condição.
        else if (nota >= 5 && nota < 7) {
        System.out.println("Recuperação. Nota: " + nota);
        }
        else {
        System.out.println("Reprovado. Nota: " + nota); 
        }
    }
}
