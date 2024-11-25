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

import com.bingo.bingo.Models.CardboardCellModel;
import com.bingo.bingo.Services.CardboardCellService;

@RestController
@RequestMapping("/cardboard-cell")
public class CardboardCellController {

    @Autowired
    private CardboardCellService cardboardCellService;

    @GetMapping("/all")
    public List<CardboardCellModel> getAllCardboardCells() {
        return cardboardCellService.getAllCardboardCells();
    }

    @PostMapping("/insert")
    public CardboardCellModel insertCardboardCell(@RequestBody CardboardCellModel cardboardCell) {
        return cardboardCellService.insertCardboardCell(cardboardCell);
    }

    @PutMapping("/edit")
    public CardboardCellModel updateCardboardCell(@RequestBody CardboardCellModel cardboardCell) {
        return cardboardCellService.updateCardboardCell(cardboardCell);
    }

    @DeleteMapping("/delete/{cellId}")
    public Optional<CardboardCellModel> deleteCardboardCell(@PathVariable int cellId) {
        return cardboardCellService.deleteCardboardCell(cellId);
    }
}
