CREATE DATABASE banco_tcc;

USE banco_tcc;

CREATE TABLE Professor(
    codProfessor    INT AUTO_INCREMENT,
    nomeProfessor   VARCHAR (50),
    senhaProfessor  VARCHAR (50),
    PRIMARY KEY (codProfessor) 
);

CREATE TABLE Aluno(
    nroMatricula  INT AUTO_INCREMENT, 
    nomeAluno     VARCHAR(50),
    sexoAluno     VARCHAR(2),
    dataNascAluno DATE,
    rg  	      INT,
    cpf 	      VARCHAR (11),
    senhaAluno    VARCHAR (50),
    PRIMARY KEY (nroMatricula)
);

CREATE TABLE Exercicio(
    codExercicio    INT AUTO_INCREMENT,
	categoria       VARCHAR(30),
    nomeExercicio   VARCHAR(50),
    funcaoExercicio VARCHAR(700),
    foto	        BLOB,
    PRIMARY KEY (codExercicio) 
);

CREATE TABLE FichaTreino(
    codFicha      INT AUTO_INCREMENT,
	nroMatricula  INT,
    codProfessor  INT,
    PRIMARY KEY (codFicha),
    FOREIGN KEY (nroMatricula) REFERENCES Aluno(nroMatricula),
    FOREIGN KEY (codProfessor) REFERENCES Professor(codProfessor)
);

CREATE TABLE ItensFichaTreino(
	codFicha	   INT,
	codExercicio   INT,
	nroMatricula   INT,
	categoria	   VARCHAR(30),
	nomeExercicio  VARCHAR(50),
    nroSeries      INT,
    nroRepeticoes  INT,
    
    PRIMARY KEY (codFicha, codExercicio),
    FOREIGN KEY (codFicha) REFERENCES FichaTreino(codFicha),
    FOREIGN KEY (nroMatricula) REFERENCES Aluno(nroMatricula),
	FOREIGN KEY (codExercicio) REFERENCES Exercicio(codExercicio)
);
 
DROP DATABASE banco_tcc; 

DROP TABLE ItensFichaTreino;
DROP TABLE Exercicio;
SELECT * FROM Professor;
SELECT * FROM Aluno;
SELECT * FROM Exercicio;
SELECT * FROM FichaTreino;
SELECT * FROM ItensFichaTreino;

SELECT codExercicio, categoria, nomeExercicio FROM Exercicio WHERE categoria = 'Ombros';

SELECT MAX(codProfessor) FROM Professor;

INSERT INTO Professor (codProfessor, nomeProfessor, senhaProfessor)
	VALUES(10, 'caio', 'teste');



SELECT codExercicio FROM ItensFichaTreino WHERE nroMatricula = 1 AND nomeExercicio = 'OMBRO_UM';

UPDATE ItensFichaTreino SET codFicha = 1, codExercicio = 2, nroMatricula = 1, categoria ='Ombros', nomeExercicio ='OMBRO_DOIS', nroSeries = 2, nroRepeticoes = 2 WHERE nroMatricula = 1 AND nomeExercicio = 'OMBRO_UM'