# 🖥️Python!

🤖[link importante para python](https://wiki.python.org.br/PythonBrasil)🤖
---
### Principais conceitos de python

❗Para documentar algo na linguagem python se usa "#" ❗

#### 🎲 Dados 🎲


* Existem tipos de dados na linguagem python. Eles servem para definir as caracteriscas e comportanementos de um valor(objeto) para o programa. Os tipos são: 

Texto > ``` srt ``` 

Numerico > ``` int && float && complex ``` 

Sequência > ``` list && tuple && range ``` 

Dicionario > ``` dict ``` 

Coleção > ``` set && frozenset ``` 

Boolenao > ``` bool ``` 

Binário > ``` bytes && bytearray && memoryview ```

---------

#### 🤬 Modo Interativo 🤬

O interpretador Python pode executar em modo que possibilite o desevolvendor a escrever o codigo e ver o resultado na hora. Existem duas formas de inicar o modo interativo: 

* Escrevendo (python)  no terminal de comando do vscode, para sair do modo interativo do termianl é ```exit()```

* executar o script com a flag -i( sendo que "flag" é o nome do arquivo que vc deseja executar)

-----------

#### 🧩Função dir e help 🧩

* dir: Sem arguemntos, retorna a lista de nomes no escopo local atual. Com um argumrntos, retorna uma lista de atributos validos para o objeto. Exemplo: 

```dir()- Sem Arguemntos ``` 

```dir(100)- Com Arguemntos ```

* help: Invoca o sistema de ajuda integrado.è possível fazer bsucar em modo interativo ou informar por parametro qual o nome do modulo, função, classe, meteodo ou variavel ele fala qual são os argumentoss que o mteodo recebe e o que ele retorrna. Exemplo:

```help()- Sem Arguemntos ``` 

```help(100)- Com Arguemntos ```


-----------
#### 🔷 Variaveis e Constantes 🔷 ####


* Variaveis em lingaugens de programça~p podemos definir valores que sofrer alterações no decorrer da execução do programa. Esses valores recebem o nome de variaveis pois eles nascem com um valor e nao necessariamnete deem pernacem com o mesmo durnate a execucao do programa.

Em Pytohn não precismaos defirnir o tipo de daods da variável, o prorpio python faz isso automaticamente, por isso nao podemos simplmemste ciruar uma variavel sem atribuir um valor. Para alterar o valor d variavel basta fazer uma atribuição de um novo valor


* Constantes: Assim como as variavies,as contantes são utilizadas para armazenar valores. Uma cosntante nasce com um valor e permanece com ele até o final da execução do rpograma, ou seja, o valor é imutável

Python não tem constantes Não exsite uma palavra reservada para informar ao interpretador que o valor é constante, em python usamos a convenção que diz ao progranadir que a variavel é uma constante

-----------

#### Conversão de Tipos de dados ####

* Em alguns momentos é necessario converter o tipod e uma variavel para manipular de forma diferente. Por exemplo:
variaveis do tipo string que aramazenam números e precisamos fazzer alguma operação matmática com esse valor


-----------

#### 🔜 Funções de entrada e saida 🔙

Receber informações e retornar elas ao usuario.

* Função Input: é utilizada quando queremos ler dados da entrada padrão(teclado). Ela recebe uma arguemntos do tipo string, que é exibido para o suaurio na saida padrão(tela). A função lê a entreda, converte para string e ternona o valor

* Função Print: é utilizada quando queremos exibir dados na saída padrão(tela). Ela recebe um argumentos obrigatorio do tipo varargs de objetos e 4 argumentos opcionais(sep,end, file e flush). Todos os obejtos são convertidos para string, separados por sep e termianos por end. A string final é exibida para o usuario

-----------

### Operadores *️⃣

#### Operedores Aritiméticos

São operadores que executam contas matemáticas, como adição, subtração, multiplicação e divisão, ver no exemplo de codigos!

#### Operedores de Comparação

São operadores que comparam dois valores. comparam duas variavies ou constantes conforme o que você desjear

#### Opeadores de atribuição

A atribuição de valores é a passagem de informação a determinada variável. Na linguagem Python tem definido que o sinal de igual (=) é o operador de atribuição.É possivel sobrescrever ou adicionar uma variavel já criada atribuindo a mais um  valor

#### Operadores logicos

São operadores utilizados em conjutno com os operaodes de comparação, para montar um expressão logica. Quando um operador de comparação é utilizado, o rsultado é um booleano, dessa forma pdoemos combinar opeardores de comparação com os opeadores logicos

#### Operadores de identidade

Os operadores de identidade servem para a comparação de objetos. Nessa comparação é verificado se eles ocupam a mesma posição na memória, o que significará que se trata do mesmo objeto


#### operadores de associação
São operadores que utilizados para saber se um objeto está presente em uma sequência, PODE SER QUALUQER OBJETO!


--------------------------

#### Estruturas Condicionais e de repetição 

Aprender como o interpretador Python utiliza a indentação do código para delimitar os blocos dde comandos

Identar códgio é uma forma de manter o código fonte mais legível e manitennível. MAs em Python ela exerce um segundo papel, através da indentação o interpretador consegue determinar onde um bloco de comando inicia e onde ele termina


------------------

#### Estruturas Condicionais  

 Estrutura condicional  permite o desvio de fluxo de controle, quandod etermianas exepressões lógicas são atendidas

* if: para cirar um estrutura condiconal simples, composta por um unico desvio, podemos  utilizar a palavra reservada if. O Ocmnaod irá testar a expressão lógica, e em caso de retorno verdadeiro ações presentes no bloco de código do if serão executadas

* if/else: para criar um estrtura condcional com dois desvios, podemos utilizar as palavras reservadas if e sle. COmo sabemos se a expressão lógica testada no fi for verdadeira, então o bloco de código do fi será executado. caso contrário o bloco de codigo do else se´ra executado

* if/elif/else; Em alguns cenários queremos mais de dois desvios, para jssl podemos utilizar a palavra reservada elfi. O elif é composto por uma nova expressão lógica, que será testada e caso retrone verdaderio o bloco de codigo do elif será executado, Não existe um numeor maixmo de elifs que podemos utilizar, porem evite ciriar grandes estrturas condicionais, pois elas aumentam a compexidade do codigo

* If aninhado, podemos criaar estruturas condiconais aninhadas, para isso absta adiconar estruturas if/elif/else dentro do bloco de código de estruturas if/elif/else

* If ternário: permite escrever uma condição em uma única linha. ele é composto por três partes, a primeira parte é o retorno casp a expressão retorne verdadeiro, a segunda parte é a expressão lógica e a terceira parte é o retorno caos a expressão não seja atendida


-------------

#### Estruturas de Repetição

* O que são estruturas de repetição?: São estruturas para repetir um trecho de código um determiando número de vezes. Esse número pode ser conehcido previamente ou determiando atrés de uma expressão lógica

* Comando for é usado para percorrer um objeto iteravel. Faz sentido usar for quando sabemos o número exato de vezes que nosso bloco de código de ve ser executado, ou quando queremos percorrer um objeto iterável

* Função Range é uma função built-in do python, ela é usada para produzir uma sequencia de nuemros interios a partit de um inicio(inclusivo) para um fim(excluviso). Se usarmos range(i, j) será produzindo:
i, i+1,i+2,i+3
ELA recebe 3 arguemntos: stop(obrigatorio), satrt(opciona)l e step opcional))

* O comando while é usado para repetir um blocod e codigo varias vezes. Faz sentido usar while quando não sabemos o número exato de vezes que nosso bloco de codigo deve ser executado

------

#### Manipulando String com Python

   
  A Classe String do Python é famosa por ser rica em méteodos e possuir uma interfcae muito fácil de trabalhar.
  Em algumas linguagens manipular sequência de caracteres não é um trabalho trivial, em Python esse travalho é muito simples


  ```
  curso = "Python" 
  ```


``` 
print(curso.upper())
-> o valor retorna interamnete em maiusculo
```

``` 
print(curso.lower())
-> o valor retorna interamnete em minisuculo
```

``` 
print(curso.title())
-> o valor retorna com a pirmeira letra em maisucla
```
``` 
print(curso.strip())
-> o valor retorna sem espaço no terminal 
```

``` 
print(curso.lstrip())
-> o valor retorna com espaço a direita no terminal
```

``` 
print(curso.rstrip())
-> o valor retorna com espaço na esquerda
```
```
print(curso.center(10, "#"))
-> o valor retorna atqe que a astring tenha 10 caracteres, ele adicona o que esta em "x" para completar 
```

```
print(".".join(curso))
-> o que esta entre "x" retorna entre os caracteres dovalor da String 
```

* Interpolação de variavel  em Python temos 3 formas de interpolar variáveis em strings, a primeira é usando o sinal %, a segunda é utilizando o metodo format e a última é utilizando f strings.A primeira forma não é atualmente recomenda e seu uso em Python 3 é raro, por esse motivo iremos focar nas 2 ultumas

* Fatiamneto de String: fatiamneto de strings e uma tecnica utilizada para retornar substrings( partes da string original), informando inicio(start), fim (stop) e passo(step): [start: stop[step]]

* Strings de multiplas linhas: Strings de múltiplas linhas são definidas informandos 3 aspas simples ou duplas duranre a atribuição. Elas podem ocupar várias linhas de codigo, e todos os espaços em branco são incluídos na string final

---------------

### Estrutura de dados

#### Trabalhando com listas ede dados

* Criando listas: Listas em python podem armazenar de maneira sequencial qualuqer tipo de objet. podemos criar listas utilizando o construtor lits, a função rangeou colocando valores separados por virgula detro de colchentes. Listas são obejtos mutáveis, portanto podemos alterar seus valores após a crialção

* Acesso direto: a lista é uma sequencia portanto podemos acessar utilizando indices. Contamos o indice de determinada sequenncia a aprtir de zero

* listas aninhadas

Listas podem armazenar todos os tipo de obejtos Python, portanto podemos ter lsiras que armazenam outras listas. COm isso ppodemos criar estruturas bidimensionais(tabelas), e acessar irnfomando os  indices de linha e clouna

* Fatiamento: alem de acessar elemntos diretamnete, podemos extrair um conjuto de valores de uma sequencia. Para isso basta passar o indice inicial e/ou final para acessar o conjuto. Podemos ainda informar quantas posições o curuso deve pular no acesso

*Iterar lsitas; a forma mais comum para percorrer os daos de uma lista é utilizando o comando for

* Função enumerate: ás vezes é necessario saber qual o indice do obejto dentro do laço for, para isso podemos usar a função enumate

* Compreensão de listas: A compreensão de lista oferece uma sintaxe mais curta quando voc~e deseja: criar uma novalista com base nos valores de uma lsita existente (filtro) ou gerar uma nova lista aplicando alguma modificacao nos elmentos de uma lista existente

```
    letra = str(input("digite uma letra: "))
    vogais = ["a","e","i","o","u"]

    if letra in vogais :
    print("a letra digitada é vogal")
    else:
    print("a letra digitada e uma consoante")
```

 - este e um exmeplo de codigo onde foi criada uma lista com os dados requistados e , dento de uma condição if, podemos acessar o conteudo da lista utilizando o in.

- esse e mais exeplos de codigos utilizando python e estruturas do python se encpntra em um repositorio privado chamados fundamnetos, csao queira acessalo entar em contanto com o propriotario do github

---------------

#### tuplas

* Tuplas são estruturas de dados muito parecidas com as listas, a principal diferença é que tuplas são imuáveis enqyanto listas são mutáveis. Podemos criar tuplas através da classe tuple, ou colocando valores seprados por virgula de parenteses

* acesso Direto a uma tupla é uma sequência, portanto podemos acessar seus dados utilizando índicies. COntamos o índice de determinada sequ~enccia a partit do zero.

* tuplas aninadas: tuplas podem armazenar todos os tipos de obejtos Python, porntanto podemos ter tuplas que armazenam outras tuplas. Com isso podemos cirar estruturas bidimensionais(tabelas), e acessar informando os índices de linhae coluna

* fatiamneto: além de acessar elemntos diretamente, podemos extarir um conjunto de valores de uma sequencia. Para iso basra passar o índice inicial e/ou final para acessar o conjunto. podemos ainda informar quantas posições o cursor deve "pular no acesso

------------

#### Conjutos impornate

* Conjutos são uma coleção de obejtos e tem elemntos unicos, são elemntos que não esttão duplicados

* Set: um set é uma coleçao que não possui obejtos repetidos, usamos setes para represnetar conjutos matematicos ou eliminar itens duplovados de um iteravel

* acessando os dados: COnjutos em Python não suportam indexação e nem fatiamento, caso queira acessar os sesu valores é necessario converter o conjuto para a lista

* iterar conjutos, a forma mais comum para percorrer os daados de um conjutno é utilizano o comando for

* função enumarate, ás vezes é necessario saber qual o indcie do objeto dentro do laço for. para isso podemos usar a função enumerate

* VER OS PROGRAMAS DE EXEMPLO !!!!!!!!!!!!!!!!!!!!!!!!!! *

-------------------------------------------

#### Dicionarios no Python 

* Um didiconario é um conjunto não-ordenado de pares chave:: valor, onde as chave ssão unicas em uma dad instância do dicionario.DIcionario são delimitados por chaves: {}, e contém uma lista de pares chave: valor separada por vírgulas, a lista e a tupla tem sequencia
Acesso aos dados: os dados são acessados e modificados através da chave

* dicionarios aninhadas: dicionarios podem armazena qualquer tipo de obejto python como valor, desde que a chave paea esse valor seja um objeto imutavel como (string e numeros)

*iterar sobre dicionarios: a forma mais comum comum para percorrer os dados de um dicionario é utilizando o comanod for

--------------

#### Funções no Python

* o que são funções?:  Função é um blco de código identificado por um nome e pode receber uma lista de parametros, esses parametros podem ou não ter valores padrões. Usar funções torna o codigod mais legivel e possibiloita o reaporveitamento de codigo. programar basado em funções, é o mesmo que dizwer que estamos programando de maneira estrurada

* retorno de valores: para retornar um valor, utilizamos a palavra reservada return. Toda função Pyhotn retorna none por padraõ. Diferente de outras linguagens de programação, em Python uma função pode rertonar mais d eum avlor

* arguemntos nomeados: funções também podem ser chamadas usandos argumentos nomeados da forma chave = valor

* args e kwargs: podemos combinar parametros obrigatorios com args e kwargs. uqnado esse são definidos (*args e **kwargs), o méteodo recebe os valores como tupla e dicionario respectivamente

* parametros especiais pro padrão argumentos podem ser passados para uma função python tanto por posição quanto explicitamente quanto explicitamente pelo nome. Para uma melhor legibilidade e desempenho, faz sentido restringir a maneira elo qual arguemntos possam ser passadis a maneiras pelo qual arguemtnoos possam er passados, assim um desevolvedor precisa apenas olhar para a defininação da funcao paraa determinar se os itens são passadis por posição, po posição e nome, ou por nome

* Obejtos de primeira calsse; Em Python tudo é ojeto, dessa forma funções também são obejtos o que as tornam obejtos de primeira calsse Com isso podemos atribuir funções a variaveis, passá-las como parametro para funções, usá-las como valores em estruturas de dados(listas, tuplas, dicionarios, etc) e usar como valor de retorno paaa uma funão(closures)

------

#### Escopo local e escopo global

* Python trabalha com escopo local e global, dentro do bloco da função o escopo é local. Portanto alterações ali feitas em obejtos imutaveis serão perdidas quando o meteodo terminar de ser executado. Para uasr objetos globais utilizamos a palavra- chave global, que informa ao interpretador que aa variavel que estas ndo manipulada no escopo local é global

-----

### EXplorando IA Generativa em um pipeline de ETL com Python

ETL: Extração, Transformação e Careegamento de dados

#####  Projeto de interface grafica com a lingaugem Python

As aplicações, sejam elas em formato mobile (celular) ou desktop (computador/notebook), têm grande importância na vida humana cotidiana, independentemente de estarmos olhando para a tela de um celular ou interagindo em nossos computadores.

Quando estamos acessando uma rede social, um jogo no celular, um aplicativo da área de trabalho do computador, ou até mesmo um site, estamos interagindo com o que chamamos de aplicativo ou widget, a depender da situação.

Hoje, eles são escritos em diferentes linguagens de programação (Java, Python, C++, C# etc.), inclusive juntando mais de uma linguagem para uma experiência cada vez melhor.

Talvez o termo widget tenha se originado da junção das palavras em inglês window (janela) e gadget (dispositivo), o que jamais poderemos saber, pois esta é uma especulação na comunidade tecnológica.

* Formas

* Tamanhos

* Funções Distintas

Widgets de layout: tem como obejtivo posicionar outros Widgets

Widgets de UI: são aqueles visiveis ao usuario final 

O Python está em todo lugar, da inteligência artificial a cybersecurity, passando por análise de dados, computação gráfica e até por suporte futuro à computação quântica.

Atualmente, é difícil pensar uma área em que ele não esteja presente. Por isso, o mercado procura pessoas capacitadas e que dominam a linguagem, a depender da especificidade.

Existem alguns aplicativos que foram codificados em Python que nos permitem imaginar o quanto essa linguagem é poderosa:

 * Kivy é amigável ao usar utilizar arquivos .kv que fornece rápido e ótimo desenvolvimento de aplicativos que usam mais a interface do usuário com altas funcionalidades e melhor para o desenvolvimento de aplicativos móveis e também outros aplicativos relacionados a aplicativos multitoque.

 * O PyQt não é tão amigável, pois o Qt não é qualquer linguagem, mas usa C++ como linguagem de programação, o que torna o desenvolvimento um pouco complexo no design da interface do usuário, porém é rápido e ótimo ao ser usado no desenvolvimento de aplicativos de desktop ou quaisquer aplicativos que têm funcionalidades nativas como software de desktop.

 
