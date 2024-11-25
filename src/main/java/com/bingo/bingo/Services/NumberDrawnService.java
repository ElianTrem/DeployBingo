package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.NumberDrawnModel;
import com.bingo.bingo.Repositories.NumberDrawnRepository;

@Service
public class NumberDrawnService {

    @Autowired
    private NumberDrawnRepository numberDrawnRepository;

    public List<NumberDrawnModel> getAllNumbersDrawn() {
        return numberDrawnRepository.findAll();
    }

    public NumberDrawnModel insertNumberDrawn(NumberDrawnModel numberDrawn) {
        return numberDrawnRepository.save(numberDrawn);
    }

    public NumberDrawnModel updateNumberDrawn(NumberDrawnModel numberDrawn) {
        return numberDrawnRepository.save(numberDrawn);
    }

    public Optional<NumberDrawnModel> deleteNumberDrawn(int numberId) {
        Optional<NumberDrawnModel> numberDrawn = numberDrawnRepository.findById(numberId);
        try {
            numberDrawnRepository.deleteById(numberId);
        } catch (Exception e) {
            return null;
        }
        return numberDrawn;
    }
}
