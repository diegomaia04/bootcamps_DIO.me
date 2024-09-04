-- Curso de SQL DIO.me
-- Aula 01 Modelagem de dados relacionais
set sql_safe_updates = 0;
create database dio;
use dio;


create table usuarios(
id int,
nome varchar(255) not null comment 'Nome do Usuario',
email varchar(100) not null unique comment' Email do usuario',
endereco varchar(50) not null comment 'Endereco do usuario',
data_nascimento date not null comment ' data de nascimento do usuario'
);

-- insert n atabela usuarios
insert into usuarios_nova (nome, email, endereco, data_nascimento) 
values ('Diego maia', 'maiadiego290@gmail.com', 'Rua sim da silva, SP', '2004-04-04');
insert into usuarios_nova (nome, email, endereco, data_nascimento) 
values ('Anakin', 'anakin@gmail.com', 'Rua Star Wars', '1989-04-04');
insert into usuarios_nova (nome, email,data_nascimento, rua, numero, cidade, estado) 
values ('Luke', 'luke@gmail.com', '1989-04-04', 'rua francisco gouevia','1977', 'SP', 'SP');

-- selecionar todas ass informações da coluna reservas
select * from  usuarios_nova;
select * from  usuarios where id = 2;

-- uptade da tabela usuairos
update usuarios_nova
set rua = 'Naboo', 
numero = 2001,
cidade = 'São Paulo',
estado = 'São Paulo' where id = 1;

-- usando o comando delete para exlcuir um usuairo ja cadastrado no bancod e dados
delete from usuarios where id = 1;

-- usando o comando alter table
alter table usuarios rename usuarios_nova;
alter  table usuarios_nova modify column endereco varchar(150);

-- tranformando a chave primaria
alter table usuarios_nova modify column id int auto_increment, add primary key(id);

-- adicioando colunas, removendo a coluna endereco e fazneod a normalização de daados F1
alter table usuarios_nova 
add rua varchar(100),
add numero varchar(10),
add cidade varchar(50),
add estado varchar(20);

alter table usuarios_nova drop column endereco;

-- -----------------------------------------------------------------------------------------------------------------------------------
create table destinos(
id int,
nome varchar(255) not null unique comment 'Nome do destino',
descricao varchar(255) not null comment 'descricao do destino'
);

-- insert n atabela destinos
insert into destinos (id, nome, descricao) 
values (1, 'Diego maia', ' teste para inserir uma descrição');
insert into destino (id, nome, descricao) 
values (2, 'Anakin', ' Mustafar');
insert into destinos (nome, descricao) 
values ('Luke', ' terra');

-- selecionar todas ass informações da coluna destinos
select * from destinos;
select * from destinos where id = 1;

-- update da tabela destinos
update destinos set descricao = 'teste realizado' where id =1;

-- usando o comando delete para deltar um iformação cadastrada na tabela
delete from destinos where id = 1;

-- usanod o alter table na tabela destinos
alter table destino rename destinos;
alter  table destinos_nova modify column id int unique;

-- tranformando a chave primaria
alter table destino modify column id int auto_increment, add primary key(id);
-- -----------------------------------------------------------------------------------------------------------------------------------
create table reservas (
id int comment ' id de reserva',
id_usuario int comment ' id que faz referencia ao id do usuairo',
id_destino int comment ' id que faz referencia ao id do destino',
data_reserva date comment ' data da reserva',
status_da_reserva varchar(255) default 'pendente' comment'status da reserva (confirmada, pendente, cancelada)'
);

-- inserir na atbela de reserva
insert into reservas(id, id_usuario, id_destino, data_reserva, status_da_reserva) 
values (1,1,1,'2015-04-04','pendente');
insert into reservas( id_usuario, id_destino, data_reserva, status_da_reserva) 
values (2,2,'1989-04-04','ja foi :/');

-- selecionar todas ass informações da coluna reservas
select * from reservas;
select * from reservas where id = 2;

-- update da tabela reservas
update reservas set id_usuario = 2 where id = 1;

-- delete
delete from reservas where id = 1;
drop table reservas;

-- alter table para tranformar as cahves estragenrias
alter table reservas modify column id int auto_increment, add primary key(id);
alter table reservas add constraint fk_reserva_usuarios foreign key (id_usuario) references usuarios_nova (id);
alter table reservas add constraint fk_reserva_destino foreign key (id_destino) references destino (id);
alter table reservas add constraint fk_usuarios foreign key (id_usuario) references usuarios_nova (id) on delete cascade;

-- comandos inner join
select * from usuarios_nova inner join reservas;
select * from usuarios_nova un inner join reservas rs on un.id = rs.id ;

-- comando left join
select * from usuarios_nova un left join reservas rs on un.id = rs.id ;

-- comando right join
select * from  reservas rs right join destinos ds on rs.id_destino  = ds.id  ;

-- comando full joi
select * from  usuarios_nova un join destinos ds on un.id = ds.id  ;