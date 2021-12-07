package com.bananacompany.checkpoint_integrador.service;

import com.bananacompany.checkpoint_integrador.exception.BadRequestException;
import com.bananacompany.checkpoint_integrador.persistence.entity.Product;
import com.bananacompany.checkpoint_integrador.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> selectAll() {
        return productRepository.findAll();
    }

    public Product selectById(Integer id) throws BadRequestException{
        try {
            return productRepository.findById(id).get();
        } catch (Exception e){
            throw new BadRequestException("Product Id not found");
        }

    }
}