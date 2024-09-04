package FundamentosJava.controleFluxo;

// import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        // try {
            // Criando o objeto Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble(); // Usando nextDouble para receber um número real

            // Imprimindo os dados
            System.out.println("Me chamo " + nome.toUpperCase() + ", tenho " + idade + " anos e minha altura é de " + altura + " metros.");

            scanner.close();
        // } catch (InputMismatchException e) {
        //     System.out.println("Erro: Entrada inválida. Certifique-se de digitar um valor numérico válido.");
        // }
    }

}
