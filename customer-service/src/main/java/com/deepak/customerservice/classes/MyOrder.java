package com.deepak.customerservice.classes;

import com.deepak.customerservice.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyOrder {
    private Product product;
    private Customer customer;
}
