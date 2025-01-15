package dev.arjunsharma.ecomtest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Product extends BaseModel{

    private String name;
    private double price;
    private String image;

    @ManyToOne
    private Category category;

    public Product(String name, double price, String image, Category category) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.category = category;
    }

    public Product() {
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
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

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + getId() +
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