package com.yassineapp.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @SequenceGenerator( name = "customer_sequence", sequenceName = "customer_sequence")
    @GeneratedValue( generator = "customer_sequence" , strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
