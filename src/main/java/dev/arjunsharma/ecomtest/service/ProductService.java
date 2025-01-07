package dev.arjunsharma.ecomtest.service;

import dev.arjunsharma.ecomtest.models.Product;
import org.springframework.stereotype.Service;
import dev.arjunsharma.ecomtest.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product GetSingleProduct(Long id){
        Optional<Product> optionalProductFromTheDatabase;
        optionalProductFromTheDatabase = productRepository.findById(id);

        Product productFromTheDatabase = null;

        if(optionalProductFromTheDatabase.isEmpty()){
            System.out.println("product not found");
        }
        else{
            productFromTheDatabase = optionalProductFromTheDatabase.get();
        }
        
        return productFromTheDatabase;
    }

    public List<Product> GetAllProducts(){
        List<Product> productsFromDB;
        productsFromDB = productRepository.findAll();

        return productsFromDB;
    }

    public Product CreateProduct(Product product){
        //product.save()
        Product savedProduct;
        savedProduct = productRepository.save(product);

        return savedProduct;
    }
}
