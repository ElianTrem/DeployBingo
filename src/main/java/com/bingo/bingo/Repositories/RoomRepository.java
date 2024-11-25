package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.RoomModel;

@Repository
public interface RoomRepository extends JpaRepository<RoomModel, Integer> {
}

