package com.example.EvaluationTest.repository;

import com.example.EvaluationTest.entity.OptionPriseReservation;
import com.example.EvaluationTest.entity.OptionPriseReservationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionPriseReservationRepository extends JpaRepository<OptionPriseReservation, OptionPriseReservationId> {
}