package com.deepak.productservice.controller;

import com.deepak.productservice.entities.Product;
import com.deepak.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("/")
public List<Product> getProducts(){
    return productService.getAllProducts();
}

    @GetMapping("{id}")
    public Optional<Product> getProductsById(@PathVariable("id") int pid){
        return productService.getProductsById(pid);
    }
@PostMapping
    public Product saveProduct(@RequestBody  Product p){
    System.out.println(productService.saveProducts(p));
        return productService.saveProducts(p);
}

}
