package com.example.demo.repositories;

import com.example.demo.entities.MoneyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<MoneyEntity, Long> {
    MoneyEntity findByBalance(double balance);
}
