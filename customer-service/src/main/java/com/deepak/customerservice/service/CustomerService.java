package com.deepak.customerservice.service;

import com.deepak.customerservice.classes.MyOrder;
import com.deepak.customerservice.classes.Product;
import com.deepak.customerservice.entities.Customer;
import com.deepak.customerservice.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    RestTemplate restTemplate;

    public Customer saveCustomer(Customer c){
        return customerRepo.save(c);
    }

    public MyOrder getMyOrderDetails(int custId){
        Optional<Customer> cust = customerRepo.findById(custId);
        int pid=cust.get().getPid();
    Product product =restTemplate.getForObject("http://PRODUCT-SERVICE/product/"+pid, Product.class);

    MyOrder myOrder= new MyOrder();
    myOrder.setCustomer(cust.get());
        myOrder.setProduct(product);
        return myOrder;
    }
}
