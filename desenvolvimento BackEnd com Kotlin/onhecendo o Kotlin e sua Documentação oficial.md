
# Desenvolvimento Backend com Kotlin
## Conhecendo o Kotlin e sua DocumentaÇÃO oficial

Percurso:

- 1 Introdução ao Kotlin
- 2 Como instalar o Kotlin
- 3 Por que Kotlin

#### Introdução ao Kotlin

Koltlin é uma linguagem de programação um tanto quanto recente, mas já madura, destinada a tornar os desenvoolvedoras mais felizes.

è concisa, segura, interoperal com Java e outras lingaugens, alem de oferecer muitas maneiras de retulizar codigo entre varias plataformas para uma programação produtiva

##### Instalçaõ do Koltin:

Koltin esta incluso no IntelliJ IDEA e Andorid Studio. entretando podemos usar o Kotlin sem nenhum desses IDEs, atraves do Kotlin PlayGorund

### !ver caderno de estudos para mais links e infomações!

Por que o Koltin?:

é concisa, segura, interoperal com Java e outras lingaugens, alem de oferecer muitas maneiras de retulizar codigo entre varias plataformas para uma programação produtiva

### Introdução Prática à Linguagem de Programação Kotlin

Dominar a sintaxe do Kotlin atraves de exemplso (hands on) Embora ler sua documentação seja facile agradavel, aprender na pratica e mais eficaz

##### Introdução ao Kotlin na pratica

- Ola mundo
- O baisco sobre funções
- variaveis
- Null Safety
- classes 
- generics

Tdos os exercicios serao retirados pela propria documentação do Kolti, visualizar exerciciosno site

Existe um pacote padrão, quando voce não definir um pacote para o codigo que voce esta escrevendo.

Inix Functions and operator Functions

Declarar função no Kotlin: 


            Fun nome da funcao() {
                  // bloco de codigo
            }

no Koltlin, podemos escolher caso se a função retorna alguma coisa ou não.

No Kotlin, não existe a contenação, fazendo assim a lingaugem de programação ser menos verboso que outras linguagens e mais limpo para que alguem possa ler e entdner o codigo

As funções podem ser declaradas fora do main, sendo depois puxados para dentro do main

* Parametros do tipo VARagr:  é um tipo de parametro uma quantidade indefinida de um determinado objeto, por exemplo: 

      fun printMessage(message: String): Unit 
      {                               
      println(message)
      }

vemos que nessa função do tipo VARagr, ele aceitara todos os objetos do tipo String, que foi defenido na propria sintaxe. è como se fosse uma lista.

* variaveis no Kotlin:

var: uma variavel mutavel, que se pode mudar a qualuer hora no codigo

val: uma constante, não se pode mudar o valor dessa variavel ao percorrer do codigo

VER EXEMPLOS NOS CODIGOS DE KOTLIN.

* Null Safety:

Declara e trata aquela variavel que pode, ou nao, ser nula

   - var neverNull; o valor nesse tipo de variavel nunca pode ser nula.

   - var nullable: a variavel pode sim ser seu valor como nula

   - var inferredNonnNull: o compilador assume que o valor sera não nulo

* classes:

Estruturas de dados que a gente consgeue moldar a apartir de nossas necessidades. e um modelo para a criação de objetos

estrutura de uma classe:

          class 'nome da classe'("variaveis que voce desjea declarar)

----


          class Customer                                  // 1

          class Contact(val id: Int, var email: String)   // 2

           fun main() {

            val customer = Customer()                   // 3 instaciando a classe
    
            val contact = Contact(1, "mary@gmail.com")  // 4 criado um objeto a apartir da classe

            println(contact.id)                         // 5
            contact.email = "jane@gmail.com"            // 6
}

##### Estruturas de Controle de fluxo e Coleçoes em Kotlin

* Objetivo Geral: Explorar as principais estruturas condicnionais e de rpetição (controle de fluxo), além de conhecer allgumas das principais Coleçoes do Koltin.

- Controle de fluxo

    - When
    - Loops
    - Rangens
    - Verificações de Igualdade
    - Expressoes condicnionais

- Coleções:
     
     - Listas (list)
     - Conjuntos
     - Mapas
     - Extension Functions


* When: equivalente ao switch case de outras linguagens de porgramação, o when é basicamnete a mesma estrutura condicional, porem amais maleav2el e facil de trabalhar com ele no seu codigo

Tipo Any: pode recebr qualquel coisa como paramentro, pode ser qualquer tipo de dados

* When Expression: ao inves de executar uma instrução, agora ele esta fazendo uma atribuição, uma função que recebe qualquer coisa e retorna qualquer coisa, aqui etsamos verificando os valores de entrada, para que possamos fazer uma verificação


* Loops: For, While, do-while, iterators

laços de repetição, que intera cada elemento dependenod da necessidade.

Iterator: são implementações de algo ser interado percorrendo elemntos de uma estrutura de daos, no kotlin ele da a possibilidae implementar interator personalizados dentro das nossas classes, instancia interavel

* Ranges:

   - Intervalos dentro da lingaugem de porgramação do Koltin, eles são ferrmanetas que capacitam de fazer nosso codigo mais limpo

   - podemos usar ranges em estrturas de repetiçao, veja alguns operadores de ranges:

           for(i in 0..3)
           for(i in 0 until 3)
           for(i in 2..8 step 2)
           for(i in 3 downTo 0)

##### Equality Checks:

Existem duas formas de decalrar igualdades de um objeto

Comparação Referencial: Sintaxe de tres iguais (===)

Comparação Estrutural: Sintaxe de dois iguais (==)

Sintaxe: 

```

fun main() {


  val authors = setOf("Shakespeare", "Hemingway", "Twain")
  val writers = setOf("Twain", "Shakespeare", "Hemingway")

  println(authors == writers)   // 1 true, por causa que os elemntos Existem em ambas listas
  println(authors === writers)  // 2 false, a ordem da lista não foi respeitada

}


```

##### Estruturas de dados

- List: uma lista e uma estrtura de daos ordenanda, uma lista mutavel ou imutavel conforme nos instacianos no codigo, como por exemplo:

listof(): criação de uma lista imutavel, apenas que podemos acessar-lá e não mudar sua estrutura

mutablelistof(): criação de uma lista mutavel, podemos acessar e mudar sua estrutura, acresentado valores, modificando, etc.


- Set: No Kotlin, a função set não é chamada explicitamente, mas é parte do suporte à sintaxe para operações de atribuição em propriedades. Ela é usada em conjunto com a função get para criar propriedades que podem ser acessadas e modificadas como campos públicos, mas permitem controle personalizado sobre o comportamento de atribuição. A função set é automaticamente acionada quando um valor é atribuído à propriedade

- Map: como a list, tambem existe as mutaveis e as imutaveis

### Orientação a Objetos e Tipos de Classes na Prática com Kotlin

Objetivo Geral: Cnhecer os pricnipais tipos de classes do Kotlin, as quais nos oferecem possibilidades poderosas para tecnicas de programação orientada a Objetos (POO)

- Abstração: Habilidade de concetra-se nos aspcetos essenciais de um dominio, ignorando caracteriscas menos importantes ou acidentais. Nesse contexto, classes e obejtos são abstrações de entidades existentes no dominio/problema em quest~questão

- Encapsulamento: encapsular siginifca esconder a implemmentação dos obejtos, cirnado assim interfaces de usos mais concisa e faceis de usar/entender. o Encapsulamento favorece pirncipalmente dois aspectos de um sistema, a manuntenção e o melhoria

- Herança: Permite que as classes compartilham suas caracteriscas (propriedades) e comportamnetos (funções) entre si. A herança é usada na intenção de promover o reuso de codigo atraves de estrturas masi genericas e flexiveis.

- Polimorfismo: Capacidade de um obejto pode ser referenciado de varias formas, ou seja, e capacidade de tratar obejtos criados a partit das classes especificas como obejtos de uma classe generica.. Esse conceito nos oferece possiblidades incriveis para a criação de soluções mmais genericas

###### VER EXEMPLOS DAS DEFUNIÇÕES ACIMA, NO CODIGOS

A clase que vai ser a classe "mãe", devera conter open no inicio da sintaxe.

Special Classes: 

   * Data Classes: são classes projetadas que usamos para porjetar valores, elaa ja implemnetada funções que sao relevantes para esse tipo de estrutra, que usamos comom comparação de objeto, para facilitar a manipulação

   * Enum class: esse tipo de classe represnetam um numeor finito de possibilidaes dentro de uma estrtutra,e uma forma de representar constantes, valores estaticcos, são distintos para representar algumas coisas

   * sealed class: um tipo de classe especifico, referencia o encapsulamento, não permite que a classe sealed, ela nao pode ser instaciada, apenas na propria classe, como se fosse o private do python , java, C3 etc.

#### O Poder das Funções em Kotlin

Avançar nossos estudos em conceitos mais avançados da linguagem de programação Kotlin, explorando funções de escopo e novos tipos

- let
- run
- with
- apply
- also

Alguns tipos de funções:

- Infix 
- Operator
- Higher-Order
- Lambda
- Extensions
- Suspend

let: ela pode exercer duas funções, uma função de escopo ou ser uma função auxiliar para a verificação de nulo, ela necessita de um retorno

run: retorna qualquer valor a partir de um objeto do qual o escopo se originou e refere-se a esse objeto como this. o run para mudar os atributos de product e utilizamos o this para referenciar o escopo do objeto:

apply: porque ele executa um bloco dentro de um determinado objeto e conseguimos fazer atribuações considerando os atributos do objeto, ver EXEMPLOS

##### Infix Functions

São funções que podem ser convertidas atraves de funções de classes ou funções que possuiem um unico paramentro

##### Operator Functions

Certas funções que podem ser atualizadas para operadores, permitindo que suas chamdas sejam chamdas de maneira correspondentd

##### High-order Functions

São funções de alta ordem, que basicamnete que podem receber outras funções como paramentro, ou retornar outras funlçoes como reposta de sua propria função

 
##### lamba functions

Kotlin permite o uso de lambdas, que são funções anônimas bem mais versáteis, limpas e fáceis de serem utilizadas.

```
val contemCaracteresSuficientes: (String) -> Boolean 
= { nome -> nome.length >= 6 }
contemCaracteresSuficientes("Jefferson") //Retorna true
```

No exemplo acima definimos uma lambda que recebe uma String e retorna um Boolean, onde o objetivo é simplesmente validar se a quantidade de caracteres da String é maior ou igual a 6. Uma vez que a lambda foi associada à constante contemCaracteresSuficientes, é possível reutilizar a funcionalidade quantas vezes for necessário.

##### Tratamento de Exceções em Kotlin

Todas as execeções herdam da classe throwable

Excecção nada mais é um erro inesperado dentro do nosso codigo que precisamos lidar e corrigir.

Quando faz setindo lançaar uma execao, é lançado quando um fluxo alternativo no codigo, onde um erro acaba ficando na implemmentação

Unit: algo sem retrono na lingaugem do Kotlin

Checked exceptions: Diferetemente do java, o kotlin não existe execções verificadas, que são expressoess que obrigam o desevolvedor a tratar dentro de um bloco TryCatch

No Koltin, nunca sera obrigado a tratar uma execeção.

#### Desafios de Projetos
