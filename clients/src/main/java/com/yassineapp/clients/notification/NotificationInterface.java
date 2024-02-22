package com.yassineapp.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(
        name= "notification",
        url = "${clients.notification.url}"
)
public interface NotificationInterface {
    @GetMapping("/api/v1/notify")
    void notify(NotificationResponse notificationResponse);
}
