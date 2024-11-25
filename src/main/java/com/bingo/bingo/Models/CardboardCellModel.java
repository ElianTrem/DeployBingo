package com.bingo.bingo.Models;

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
@Table(name = "\"CardboardCells\"")
@Setter @Getter @NoArgsConstructor
public class CardboardCellModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cell_id")
    private int cell_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cardboard_id", nullable = false)
    private CardboardModel cardboard;

    @Column(nullable = false)
    private char column;

    @Column(nullable = false)
    private int row;

    private Integer number;
}

