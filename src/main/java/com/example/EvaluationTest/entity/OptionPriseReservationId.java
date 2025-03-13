package com.example.EvaluationTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OptionPriseReservationId implements Serializable {
    private static final long serialVersionUID = 4503209091499930612L;
    @NotNull
    @Column(name = "id_reservation", nullable = false)
    private Integer idReservation;

    @Size(max = 50)
    @NotNull
    @Column(name = "reference_reservation", nullable = false, length = 50)
    private String referenceReservation;

    @NotNull
    @Column(name = "id_option_payante", nullable = false)
    private Integer idOptionPayante;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public String getReferenceReservation() {
        return referenceReservation;
    }

    public void setReferenceReservation(String referenceReservation) {
        this.referenceReservation = referenceReservation;
    }

    public Integer getIdOptionPayante() {
        return idOptionPayante;
    }

    public void setIdOptionPayante(Integer idOptionPayante) {
        this.idOptionPayante = idOptionPayante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OptionPriseReservationId entity = (OptionPriseReservationId) o;
        return Objects.equals(this.idReservation, entity.idReservation) &&
                Objects.equals(this.referenceReservation, entity.referenceReservation) &&
                Objects.equals(this.idOptionPayante, entity.idOptionPayante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReservation, referenceReservation, idOptionPayante);
    }

}