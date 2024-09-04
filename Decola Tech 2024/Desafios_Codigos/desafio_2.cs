// Descrição
// Agora, focaremos em outro conceito fundamental de programação para desenvolver um algoritmo que possua como objetivo a simulação de um Sistema de Gerenciamento de Tarefas. 
// Dessa forma, crie variáveis como, titulo, descricao e dataVencimento para guardar as informações das tarefas, 
// após isso, implemente uma estrutura condicional 'if/else' para verificar se a descrição da tarefa excede 50 caracteres. 
// Caso a descrição exceda 50 carateres, trataremos essa condição exibindo uma mensagem adequada. 
// Lembrando que as estruturas condicionais são fundamentais para o controle de fluxo dos programas pois realizam verificações precisas com base em condições específicas predefinidas, 
// neste caso, é o limite de 50 caracteres.

using System;

class desafio_2
{
    static void Main()
    {

        // TODO: Crie as variáveis titulo, descricao e dataVencimento para guardar as informações das tarefas:
        string titulo;
        string descricao;
        string dataVencimento;

        // Obtém o titulo e a descricao a partir da entrada do console  
        titulo = Console.ReadLine();
        descricao = Console.ReadLine();

        // TODO: Crie uma estrutura condicional 'if/else' para verificar se a descrição da tarefa excede 50 caracteres.
        if (descricao.Length > 50)
        {
            Console.WriteLine("Descricao ultrapassa limite de caracteres.");
        }
        else
        {
            // Caso a descricao esteja dentro do limite é solicitado a entrada pelo console:
            dataVencimento = Console.ReadLine();

            // TODO: Imprima a descricao e a data de vencimento como nos exemplos da tabela:          
            Console.WriteLine($"{descricao} ate {dataVencimento}");

        }
    }
}