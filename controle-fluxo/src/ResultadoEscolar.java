  //GERADOR DE NOTAS ALEATORIAS.
  //implementação de notas aleatorias.
  //estrutura condicional composta.
import java.util.Random;

public class ResultadoEscolar {

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

     // ABREVIAÇÃO TERNARIA: if, else if, else :

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7? "Recuperação" : "reporvado";
  System.out.println(resultado + ": " + nota);
    }
}
