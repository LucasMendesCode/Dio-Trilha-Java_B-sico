public class smartTv {
    boolean ligada =false;
    int canal =1;
    int volume =25;

    public void aumentarVolume (){
        volume++; 
        // ++ aumentar o volume em mais 1. 
    }

    public void diminuirVolume (){
        volume--;
        // -- diminuir o volume em mais 1. 
    }

    public void ligar (){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
