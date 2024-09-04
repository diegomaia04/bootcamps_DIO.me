using System.Globalization;
using Models;
using Newtonsoft.Json;
using System.Net.Http.Headers;
using trilha_net_exemplo_explorando__linguagem_main.Models;

// Os códigos estão comentados por seções inicio/fim exemplo conforme as aulas.
// Basta descomentar as seções e executar individualmente

// INICIO EXEMPLO -------------------------------------------------------
// representação de variaves e de dados

string apresentacao = "olá, seja bem-vindo";
int quantidade = 1;
double altura = 1.68;
decimal preco = 1.80M;
bool condicao = true;

Console.WriteLine(apresentacao);
Console.WriteLine("Valor da variavel quantidade: " + quantidade);
Console.WriteLine("Valor da variavel altura: " + altura);
Console.WriteLine("Valor da variavel preco: " + preco);
Console.WriteLine("Valor da variavel condicao: " + condicao);

// o valor de uma variavel pode mudar conforme o jeito que declara ela, exemploo( ela respeitara a ordem da sintaxe):

int idade = 20;
Console.WriteLine("a minha idade no ano que vem será de: " + idade);
idade = 19;
Console.WriteLine("pórem minha idade atual é de: " + idade);

// DateTime

DateTime dataAtual = DateTime.Now;
Console.WriteLine(dataAtual);

DateTime dataFutura = DateTime.Now.AddDays(3600);
Console.WriteLine(dataFutura);

DateTime dataString = DateTime.Now.AddDays(5);
Console.WriteLine(dataString.ToString("dd/MM/yyyy"));

// FIM DO EXEMPLO -----------------------------------------------------------

// INICIO DO EXEMPLO
// Operadores no C#

int a = 10;
int b = 20;
int c = a + b;
c = c + 5; // 30 + 5
c += 10;
c -= 10;
c *= 10;
c /= 10;
Console.WriteLine(c);

int inteiro = 5;
string ex = inteiro.ToString();
Console.WriteLine(ex);

int po = 5;
double pos = po; 
Console.WriteLine(pos);

int x = int.MaxValue;
long v = x;
Console.WriteLine(v);

string aa = "15";
int bb = 0;
int.TryParse(aa, out bb);
Console.WriteLine(bb);
Console.WriteLine("Conversão realizada com sucesso!");

int quantidadeEstoque = 10;
int quantidadeCompra = 4;
bool possivelVenda = quantidadeEstoque >= quantidadeCompra;
Console.WriteLine($"Quatidade em estoque: {quantidadeEstoque}");
Console.WriteLine($"Quatidade em compra: {quantidadeEstoque}");
Console.WriteLine($"épossivel relaizar a venda {possivelVenda}");

if (possivelVenda)
{

    Console.WriteLine("Venda realizada");

}
else
{

    Console.Write("Desculpe, não temos a quantidade desejada no estoque");

}

Console.WriteLine("Digite uma letra: ");
string letra = Console.ReadLine();

// utilizando o switch case

switch (letra)
{

    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
        Console.WriteLine("Vogal");
        break;

    default:
        Console.WriteLine(" não é vogal");
        break;
}

// utilizando o if

if (letra == "a")
{
    Console.WriteLine("vogal");
}
else if (letra == "e")
{
    Console.WriteLine("vogal");
}
else if (letra == "i")
{
    Console.WriteLine("vogal");
}
else if (letra == "o")
{
    Console.WriteLine("vogal");
}
else if (letra == "u")
{
    Console.WriteLine("vogal");
}
else
{
    Console.WriteLine("não é uma vogal");
}

// utilizando o swtich case

// FIM DO EXEMPLO --------------------------------------------------------------------------------

// INICIO DO EXEMPLO
// Operadores Logicos

// or
bool MaiorIdade = true;
bool Autorizacao = false;

if (MaiorIdade || Autorizacao)
{

    Console.WriteLine("Entrada liberada!");

}
else
{

    Console.WriteLine("Entrada não liberada");

}

// and

bool Presenca = true;
double media = 7.0;

if (Presenca && media >= 7)
{

    Console.WriteLine("Aprovado");

}
else
{
    Console.WriteLine("Reporvado :(");
}

bool chuva = false;
bool tempo = false;

if (!chuva && !tempo)
{

    Console.WriteLine("Vou sair!");

}
else
{
    Console.WriteLine("nao vou sar");
}

// INICIO DO EXEMPLO
// Operadores aritmeticos em C#

Calculadora calc = new Calculadora();

calc.Somar(10, 2);
calc.Subtrair(10, 50);
calc.Multiplicar(15, 45);
calc.Dividir(2, 2);
calc.Potencia(3, 3);
calc.Seno(30);
calc.Cosseno(30);
calc.Tangente(30);

int numeroIncrimento = 10;
Console.WriteLine(numeroIncrimento);

Console.WriteLine("Incrementando o numero");
numeroIncrimento++;
Console.WriteLine(numeroIncrimento);

int numeroDecremento = 10;
Console.WriteLine(numeroDecremento);

Console.WriteLine("Incrementando o numero");
numeroDecremento--;
Console.WriteLine(numeroDecremento);



// FIM DO EXEMPLO -------------------------------------------------------------

// INICIO DO EXEMPLO

int numero = 5;
int rep = 0;
Console.WriteLine($"{numero} * 1 = {numero * 1}");

for (int contador = 0; contador <= 10; contador++)
{
    Console.WriteLine($"{numero} * {contador} = {numero * contador}");

}

while (rep <= 10)
{
    Console.WriteLine($" {rep} rep° Execução: {numero} * {rep} = {numero * rep}");
    rep++;

    if (rep == 6)
    {
        break;
    }

}

int soma = 0;
int nuemro = 0;

do
{
    Console.WriteLine("Digite um numero(0 para parar a execuçao)");
    numero = Convert.ToInt32(Console.ReadLine());

    soma += nuemro;

} while (numero != 0);

Console.WriteLine($"Total da soma dos nuemros digitados é: {soma}");

string opcao;
bool exibirMenu = true;

while (exibirMenu)
{
    Console.WriteLine("Digite a sua opção:");
    Console.WriteLine("1 - Cadastrar cliente");
    Console.WriteLine("2 - Buscar cliente");
    Console.WriteLine("1 - Apagar cliente");
    Console.WriteLine("4 - Encerrar");

    opcao = Console.ReadLine();

    switch (opcao)
    {

        case "1":
            Console.WriteLine("cadastro de Cliente");
            break;

        case "2":
            Console.WriteLine("Busca de Cliente");
            break;

        case "3":
            Console.WriteLine("Apagar de Cliente");
            break;

        case "4":
            Console.WriteLine("Encerrar");
            exibirMenu = false;
            break;

        default:
            Console.WriteLine("opção invalida");
            break;

    }
}



//FIM DO EXEMPLO -----------------------------------------------------------------------

// INICIO DO EXEMPLO

int[] arrayInteiro = new int[3];

arrayInteiro[0] = 72;
arrayInteiro[1] = 64;
arrayInteiro[2] = 79;

int[] arrayInteiroDobrado = new int[arrayInteiro.Length * 2];
Array.Copy(arrayInteiro, arrayInteiroDobrado, arrayInteiro.Length);

Array.Resize(ref arrayInteiro, arrayInteiro.Length * 2);

// percorrendo o array com o for
for (int contador = 0; contador < arrayInteiro.Length; contador++)
{
    Console.WriteLine($"Posição N°{contador} - {arrayInteiro[contador]}");
}

// percorrendo o array com o foreach
int contadorForeach = 0;
foreach (int valor in arrayInteiro)
{
    Console.WriteLine($"Posição N° {contadorForeach} - {valor}");
    contadorForeach++;
}

List<string> listaString = new List<string>();

listaString.Add("Spfc");
listaString.Add("São Paulo");
listaString.Add("Tricolor");

Console.WriteLine($"Itens na minha lista: {listaString.Count} - Capacidade{listaString.Capacity}");
listaString.Add("Soberano");

Console.WriteLine($"Itens na minha lista: {listaString.Count} - Capacidade{listaString.Capacity}");
listaString.Add("Trikas");

Console.WriteLine($"Itens na minha lista: {listaString.Count} - Capacidade{listaString.Capacity}");
listaString.Add("O mais Popular");

for (int contador = 0; contador < listaString.Count; contador++)
{

    Console.WriteLine($"Posição N°{contador} - {listaString[contador]}");

}

int Foreach = 0;
foreach (string iten in listaString)
{
    Console.WriteLine($"Posição N° {Foreach} - {iten}");
    contadorForeach++;
}


//FIM DO EXEMPLO -----------------------------------------------------------

// ---------------------------------------------------------------------------------- //

