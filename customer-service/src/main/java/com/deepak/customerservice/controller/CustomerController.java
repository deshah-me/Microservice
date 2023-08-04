package com.deepak.customerservice.controller;

import com.deepak.customerservice.classes.MyOrder;
import com.deepak.customerservice.entities.Customer;
import com.deepak.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

@Autowired
    CustomerService customerService;

@PostMapping("/")
public  Customer saveCustomer(@RequestBody Customer customer){
    return customerService.saveCustomer(customer);

}

@GetMapping("myorders/{cid}")
    public MyOrder myProductOrders(@PathVariable("cid") int custId){
        return customerService.getMyOrderDetails(custId);

    }



}
