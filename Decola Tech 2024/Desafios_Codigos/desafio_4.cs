using System;

class desafio_4
{
    static void Main()
    {
        Console.WriteLine("Quantos jogos deseja adicionar?");
        int quantidadeJogos = int.Parse(Console.ReadLine());

        string[] nomesJogos = new string[quantidadeJogos];

        for (int i = 0; i < quantidadeJogos; i++)
        {
            Console.WriteLine($"Digite o nome do jogo {i + 1}:");
            nomesJogos[i] = Console.ReadLine();
        }

        Console.WriteLine($"Foi adicionados '{quantidadeJogos}' jogos: {string.Join(", ", nomesJogos)} ao catálogo.");
    }
}
