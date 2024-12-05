--CREATE DATABASE testeDanval;
--GO
--USE DATABASE testeDanval;
--GO
--CREATE TABLE Funcionarios(
--	ID INT IDENTITY(1,1),
--	Nome 
--	Cargo
--	Salario
--	DepartamentoID
--);

INSERT INTO Funcionarios (Nome, Cargo, Salario, DepartamentoID)
VALUES ('Novo Funcionario', 'Analista', NULL, 10);

UPDATE Funcionarios
SET Salario = 8000
WHERE FuncionarioID = 45;

SELECT 
    F.Nome, 
    F.Cargo, 
    F.Salario, 
    D.NomeDepartamento, 
    D.GerenteID
FROM 
    Funcionarios F
JOIN 
    Departamentos D
ON 
    F.DepartamentoID = D.ID
WHERE 
    F.FuncionarioID = 45;
