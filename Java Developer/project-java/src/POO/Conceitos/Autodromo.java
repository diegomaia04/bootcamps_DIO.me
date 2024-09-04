package POO.Conceitos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1989-TS");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("1313-taylor");
        z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
