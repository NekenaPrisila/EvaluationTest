\c postgres;
DROP DATABASE coworking;
CREATE DATABASE coworking;
\c coworking;

CREATE TABLE Role(
   id SERIAL,
   role VARCHAR(50)  NOT NULL,
   PRIMARY KEY(id),
   UNIQUE(role)
);

CREATE TABLE Espace_Travail(
   id SERIAL,
   nom VARCHAR(50)  NOT NULL,
   prix_heure NUMERIC(15,2)   NOT NULL,
   PRIMARY KEY(id),
   UNIQUE(nom)
);

CREATE TABLE Option_Payante(
   id SERIAL,
   nom_materiel VARCHAR(50)  NOT NULL,
   prix NUMERIC(15,2)   NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE Utilisateur(
   id SERIAL,
   numero_tel BIGINT,
   username VARCHAR(50)  NOT NULL,
   email VARCHAR(100)  NOT NULL,
   mdp VARCHAR(100)  NOT NULL,
   nom VARCHAR(50)  NOT NULL,
   prenom VARCHAR(50) ,
   dtn DATE,
   id_role INTEGER NOT NULL,
   PRIMARY KEY(id, numero_tel),
   UNIQUE(username),
   UNIQUE(email),
   FOREIGN KEY(id_role) REFERENCES Role(id)
);

CREATE TABLE Reservation(
   id SERIAL,
   reference VARCHAR(50) ,
   date_reservation TIMESTAMP NOT NULL,
   heure_a_reserver TIME NOT NULL,
   dure_reserver TIME NOT NULL,
   id_espace_travail INTEGER NOT NULL,
   id_utilisateur INTEGER NOT NULL,
   numero_tel_utilisateur BIGINT NOT NULL,
   PRIMARY KEY(id, reference),
   FOREIGN KEY(id_espace_travail) REFERENCES Espace_Travail(id),
   FOREIGN KEY(id_utilisateur, numero_tel_utilisateur) REFERENCES Utilisateur(id, numero_tel)
);

CREATE TABLE Paiement(
   id SERIAL,
   date_paiement TIMESTAMP NOT NULL,
   referencement VARCHAR(50)  NOT NULL,
   id_reservation INTEGER NOT NULL,
   reference_reservation VARCHAR(50)  NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(id_reservation, reference_reservation) REFERENCES Reservation(id, reference)
);

CREATE TABLE Option_Prise_Reservation(
   id_reservation INTEGER,
   reference_reservation VARCHAR(50) ,
   id_option_payante INTEGER,
   PRIMARY KEY(id_reservation, reference_reservation, id_option_payante),
   FOREIGN KEY(id_reservation, reference_reservation) REFERENCES Reservation(id, reference),
   FOREIGN KEY(id_option_payante) REFERENCES Option_Payante(id)
);
