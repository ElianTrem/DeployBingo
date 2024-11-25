package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.GameModel;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Integer> {
}

