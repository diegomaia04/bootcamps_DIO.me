package FundamentosJava;

import java.sql.Date;

public class operadores {
    public static void main(String[] args) {
        
        // operaadores de atribuição
        // representados pelo simbilo "="

        String nome = "Anakin";
        int idade = 1;
        double peso = 5.5;
        char sexo = 'M';
        Boolean castrado = true;
        String animal = "gato bengal";

        // operadores aritmeticos
        // operadores artimeitcso são utilizados para realizar contas matematicas

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 27;
        int multiplicacao = 15 * 17;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double Resultado = (10 * 7) + ( 548 - 97);

        // o "+" pode ser utilizado como concatenação entre strings

        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        concatenacao = "1" + 1 + 1 + "1" + "1";
        System.out.println(concatenacao);

        // operadores unarios
        // são aplicados juntamente com outro operador artimetico, incremnetar decremnetar, invetr valores etc
    
        int number = 5;
        number = -number;
        System.out.println(number);

        number = number * -1;
        System.out.println(number);

        // x repetição
        number ++;
        System.out.println(number);
    
    
    }   
}
