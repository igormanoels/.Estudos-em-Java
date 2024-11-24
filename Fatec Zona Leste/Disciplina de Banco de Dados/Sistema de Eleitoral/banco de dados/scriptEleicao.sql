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
GO
CREATE TABLE Apuracao (
    id INT IDENTITY (1,1),
    quantidadeVotos INT NOT NULL,
    dataApuracao DATE NOT NULL,
    candidatoNumero INT,
    PRIMARY KEY (id),
    FOREIGN KEY (candidatoNumero) REFERENCES Candidato(numero)
)
 

-- drop database eleicao

---------------------------------------------------------------------------------------------------------------------------------------------------
-- TESTE
USE eleicao
SELECT * FROM Eleitor
SELECT * FROM Voto
SELECT * FROM Partido
SELECT * FROM Candidato
SELECT * FROM Apuracao

DELETE FROM Candidato WHERE partidoCnpj = '12345678901234';
DELETE Partido WHERE cnpj = '12345678901234';

SELECT * FROM Partido WHERE cnpj = '12345678901234';

DELETE Candidato WHERE cpf = '11122233344';        



-- Limpa o banco e zera contador de autoincremento
EXEC sp_msforeachtable "ALTER TABLE ? NOCHECK CONSTRAINT ALL";
DELETE FROM Apuracao;
DELETE FROM Voto;
DELETE FROM Eleitor;
DELETE FROM Candidato;
DELETE FROM Partido;
EXEC sp_msforeachtable "ALTER TABLE ? CHECK CONSTRAINT ALL";
DBCC CHECKIDENT ('Apuracao', RESEED, 0);

private int numero;
private String nome;
private String cpf;
private LocalDate nascimento;
private String estado;
private String nomePartido;
private int quantidadeVotos;
private LocalDate dataApuracao;

-- cotagem os votos
SELECT Candidato.numero, Candidato.nome, Candidato.cpf, Candidato.nascimento, Candidato.estado, Partido.nome, 
COUNT(Voto.eleitorCpf) AS totalVotos
FROM Candidato
LEFT JOIN Voto ON Candidato.numero = Voto.candidatoNumero
LEFT JOIN Partido ON Candidato.partidoCnpj = Partido.cnpj
GROUP BY Candidato.numero, Candidato.nome, Candidato.cpf, Candidato.nascimento, Candidato.estado, Partido.nome;



---------------------------------------------------------------------------------------------------------------------------------------------------
-- INSERT  PARA TESTAR AS FUNÇÕES

INSERT INTO Partido (cnpj, nome, representante) VALUES 
('111222333444555', 'Partido 1', 'João'),
('111222333444666', 'Partido 2', 'Pedro'),
('111222333444777', 'Partido 3', 'Maria');
GO
INSERT INTO Candidato (numero, nome, cpf, nascimento, estado, partidoCnpj) VALUES 
(10, 'Luiz', '11111111111', '2001-11-01', 'MA', '111222333444555'),
(20, 'Jeferson', '222222222222', '1999-07-27', 'AC', '111222333444666'),
(30, 'Solange', '333333333333', '2003-12-22', 'SP', '111222333444777');
GO
INSERT INTO Eleitor (cpf) VALUES 
('111111111111'),
('222222222222'),
('333333333333'),
('444444444444'),
('555555555555'),
('666666666666'),
('777777777777'),
('888888888888'),
('999999999999');
GO
INSERT INTO Voto (eleitorCpf, candidatoNumero) VALUES 
('111111111111', 10),
('222222222222', 10),
('333333333333', 10),
('444444444444', 10),
('555555555555', 10),
('666666666666', 20),
('777777777777', 20),
('888888888888', 30),
('999999999999', 30);
GO
INSERT INTO Apuracao (id, quantidadeVotos, dataApuracao, candidatoNumero) VALUES 
(1, 5, '2024-11-01', 10),
(2, 2, '2024-11-01', 20),
(3, 1, '2024-11-01', 30);



