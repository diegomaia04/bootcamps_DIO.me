# Orientação a objetos com C#
#### Introdução, Abstração e Encapsulamento com C#

Objtivo Geral: apresentar e explorar o paradgma de programação orientado a obejto, e seus usos e como ele é aplicado no dia a diad da programação

vamos estudar sobre a parte teorica e a parte pratica nesse modulo pois e essencial

Percuso:

- Introdução POO, abstração e Encapsulamento
- Herança e polimorfismo
- Classes Abstratas e interfaces

#### O que á POO

A POO e um paradifma de programação, ou seja, correspomde a uma tecnia de programação para um fim especifico, seu pricipal conceito são classes e objetos

Dentro desta tecnica, existem quatros pilares, sempre sao esses pilares

- abstração
- encapsulamento
- herança
- Poliformismo

Parafigmas da programação:

- Um paradgma nada mais é do que um modelo de tecnicas e estruturas de formas de solucionar um problema,

- Paradgma de programação é diferer=nte de linguaeem de programação

- Uma lingugaem de programação implementa um ou mais paradgiams

Alguns dos paradgmas que existem no mundo da proggramação

- Programação orientada a objetos
- Programação estruturada
- Programação imperativa
- Programação proceeural
- Programação orientada a eventos
- Programação logica

Encapsulamento:

- O encapsulamento serve para proteger uma classee definir limites para alteração de suas propriedads, serve para ocultar seu comportamento e expor somente o necessario

Herança:

-  Aherança nos permite reutilizar atributos, métodos e comportamentos de uma clsse em outras classes. Serve para agruar objetos que sao do mesmo tipo, porem com carateriscas difernetes

Exemplo: (imagine que temos duas classes, o aluno e a classe pessoa:)


    public class Aluno : Pessoa
    {
        // bloco de codigo
    }

- Polimorfismo

- O poliforminismo vem do grego e siginifca "muitas formas. Com o Poliforminismo, podemos sobrescrever metodos das classes filhas para que se comportem de maneira digerente e ter sua propria implemetação

#### Classe abstrata

Uma classse abstrada tem como ojeitvo ser exclusivamente um modelo para ser herado, portanto não pode instaciada. Voce ppode implmentera meteodos

#### Calsse selada

Uma classe selada tem como objeitco de impdedir que putras classes façam uma herança dela, ous eja, nehuma classe pode ser sua derivada. tambem existem metodos e proepriedades seladas

SEALEd; selar metodos e classes para ão serem possiveis serem sobreescrividas

#### object

A classe System.Obejct é a mae de todas as classes na hierarquia do .NET. Todas as classes derivam direta ou indiretamebte da classe object, e ela tem como obejtivo prover servicos de baixo nivel para suas classes filhas

- equals(Obejct): determina o onejto espeficidado e igual ao obejto atual

- equals(object,object):  determina se as instacias de obejto especificadas sao considerados iguais

-Fianlize(): permire que um obejto tente liberar recurso e executar outras operações de limpeza de ser recuperado pela coleta de lixo

- GetHashCode(): serve como a funcap de hash padrao

- GetType(): obtem o type da instacinia atual

- ToString(): retorna uma cadeia de carcteres que representa a objeto atua

#### Interface

Uma interface e um contratto que pod ser implmnetadi por uma classe. E comoms efosse uma classe asbtara pdoendo  definir meteodos abstratos para serem impementado. Assim como uma clsse classe abstrata uma interae nao pode sr instaciada.

#### Desafio de projeto

usarei a docuemntação fornceidade pleo github do professor leonardo Buta

--------------------------------------------------------------
# DIO - Trilha .NET - Programação orientada a objetos
www.dio.me

## Desafio de projeto
Para este desafio, você precisará usar seus conhecimentos adquiridos no módulo de orientação a objetos, da trilha .NET da DIO.

## Contexto
Você é responsável por modelar um sistema que trabalha com celulares. Para isso, foi solicitado que você faça uma abstração de um celular e disponibilize maneiras de diferentes marcas e modelos terem seu próprio comportamento, possibilitando um maior reuso de código e usando a orientação a objetos.

## Proposta
Você precisa criar um sistema em .NET, do tipo console, mapeando uma classe abstrata e classes específicas para dois tipos de celulares: Nokia e iPhone. 
Você deve criar as suas classes de acordo com o diagrama abaixo:

## Regras e validações
1. A classe **Smartphone** deve ser abstrata, não permitindo instanciar e servindo apenas como modelo.
2. A classe **Nokia** e **Iphone** devem ser classes filhas de Smartphone.
3. O método **InstalarAplicativo** deve ser sobrescrito na classe Nokia e iPhone, pois ambos possuem diferentes maneiras de instalar um aplicativo.

## Solução
O código está pela metade, e você deverá dar continuidade obedecendo as regras descritas acima, para que no final, tenhamos um programa funcional. Procure pela palavra comentada "TODO" no código, em seguida, implemente conforme as regras acima.

