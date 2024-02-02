package com.yassineapp.notification;

import com.yassineapp.clients.notification.NotificationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public String sendNotification(NotificationResponse notificationResponse) {

        notificationRepository.save(Notification.builder()
                .toCustomerId(notificationResponse.toCustomerId())
                        . toCustomerEmail(notificationResponse.toCustomerEmail())
                        .sender("notification-service")
                .message(notificationResponse.message()).sentAt(LocalDateTime.now()).build());
    return ("this client is not a fraud");
    }
}
