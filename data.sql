create database projetdevops;
use projetdevops;
create table User
(
id INT primary key not null auto_increment,
mail varchar(100),
motdepasse varchar(100),
nom varchar(100),
prenom varchar(100),
Numero_nom varchar(100)
);
INSERT INTO User VALUES
(null,"Tmax",530,"Scooter","E",123456789);