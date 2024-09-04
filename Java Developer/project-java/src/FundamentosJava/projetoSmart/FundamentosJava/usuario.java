package FundamentosJava.projetoSmart.FundamentosJava;

public class usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(5);


        System.out.println("tv ligada? "+ smartTv.ligada);
        System.out.println("canal Atual " + smartTv.canal);
        System.out.println("o volume da tv é:" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status --> Tv ligada? " + smartTv.ligada);


    }
}
