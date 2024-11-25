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
@Table(name =  "\"Tickets\"")
@Setter @Getter @NoArgsConstructor
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private int ticket_id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private UserModel player;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    private GameModel game;

    @Column(name = "purchase_time", nullable = false)
    private Timestamp purchase_time;


    @JsonManagedReference
    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CardboardModel> cardboards = new ArrayList<>();
    
}
