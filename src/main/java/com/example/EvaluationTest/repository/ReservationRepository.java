package com.example.EvaluationTest.repository;

import com.example.EvaluationTest.entity.Reservation;
import com.example.EvaluationTest.entity.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, ReservationId> {
}