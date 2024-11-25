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

import com.bingo.bingo.Models.ValidationLogModel;
import com.bingo.bingo.Services.ValidationLogService;

@RestController
@RequestMapping("/validation-log")
public class ValidationLogController {

    @Autowired
    private ValidationLogService validationLogService;

    @GetMapping("/all")
    public List<ValidationLogModel> getAllValidationLogs() {
        return validationLogService.getAllValidationLogs();
    }

    @PostMapping("/insert")
    public ValidationLogModel insertValidationLog(@RequestBody ValidationLogModel validationLog) {
        return validationLogService.insertValidationLog(validationLog);
    }

    @PutMapping("/edit")
    public ValidationLogModel updateValidationLog(@RequestBody ValidationLogModel validationLog) {
        return validationLogService.updateValidationLog(validationLog);
    }

    @DeleteMapping("/delete/{logId}")
    public Optional<ValidationLogModel> deleteValidationLog(@PathVariable int logId) {
        return validationLogService.deleteValidationLog(logId);
    }
}
