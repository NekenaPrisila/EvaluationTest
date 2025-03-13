package com.example.EvaluationTest.repository;

import com.example.EvaluationTest.entity.Utilisateur;
import com.example.EvaluationTest.entity.UtilisateurId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, UtilisateurId> {
}