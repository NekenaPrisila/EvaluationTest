package com.example.EvaluationTest.repository;

import com.example.EvaluationTest.entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Integer> {
}