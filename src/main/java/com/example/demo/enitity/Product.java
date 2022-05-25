package com.example.demo.enitity;

public class Product {
    private Integer productId;
    private String productName;
    private Integer price;

    public Product() {

    }

    public Product(Integer productId, String productName, Integer price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer id) {
        this.productId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductInfo() {
        return "product_id=" + productId + ", product_name=" + productName + ", price=" + price ;
    }

}
