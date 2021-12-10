//package com.bananacompany.checkpoint_integrador.dto;
//
//import com.bananacompany.checkpoint_integrador.persistence.entity.Category;
//
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//public class ProductsDto {
//    private Integer id;
//    private String title;
//    private Double price;
//    private Category category;
//    private String description;
//    private String image;
//    private Boolean hasGluten;
//    private Boolean hasLactose;
//    private Boolean hasEgg;
//
//    public ProductsDto(Integer id, String title, Double price, Category category, String description, String image, Boolean hasGluten, Boolean hasLactose, Boolean hasEgg) {
//        this.id = id;
//        this.title = title;
//        this.price = price;
//        this.category = category;
//        this.description = description;
//        this.image = image;
//        this.hasGluten = hasGluten;
//        this.hasLactose = hasLactose;
//        this.hasEgg = hasEgg;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public Boolean getHasGluten() {
//        return hasGluten;
//    }
//
//    public void setHasGluten(Boolean hasGluten) {
//        this.hasGluten = hasGluten;
//    }
//
//    public Boolean getHasLactose() {
//        return hasLactose;
//    }
//
//    public void setHasLactose(Boolean hasLactose) {
//        this.hasLactose = hasLactose;
//    }
//
//    public Boolean getHasEgg() {
//        return hasEgg;
//    }
//
//    public void setHasEgg(Boolean hasEgg) {
//        this.hasEgg = hasEgg;
//    }
//}
