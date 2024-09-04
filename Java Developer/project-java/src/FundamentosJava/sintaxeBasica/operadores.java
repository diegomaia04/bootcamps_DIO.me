package FundamentosJava.sintaxeBasica;
public class operadores {
    public static void main(String[] args) {

        // operaadores de atribuição
        // representados pelo simbilo "="
        /*
         * String nome = "Anakin";
         * int idade = 1;
         * double peso = 5.5;
         * char sexo = 'M';
         * Boolean castrado = true;
         * String animal = "gato bengal";
         */
        // operadores aritmeticos
        // operadores artimeitcso são utilizados para realizar contas matematicas
        /*
         * double soma = 10.5 + 15.7;
         * int subtracao = 113 - 27;
         * int multiplicacao = 15 * 17;
         * int divisao = 15 / 3;
         * int modulo = 18 % 3;
         * double Resultado = (10 * 7) + (548 - 97);
         */

        // o "+" pode ser utilizado como concatenação entre strings

        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = "1" + 1 + 1 + "1" + "1";
        System.out.println(concatenacao);

        // operadores unarios
        // são aplicados juntamente com outro operador artimetico, incremnetar
        // decremnetar, invetr valores etc

        int number = 5;
        number = -number;
        System.out.println(number);

        number = number * -1;
        System.out.println(number);

        // x repetição
        number++;
        System.out.println(number);

        // operadores ternarios
        // uma forma resumida definir uma condição e escolher por um dnetre os dois
        // valores

        int a, b;

        a = 5;
        b = 6;
        // String resultado = "";

        /*
         * if (a == b) {
         * resultado = "verdadeiro";
         * } else {
         * resultado = "falso";
         * }
         */

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        // operadores relacionais
        // avaliam a relaçõa entre duas variaveis ou expressoes

        boolean simNao = a == b;
        System.out.println("os dois nuemros, a e b, sao enguais" + simNao);

        simNao = a != b;
        System.out.println("os dois nuemros, a e b, sao enguais" + simNao);

        simNao = a > b;
        System.out.println("os dois nuemros, a e b, sao enguais" + simNao);

        simNao = a < b;
        System.out.println("os dois nuemros, a e b, sao enguais" + simNao);

        // operadores logicos
        // representam o recursos que nos permite cirar expressoes logicos
        // && = "E"
        // || = "ou"

        boolean condição1 = true;
        boolean condição2 = false;

        if (condição1 && condição2) {
            System.out.println("amabs as condições sao verdadeiras");
        }

        if (condição1 || condição2) {
            System.out.println("se uma das condições for verdadeira");
        }

    }
}
