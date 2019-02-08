CREATE DATABASE WebStore;
USE WebStore;

CREATE TABLE List;(
ID_Produit	int(4) 		PRIMARY KEY AUTO_INCREMENT,
Nom_Produit VARCHAR(45) NOT NULL,
Description VARCHAR(45) NOT NULL,
Prix		FLOAT		NOT NULL,

);

INSERT INTO  List (ID_Produit, Nom_Produit, Description, Prix) VALUES(1, 'Television','TELE 4K', 2999.00);

SELECT * FROM List;

