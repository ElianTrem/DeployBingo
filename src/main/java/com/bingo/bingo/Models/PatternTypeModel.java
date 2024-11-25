package com.bingo.bingo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"PatternTypes\"")
@Setter @Getter @NoArgsConstructor
public class PatternTypeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pattern_type_id")
    private int pattern_type_id;

    @Column(name = "type_name", nullable = false, unique = true)
    private String type_name;

    @Column(name = "description")
    private String description;

    @Column(nullable = false, name = "static")
    private boolean staticPattern;
}
