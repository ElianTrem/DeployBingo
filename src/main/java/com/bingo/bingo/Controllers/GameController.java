package com.bingo.bingo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.bingo.Models.GameModel;
import com.bingo.bingo.Services.GameService;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/all")
    public List<GameModel> getAllGames() {
        return gameService.getAllGames();
    }

    @PostMapping("/insert")
    public GameModel insertGame(@RequestBody GameModel game) {
        return gameService.insertGame(game);
    }

    @PutMapping("/edit")
    public GameModel updateGame(@RequestBody GameModel game) {
        return gameService.updateGame(game);
    }

    @DeleteMapping("/delete/{idGame}")
    public Optional<GameModel> deleteGame(@PathVariable int idGame) {
        return gameService.deleteGame(idGame);
    }
}
