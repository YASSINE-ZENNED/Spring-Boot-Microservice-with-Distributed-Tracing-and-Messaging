package com.yassineapp.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1/fraud-check")
public class FraudController {
 private final FraudService fraudService;



    @GetMapping("/{customerId}")
    public FraudCheckResponse fraudCheck(@PathVariable("customerId") Integer customerId) {
        boolean fraud = fraudService.isFraud(customerId);
        return new FraudCheckResponse(fraud);
    }
}
