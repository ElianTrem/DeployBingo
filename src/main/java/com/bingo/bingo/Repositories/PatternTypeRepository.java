package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.PatternTypeModel;

@Repository
public interface PatternTypeRepository extends JpaRepository<PatternTypeModel, Integer> {
}

