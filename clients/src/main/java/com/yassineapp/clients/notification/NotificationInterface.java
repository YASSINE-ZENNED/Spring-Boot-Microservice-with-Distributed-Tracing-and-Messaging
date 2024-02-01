package com.yassineapp.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("notification")
public interface NotificationInterface {
    @GetMapping("/api/v1/notify/{customerId}")
    NotificationResponse notify(@PathVariable("customerId") Integer customerId) ;
}