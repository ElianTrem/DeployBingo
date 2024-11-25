package com.bingo.bingo.Models;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "\"Games\"")
@Setter @Getter @NoArgsConstructor
public class GameModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private int game_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomModel room;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private UserModel admin;

    @Column(name = "start_time", nullable = false)
    private Timestamp start_time;

    @JsonManagedReference
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TicketModel> tickets = new ArrayList<>();

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "pattern_type_id", nullable = false)
    private PatternTypeModel patternType;
    
}

