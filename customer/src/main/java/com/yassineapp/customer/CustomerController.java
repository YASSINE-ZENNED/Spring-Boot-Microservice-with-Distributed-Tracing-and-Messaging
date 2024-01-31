package com.yassineapp.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")

public record CustomerController(  CustomerService customerService) {
    @GetMapping
    public void getCustomers() {


    }
    @PostMapping
    public void registerNewCustomer(@RequestBody CustomerRegistrationRequest customerRequest) {
        log.info("registerNewCustomer {}", customerRequest);
        customerService.registerNewCustomer(customerRequest);

    }
}
