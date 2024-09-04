package FundamentosJava.controleFluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class repeticao {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("contando ate 20.. " + i);
        }

        String alunos[] = { "art", "tashi", "patrick" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("o aluno no indice x = " + x + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println("um nome de um dos portagonista do filme é: " + aluno);
        }

        for (int n = 1; n <= 5; n++) {
            if (n == 4)
                break;

            System.out.println(n);
        }

        // _________________________________________________________________________________________

        double mesada = 50.0;

        while (mesada > 0) {

            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;

        }
        System.out.println("mesada: " + mesada);
        System.out.println("o otario gastou toda a mesada");

        // _______________________________________________________________

        System.out.println("discando..");

        do {
            // executando repetidas vezes ate alguem atender
            System.out.println("telefone tocando");
        } while (tocando());

        System.out.println("alo");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocadno
        return !atendeu;
    }
}
