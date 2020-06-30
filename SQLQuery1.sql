
USE JAVA_1
GO

CREATE TABLE JAVA_1_Alumno(
id  INT IDENTITY(1,1) PRIMARY KEY,
nombre   varchar (50),
apellido varchar (50),
sexo     varchar(7),
promedio varchar (50)
)
UPDATE JAVA_1_Alumno SET nombre ='javier',apellido='gaete' where id=2