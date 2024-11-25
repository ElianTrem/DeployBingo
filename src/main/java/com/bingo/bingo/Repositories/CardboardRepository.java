package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.CardboardModel;

@Repository
public interface CardboardRepository extends JpaRepository<CardboardModel, Integer> {
}

