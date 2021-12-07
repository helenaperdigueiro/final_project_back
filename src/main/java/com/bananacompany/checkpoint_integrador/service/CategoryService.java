package com.bananacompany.checkpoint_integrador.service;

import com.bananacompany.checkpoint_integrador.exception.BadRequestException;
import com.bananacompany.checkpoint_integrador.persistence.entity.Category;
import com.bananacompany.checkpoint_integrador.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> selectAll() {
        return categoryRepository.findAll();
    }

    public Category selectByName(String name) throws BadRequestException{
        try {
            return categoryRepository.findByName(name);
        } catch (Exception e) {
            throw new BadRequestException("Category Id not found");
        }

    }
}