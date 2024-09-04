package FundamentosJava.ControleCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // System.out.println("Processo seletivo");
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0)
        // selecaoCandidatos();
        // imprimirSelecionados();

        String[] candidatos = { "Anakin", "Padme", "Luke", "Padme", "R2-D2" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contanto realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("conseguimos falar com o meno " + candidato );
        } else {
            System.out.println(" nao atendeu de maneira alguma >:(");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Anakin", "Padme", "Luke", "Padme", "R2-D2" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("o candidato slecionado foi" + candidato);
        }
    }

    static void selecaoCandidatos() {

        String[] candidatos = { "Anakin", "Padme", "Han solo", "Chewbacca", "Luke", "Obi-Wan", "Leia", "Yoda", "R2-D2",
                "C3PO" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println(" O candidadto " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("ligar para canditado");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("ligar para o candidato com contra proposta");
        } else {
            System.out.println("aguardando o resultado dos demias candidatios");
        }
    }
}
