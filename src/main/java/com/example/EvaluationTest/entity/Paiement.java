package com.example.EvaluationTest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Table(name = "paiement")
public class Paiement {
    @Id
    @ColumnDefault("nextval('paiement_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date_paiement")
    private LocalDate datePaiement;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private com.example.EvaluationTest.entity.Reservation reservation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public com.example.EvaluationTest.entity.Reservation getReservation() {
        return reservation;
    }

    public void setReservation(com.example.EvaluationTest.entity.Reservation reservation) {
        this.reservation = reservation;
    }

}