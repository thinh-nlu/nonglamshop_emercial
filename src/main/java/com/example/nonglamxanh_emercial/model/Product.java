package com.example.nonglamxanh_emercial.model;

public class Product {
    private int id;
    private String title;
    private String image;
    private String price;
    private String unit;
    private String categoryId;
    private String keyword;
    private String status;

    public Product(){}

    public Product(String title, String image, String price, String unit, String categoryId, String keyword, String status) {
        this.title = title;
        this.image = image;
        this.price = price;
        this.unit = unit;
        this.categoryId = categoryId;
        this.keyword = keyword;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                ", unit='" + unit + '\'' +
                ", categoryId=" + categoryId +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
