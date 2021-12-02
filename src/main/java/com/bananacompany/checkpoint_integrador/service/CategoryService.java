package com.bananacompany.checkpoint_integrador.service;

import com.bananacompany.checkpoint_integrador.persistence.entity.Category;
import com.bananacompany.checkpoint_integrador.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> selectAll() {
        return categoryRepository.findAll();
    }

    public Category selectById(Integer id) {
        if(categoryRepository.existsById(id)) {
            categoryRepository.findById(id);
        }
        return null;
    }
}
