package dev.arjunsharma.ecomtest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private double price;
    private String image;

    public Product(String name, double price, Long id, String image) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.image = image;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}

// @Entity --

// mysql driver, spring jpa, hibernate

/* JPA --- if internal imp of dbs queries change
   |
   hibernate (ORM) --- predefined methods
   |
   different db's  -- actual query

   selectXyz()

   select $ from xyz; - mysql -----> selectXyz
   choose all form xyz; - other db ------> selectXyz

   object relational mapping
*/