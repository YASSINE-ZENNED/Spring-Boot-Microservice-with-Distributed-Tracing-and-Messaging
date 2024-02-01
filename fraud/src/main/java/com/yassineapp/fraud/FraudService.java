package com.yassineapp.fraud;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@AllArgsConstructor
@Service
public class FraudService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;



    public boolean isFraud(Integer customerId) {
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder().customerId(customerId)
                .isFraudster(false ).checkDateTime(LocalDateTime.now()).build());
        return false;
    }
}
