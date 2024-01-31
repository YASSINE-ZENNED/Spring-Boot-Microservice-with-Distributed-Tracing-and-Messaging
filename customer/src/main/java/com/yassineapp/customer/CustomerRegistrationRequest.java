package com.yassineapp.customer;

public record CustomerRegistrationRequest(String firstname, String lastname, String email) {


    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }

}
