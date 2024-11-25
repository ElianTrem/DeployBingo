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
@Table(name = "\"WinningPatterns\"")
@Setter @Getter @NoArgsConstructor
public class WinningPatternModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cell_id")
    private int cell_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "pattern_type_id", nullable = false)
    private PatternTypeModel patternType; 
    

    @Column(nullable = false)
    private char column;

    @Column(nullable = false)
    private int row;
}

