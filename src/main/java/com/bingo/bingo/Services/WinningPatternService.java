package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.WinningPatternModel;
import com.bingo.bingo.Repositories.WinningPatternRepository;

@Service
public class WinningPatternService {

    @Autowired
    private WinningPatternRepository winningPatternRepository;

    public List<WinningPatternModel> getAllWinningPatterns() {
        return winningPatternRepository.findAll();
    }

    public WinningPatternModel insertWinningPattern(WinningPatternModel winningPattern) {
        return winningPatternRepository.save(winningPattern);
    }

    public WinningPatternModel updateWinningPattern(WinningPatternModel winningPattern) {
        return winningPatternRepository.save(winningPattern);
    }

    public Optional<WinningPatternModel> deleteWinningPattern(int cellId) {
        Optional<WinningPatternModel> winningPattern = winningPatternRepository.findById(cellId);
        try {
            winningPatternRepository.deleteById(cellId);
        } catch (Exception e) {
            return null;
        }
        return winningPattern;
    }
}
