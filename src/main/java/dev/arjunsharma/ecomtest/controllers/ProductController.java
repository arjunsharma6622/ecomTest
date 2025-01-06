package dev.arjunsharma.ecomtest.controllers;

import dev.arjunsharma.ecomtest.models.Product;
import dev.arjunsharma.ecomtest.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
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

    @PostMapping("/products")
    public Product CreateProduct(@RequestBody Product productFromUser){
        Product savedProduct;
        savedProduct = productService.CreateProduct(productFromUser);

        return savedProduct;
    }

}