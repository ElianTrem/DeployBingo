package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.ValidationLogModel;

@Repository
public interface ValidationLogRepository extends JpaRepository<ValidationLogModel, Integer> {
}

