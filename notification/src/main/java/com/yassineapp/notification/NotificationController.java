package com.yassineapp.notification;

import com.yassineapp.clients.fraud.FraudCheckResponse;
import com.yassineapp.clients.notification.NotificationResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/notify")
public class NotificationController {
    private final NotificationService notificationService;



    @GetMapping
    public String hello() {
        return "Hello from notification service";
    }

    @GetMapping("/{customerId}")
    public NotificationResponse sendNotification(@PathVariable("customerId")  Integer customerId) {
            String  message = notificationService.sendNotification(customerId);

            notificationService.sendNotification(customerId);
        return new NotificationResponse(message);

    }

}
