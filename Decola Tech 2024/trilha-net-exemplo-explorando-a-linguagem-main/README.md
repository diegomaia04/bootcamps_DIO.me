# Introdução a linguagem de progrmação C#
## Introdução e dominação ao .NET

- Obejtivo Geral: Apresentar a historia do .NET, como surgiu, aplicações e o que voce pode fazer com ele. A evoulução da plataforma .Net, principais IDEs, Apresentar de maneira prática seus fubdamentos e suas logigas de programação, ccrinado algoritmos para deostra seu desempenho

Percuso:

* Introudção ao.NEt,  historia, versoes, usos
* Diferenças entre .NET Framework (legado) e .Net
* Compilador .NEt e seu funcimaoneto
* Configuraçãp do amibiete e IDEs
* Sintaxe e Indetação
* Tipos de daods
* Operadores de atribuição
* Operadores condicioanis
* operadores lógicos
* operadores aritmeticos e a classe Math
* Estruturas de repetição
* Estrutura de um programa e meteodo principal
* Array List

#### Introudção ao.NEt,  historia, versoes, usos

O .Net é uma plataforma de desenvolvimento unificado que permite a construção de sistemas e aplicções, ou seja o .NEt é um tipo de IDE. è mantiddo e foi cirado pela microsoft, e uma open source. Pode desevolver os seguintes plataformas, ela trabalha com tres linguagens: C#, F# e Visual Basic

O .NET fornce as seguintes bibliotecas:

- Desktop
- Web
- Mobile
- Gaming
- Iot (intert of things)
- AI

C# é uma linguagem de porgramação usada no .NET

###### historia do .NET

A microsoft começou a trabalhar no C# no finaldo dos anos 90, tendo sua primeira versao do framework lancanda em 2002, tendo como obejtico competir com o JAva.

O conceito de multiplatadofrma era estrondoso na época, e a microsoft trabalhou em melhorias e implementações di sistema em sua plataforma, mas foi impeida pela Sun

Isso o motivou a microsoft a desevolver um ecossietma intregado ao windows, que fosse facil paara deswolvover aplicativos desktop e web, e que fosse amarrado apenas ao windows, aumentando assim a sua revelancia

#### Diferenças entre .NET Framework (legado) e .Net

 O que é framework? é um conjunto de códigos prontos que servem como estrutura para auxiliar no desenvolvimento. Esses códigos trazem funcionalidades já determinadas para agilizar o processo e evitar que as pessoas tenham que reescrever essas funções frequentemente.

 A versao .NEt, que é a versão mais atual, foi reescrita do zero, para funcionar em multiplatarformas, e não somente em uma plataforma, sua ultima versao é a 4.8

 A versão .NET Framerwork foi criado e escrito apenas para funcionar na plataforma windows, onde ja bvem pre-instalado, e impossivel rodar em outras plataformas, como o linux e MAC, sua ultima versao é a 3.1

 #### Compilador .NEt e seu funcionamento

 Smepre quando queremos mudar ou alterar algo do nosso codigo, nos iremos utilizar o compilador .NET para realizar essas mudanças

 - Lingaugem de alto nivel: A linguagem que entedemos e escrevemos nosso codigo fonte

 - linguagem de baixo nivel: A linguagem que a maquina entende, posssui ouca abstração, sendo dificil de entender

O que é um compilador: è um programa que realiza a conversão de linguagem de alto nível para baixo nível. Caminhos para a realização desse compilador

High Level Language => Lexical analyser => Synrax analyser => Intermediate code generator => Code Optimizer => Code generator => Machie Code 

- Compilador: é um programa que realiza a conversao de linguagem de alto nivel para baixo nivel. Exemplo: C#, Java

- Transpilador: é a conversao de uma linguagem ou implemmetação para outra/ A sua Saida permanece em linguagem de alto nivel

Linguagem compilada: São lingaugens o codigo fonte é traduzido para o codgio de maquina. Exemplo; C#, Java

lingaugem interpretada: São linguagens que fazem a leitura e interpretação diretamente do codgio fonte. Exeplo: javaScript Php

 #### Configuraçãp do amibiete e IDEs

 O que é uma IDE?:

 Uma Ide (integrad development Environment), ou amibiente de desevolvimento inttregado, é um software que facilita e integra diversas facilidaaes para a escrita e deupuração do codigo

 Visual Studio é a pricnipal IDE para o .NET com susporte para outras linguagens de programação, e gratuita, o debug rico em detalhes

 Visual Studio Code e um editor de texto usado para facilitar o desevolviemnto de diversas linguagens, totalmente fratuito, possibilidade de instalar extensões, Muito leve em performance

 Rider: tambem é um IDE para o .NEt, rico me funcionalidades, Forte integração com o .NET, facilidade em trabalhar com o Unity, Recomnedações de refatoração de código, atalhos e comando que aumentam a produtividade


- E nessario baixar o .NET SDK no site da microsoft.

Apos nos instalamos o .NET SDK, vamos para o visual studio code e utilizaremos o terminal, sempre que usamos algo relacionado comm o >NEt, temos que digitar primeiro o dotnet

```
dotnet new console
```

ele cria um novo projeto em dotnet

Instalar um extensão que vai facilitar o decorrimento das ualas e aprendizado do coidgo C#

C# extensions for JosKreativ

#### Sintaxe e Indetação

Vamos estudar como é composto um projeto, classes e suas convenções no C#

nessa etapa sera algo mais pratico, logo os programas fetiso estarao no repositorio 

     dotnet --info

codigo que mostra as informações sobre o arquivo .NET instalado na maquina



```
dotnet new console
```

quando executamos esse codigo é cirado dois arquivos e duas pastas

arquivos:

- Program.cs
- NomedaPasta.csproj
   - um arquivo de projeto do c#, nele contemos algumas essssecnias que sao descritivas do projeto, ou seja, sao metadados, linguagem xml

Pastas:
- bin
- obj

essas pastas são geradas automaticamentes, que sao um estrutura basica do projeto.

criação de arquivos json para docuemtação do projeto.

criação da primeira classe e entender sua estrtura e organização dentro do visual studio code

Toda nome de classe tem que comecar com letra maiuscula

      prop

- atalho no C# para a criação de uma prorpiedade dentro do C#

nao importa a ordem, de atributos e meteodos dentro de um classe

Toda ação temos que fazer no Program.cs pq ele é o ponto de entrada do sistema 

"\n" quebra de linha pelo comando

- Sintaxe: Conjunto de regras que deve-se obedecer, se não o C# não compilar o codigo

- Converções: padronizar nossas codificações, não é obrigatorio, porém fica mais ilegivel

Tipos de Cases

* camelCase
* PascalCase
* snake-case
* spinal-case

### Modulo Fundamentos

#### Tipos de daods

###### obs: 

para algum bloco de codigo, e preciso selecionar, e depois apertar crtl + k + c.

- String: a series of characteres
- char: a unicode character
- object: Object type
- bool: Boolean value
- byte: 8-bit unisgned integer
- decimal: decimal values with 28-29 significant digits
- double: 64 bit double-precision floating point type
- int 32 bit signed integer type
- floatt: 32 bit single-precision floating point type
- long 64 bit signed integer type
- uint: 32 it unsigned integer type
- short: 16 bit signed integr type
- ulong 64 bit unisgned integer type

-----

DateTime; é uma maneira de reprensetar datas na lingaugem de programação C#

o codigo para mostrar o dia atual e o horario que a maquina esta

```
DateTime dataAtual = DateTime.Now;
Console.WriteLine(dataAtual);
```

o codigo para mostrar do dia atual mais a quantidade de dias desejados, com o horario atual.
```
DateTime dataAtual = DateTime.Now.AddDays(numero de dias);
Console.WriteLine(dataAtual);
```

o codigo as eguir so passa a data, pode ser usado em qualquer tio de DataTime, em dia futuros ou em dias atuais, exemplo
```
DateTime dataAtual = DateTime.Now.AddDays(numero de dias);
Console.WriteLine(dataAtual.ToString("dd//MM/yyyy"));
```

- o valor de uma variavel pode mudar conforme o jeito que declara ela, exemploo( ela respeitara a ordem da sintaxe):
      - ver exemplo nos codigos
- isso se chama de alteração de uma variavel ja declarada anterioamente.
- podemos declarar varias variavies de um mesmo tipo em uma unica linha, desde que elas sejam da mesma categoria de vaiaveis

----------------------------------------------

#### Operadores de atribuição

O operador de atribuição "=" atribui o valor do opreando do lado direito a uma variavel, uma "=" ou um elemento indexador fornecido pelo operando do lado esquerdo. O resultado de uma expressão de atribição é o valor atribuído a uma operando do lado esquerdo. O tipo de operandos do lado direto deves er do mesmto tupo ou implicitamenre conversivel para o operando do lado esquerdo

- Impossivel transformar String para int, para trabfromar variaveis elas precisam ser do mesmo tipo, por exemplo, float para int, vice-versa

Podemos utilizar dois tipos de codigos para conevtertipos de variaveis

- O primeiro é o Covert


      int a = Covert.ToInt32(5);

- o segundo tipo e

      int a = int.Parse("5c");

Conervsao para o tipo String. Para ser reconhecido como string é preciso estar entre aspas duplas

 - Outro jeito é declarar o numero como int e depois converter o valor declarado como int por exeplo em string, como exemplo


         int inteiro = 5;
         string a = inteiro.ToString();

- O proprio ToString vem do proprio C#, de uma propria classe do C# atraves da orientação de objetos

###### o que é um Cast Implícito 

- significa uma conversao de diferentes tipos que nao precisa utilizar a conversao pois ele se converte automaticamente por voce
 
       int a = 5;
       double b = a;
       Console.WriteLine(b);


Ordem dos operadores, nas contas que realizamos no C#, ele respieta as ordem na matematica, em preferencia de parenteses, chaves, de divisao, multiplicação e tec

a sintaxe de codigo, é uma tentaiva de saida com uma espera de erro vindo od codigo, o "out b" e uma tentativa de converter o "b" para o "a":

      string a = "15";
      int b = 0;
      int.TryParse(a, out b);

-----------------------------------------------------------------------

#### Operadores Condicionais

 O operador condicional possibilita mudar o fluxo de execucao de seu codigo, indicando um caminho que ele deve percorrer

 exemeplos de condições: if, ifelse, switch case, etc.

* if aninhado, exemplo:

      if(condicao){
         // bloco de codigo
      }
      else if(condicao2){
        // bloco de codigo
      } else {
        // bloco de codigo
      }


 Afinal, o que é debugar um código? O debug é um processo que ajuda a identificar e remover inconsistências no código-fonte do programa. Sabe quando ocorre uma mensagem de erros inesperados ou quando uma ação do usuário não funciona? Às vezes uma simples depuração pode resolver esse “bug”.

Falamos acima que um bug pode acontecer quando um usuário tenta abrir uma página ou painel, mas não conseguir executar a ação. E esses casos podem acontecer apenas porque há um erro de digitação de código, independente da linguagem. 

Detalhes, que podem soar pequenos para todos, na programação impedem que o sistema desempenhe as tarefas da maneira correta. Para solucionar esses problemas é importante entender o que é debug e sua aplicação. 

Além de ajudar a evitar os erros, o debug ainda aumenta o tempo de vida útil de um sistema. Afinal, se houver muitos travamentos, as pessoas deixarão de usá-lo. Sem contar que programas que funcionam bem garantem a confiança do público, sejam aplicativos de banco, sites ou jogos de computador.
       

* case: estrtura condicional, da mesma forma que o if, porem e um pouco melhor e mais pratico para aqueles que tem muitos caminhoss que o cdigo podem seguir ou muitas opções a seu dispor

#### Operadores Logicos

- Operador OR (Pipe, ||)
- Operador AND (&&) obs: todas as condições precisam ser verdadeiras
- Operador NOT (!)

----------------------------------------
#### operadores aritmeticos e a classe Math

São operadores que utilizamos na matetimca e tambem no c# para a realização de contas matematicas, a classe Math, é uma classe que possibilita fazer cálculos mais complexos

- +: Addition, adds together two values (x + y)
- -: Subtraction, Subtracts one value form another (x - y)
- *: multiplication, multiplies two values (x * y)
- / : Division, divides one value by another (x / y)
- % : Modulos, returns the divider remainder (x % y)
- ++ : Increment, increases the value of a variable by 1 (x++)
- -- : descrement, decreases the value of a variable by 1 (x--)
-------------------------------------------------

#### Estruturas de repetição

Tambem conhecida como laco de repetição, uma execução rpeteidas vezes que termina checando a repetição novamente ate que ela seja falsa, so assim o laco tremina e o codigo é finalizado

FOR: possui tres sintaxes basicas que o for necessita , elas são

- Declaração da variavel
- Condição
- Incremento

Sintaxe:

        for(declarao da variavel;, condicao;*, Incremento){
            // bloco de codigo
        }

** a condicao decide ate quando o codigo vai ser repetido

WHILE: enquanto a condição true ou false, depdendo do codigo ela se repetira

- CUIDADO:  muito cuidado para não cair em uma condição que vai deicxar emum laço infinito

Sinatxe:

         while(condicao){
            //bloco de codigo

            //opcional caso queira parar o sistema
            if(condicao){
                  break;
            }
         }

DO WHILE: mais uma extensao do while, porem a sua verificação e executa no final do codigo e enquanto no bloco do indeonedet da codnicao do while

Sintaxe:


        do{
            // bloco de codigo
        } while(condicao);

-----------------------------------------------
#### Array List

O array e uma estrutura de daos que armazen valores do mesmo tipo, com um tamnho fixo

       * 1: int[] array = new int[4];
       * 2: int[] array = new int[] {42,75,74,,61};
       * 3: string[] nomes = {"Jan, "Fev};

Indice: é a posição de um determiando valor de um array, sempre comecando com zero

foreach: A instrução foreach enumera os elementos de uma coleção e executa o bloco correspondente para cada elemento dessa coleção. A instrução do executa condicionalmente o bloco correspondente uma ou mais vezes

Apos declarar um array, caso queria mudar a capacidade de armazenamento dele, é preciso utilizar a biblioteca ddo array, sendo assim precisa usar um codigo dentro do poro do c#, exemplo:

      Array.Resize(ref nomeDoArray, nomeDoArray.Length * (quantidade dde vezes que voce desja aumentar o array));

Redimensioando o array, em teoria:

 Cirar um novo array com uma capacidade de armzamento maior e copiar os dados e o armazenamneto de um outro array com capacide menor

 - Sintaxe:

      int[] NomeDoNovoArray = new int[NomeDoAntigoArray.Length * 2];
      Array.Copy(ArrayAntigo,ArrayNovo,ArrayAntigo.Length);

##### Listas

Uma lista é um "Array melhorado", ela tamebm e capza de represtra coleoces de um objeto de um mesmo tipo, no arrat temos que passar uma capacidade de obrigatorio, porem em uma lista noa somos obrigados a colocar um limite, podemos colocar sem limites em uma lista.

A lista é cmo se fosse uma extensao de um array, sendo mais pratico e facil de manuisear do quee o array.

- Sintaxe

         List<string> listaString = new List<string>();

Para adicionar é possivel fazer de duas formas, usando o Add ( que so adiciona um elemnto de cada vez) ou o AddRange ( que adiciona varios elementos de uma vez so) =. Lembrando, os elemntos tem que ser do mesmto tipo de variavel em que a lista foi declarado

Agora passa o acesso dessa lista é semelhante ao acesso que fizemos para o acesso do array, podemos usar o for ou o foreach, o amsi recomenado é o foreach

