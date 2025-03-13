package com.example.EvaluationTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Entity
@Table(name = "espace_travail")
public class EspaceTravail {
    @Id
    @ColumnDefault("nextval('espace_travail_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @NotNull
    @Column(name = "prix_heure", nullable = false, precision = 15, scale = 2)
    private BigDecimal prixHeure;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getPrixHeure() {
        return prixHeure;
    }

    public void setPrixHeure(BigDecimal prixHeure) {
        this.prixHeure = prixHeure;
    }

}