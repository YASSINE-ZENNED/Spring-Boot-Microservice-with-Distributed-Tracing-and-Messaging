package com.yassineapp.notification;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public String sendNotification(Integer  customerId) {
        notificationRepository.save(Notification.builder().customerId(customerId)
                .message("this client is not a fraud").createAt(LocalDateTime.now()).build());
    return ("this client is not a fraud");
    }
}
