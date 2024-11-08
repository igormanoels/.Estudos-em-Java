-- CRIANDO O BANCO DE DADOS

CREATE DATABASE agendadb;

USE alunofatec;

CREATE TABLE contatos (
    id INT AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(30),
    PRIMARY KEY(id)
);

INSERT INTO contatos (nome, email, telefone) 
    VALUES ('IGOR MANOEL', 'IGOR@EMAIL.COM', '11-95443-0911');

