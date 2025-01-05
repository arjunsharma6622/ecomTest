package dev.arjunsharma.ecomtest.service;

import dev.arjunsharma.ecomtest.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public Product GetSingleProduct(Long id){
        Product productFromTheDatabase;
        productFromTheDatabase = new Product(
                "Tshirt",
                1,
                2342L,
                "xyz"
        );

        return productFromTheDatabase;
    }

    public List<Product> GetAllProducts(){

        List<Product> productsFromDB;
        productsFromDB = new ArrayList<Product>();

        Product p1;
        p1 = new Product();

        p1.setId(1234L);
        p1.setName("Prod1");
        p1.setPrice(32423);
        p1.setImage("image1");

        Product p2;
        p2 = new Product();

        p2.setId(43534L);
        p2.setName("Prod2");
        p2.setPrice(3332);
        p2.setImage("image2");

        Product p3;
        p3 = new Product();

        p3.setId(34342L);
        p3.setName("Prod3");
        p3.setPrice(11);
        p3.setImage("image3");

        productsFromDB.add(p1);
        productsFromDB.add(p2);
        productsFromDB.add(p3);

        return productsFromDB;
    }
}
