// Descrição
// Para este desafio, vamos aplicar outros conceitos fundamentais de programação, agora, criaremos um programa que calcule a soma dos números pares em um intervalo específico.
// Dessa forma, desenvolva uma solução clara, simples e organizada, você pode criar variáveis com nomes representativos, como limiteInferior, limiteSuperior e somaPares.]
// Utilize uma estrutura de controle de fluxo, como o `for` para percorrer todos os números no intervalo definido pelos `limiteInferior e o limiteSuperior`. 
// Dentro desse loop, crie uma estrutura condicional `if ` para verificar se cada número é par e se o resto da divisão por 2 é igual a zero (i % 2 == 0). 
// Se a condição for verdadeira, o número é somado à variável somaPares.

using System;

class desafio_3
{
    static void Main()
    {
        // Solicita ao usuário os limites inferiores e superiores
        int limiteInferior = int.Parse(Console.ReadLine());
        int limiteSuperior = int.Parse(Console.ReadLine());

        // Variável para acumular a soma dos números pares
        int somaPares = 0;

        // Loop para percorrer os números no intervalo
        for (int i = limiteInferior; i <= limiteSuperior; i++)
        {
            // Verifica se o número é par
            if (i % 2 == 0)
            {
                // Acumula a soma dos números pares
                somaPares += i;
            }
        }

        // Exibe o resultado
        Console.WriteLine($"A soma dos números pares de {limiteInferior} a {limiteSuperior} e: {somaPares}");
    }
}

