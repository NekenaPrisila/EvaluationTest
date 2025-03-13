package com.example.EvaluationTest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "reservation")
public class Reservation {
    @EmbeddedId
    private ReservationId id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_espace_travail", nullable = false)
    private EspaceTravail idEspaceTravail;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private com.example.EvaluationTest.entity.Utilisateur utilisateur;

    public ReservationId getId() {
        return id;
    }

    public void setId(ReservationId id) {
        this.id = id;
    }

    public EspaceTravail getIdEspaceTravail() {
        return idEspaceTravail;
    }

    public void setIdEspaceTravail(EspaceTravail idEspaceTravail) {
        this.idEspaceTravail = idEspaceTravail;
    }

    public com.example.EvaluationTest.entity.Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(com.example.EvaluationTest.entity.Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

}