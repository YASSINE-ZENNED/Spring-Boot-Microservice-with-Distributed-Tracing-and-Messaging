package com.yassineapp.notification.rabbitMQ;

import com.yassineapp.clients.notification.NotificationResponse;
import com.yassineapp.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {
        private final NotificationService notificationService;
        @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumer(NotificationResponse notificationResponse) {
       log.info("Message received from queue : " + notificationResponse);
       notificationService.sendNotification(notificationResponse);
    }
}
