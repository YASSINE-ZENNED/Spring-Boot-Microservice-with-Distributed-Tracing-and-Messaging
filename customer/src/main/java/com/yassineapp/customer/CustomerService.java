package com.yassineapp.customer;

import com.yassineapp.clients.fraud.FraudCheckResponse;
import com.yassineapp.clients.fraud.FraudClient;
import com.yassineapp.clients.notification.NotificationResponse;
import com.yassineapp.clients.notification.NotificationInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@AllArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;
    private final FraudClient fraudClient;
    private final NotificationInterface notificationInterface;
    public void registerNewCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstname(customerRequest.getFirstname())
                .email(customerRequest.getEmail())
                .lastname(customerRequest.getLastname())
                .build();
        customerRepository.saveAndFlush(customer);


        FraudCheckResponse fraudCheckResponse =   fraudClient.fraudCheck(customer.getId());
       if(!fraudCheckResponse.isFraudster()){
           NotificationResponse notificationResponse = notificationInterface.notify(customer.getId());

       }
    }

    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
