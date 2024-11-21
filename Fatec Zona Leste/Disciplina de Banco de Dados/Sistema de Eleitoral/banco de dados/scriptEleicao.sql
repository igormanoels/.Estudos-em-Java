CREATE DATABASE eleicao
GO 
USE eleicao
GO
CREATE TABLE Partido (
    cnpj VARCHAR(30) PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    representante VARCHAR(60) NOT NULL
)
GO
CREATE TABLE Candidato (
    numero INT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    cpf VARCHAR(30) NOT NULL UNIQUE,
    nascimento DATE NOT NULL,
    estado VARCHAR(30) NOT NULL,
    partidoCnpj VARCHAR(30) NOT NULL,
    FOREIGN KEY (partidoCnpj) REFERENCES Partido(cnpj)
)
GO
CREATE TABLE Eleitor (
    cpf VARCHAR(60) PRIMARY KEY
)
GO
CREATE TABLE Voto (
    id INT IDENTITY(1,1) PRIMARY KEY,
    votos INT NOT NULL,
    eleitorCpf VARCHAR(60) NOT NULL,
    candidatoNumero INT NOT NULL,
    FOREIGN KEY (eleitorCpf) REFERENCES Eleitor(cpf),
    FOREIGN KEY (candidatoNumero) REFERENCES Candidato(numero)
)