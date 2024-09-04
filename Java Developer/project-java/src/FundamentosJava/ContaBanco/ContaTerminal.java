package FundamentosJava.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite a Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da Agência");
            int numeroAgência = scanner.nextInt();

            System.out.println("Por favor, informe o seu nome e sobrenome");
            String nomeSobrenome = scanner.next();

            System.out.println("Por favor, informe o saldo ");
            double saldoAgencia = scanner.nextDouble();

            System.out.println("a");

            System.out.println(
                    "olá " + nomeSobrenome.toUpperCase() + ", obrigado por cirar uma conta em nosso banco, sua agência é " +
                            agencia + ", conta " + numeroAgência + " e seu saldo " + saldoAgencia
                            + " já esta disponivel para saque");

            scanner.close();
        }

    }
}
