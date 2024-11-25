package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.WinnerModel;
import com.bingo.bingo.Repositories.WinnerRepository;

@Service
public class WinnerService {

    @Autowired
    private WinnerRepository winnerRepository;

    public List<WinnerModel> getAllWinners() {
        return winnerRepository.findAll();
    }

    public WinnerModel insertWinner(WinnerModel winner) {
        return winnerRepository.save(winner);
    }

    public WinnerModel updateWinner(WinnerModel winner) {
        return winnerRepository.save(winner);
    }

    public Optional<WinnerModel> deleteWinner(int winnerId) {
        Optional<WinnerModel> winner = winnerRepository.findById(winnerId);
        try {
            winnerRepository.deleteById(winnerId);
        } catch (Exception e) {
            return null;
        }
        return winner;
    }
}
