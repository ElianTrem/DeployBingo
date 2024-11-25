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

import com.bingo.bingo.Models.NumberDrawnModel;
import com.bingo.bingo.Services.NumberDrawnService;

@RestController
@RequestMapping("/number-drawn")
public class NumberDrawnController {

    @Autowired
    private NumberDrawnService numberDrawnService;

    @GetMapping("/all")
    public List<NumberDrawnModel> getAllNumbersDrawn() {
        return numberDrawnService.getAllNumbersDrawn();
    }

    @PostMapping("/insert")
    public NumberDrawnModel insertNumberDrawn(@RequestBody NumberDrawnModel numberDrawn) {
        return numberDrawnService.insertNumberDrawn(numberDrawn);
    }

    @PutMapping("/edit")
    public NumberDrawnModel updateNumberDrawn(@RequestBody NumberDrawnModel numberDrawn) {
        return numberDrawnService.updateNumberDrawn(numberDrawn);
    }

    @DeleteMapping("/delete/{numberId}")
    public Optional<NumberDrawnModel> deleteNumberDrawn(@PathVariable int numberId) {
        return numberDrawnService.deleteNumberDrawn(numberId);
    }
}
