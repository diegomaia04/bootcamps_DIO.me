package POO.Desafio.Iphone;

import java.util.Scanner;

import POO.Desafio.Interfaces.AparelhoTelefonico;
import POO.Desafio.Interfaces.NavegadorInternet;
import POO.Desafio.Interfaces.ReprodutorMusical;

public class ModeloIphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void tocar() {
        System.out.println("Digite uma musica para tocar: ");
        String nomeMusica = scanner.nextLine();

        System.out.println(" a musica " + nomeMusica + " já esta tocando!!");
    }

    @Override
    public void pausar() {
        System.out.println("Deseja Pausar a musica?");
        String opcao = scanner.nextLine();

        if (opcao == "sim" || opcao == "Sim") {
            System.out.println("musica pausada.");
        } else {
            System.out.println("musica tocando...");
        }
    }

    @Override
    public void ligar() {
        System.out.println("Digite para qual Numero você deseja ligar : ");
        String nomeMusica = scanner.nextLine();

        System.out.println(" a musica " + nomeMusica + " já esta tocando!!");
    }

    @Override
    public void atender() {
        boolean atender = false;

        if (atender == true) {
            System.out.println("a ligação foi atendida");
        } else {
            System.out.println("a ligação não foi atendida");
        }
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Deixe um Correio de Voz");
        scanner.nextLine();
        System.out.println("o Correio de Voz foi enviado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Digite a pagina que você gostaria de ir: ");
        String pagina = scanner.nextLine();

        System.out.println(" a pagina" + pagina + "esta sendo carregada");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando uuma nova pagina");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("atualizando pagina / paginas");
    }
}
