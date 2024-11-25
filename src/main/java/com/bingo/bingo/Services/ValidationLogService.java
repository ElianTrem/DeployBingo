package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.ValidationLogModel;
import com.bingo.bingo.Repositories.ValidationLogRepository;

@Service
public class ValidationLogService {

    @Autowired
    private ValidationLogRepository validationLogRepository;

    public List<ValidationLogModel> getAllValidationLogs() {
        return validationLogRepository.findAll();
    }

    public ValidationLogModel insertValidationLog(ValidationLogModel validationLog) {
        return validationLogRepository.save(validationLog);
    }

    public ValidationLogModel updateValidationLog(ValidationLogModel validationLog) {
        return validationLogRepository.save(validationLog);
    }

    public Optional<ValidationLogModel> deleteValidationLog(int logId) {
        Optional<ValidationLogModel> validationLog = validationLogRepository.findById(logId);
        try {
            validationLogRepository.deleteById(logId);
        } catch (Exception e) {
            return null;
        }
        return validationLog;
    }
}

