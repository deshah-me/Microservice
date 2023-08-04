package com.deepak.productservice.service;

import com.deepak.productservice.entities.Product;
import com.deepak.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> getProductsById(int pid){
        return productRepo.findById(pid);
    }

    public Product saveProducts(Product product){
        System.out.println(productRepo.save(product));
        return productRepo.save(product);
    }
}
