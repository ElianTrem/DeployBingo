package com.bingo.bingo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bingo.bingo.Models.RoleModel;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Integer> {


}
