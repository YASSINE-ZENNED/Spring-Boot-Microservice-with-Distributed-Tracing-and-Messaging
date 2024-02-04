package com.yassineapp.notification;

import com.yassineapp.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.yassineapp.notification","com.yassineapp.amqp"})
@EnableFeignClients
@EnableEurekaClient

public class Notificationapplication {
    public static void main(String[] args) {
        SpringApplication.run(Notificationapplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer, NotificationConfig notificationConfig) {
        return args -> {
          producer.publish("foo", notificationConfig.getInternalExchange(), notificationConfig.getNotificationRoutingKey());
        };
    }
}