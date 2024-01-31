package com.yassineapp.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerNewCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstname(customerRequest.getFirstname())
                .email(customerRequest.getEmail())
                .lastname(customerRequest.getLastname())
                .build();


        customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }
}
