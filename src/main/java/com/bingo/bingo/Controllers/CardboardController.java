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

import com.bingo.bingo.Models.CardboardModel;
import com.bingo.bingo.Services.CardboardService;

@RestController
@RequestMapping("/cardboard")
public class CardboardController {

    @Autowired
    private CardboardService cardboardService;

    @GetMapping("/all")
    public List<CardboardModel> getAllCardboards() {
        return cardboardService.getAllCardboards();
    }

    @PostMapping("/insert")
    public CardboardModel insertCardboard(@RequestBody CardboardModel cardboard) {
        return cardboardService.insertCardboard(cardboard);
    }

    @PutMapping("/edit")
    public CardboardModel updateCardboard(@RequestBody CardboardModel cardboard) {
        return cardboardService.updateCardboard(cardboard);
    }

    @DeleteMapping("/delete/{idCardboard}")
    public Optional<CardboardModel> deleteCardboard(@PathVariable int idCardboard) {
        return cardboardService.deleteCardboard(idCardboard);
    }
}

