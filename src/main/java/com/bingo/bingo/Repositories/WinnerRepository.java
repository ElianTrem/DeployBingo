package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.WinnerModel;

@Repository
public interface WinnerRepository extends JpaRepository<WinnerModel, Integer> {
}
