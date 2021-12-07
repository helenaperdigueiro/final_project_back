package com.bananacompany.checkpoint_integrador.controller;

import com.bananacompany.checkpoint_integrador.exception.BadRequestException;
import com.bananacompany.checkpoint_integrador.persistence.entity.Category;
import com.bananacompany.checkpoint_integrador.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        
        return ResponseEntity.ok(categoryService.selectAll());
    }
    
    @GetMapping("/{name}")
    public ResponseEntity<Category> getCategoryById(@PathVariable String name) throws BadRequestException {
            Category category = categoryService.selectByName(name);
            return ResponseEntity.ok(category);
    }
}

