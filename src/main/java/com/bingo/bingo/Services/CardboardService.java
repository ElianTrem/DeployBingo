package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.CardboardModel;
import com.bingo.bingo.Repositories.CardboardRepository;

@Service
public class CardboardService {

    @Autowired
    private CardboardRepository cardboardRepository;

    public List<CardboardModel> getAllCardboards() {
        return cardboardRepository.findAll();
    }

    public CardboardModel insertCardboard(CardboardModel cardboard) {
        return cardboardRepository.save(cardboard);
    }

    public CardboardModel updateCardboard(CardboardModel cardboard) {
        return cardboardRepository.save(cardboard);
    }

    public Optional<CardboardModel> deleteCardboard(int idCardboard) {
        Optional<CardboardModel> cardboard = cardboardRepository.findById(idCardboard);
        try {
            cardboardRepository.deleteById(idCardboard);
        } catch (Exception e) {
            return null;
        }
        return cardboard;
    }
}

