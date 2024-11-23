CREATE DATABASE eleicao
GO 
USE eleicao
GO
CREATE TABLE Partido (
    cnpj VARCHAR(30),
    nome VARCHAR(60) NOT NULL,
    representante VARCHAR(60) NOT NULL,
	PRIMARY KEY (cnpj)
)
GO
CREATE TABLE Candidato (
    numero INT,
    nome VARCHAR(60) NOT NULL,
    cpf VARCHAR(30) NOT NULL UNIQUE,
    nascimento DATE NOT NULL,
    estado VARCHAR(30) NOT NULL,
    partidoCnpj VARCHAR(30) NOT NULL,
	PRIMARY KEY (numero),
    FOREIGN KEY (partidoCnpj) REFERENCES Partido(cnpj)
)
GO
CREATE TABLE Eleitor (
    cpf VARCHAR(60) PRIMARY KEY
)
GO
CREATE TABLE Voto (
    eleitorCpf VARCHAR(60) NOT NULL,
    candidatoNumero INT NOT NULL,
	PRIMARY KEY (eleitorCpf, candidatoNumero),
    FOREIGN KEY (eleitorCpf) REFERENCES Eleitor(cpf),
    FOREIGN KEY (candidatoNumero) REFERENCES Candidato(numero)
)

-- drop database eleicao

---------------------------------------------------------------------------------------------------------------------------------------------------
-- TESTE
-- Inserir dados no Partido
INSERT INTO Partido (cnpj, nome, representante)
VALUES ('12345678901234', 'Partido Exemplo', 'JoÃ£o Silva');
GO
-- Inserir dados no Candidato
INSERT INTO Candidato (numero, nome, cpf, nascimento, estado, partidoCnpj)
VALUES (13, 'Maria Candidata', '98765432100', '1985-06-15', 'SP', '12345678901234');
GO
-- Inserir dados no Eleitor
INSERT INTO Eleitor (cpf)
VALUES ('12345678930');
GO
-- Inserir dados no Voto
INSERT INTO Voto (eleitorCpf, candidatoNumero)
VALUES ('12345678920', 22);

USE eleicao
SELECT * FROM Eleitor
SELECT * FROM Voto
SELECT * FROM Partido
SELECT * FROM Candidato
SELECT * FROM 

INSERT INTO Eleitor (cpf) VALUES ('12345678920');
INSERT INTO Voto (eleitorCpf, candidatoNumero) VALUES ('12345678940', 22);

DELETE FROM Candidato WHERE partidoCnpj = '12345678901234';
DELETE Partido WHERE cnpj = '12345678901234';

INSERT INTO Partido (cnpj, nome, representante) VALUES ('12345678901235', 'Partido 2', 'Josué');

SELECT * FROM Partido WHERE cnpj = '12345678901234';