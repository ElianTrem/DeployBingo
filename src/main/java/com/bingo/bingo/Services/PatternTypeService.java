package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.PatternTypeModel;
import com.bingo.bingo.Repositories.PatternTypeRepository;

@Service
public class PatternTypeService {

    @Autowired
    private PatternTypeRepository patternTypeRepository;

    public List<PatternTypeModel> getAllPatternTypes() {
        return patternTypeRepository.findAll();
    }

    public PatternTypeModel insertPatternType(PatternTypeModel patternType) {
        return patternTypeRepository.save(patternType);
    }

    public PatternTypeModel updatePatternType(PatternTypeModel patternType) {
        return patternTypeRepository.save(patternType);
    }

    public Optional<PatternTypeModel> deletePatternType(int patternTypeId) {
        Optional<PatternTypeModel> patternType = patternTypeRepository.findById(patternTypeId);
        try {
            patternTypeRepository.deleteById(patternTypeId);
        } catch (Exception e) {
            return null;
        }
        return patternType;
    }
}

