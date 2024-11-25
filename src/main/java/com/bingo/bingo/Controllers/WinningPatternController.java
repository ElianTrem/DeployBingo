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

import com.bingo.bingo.Models.WinningPatternModel;
import com.bingo.bingo.Services.WinningPatternService;

@RestController
@RequestMapping("/winning-pattern")
public class WinningPatternController {

    @Autowired
    private WinningPatternService winningPatternService;

    @GetMapping("/all")
    public List<WinningPatternModel> getAllWinningPatterns() {
        return winningPatternService.getAllWinningPatterns();
    }

    @PostMapping("/insert")
    public WinningPatternModel insertWinningPattern(@RequestBody WinningPatternModel winningPattern) {
        return winningPatternService.insertWinningPattern(winningPattern);
    }

    @PutMapping("/edit")
    public WinningPatternModel updateWinningPattern(@RequestBody WinningPatternModel winningPattern) {
        return winningPatternService.updateWinningPattern(winningPattern);
    }

    @DeleteMapping("/delete/{cellId}")
    public Optional<WinningPatternModel> deleteWinningPattern(@PathVariable int cellId) {
        return winningPatternService.deleteWinningPattern(cellId);
    }
}
