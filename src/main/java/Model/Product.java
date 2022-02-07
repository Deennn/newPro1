package Model;

import Enums.Brand;
import Enums.Category;

public class Product {
    private String name;
    private  int id;
    private Brand brand;
    private Category category;
    private double price;
    private int quantity;

    public Product(String name, int id, Brand brand, Category category, double price, int quantity) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Brand getBrands() {
        return brand;
    }

    public Category getCategories() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrands(Brand brand) {
        this.brand = brand;
    }

    public void setCategories(Category category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id = " + id +
                ", brand = " + brand +
                ", category = " + category +
                ", price = " + price +
                ", quantity = " + quantity +
                '}';
    }
}
