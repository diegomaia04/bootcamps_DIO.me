// DESAFIOS DE CODIGO DO MODULO
// AQUI SERAÕ GUARDADOS TODOS OS ENUNCIADOS DOS DESAFIOS E SUAS RESPOSTAS.
using System;
class Program
{
    static void Main(string[] args)
    {

        //EX1:
        // Descrição
        // Neste desafio, aplicaremos conceitos essenciais de programação, seu objetivo é desenvolver uma solução simulando o registro de usuário em uma aplicação. 
        //Assegure que o código tenha uma sintaxe clara e organizada, com nomenclaturas significativas para variáveis como email, nomeUsuario, senha que será o local de armazenamento das informações de registro. 
        //Escolha tipos de dados apropriados, como o String para representar o email, nomeUsuario e senha. Certifique-se de tratar senha como strings para operações específicas.

        // TODO: Declare as variáveis para guardar as informações de nome, email e senha:
        string registroNome;
        string registroEmail;


        // Obtém o email e nome do usuário a partir da entrada do console
        registroEmail = Console.ReadLine();
        registroNome = Console.ReadLine();


        // TODO: Imprima a mensagem formatada com o nome do usuário e o email de registro:
        Console.WriteLine($"{registroNome}, verifique o email: {registroEmail} para ativar.");
    }
}
