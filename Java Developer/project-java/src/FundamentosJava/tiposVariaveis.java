package FundamentosJava;

public class tiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começãr com zero, talvez tenha que ser outro tipo
        long  cpf =  98565548886L; // se começãr com zero, talvez tenha que ser outro tipo
        float pi = 3.14F; // orbigatorio ter o F ou f em float
        double salario = 1275.33;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;               // trasnformar os mais diferentes tipos de declaração de numerais
        short numeroCurto2 = (short) numeroNormal;

        ano = 2024;
        System.out.println(ano);

        /* 
         * ao usar a palavra reservadad final, voce pode determinar uma cinstante
         * isso e considerado uma cnstante na linguagem Java
        */

        final double valueofPi = 3.14;
        // valueofPi = 3; essa linha dara erro caso seja descomentada
        System.out.println(valueofPi);
    }
}
