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

import com.bingo.bingo.Models.PatternTypeModel;
import com.bingo.bingo.Services.PatternTypeService;

@RestController
@RequestMapping("/pattern-type")
public class PatternTypeController {

    @Autowired
    private PatternTypeService patternTypeService;

    @GetMapping("/all")
    public List<PatternTypeModel> getAllPatternTypes() {
        return patternTypeService.getAllPatternTypes();
    }

    @PostMapping("/insert")
    public PatternTypeModel insertPatternType(@RequestBody PatternTypeModel patternType) {
        return patternTypeService.insertPatternType(patternType);
    }

    @PutMapping("/edit")
    public PatternTypeModel updatePatternType(@RequestBody PatternTypeModel patternType) {
        return patternTypeService.updatePatternType(patternType);
    }

    @DeleteMapping("/delete/{patternTypeId}")
    public Optional<PatternTypeModel> deletePatternType(@PathVariable int patternTypeId) {
        return patternTypeService.deletePatternType(patternTypeId);
    }
}

