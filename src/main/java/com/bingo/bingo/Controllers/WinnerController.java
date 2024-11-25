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

import com.bingo.bingo.Models.WinnerModel;
import com.bingo.bingo.Services.WinnerService;

@RestController
@RequestMapping("/winner")
public class WinnerController {

    @Autowired
    private WinnerService winnerService;

    @GetMapping("/all")
    public List<WinnerModel> getAllWinners() {
        return winnerService.getAllWinners();
    }

    @PostMapping("/insert")
    public WinnerModel insertWinner(@RequestBody WinnerModel winner) {
        return winnerService.insertWinner(winner);
    }

    @PutMapping("/edit")
    public WinnerModel updateWinner(@RequestBody WinnerModel winner) {
        return winnerService.updateWinner(winner);
    }

    @DeleteMapping("/delete/{winnerId}")
    public Optional<WinnerModel> deleteWinner(@PathVariable int winnerId) {
        return winnerService.deleteWinner(winnerId);
    }
}
