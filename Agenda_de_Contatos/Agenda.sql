create database bdAgenda;

create table tabela_cadastro (
	id int auto_increment primary key,
    nome varchar(100),
    telefone varchar(15),
    email varchar(100),
    endereco varchar(100),
    data_nascimento varchar(10)
);