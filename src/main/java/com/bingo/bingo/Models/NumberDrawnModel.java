package com.bingo.bingo.Models;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"NumbersDrawn\"")
@Setter @Getter @NoArgsConstructor
public class NumberDrawnModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_id")
    private int number_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private GameModel game;

    @Column(nullable = false)
    private String number;

    @Column(name = "drawn_time", nullable = false)
    private Timestamp drawn_time;
}

