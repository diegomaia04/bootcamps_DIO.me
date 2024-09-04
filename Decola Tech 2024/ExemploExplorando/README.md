## Novo Modulo, 2

Peruso do novo Modulo

- Prpriedades, méteodos e construtores
- Manipulando valores
- Exceções e Coleções
- tuplas operador ternário e desconstrução de objeto
- Nuget, serializar e atributos no C#
- Tipos especiais no C#
- Stack, Heap e GArbage Collector

Explorar a lingaugem C#, apresentando diferentes possiblidades e capacidades da linguagem, bem como nos aprodfundarmos mais sobre suas caracteriscas

### Propriedades, Mteódos ee Construtores

Propriedades: uma propriedade é um membro que oferece um mecanismo flexivel para ler, gravar ou calcular o valor de um campo particular

Criação de uma pasta para armazenar os novos dados e praticas de codigo nessa pasta

Para isso presicamos digitar um codigo que formata uma pasta e cria um novo campo de codidificação para nos.

        dotnet new console


Na propeiedade Pessoa que criamos o comando prop existem dois coomando, o get e o set. 

- Get: o get e o comando utilizado para puxar e receber o valor destinado para aquela variavel
- Set: ja o set e utilizado para desmontrar e obter o valor e mostrar o valor

!!! Nesse Modulo iremos melhorar nossa codificaçõa com pensamneto logico de programaçõaa, se utilizando de programas anteriores no primeiro Modulo para melhorar esses codigos. ( caso nao saiba, a documentação de todo codigo e do README ja esta no repositorio)

- public: todas as classes podem aceessar o metodo que aquele tiver o metodo publico
- private: como o nome ja diz é uma classe privada que pode ser acessado na classe qu foi criado

* Metodo: Um mteodo é um bloco de codigo que contem intreuções de como o sistema deve seguir

- Lista: e uma coleção de um determinado conjuto de variaveis, classes ou objetos, uma coleção do tipo oublico ou privado, nesse modulo vamos utilizar da classe pessoas.

Retorno: 

* Count: vai retornar o numero total de qunatidade de objetos na lista
* return: todo metodo que exigir um tetorno essa palvra reservada, é obrigadtorio para o tipo de retorno para algum metodo

* Qualuqer coisa difenrente de void precisa obrigatoriamnete de um tipo de retorno

- Construtores: Os construtores permitem que o prpgramador defina valores padrao, limite a instanciação e grave codigos flexiveis e faceis de ler. 
      
  - Importante: todo construtor tem o mesmo nome da sua classe, ou seja, na classe que o construtor for construido, eles deverao ter o mesmo nome, nao precisa de retorno

  ###  Manipulando valores

  Vamos aprender a como represnetar um tipo de dados com outros tipos de reprenstações

  - Concatenação de String: podemos formatra valores em diveras reprentações. Essa formtação de valores é conhecida por concatenação ou interpolação, varias strings

  - O outro jeito de concatenar uma string é atraves de uma forma chamda interpolação de string, o resultado apesar de ser o mesmo a sinatxe do odigo e difenrete, por exemplo, utilizamos na interpolação antes do texto o simbolo de dolar ($), unica string

  - Nesses casos, as variaveis sempre estarao entre chaves.

  - quando utlizamos o simbolo "+" em duas variaveis do tipo string, ele se compotara como uma junção de textos, e não como uma operação matematico

  * Trabalhamos com o DatTIme, ver exemplos no codigo e links que o professor disponibilizou no fim da aula.

  ### Exceções e Coleções

  - Exception:

  Os recurso de manipulaçãp de exceção da lingaugem C# ajudam voce a lidar com quaisquer situações exepcionais ou inesperadas que occorream quando um program foe executado.

 No projeto ciramos uma nova pasta arquivo para a leitura do mesmo em formato de codigo atraves do aprendizado na aula

  - na leitura de um arquivo, cada linha pode ser retornada como uma string.
  - File: classe propria do C# para a leitura de arquivos

  Sintaxe:

    string [] linhas = File.ReadAllLines("caminho do arquivo");

Esse formato é usado para ler todas as linhas de determinado arquivo escolhido
0
    foreach (string linha in linhas)
    {
    Console.WriteLine(linha);
    }

Já esse bloco de codigo usamos para percorrer o arquivo que foi puxado pelo pela string e impirmir ele no console. 

Tipos de execeções:

- Exceção Genérica
- Exceção especifica

* Dictionary: uma dicitinary é uma coleção de chave-valor para armaezenar valores únicos sem uma ordem espeficia

#### Desafio de COidgo do Modulo

O desafio sera realizar um peuqno sistema de estacionamneto que registre veiculos e suas horas no estacionamneto, o menu devera ser assim:

* 1- cadastrar veículo
* 2- remover veiculo
* 3- Listar veicculo
* 4-Encerrar

O programa deve caluclar o tempo que o carro ficou no veiuclo e calcular a conta de quanto o motorista deve pagar pelo tempo gasto

- enunciado do desafio disponibilizado no github da DIO.me

## Desafio de projeto
Para este desafio, você precisará usar seus conhecimentos adquiridos no módulo de fundamentos, da trilha .NET da DIO.

## Contexto
Você foi contratado para construir um sistema para um estacionamento, que será usado para gerenciar os veículos estacionados e realizar suas operações, como por exemplo adicionar um veículo, remover um veículo (e exibir o valor cobrado durante o período) e listar os veículos.

## Proposta
Você precisará construir uma classe chamada "Estacionamento", conforme o diagrama abaixo:

* 1- cadastrar veículo
* 2- remover veiculo
* 3- Listar veicculo
* 4-Encerrar

A classe contém três variáveis, sendo:

**precoInicial**: Tipo decimal. É o preço cobrado para deixar seu veículo estacionado.

**precoPorHora**: Tipo decimal. É o preço por hora que o veículo permanecer estacionado.

**veiculos**: É uma lista de string, representando uma coleção de veículos estacionados. Contém apenas a placa do veículo.

A classe contém três métodos, sendo:

**AdicionarVeiculo**: Método responsável por receber uma placa digitada pelo usuário e guardar na variável **veiculos**.

**RemoverVeiculo**: Método responsável por verificar se um determinado veículo está estacionado, e caso positivo, irá pedir a quantidade de horas que ele permaneceu no estacionamento. Após isso, realiza o seguinte cálculo: **precoInicial** * **precoPorHora**, exibindo para o usuário.