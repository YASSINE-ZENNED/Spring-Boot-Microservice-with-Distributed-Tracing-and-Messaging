package com.yassineapp.notification;

import com.yassineapp.clients.fraud.FraudCheckResponse;
import com.yassineapp.clients.notification.NotificationResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/notify")
public class NotificationController {
    private final NotificationService notificationService;



    @GetMapping
    public String hello() {
        return "Hello from notification service";
    }

    @PostMapping
public void sendNotification(@RequestBody  NotificationResponse  NotificationResponse) {
            log.info("Sending notification to customer {}", NotificationResponse);
    notificationService.sendNotification(NotificationResponse);

    }

}

