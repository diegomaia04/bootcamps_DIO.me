package FundamentosJava.projetoSmart.FundamentosJava;

public class SmartTV {
    boolean ligada = false;
    int canal = 13;
    int volume = 22;

    public void aumentarVolume() {
        volume++;
        System.out.println("aumentando o volume" + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo o volume" + volume);
    }

    public void ligar() {
        ligada = true;
        System.out.println("a tv foi ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("a tv foi desligada");
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("aumnetando canal");
    }

    public void diminuindoCanal() {
        canal--;
        System.out.println("dimuindo canal");
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
