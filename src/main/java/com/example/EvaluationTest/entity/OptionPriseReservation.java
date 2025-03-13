package com.example.EvaluationTest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "option_prise_reservation")
public class OptionPriseReservation {
    @EmbeddedId
    private OptionPriseReservationId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private com.example.EvaluationTest.entity.Reservation reservation;

    @MapsId("idOptionPayante")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_option_payante", nullable = false)
    private OptionPayante idOptionPayante;

    public OptionPriseReservationId getId() {
        return id;
    }

    public void setId(OptionPriseReservationId id) {
        this.id = id;
    }

    public com.example.EvaluationTest.entity.Reservation getReservation() {
        return reservation;
    }

    public void setReservation(com.example.EvaluationTest.entity.Reservation reservation) {
        this.reservation = reservation;
    }

    public OptionPayante getIdOptionPayante() {
        return idOptionPayante;
    }

    public void setIdOptionPayante(OptionPayante idOptionPayante) {
        this.idOptionPayante = idOptionPayante;
    }

}