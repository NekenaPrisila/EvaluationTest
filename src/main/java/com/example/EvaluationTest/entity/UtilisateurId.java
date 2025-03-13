package com.example.EvaluationTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UtilisateurId implements Serializable {
    private static final long serialVersionUID = 1454676085662059817L;
    @NotNull
    @ColumnDefault("nextval('utilisateur_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "numero_tel", nullable = false)
    private Long numeroTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(Long numeroTel) {
        this.numeroTel = numeroTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UtilisateurId entity = (UtilisateurId) o;
        return Objects.equals(this.numeroTel, entity.numeroTel) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTel, id);
    }

}