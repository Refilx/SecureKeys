create database securekeys;

use securekeys;

create table chaves(
	numeroChave integer auto_increment not null primary key,
    sala varchar(30),
    quantChave integer not null,
    status varchar(30)
);

create table usuario(
	idUser integer auto_increment not null primary key,
    username varchar(120) not null,
    password varchar(240) not null,
    role varchar(30) not null,
    dtRegistro date not null
);

create table logs(
	idLogs integer auto_increment not null primary key,
	idUser integer not null,
    dtLogs date not null,
    
    FOREIGN KEY idUser(idUser) REFERENCES usuario(idUser)
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

create table historico(
	idHistorico integer auto_increment not null primary key,
    nome varchar(240) not null,
    numeroChave integer not null,
    observacoes varchar(500),
    status varchar(30),
    dataAbertura date,
    dataFechamento date,
    
    foreign key numeroChave(numeroChave) references chaves(numeroChave)
);