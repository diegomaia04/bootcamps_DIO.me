using System;

class desafio_5
{
    static void Main()
    {
        
        string nome = Console.ReadLine();
        double quilometrosPorDia = double.Parse(Console.ReadLine());
        int horasDeEletronicos = int.Parse(Console.ReadLine());
        int refeicoesComCarne = int.Parse(Console.ReadLine());

        double pegadaDeCarbono = CalcularPegadaDeCarbono(quilometrosPorDia, horasDeEletronicos, refeicoesComCarne);
        Console.WriteLine($"{nome}, sua pegada de carbono e de {pegadaDeCarbono} toneladas de CO2 por ano.");
        Console.ReadLine();
    }
      static double CalcularPegadaDeCarbono(double quilometrosPorDia, int horasDeEletronicos, int refeicoesComCarne)
    {
        // Lógica para calcular a pegada de carbono com base nos parâmetros fornecidos
        // Exemplo hipotético de cálculo:
        double pegadaDeCarbono = (quilometrosPorDia *  0.2  * 365) + (horasDeEletronicos * 0.1) + (refeicoesComCarne * 0.5);
        return pegadaDeCarbono;
    }
}
