package com.manhhuy.d01112025;

public class Food {
    private String name;
    private String weight;
    private String price;
    private String urlImage;
    private String description;

    public Food(String name, String weight, String price, String urlImage, String description) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.urlImage = urlImage;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}