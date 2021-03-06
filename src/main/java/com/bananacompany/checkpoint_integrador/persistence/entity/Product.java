package com.bananacompany.checkpoint_integrador.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String description;
    private String image;
    private Boolean hasGluten;
    private Boolean hasLactose;
    private Boolean hasEgg;
    private String ingredients;

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getHasGluten() {
        return hasGluten;
    }

    public void setHasGluten(Boolean hasGluten) {
        this.hasGluten = hasGluten;
    }

    public Boolean getHasLactose() {
        return hasLactose;
    }

    public void setHasLactose(Boolean hasLactose) {
        this.hasLactose = hasLactose;
    }

    public Boolean getHasEgg() {
        return hasEgg;
    }

    public void setHasEgg(Boolean hasEgg) {
        this.hasEgg = hasEgg;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
