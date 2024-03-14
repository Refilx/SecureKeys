create database securekeys;

use securekeys;

create table chaves(
	numeroChave integer auto_increment not null primary key,
    sala varchar(30),
    quantChave integer not null,
    status varchar(30)
);

create table logs(
	idUser integer auto_increment not null primary key,
    username varchar(120),
    dtLogs date not null
);

create table pessoa(
	idPessoa integer auto_increment not null primary key,
    nome varchar(240) not null,
    cpf varchar(14),
    email varchar(240),
    telefone varchar(14),
    endereco varchar(360),
    empresa varchar(240),
    cargo varchar(240),
    cidade varchar(120),
    cep varchar(8),
    dtRegistro date not null
);

