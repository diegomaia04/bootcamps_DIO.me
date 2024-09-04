using ExemploExplorando.Models;
using System.Globalization;

CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("pt-BR");

Pessoa p1 = new Pessoa(nome: "Anakin", sobrenome: "Skywalker");
Pessoa p2 = new Pessoa(nome: "Percy", sobrenome: "Jackson");

Curso CursoDeingles = new Curso();
CursoDeingles.Nome = "Ingles";
CursoDeingles.Alunos = new List<Pessoa>();

CursoDeingles.AdicionarAluno(p1);
CursoDeingles.AdicionarAluno(p2);
CursoDeingles.ListarAlunos();

// -----------------------------------------

string numero1 = "10";
string numero2 = "20";

int n1 = 10;
int n2 = 20;

string resultado = numero1 + numero2;
int Intresultado = n1 + n2;
Console.WriteLine(resultado);
Console.WriteLine(Intresultado);

// -------------------------------------------

decimal valorMonetario = 1582.40M;
//Console.WriteLine($"{valorMonetario:C}");
Console.WriteLine(valorMonetario.ToString("C", CultureInfo.CreateSpecificCulture("en-US")));

double porcentagem = .3421;
Console.WriteLine(porcentagem.ToString("P"));

int date = 30122023;
Console.WriteLine(date.ToString("##-##-####"));

// ----------------------------------- 

DateTime data = DateTime.Parse("11/04/2004 20:16");
Console.WriteLine(data);
Console.WriteLine(data.ToString("dd/MM/yyyy HH:mm"));
Console.WriteLine(data.ToShortTimeString());

string dataString = "2022-04-17 18:00";

bool sucesso = DateTime.TryParseExact
(dataString,
"yyyy-MM-dd HH:mm",
CultureInfo.InvariantCulture,
DateTimeStyles.None,
out DateTime time);

if (sucesso)
{
    Console.WriteLine($"Conversão com Sucesso! Data {time}");
}
else
{
    Console.WriteLine($"Data {time} não é uma data valida");
}

// ----------------------------------------------------------------------

try
{
    string[] linhas = File.ReadAllLines("Arquivos/Arquivo.txt");
    foreach (string linha in linhas)
    {
        Console.WriteLine(linha);
    }
}
catch (FileNotFoundException ex)
{
    Console.WriteLine($"Ocorreu um erro na leitura do arquivo. Arquivo não encontrado. {ex.Message}");
}
catch (DirectoryNotFoundException ex)
{
    Console.WriteLine("Ocorreu um erro na leitura do arquivo. Caminho da pasta não enocntrado"
    + ex.Message);
}
catch (Exception ex)
{
    Console.WriteLine($"Ocorreu uma exceção genérica. {ex.Message}");
}
finally
{
    Console.WriteLine("Chegou até aqui");
}

// ----------------------------------------------------

new ExemploExcecao().Metodo1();

// -----------------------

Queue<int> fila = new Queue<int>();

fila.Enqueue(2);
fila.Enqueue(4);
fila.Enqueue(6);
fila.Enqueue(8);

foreach (int item in fila)
{
    Console.WriteLine(item);
}

fila.Dequeue();
Console.WriteLine($"removendo o elemnto: {fila.Dequeue()}");
fila.Enqueue(10);

foreach (int item in fila)
{
    Console.WriteLine(item);
}

// ------------------------------------------------

Stack<int> pilha = new Stack<int>();

pilha.Push(4);
pilha.Push(6);
pilha.Push(8);
pilha.Push(10);

foreach (int item in pilha)
{
    Console.WriteLine(pilha);
}

Console.WriteLine($"Removendo o elemnto do topo: {pilha.Pop}");
pilha.Push(20);

foreach (int item in pilha)
{
    Console.WriteLine(pilha);
}

// -------------------------------------------------------------------

Dictionary<string, string> estados = new Dictionary<string, string>();

estados.Add("SP", "São Paulo");
estados.Add("RJ", "Rio de Janeiro");
estados.Add("BH", "Belo Horizonte");

foreach (var item in estados)
{
    Console.WriteLine($"Chave: {item.Key}, Valor {item.Value}");
}

estados.Remove("RJ");
estados["SP"] = "São Paulo = valor alterado";

estados.Remove("");

foreach (var item in estados)
{
    Console.WriteLine($"Chave: {item.Key}, Valor {item.Value}");
}

string chave = "BH";
Console.WriteLine($"Verificando o elemnto {chave}");

if (estados.ContainsKey(chave))
{
    Console.WriteLine($"Valor existente {chave}");
} else {
    Console.WriteLine($"Valor não existe. è seguro adicionar a chave {chave}");
}