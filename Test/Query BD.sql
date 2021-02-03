Drop Database conexion_java;
CREATE DATABASE  IF NOT EXISTS conexion_java;

USE conexion_java;

CREATE TABLE IF NOT EXISTS personal_data (
age int not null,
sex varchar(10) not null,
freq VARCHAR(20) NOT NULL,
estado Varchar(25) not null,
allergy varchar(50),
desease varchar(50)
);


/*drop table user;*/
CREATE TABLE IF NOT EXISTS usuario (
Mail Varchar(100) not null,
Username varchar(25) PRIMARY KEY not null, 
Pass char(25) not null
);



SELECT* FROM conexion_java.personal_data;
SELECT * FROM conexion_java.usuario;



SET GLOBAL time_zone = '-3:00';