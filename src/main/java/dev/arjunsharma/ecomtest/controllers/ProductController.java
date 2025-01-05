package dev.arjunsharma.ecomtest.controllers;

import dev.arjunsharma.ecomtest.models.Product;
import dev.arjunsharma.ecomtest.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public Product GetSingleProduct(@PathVariable("id") Long id){
        Product productFromDB;
        productFromDB = productService.GetSingleProduct(id);
        return productFromDB;
    }

    @GetMapping("/products")
    public List<Product> GetAllProducts(){
        List<Product> productsFromDB;
        productsFromDB = productService.GetAllProducts();

        return productsFromDB;
    }

}