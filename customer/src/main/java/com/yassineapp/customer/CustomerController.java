package com.yassineapp.customer;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor

public class CustomerController{

    private final CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
    @PostMapping
    public void registerNewCustomer(@RequestBody CustomerRegistrationRequest customerRequest) {
        log.info("registerNewCustomer {}", customerRequest);
        customerService.registerNewCustomer(customerRequest);

    }
}
