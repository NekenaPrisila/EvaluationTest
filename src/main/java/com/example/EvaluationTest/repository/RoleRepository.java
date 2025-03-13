package com.example.EvaluationTest.repository;

import com.example.EvaluationTest.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}