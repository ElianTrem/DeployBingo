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
@Table(name = "\"ValidationLogs\"")
@Setter @Getter @NoArgsConstructor
public class ValidationLogModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private int log_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private UserModel admin;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "winner_id", nullable = false)
    private WinnerModel winner;

    @Column(name = "action_time", nullable = false)
    private Timestamp action_time;

    @Column(name = "action_type", nullable = false)
    private String action_type;

    @Column(name = "comments")
    private String comments;
}

