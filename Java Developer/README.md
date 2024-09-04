# Bootcamp Java 2024

### Principios de Desenvolvimento de Sofwtare Colaborativo

Conhecer a estrutura, a historia de criação e evoluça~p da linguagem java, além de suas plataformas, instalação e utilização de IDEs para Desenvolvimento   

- Obejtivos

    - Apresnetar a historia da linguagem Java   
    - Explorar os recursos de cada plataforma 
    - Configurar o ambiente para Desenvolvimento
    - Definir uma IDE e aumentar nossa produtividade

- Java basico

A linguagem de java é composta por um conjunto bem defiido de funcionalidades (features).

Java e uma linguagem de programação simples e fácil de entender, pois não contem complexidades que existiam em linguagens de programação anteriores, na verdade, a simplicidade era o objetivo do design dos povos Javasoft, pro que ele tem que funcionar em dispositivos eletronicos

é uma linguagem de programação orientada a objetos. Isso significa que em Java tudo é escrito em termos de classe e objetos

## Dominiando a linguagem de programação Java

IDes, para auemnatr nossa produtividade, nós podemos escolher algumas ferramentas denominadas de IDE - integrated Development Environment ou Ambinete de Desenvolvimento integrado. é um Sofwtare que dispoe de recursos que auxiliar no Desenvolvimento

- Aceleração de nossa escrita com Auto-Complete ou IntelliSense

- Formatação de palavras e blocos de codigos

- Análise de erro de sintaxe

- Compilação de programação

- Depuração (acompnahemnto) de excução o programa

    * classe executavel: uma classe capaz de incializar o conteudo do codigo dentro do projeto

    ```
    public static void main(String[] args) {
         // bloco de codigo   
        }
    ```

- Declarar uma variavel em Java segue sempre a seguinte estrutura:

    ```
    // estrutura

    tipo nomeVariavel = atribuição (opcional em alguns casos)

    // exemplo

    int idade = 23;
    double altura = 1.63

    ```
    - Declarar meteodos em Java segue sempre a seguinte estrutura:

    ```
    // estrutura

    tipoRetorno NomeObjetivoNoInfinitivo Parametros(s)

    // exemplo

   int somar ( int Numero Um, int NumeroDois)
    ```

IDES:

- Eclipse: é uma alternatica muito comum de encontrar ambinetes de Desenvolvimento, pricinciplamente pelo aspecto de uma interface simples, pligins para recursos adicionais, atalhos para operações de meni e de escrita e para quem trabalhar com Java Swing

- IntellliJ: é uma plataforma de codgio aberto para criação de IDes e  ferramnetas para desenvolvedores, mas nem todos os recusros estão disponiveis de forma gratuita

- VSC: Desenvolvido pela Microsoft, é um editor de texto muito simples e interativo que conta com inumeras extensoes, temas variados e integraçãp com tecnologias como NOdeJS e Java

- crtl + shift + p: aparece a opção de criar um novo projeto jaba, ele ja cria todos os coumentos possiveis

#### Sintaxe basica do Java

- Apresentra as regras essenciasi para a ccontrução de códigos com base na linguagem Java

- Anatomia da Classe: basicmanete consolidar tdodo aspectal estrutural da linguagem, seus por ques resumidamente

- Arquivo.java: Todo arquivo .java deve começar com a letra maiuscula. Se a palavra for composta, as segunda palavra deve também ser maiuscla, exemplo: 
        - Calculadora.java
        - CalculadoraCientifica.java

- Nome da classe do arquivo: A Classe deve posssuir o mesmo noeme do arquivo.java

- Objetivo: Explorar os tipos de dados numericos inteiros, numericos decimais, lógicos, cacteres e suas aplicabilidades. Explicar a diferencia entre definição de variaveis e constantes

    - nuemricos inteiros
    - tipos logicos
    - caracteres
    
###### os oito tipos primitivos em Java são

- int
- byte
- short
- long
- float
- double
- char

esses tipos não são considerados obejtos, e portanto representam valores brutos. Eles são armazenamdos diretamente na pilha da memoria

```
<tipo> <nomeVariavel> <=> <atribuiçãoDeValor>
```

* TIPOS DE OPERADORES

    - operadores aritmeticos
    - ||         ternario

            *   ```
            <expressao Condicional> ? (caso condição seja true) : (caso condição seja false)
            ```
    - ||         logicos
    - ||         relacionais
    - ||         unários
  


###### regras para a construção de uma variavel

1. deve conter apenas letras, underline (_), $, ou os numeros de 0 a 9
2. Deve iniciar com uma letra minuscla (boa pratica)
3. Nao pode conter espaços
4. Nao podemos usar palavras chave da linguagem
5. O nome deve ser unico dentro de um escopo

- Identação: BAdicamnete indetar é um termo utilizado para escrever o codigo do programa de forma hieráquica, facilitando assim a vissualização eo entendimento do programa

###### Java Beans

Uma das maiores dificuldades na programação é escrever algoritmos legíveis a n´veis que sejam compreeendidos por todo seu time ou por voce mesmo no futoro. Para isso a lingagem Java sugere, atrasves de conveções, formas de escrita universal para nossas classes, atributos metodos e pacotes

###### assuntos

- Estrutura inical
- Padrão de nomeclatura
- Declarando variáveis e métodos
- Identação
- Organização arquivos
- java Beans

###### metodos

- apresentar ccireteieros para criação de meteodos, parametros e visibilidade

- qual a porposta principal do mteodo

- qual o tipo de retorno esperado apos executar o meteodo

- quais os parametros serao necesarios para ececução do metodo

- o metodo possui o risoc de apresentar alguma exceção

- qual a visibilidade do metodo

Meteodos: 

todas as ações das aplicações são consideradas metodos. Uma classse é definida por atribuitos e metodos. em sua grande maioria, variavies de diferentes tipos e valores. Os mmteodos, por usa vez, correspondem as funções diposivenis dentro de nossas classes

- deve ser nomeado como verbo

- seguir o padrao camelCase (todas as letras minusculas com a exceção da primeira letra da segunda palara)

- atenção não exsite em javva o conceito de mteodos globais. Todos os metodos devem sempre ser definidos dentro d eum classe


```
public double somar (int num1, int num2){
    // logica - finalidade do metodo
    return ...
}

public void imprimir(String Texto){
    // logica - finalidade do meteod
    // esse tipo de meteodo noa precisa de retorno
}

public double dividir(int num1, int num2) throws exeception{
    // thors exception: indica que o meteodo utilizado podera gear uma exceção
} 

private void meteodoPrivado{
    // esse metodo nao estara visivel por outra calsse
}
```

###### Escopo

- escopo de classe
- escopo de metodo
- escopo de fluxo

Escopo pode ser entenido comom o ambinete onde uma varivael pode ser acessa. em Java, o escopo de variaveis vai de acordo com vloco onde la foi declarada

###### palavras reservadas

palvras reservadas são identifcadores de uma lingaugem que ja possume uma finalidade espeficia, portanto nao pode serm utilizados para nomear variaveis, classe, meteodos ou atributos

A lingaugem Java possui  52 palavras reservadas

###### java Doc

Apresnetar a ferramneta de documentação da linguagem e explorar como adicionar comengarios em nossso arquivos

###### Terminal e Argumentos

- explorar opções de entrea e saida simples de daods em uma aplicação em Java

- permite que o coidgo java seja executado via terminal

#### Introdução e Estruturas Condiconais com Java
 
- Controle de fluxo

    Controle de fluxo é a habilidade de ajustar a maneira como um programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas pode ser executadas seletivamnete, repetidamente ou ex epcionalmente



Porposta do curso: apresnetar os conceitos e explorar os tipos  de fluxox condicional, excepcional e de repetição em uma aplicação JAva

Assuntos:

    - Estruturas condicionais: if-else, switch-case
    - Estruturas de repetição: for, while, do - while
    - Estruturas de exceções: try-catch- finally, throw


A estrutura switch compara o valor de cada caso com o da variavel sequecialmente, e smepre que encontra um valor correpondente, executa o coidgo asssociaod ao caso. para evitra que as comparações continuem a ser executadas apos um caso correpsondete ter sido encotrado, acresentamos o comnaod break no final de cada bloco de codigo

    - Se optarem por usar switch / case, estudem um pouco sobre os conceitos continue, break e default

Laços ourepetições são representadas pelas seguiintes coisa 

- for (para)
- while ( enquanto)
- do while (faca enquanto)

estruturas excepcionais

 - De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é necerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação.


 * java. lang. nullPointerException : quando tentamos obter alguma informaçõa de uma variavel nula

 * java.lang.Arithmeticexception: quando tentamos dividri um valor por zero

 * java.sql.SQLException: quando existe algum erro relacionado a ingteração ao banco de dados

 * java.io.FileNotFoundException: quando tenatmos ler ou escrever em um arquivo que não existe
## POO com Java

POO é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, tambem conhecidos como atribui=tos e coidgos na form ade procedimentos, 

Enquanto a programação estruturada é voltada a procedimentos e funç~oes definidas pelo usuario, a programação orientada a obejtos é voltada a conceitos como o de classes e objetos

- Classes:

Toda a estrutura de codigo na linguagem JAVA é distruido em arquivos com extensão em java denominados de classe

 - as classes exsitents em nossos projeto serão composta por:
 
 - identificador 
 - caracteriscas
 - comportamnetos
 - classse (class)
 - Instaciar
 
 Getters e Setters: os meteodos são utilizados para bsucar valores de atributos ou defininr novos valores de aatrbatrbutos de instancias de classes

 Para uma lingaugem ser consideerada orientada a obejtos, esta deve seguir o que denominamos como os quatro pilares da orientação a objetos

 - Encapsulamento: nem tudo precisa estar visivel, grande  parte ddo nosso algoritmo pode ser distribuido em metodos com finalidaes especificas que complemneta uma ação em nossa aplicação

 - Herança: Caracteriscas e comportamentos comuns podem ser elevados e compatilhados atraves de uma hierarquia de objetos

 - Abstração; é a indisponibilidade para determinar a logica de um ou varios comportamentos em um obejto

- Pomorfismo: são as inumeras maneiras de se realizar uma mesma ação.

###### Collection Framework APi

- Uma coleção (collection) é um estrutura de dados que servepara agrar muitos elementso em uma unica unidade, estes elemntos precisão ser Objetos

- Uma collection pode ter coleções homogeneas ou heterogeenas, normalmente utilizamos coloções homogeneas de um tipo especifico

- O nucleo pricnipal das coleções é formado pelas interfaces, essas interfaces permitem manipular a coleção independente do nivel de ddetalhe que elas representam

- Temos quatros tipos de coleções

    - List (lista)
    - set (conjuto)
    - queue (fila)
    - Mp (mapa)

- Generics Type: um tipo generico é uma classe generica ou uma interface que é paratrizada em relação a tipos

- O simbolo <> é chamdado "diamond" ou "diamon operator" foi um recurso introduzido noo JAVA 7 e é usado no cpntexto de tipos genericos em JAva para inferir automaticamnete o tipo com base do contexto

Comparable X Comparator: são duas interfaces do mundo java

    - Comparable: fornece uma unica sequencia de ordenação. Em outras alavras, podemos ordenar a coleção com base em um unico elemento, como id nome e preco 

    - Comparator: fornece múltiplas seuquencias de ordenação. Em outras 
    palavras, podemos ordenar a coleção combase em multiplos elementos

    - LIST: é uma coleção ordenanda que permite a inclusão de elemtnos duplicados 
        - A interface LIST fornece meteodos uteis para adicionar elemntops em posições especificas, remover ou substituir elementos com base no indice e obter sublistas usndo

###### ganhanfo produtividade com Stream APi e Java

- A Strems Api traz uma novs opção para a manipulação de coleções em java seguindo os pricnipais da programação funcional 

- Stream, trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao ives da tradicional e burocatica forma imperativa

- Lambda
    - As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.

     - As interfaces funcionais desempenham um papel crucial na programação funcional em Java, pois servem de base para o uso de expressões lambda.

    - Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado.

    - As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

## Testes e Gereciamento de dependências em projetos JAVA

- Objetivos do Curso

    Criar um projeto utilizando a ferramenta
    entender os pirincipais conceitos por tras do Maven
    Gerenciar dependencias do seu porjeto
    COnfigurar plugins e projetos com cenessidades especicas

Percuso

    - Definição e instalação
    - primeiro porjeto e conceitos
    - POM, Dependencias e repositorios
    - Gerenciado Dependencias
    - Maven BUild Lifecycle
    - Multii modulos

O que é Maven?

    - Endereça como o software foi construido e suas depdendecias atraves do POM (project object model)
    - facilita a compreensão do desenvolvedor
    - fornece informações de qualidade

Entendendo o POM

    - POM - Project Obect Model
    - Unidade fundamnetal de trabalho
    - Formato XML
    - Detalha o projeto
    - Detalha como construir o porjeto
    - Maven sempre porcura pelo pom.xml para realizar sua execução

##### Teste unitarios com JUnit

Percuso

- Por que escrever testes unitarios

    Tambem chamado de testes de unidade, testes unitarios testam a menor unidade de codigo possivel, unidade: função, método, classes. testa uma aplicação na sua menor parte

    Situações no desenvolvimento de sofwatre que mostram a importancia de testes unitarios

    - compreender o codigo fonte
    - corrigir bugs com segurança
    - refatorar codigo sem introduzir bugs
    - entrgar com segurança uma nova feature


- Hello World, JUnit
- Aprofudando nos recursos
- Recursos detestes nas IDEs
- Boas praticas
- Conclusão


## banco d eDados SQL / NoSQL para desenvolvedores backend

- Introdução:

Introdução ao mundo do NoSQl, apresentar os tipos de bancos NoSQl assim como realizar pequenas operações em alguns deles com enfâse no MongoDB no qual iremos desde sua instalação, opções de uso na nuvem e operações de manipulação de dados

Percuso:

- Introdução ao NoSQL

    Entender os fatores que levaram a criação dos bancos noSQl
    Conhecer as principais diferenças gerais
    Conhecer as carcteriscas e vantagens do uso

    Tipos de banco NoSQL: Document Store, Key-Value Store, Wide-Column Store e Graph Store


- Conhcecendo os tipos de banco de dados NoSQl
- introdução ao MongoDb e instalação
- Schema Design e boas práticas
- Apredendo mais ssobre JSON e BSON
- Operações dwe manipulação de dados
- performance  de índices
- Agregações

Nos: são nosso dados especificamentes, podendo ter diversas tipos de caracteristicas.

Chave valor:

 - Armazena um conjuto de dados, seja ele simples ou complexo identificados por um identificador exclusivo.

    - Bom desempenho em aplicações na nuvem.
    - menor capacidade de busca

- uso: cache, memoria, etc.

iremos utilizar o Redis um banco de dados, chche, messageria e fila

- alto desempenho
- estrutura de dados na memoria
- versatilidade de uso
- replicação e persistencia

Documento:

- Dados e documentos autocontidos e autodescritivos. Permite redundância e incosistencua
- Livre de esquemas podemos utilizar json, xml entre outros

BSON:

- é uma serialização codificada em bínaroi de documentos semelhantes a JSON

- COntém extenções que permitem a representação de tipos de dados que não fazem parte da especificação JSON. Por exemplo, BSON tem um tipo Date, ObejtcID

## ganhando produtividade no Java com spirng framework
