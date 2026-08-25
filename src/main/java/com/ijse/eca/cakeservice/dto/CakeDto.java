package com.ijse.eca.cakeservice.dto;

import java.math.BigDecimal;

public class CakeDto {
    private Long id;
    private String name;
    private String category;
    private String flavor;
    private BigDecimal price;
    private Integer stockQuantity;
    private String description;
    private String imageUrl;

    public CakeDto() {}

    public CakeDto(Long id, String name, String category, String flavor, BigDecimal price, Integer stockQuantity, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.flavor = flavor;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getFlavor() { return flavor; }
    public void setFlavor(String flavor) { this.flavor = flavor; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Integer getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(Integer stockQuantity) { this.stockQuantity = stockQuantity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
