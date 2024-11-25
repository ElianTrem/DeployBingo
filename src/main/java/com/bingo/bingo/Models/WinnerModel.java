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
@Table(name = "\"Winners\"")
@Setter @Getter @NoArgsConstructor
public class WinnerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "winner_id")
    private int winner_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private UserModel player;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private GameModel game;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cardboard_id", nullable = false)
    private CardboardModel cardboard;

    @Column(name = "winning_time", nullable = false)
    private Timestamp winning_time;

    @Column(name = "validation_status", nullable = false)
    private String validation_status = "pending";
}

