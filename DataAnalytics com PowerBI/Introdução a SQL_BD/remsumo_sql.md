# Introdução a Banco de Dados Relacionais (SQL) 🏦

O objtivo Geral do curso é fornecer uma introdução aos Bancos de Dados relaiconais e desenvolver habilidades ma criação, modelagem e consulta desses bancos, Focado para Desenvolvedores!

* Introdução aos Bancos de Dados Relacionais e conceitos básicos de SQL

* Modelagem de tabelas, colunas e regsitros com operacoes CRUD

* Chaves primárias e estranheiras com modelagem de tabelas relacionadas

* Normalização de daos, inetificnado e corrigindo de normalização

* Consultas avançadas com unções e subconsultas

* Funções agregadas e agrupamento de resultados com GROUP BU e HAVING

* Uso de índices para otimização de consultas

#### Tipos de Banco de Dados

* relacionais/SQL

* Não relacionais/NoSQL

* Orientado a Obejtos

* Hieráquico

#### Caracteriscas de um banco de dados relacional

* relacionamento entre tabelas
* Linguagem de Consulta Estruturada
* Integridade referencial
* Normalização de dados
* Segurança
* Flexibilidade e extensibildade
* Suporte a transações ACID

## Introdução e Conceitos basicos de SQL

Linguagem de consulta padronizada utilizada para a interação com o banco de dados

Osrganização do SQL:

* DDL - Linguagem de COnsulta de Dados: São comandos de modificação do banco de dado
    ```SELECT;```

* DML - Linguagem de Manipulação de Dados: São comandos de alteração das informações contidas em tabelas, que pode ser para a inserção ou exclusão de dados
    ```INSERT, UPDATE, DELETE```

* DCL - Linguagem de Controle de Dados: Atua nas permissões, restrições e bloqueios no banco de dados 
    ```GRANT, REVOKE```

* DTL -  Linguagem de Transição de Dados: Responsável por registrar e salvar quaisquer alterações realizadas por usuários
    ```BEGIN, COMMIT, ROLLBACK```
  
    ---

    #### Mer e Der

    - O modelo Entidade-relacionamento (MER) é representado atraves de diagramas chamados Diagramas Entidade-Relacionamento (DER)

    - AS entidaes são noemadas com substantivos concretos ou abtratos que representam de forma clara sua função dentro do domínio

    - Os atributos são as caracteriscas ou propriedades das entidades. Eles descrevem informações específicas sobre uma entidaade.


    - Relacionamentos represetma as asscoiações de entidades

    CARDINALIDADE: cardinalidade de relaiconamento é um imporntante propriedade de um relaiconamento, representa quantas ocorrencias de uma entidade podem estar associadas a uma determinada ocorrencia de entidade atraves de relacionamento

    - Relacionamento 1 .. 1( um para um)

    - Relacionamento 1 .. n(um para muitso)

    - Relacionamento n .. n ( muitos para muitos)
    
    
    CREATELY: Sotfware que permite a criação de diagramas [creately](https://app.creately.com)


    Existe uma intelifencia artifical que monta diagramas a partir de infomações dadas pelo usuario, o site é:  [site que faz diagramas!!](https://app.quickdatabasediagrams.com/#/)


 ### Chaves
- PK: primary key ou chave primaria

  - Identifica exclusivamnete
  - Não pode conteer valores nulos(NULL)
  - Uma tabela pode ter apenas uma chave primaria

  ---

- FK: foreing key ou chave estrangeira

  - é usada para estbalecer a integridade dos dadso das tabelas relacionadas
  - pode ser nula(NOT NULL)
  - é posssivel ter mais de uma ( ou nenhuma) em uma tabela
  - On delete espesifica o que acontece coms os registros dependetes quando um regsitro api ée xlcuido
  - on update define o comportamneto dos registros depednetes quando um regsitro pai é atualizado
  - CASCADE, SET NULL, STE DEFAULT e RESTRICT

#### tabelas

Tabelas são usadas para armazenar dados de forma organizada. cada tabela em um banco de dados relacional tem um nome unuico e é dividida em colunas e linhas

#### Colunas 

Uma coluna é uma estrutura dentreo de uma tabela que represnetada um atributo especifico dos dados armazenados. cada coluna tem um nome unico e um tipo de dados associado que define o tipo de informação qie pode ser armazenada nela, como numeros, textos, datas, etc

----

## Tipos de dados

os dados podem variar muito entre os diversos SGBD, os mais comuns são:

- Inteiro (integer)
- Decimal/Numérico (Decimal/Numeric)
- Caractere/Varchar (Character/Varchar)
- Data/Hora (Date/Time)
- Booleano(Boolean)
- Texto Longo (Text)

## Comando: Select - Operadores

- = (igualdade)
- "<>" ou ! (desigualdade)
- ">" ( maior que)
- < (menor que)
- ">=" (maior ou igual que) 
- "<=" (menor ou igual que)
- Like (comparação de padrões)
- in (pertence a uma lista de valores)
- between (dentro de um intervalo)
- and (e logico)
-or ( ou logico)

### Problema

Usuários com endereços longos não estão conseguindo realizar  adastro no sistema

- Recriar a tabela, migrar os dados e excluir a tabela anetrior

- Altera estrtura da tabela


### Alter table

A clasula alter table é usada no sql para odficar a estrtura de uma tabel existente em um banco de dados relacional

- Adicionar, alterar ou excluir colunas
- MOdificar as restrições, índices
- renoemar a tabela entre outas alterações

----

### Normalização de dados

A normalização de daos é um processo no qual seorganiza e estrutu um banco de daods relacional de forma a eliminar redundâncias e anomalias, garatindo a consistência e integridade dos dados



#### Formas Normais
  - A 1FN estabelece que cada valor em uma tabela deve ser atõmico, ou seja, indivisivel. Nenhum campo deve conter multiplos valores ou llistas. NO seu caso, o campo endereco contém múlyiplos valores, como rua, número, cidade e estado. Para atingir a 1FN, precisamos dividir o campo "endereco" em colunas separadas

  - A 2FN estabelece que uma tabela deve estar na 1FN, todos os atributos não chave devem depender totalmente da chave primaria. DICA: se sua tabela tem um cahve primaria simples não existe a possibilodae de termos depdencia paricla e por tanto ela ja se encontra na 2FN 

- A 3FN uma tabela deve estrar na 2FN, nenhuma coluna não-chave depender de outra colua não chave

##### Resumos

- A 1FN garante que cada valor seja atômico e que s registros sejam únicos e identificáveis.

-A 2FN garante que os atributos não chave dependam totalmente da chave primaria, evitando dependencias parcias

-A 3FN elimina dependencias transitivas entre os atributos não chave, garatido que cada atributo não chave dependa apenas da chave primaria, não havendo depdnencoas indiertas entre eles

### Consultas com junções e subconsultas

São usadas no sql junções: JOINs para combinar dados de duas ou mais tabelas relacionadas em uma unica consulta. Os tipos são:

```
inner join
```
```
left join ou left outer join
```
```
right join ou right outer join
```
```
full join ou full outer join
```

* Inner Join Retorna apenas as linhas que tem correspondencia em ambas as tabelas envolvidas na junção. A jinção é feita com base em uma condiçõa de igualdade especificada na clausula ON

* Left Join retorna todas as linhas da tabela a esquerda da junção e as linhas correspondetes da tabela a direta. Se não houver correpondecia, os valores da tabela a direta serão NULL

- Right Join retorna todas as linahs da tabela a direita da junção e as linhas correpsondentes da tabela a esquerda. Se não houver correpondencia , os valores da tabela a esquerda serao null

- Full Join retorna todas as linhas de ambas as tabelas envolvidas  na junção, combinado-as com base em uma correpsondeica de igualdade. Se não houver correpondencia, os valores rertonados serao reppecindiso com NULL

#### Sub Consultas

Elas permitem realizar consultas mais complexas permitindo que você use o resultado de uma consulta como entreda para outra consulta  

- Select
- from
- where
- having
- join

#### Funções Agregadas

* Count; Conta o nuemro de regsitros
* SUM: Soma os valores de uma coluna numerica
* AVG: calcula a media dos valores de uma coluna nuemrica
* MIN: retorna o valor minimo de uma coluna
* MAX: retorna o valor maixmo de uma coluna

### Análise do plano de execuação

 Análise do plano de execuação, elas nos permite examinar as operações realizadas, as tabelas acessadas, os indices utilizados e outras inofrmações imporntantes para idenitirfcar possiveis melhroias de desempenho.

- select_type: "SIMPLE", "SUBQUERY", "JOIN
- table
- type: "ALL", "INDEX" entre outros
- possible_keys: Os indices possiveis que podem ser utilizadso na operação
- key: O Inidce utilizado na operação, se aplicavel
- key_len: O comprimento do indicce utilizado 
- ref; As colunas ou constantes usadas para acessar o indice 
- row
    
