# Introdução a Banco de Dados NoSQL

### O que é um banco de dados não relaiconal

* termo correto: not noly sql
* Não seguem modelos de tabelas e relacionamentos
* Não utilizamos comandos  no baanco de dados não relacional
* projetados para lidar ccom alto volume de daos, alta escabilidade
* alta flexibilidade na estrturada de daodso
* eles são aplamente utilizados em cenarios onde a conisstencia imediata dos daos não é critica

#### as diferenças basicas entre o SQL e o NoSQl

SQL:

- Modelo de dados fixo
- Escalabilidade vertical (hardware)
- Transações ACID 100%
- Linguagem dde consulta SQL

NoSQL:

- Modelo de dados flexivel
- Escalabilidade horizontal
- Transações ACID ausentes total ou parcial
- Cada SGBD tem sua propria linguagem

#### Mteodo de instalação do MongoDb

- Para a utilização do banco de dados não relacional é necessario instalar os seguintes itens:
    - MongoDb Service
    - MongoDB Compass
    - MonngoDB Shell 

#### Visão geral dos tipos de NoSQL

Resumo: os arquivos no MongoDB são parecidos com as estrturas de arquivos JOSN ou JavaScript, sendo suas sinatexes de estrtura parecidade, no MOngoDb chamados os objetos de documentos 

TIPOS:

- Key-value
- Documento
- Coluna
- Grafos
- Entre outros

#### KEY-VALUE > Chave valor

Armazena dados como pares de chave e valor, onde cada chave é um identificador único para acessar o valor correspondente. 
- Exemplo: redis, riak, Amazon DynamoDB

- USO: Um site pode usar um banco de dados Redis para armazenar infoemações de sessao de usuairo

#### Document > Documento

Armazenam dados em documentos semiestruturados, geralmenet em formato JSON ou BSON

- EXEMPLO: MOngoDB, Couchbase, Apache COuchDB

- Uso: Um catálogo de e-commerce pode usar o MOngoDB para armazenar informações de prdotudos como nome, descrição, preço e atributos adicionais

#### Coluna

Armazenam dados em formato de colunas, o que permite alta escalabilidade e eficiencia em determinados tipos de consultas

- Exemplo de SGBD: Apache Cassandra, ScyllaDB, HBase

- Uso: Um sistema de regsitro de aplicativos pode usar o Apache Cassandra para armazenar regsitros de log

#### Grafo

Armazenar e consultar daodos interconctados, onde os relaiconamentos entre os dados sao tao importante quanto os proprioos dados

- Exemplo de SGBD: Neo4j, Amazon Neptune, JanusGraph

- Uso: Uma rede social ppode usar o Neo4j para armezar os perfis do usuairio e suas conexoes, permitindo consultas eficientes para enconatra amigos e comoum

### O que é o MongoDB

- Banco de dados NoSQL orientado a documentos
- Grandes volumes de daos, escabilidade horinzotal de modelagem flexivel
- Não exige um esquema
-Permite que os documentos sejam armazenados em foemato BSON (Bynary JSON), proporcionado uma estrutura semiestruturada

#### Vantagens

* Flexibilidade na modelagem de dados
* escalabilidade horizontal para lidar com grandes volumes de dados
* Consultas ricas e suporte a consulta complexas
* lata disponibilidade e tolerancia a falhas
* Comunidade ativa e recursos de siporte

#### Desvantagens
 
* menor consistencia imediata em comparcao com bancos de dados relacionais
* Consultas complexas podem exigir um maior conhecimento e planejamento adequado
* Maior consumod e espaco de armazenamento em comparação com banco de dadso relacionais devido á felixbilidade dos documentos

### Onde o MongoDB é usado

- Aplicação web: Onde a felixbilidae e a escavilidade são cruciais para lidar com volumes variaveis de dados
- Análise de big data: Análise de grandes volumes de dados não estrurados ou semiestruturados, fornecendo uma plataforma para armazenar e preocessar eeses dado
- armazenamento de daos semiestruturados: permite a inserção de coumentos com estrutras difernetes em uma mesma coleção
- casos de usso de geolocalização: Com suas funcionalidades de cosnulta geoespacial, é adequado para casos de usso que envolvem dados baseados em localização, como aplicativos de mapaeamneto e rastreamento

#### cadastro no mongodb

! USERNAME: adm
! PASSWORD: 123@anakin
! Connection String: mongodb://localhost:27017

### Estrutura de documentos no banco de dados

- Coleções: cada coleção são documentos em conjuto
- Documentos: arquivos do tipo JSON que armazena dados requeridos

- Exemplo de um documentos:

```
{
   "_id":1,
   "nome":"Diego Maia",
   "idade":19,
   "data_nascimento":"2004-04-04",
   "endereco":"Rua francisco Gouveia 46...",
   "enderecos":[
      {
         "logradouro":"Rua Francisco Gouveia",
         "numero":46,
         "bairro":"mooca",
         "cidade":"São paulo"
      }
   ]"interesses":[
      "musica",
      "livros"
   ],
   "reservas":[
      1,
      2
   ]
}
```

### Coleções

- Agrupamento lógico de documentos
- Não exige esquema ou que os docuemntos tenham a mesma estrutura

#### caracteriscas das coleções

Os nomes das coleções devem seguir algumas regras:

* Devem começar com uma letra ou um underscore(_)
* Podem conter letras, números ou underscores
* Não podem ser vazios
* Não podem ter mais de 64 bytes de comprimento

#### documento

- São armazenamdos em docuemtnos BSON(Bynary Json), que são esttruturas flexiveois e semiestruturadas
- Cada docuemnto posssui um indetificador único chamado "_id"
- é composto por pares de chaves e valores
- Tamanho máximo; cada documento no MOngoDB pode ter um tamanho máximo de 16 MB
- Aninhamento de documentos
- Flexibilidade na evolução do esquema

### tipos de dados simples

- String
- Number
- Boolean
- Date
- Null
- Objectld

### tipos de dados complexos

- Array
- Documento EMbutido (Embedded Docuemnte)
- Referência (Reference)
- GeoJSON

### Estrategias de modalegm de daodos eficinetes e escalaveis

* Modelagem orientada por consultas, a modelagem de dadis no MonogoDB deve ser orinetada pelas consultadas que serão realizadas com mais frequencia

* Inner Documents: NO MongoDB, é comum denormalizar os dados para evitar operaões de junção(join) custosas. Isso significa que os dados relacionados podem ser armazenados juntos em um único documento, em vez de serem distruibidos em varias coleções

   - Quando usar o inner Documents:

   * Os dados aninhados são específicos para o documento pai.
   * Os dados aninhados são sempre acessadps juntamente com o documento pai
   * A cardinalidade do relacionamento é um-para-muitos(um usuario pode ter varias reservas)

    - Quando  NÃO usar o inner Documents:

   * Se os dados aninhados precisarem ser consultado e atualizados independetemnete do coumento pai, é mais adqueaod utilizar coleções speradas

   ### MongoDB Compass
  
- Criando um DataBase

   ```
   use {{nome_do_banco}}
   ```

   * enquanto o database não tiver uma collection ele não será apresentado na lista

 - Criando uma collection

   ```
   db.createCollection("usuarios")
   ```
    ```
   db.createCollection("destinoss")
   ```

-  Criando Documentos

   ```
   db.Collection.InsertOne({ "conteudo" })   // criando apenas um documento
   ```
   ```
   db.Collection.InsertMany({ "conteudo", "conteudo", ... })   // criando varios documentos de uma vez somente
   ```

- Consultando Documentos

    ```
   db.usuarios.find({})
    ```
     ```
   db.usuarios.findOne({})
   ```
    ```
   db.usuarios.findOneAndUpdate({})
   db.usuarios.findOneAndDelete({})
   ```

   - Excluindo Documentos
  
   ```
   db.usuarios.deleteOne({})
   db.usuarios.deleteMany({})
   ```

   - Modificando Documentos

   ```
   db.nomeDB.UpdateOne({ID}, {$push: {campo: "modificação"}})       // caso queria adiconar em algum campo do docuemnto
   ```

     ```
   db.nomeDB.UpdateOne({ID}, {$pull: {campo: "modificação"}})       // caso queria remover uma propiedade em algum campo do docuemento
   ```

   ### Consulta Simples: Operações

   - Igualdade realizar consultas baeasdas em um valor especifico em um campo

   ```
   db.usuarios.find({"endereco.cidade": "São Paulo"})
   ```

   - Operadores Lógicos
   
    * $and
    * $or
    * $not

    - Operadores Comparação
    
    * $eq: ==
    * $ne: !=
    * $gt: >
    * $gte: >=
    * $it: <
    * $ite: <=>


    ### O que é o redis 
      
      O redis e um sistema de armazenamneto de dados em memória de aalto desempenho


    ##### pricniapis caracetriscas do redis

    - Armazenamento em meoria
    - Estrutura de dados versátil
    - operações atômicas
    +- cache de alto desempenho
    - Pub/Sub (publicação/Assinatura)

    #### pricniapis utilizações do redis

    -Cache de dados
    - Filas de Mensagnes
    - Contagem de acessos e estaticas em tempo real
    - Gerenciamneto de sessoes
    - Cache de resultados de cosnultas

    #### pricniapis comandos

    - set
    - get
    - del
    - exists
    - keys
    - incr
    - decr
