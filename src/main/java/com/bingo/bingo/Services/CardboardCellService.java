package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.CardboardCellModel;
import com.bingo.bingo.Repositories.CardboardCellRepository;

@Service
public class CardboardCellService {

    @Autowired
    private CardboardCellRepository cardboardCellRepository;

    public List<CardboardCellModel> getAllCardboardCells() {
        return cardboardCellRepository.findAll();
    }

    public CardboardCellModel insertCardboardCell(CardboardCellModel cardboardCell) {
        return cardboardCellRepository.save(cardboardCell);
    }

    public CardboardCellModel updateCardboardCell(CardboardCellModel cardboardCell) {
        return cardboardCellRepository.save(cardboardCell);
    }

    public Optional<CardboardCellModel> deleteCardboardCell(int cellId) {
        Optional<CardboardCellModel> cardboardCell = cardboardCellRepository.findById(cellId);
        try {
            cardboardCellRepository.deleteById(cellId);
        } catch (Exception e) {
            return null;
        }
        return cardboardCell;
    }
}
