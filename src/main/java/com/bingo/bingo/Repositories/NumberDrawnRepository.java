package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.NumberDrawnModel;

@Repository
public interface NumberDrawnRepository extends JpaRepository<NumberDrawnModel, Integer> {
}
