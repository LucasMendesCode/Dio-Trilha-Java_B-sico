public class usuarioTv {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual :" + smartTv.volume);

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ?" + smartTv.ligada);
        
        smartTv.desligar(); 
        System.out.println("Novo Status -> TV Ligada ?" + smartTv.ligada);

    }
}
