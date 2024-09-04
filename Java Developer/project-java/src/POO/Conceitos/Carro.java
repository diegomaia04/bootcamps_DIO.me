package POO.Conceitos;

public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }

    public void confereCombustivel() {
        System.out.println("conferindo combustivel");
    }

    public void confereCambio() {
        System.out.println("conferindo o cambio");
    }
}
