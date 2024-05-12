//SWITCH-CASE
import java.util.Random;
//com siglas aleatorias:
public class sistemaDeMedida{
    public static void main(String[] args) {
        Random rand = new Random();
        int sigla = rand.nextInt(4);

        //SEM o SWITCH-CASE:
        if(sigla == 0)
       System.out.println("pequeno");

       else if(sigla == 1)
        System.out.print("medio");

        else if(sigla == 2)
        System.out.print("grande");

        else
        System.err.println("indefinido");
    

    
        //COM SWITCH-CASE:
        //sem siglas aleatorias:
      String siglaB ="m"; 

        switch(siglaB){
            case "p":{
                System.out.println("pequeno");
                break;
            }
            case "m":{
                System.out.println("medio");
                break;
            }
            case "g":{
                System.out.println("grande");
                break;
            }
            default:
                System.out.println("indefinido");
                
            }
    }
}
    

