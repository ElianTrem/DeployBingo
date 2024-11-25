package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.GameModel;
import com.bingo.bingo.Repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameModel> getAllGames() {
        return gameRepository.findAll();
    }

    public GameModel insertGame(GameModel game) {
        return gameRepository.save(game);
    }

    public GameModel updateGame(GameModel game) {
        return gameRepository.save(game);
    }

    public Optional<GameModel> deleteGame(int idGame) {
        Optional<GameModel> game = gameRepository.findById(idGame);
        try {
            gameRepository.deleteById(idGame);
        } catch (Exception e) {
            return null;
        }
        return game;
    }
}

