package FundamentosJava;

public class sintaxeBasica {
    public static void main(String[] args) {
        // declaração de variavel

        String meuNome = "Diego"; // cacrteres
        int anoNascimento = 2004; // numeros interios
        double altura = 1.67; // numero quebrado
        boolean simNao = false; // valores logicos

        final String BR = "brasil"; // essa expressoa final, nao permite que o valor seja alterado
        // BR = "brazil"; erro por conta do final acima.

        anoNascimento = 1989; // podemos atribuir outro valor para uma variavel ja declarada

        System.out.println(meuNome + " " + anoNascimento + " " + altura + " " + simNao + " " + BR);

        String primeiroNome = "anakin";
        String segundoNome = "skywalker";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do méteodo" + primeiroNome.concat(" ").concat(segundoNome); // dois jeitos de concatenar duas strings
    }
}
