# Utilização do Mongo DB com plataformas e linguagens de programação

- Com uma banco de dados estruturado é possivel trabalhar com eles com diversas linguagens de programação. Nesse repositorio iremos trablhar com o node.js juntamente com o banco de dados que criei baseado em uma bookstore.

- é necessario ter o node.js instalado juntamente com o banco de dados Mongo Db prontos para uso, além de uma plataforma de desenvolvimento, estarei utilizando o visual studio code

- ## Comandos para a instalação do Mongo Db no node.js

```
npm init // iniciar um projeto npm no vsc
```
```
npm install express // instalar expressões.
```
```
 npm install -g nodemon // é um utilitário que monitora as mudanças nos arquivos do seu projeto 
```

```
nodemon app // para aplicar o que coidficamos para nossa porta de localhost, ABAIXO
```

## ATENÇÃO!!

Caso exiba uma erro ao digitra o codigo acima, é muito provael que seja de segurança, caso for siga os passos abaixo:

1° - Execute o cmd do PowerShell como administrador;

2° - Execute os comandos:
Get-ExecutionPolicy
E veja o que ele retorna;

3° - Caso o retorno seja Restricted, dê o comando:
Set-ExecutionPolicy RemoteSigned e escolha a opção yes apertando a letra y e após um enter;

// caso não der certo utilize outro comando

```
Set-ExecutionPolicy -Scope CurrentUser
```
   * esse comando permitira alterar os niveis de segurança, apos digitar ele digite no shell:
 
   * RemoteSigned

### Postman

Iremos utilizar o Postman para a realização de tarefas do mongoDB atraves do browser do postman, uma maneira mais simples do que continuar no browser normal.
