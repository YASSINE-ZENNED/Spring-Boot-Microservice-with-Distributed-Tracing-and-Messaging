package com.yassineapp.notification;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Value("${rabbitmq.exchanges.internal}")
    private  String internalExchange;

    @Value("${rabbitmq.routing-keys.internal-notification}")
    private  String notificationRoutingKey;

    @Value("${rabbitmq.queues.notification}")
    private  String notificationQueue;


    @Bean
    public TopicExchange internalTopicExchange() {
        return new TopicExchange(this.internalExchange);
    }


    @Bean
    public Queue notificationQueue() {
        return new Queue(this.notificationQueue);
    }

    @Bean
    public Binding internalToNotificationBinding() {
        return BindingBuilder.bind(notificationQueue()).to(internalTopicExchange()).with(this.notificationRoutingKey);
    }


    public String getInternalExchange() {
        return internalExchange;
    }

    public String getNotificationRoutingKey() {
        return notificationRoutingKey;
    }

    public String getNotificationQueue() {
        return notificationQueue;
    }
}
