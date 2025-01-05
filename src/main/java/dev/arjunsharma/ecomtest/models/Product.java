package dev.arjunsharma.ecomtest.models;

public class Product {
    private String name;
    private double price;
    private Long id;
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
}