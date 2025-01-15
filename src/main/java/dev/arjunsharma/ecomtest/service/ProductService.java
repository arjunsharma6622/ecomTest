package dev.arjunsharma.ecomtest.service;

import dev.arjunsharma.ecomtest.Exceptions.ProductNotFoundException;
import dev.arjunsharma.ecomtest.models.Category;
import dev.arjunsharma.ecomtest.models.Product;
import dev.arjunsharma.ecomtest.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import dev.arjunsharma.ecomtest.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepository productRepository;
    CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product GetSingleProduct(Long id) throws ProductNotFoundException {
        Optional<Product> optionalProductFromTheDatabase;
        optionalProductFromTheDatabase = productRepository.findById(id);

        Product productFromTheDatabase = null;

        if(optionalProductFromTheDatabase.isEmpty()){
            throw new ProductNotFoundException("Product not found in the DB, @shashank");
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
        Product productToSave = new Product();

        Optional<Category> optionalCategory = categoryRepository.getCategoryByName(product.getCategory().getName());

        if(optionalCategory.isPresent()){
            productToSave.setCategory(optionalCategory.get());
        }else{
            Category c = new Category();
            c.setName(product.getCategory().getName());

            Category savedCategory = categoryRepository.save(c);

            productToSave.setCategory(savedCategory);
        }

        productToSave.setName(product.getName());
        productToSave.setImage(product.getImage());
        productToSave.setPrice(product.getPrice());

        return productRepository.save(productToSave);
    }
}
