package FundamentosJava.controleFluxo;

import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }

        // __________________________________________________________________________________

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("digite a nota final");
            int nota = scanner.nextInt();

            if (nota >= 7) {
                System.out.println("aporvado parabens ai");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("fico de rec kkk");
            } else {
                System.out.println("reporvado eitakkkkkkkk e agora bonzao");
            }
        }
        

        // ____________________________________________________

        String sigla = "A";

        switch (sigla) {
            case "P":
                System.out.println("pequeno");
                break;
            case "M":
                System.out.println("medio");
                break;
            case "G":
                System.out.println("grande");
                break;
            default:
                System.out.println("indefinido");
                break;
        }
    }
}
