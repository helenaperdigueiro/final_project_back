package com.bananacompany.checkpoint_integrador.service;

import com.bananacompany.checkpoint_integrador.persistence.entity.Product;
import com.bananacompany.checkpoint_integrador.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> selectAll() {
        return productRepository.findAll();
    }

    public Product selectById(Integer id) {
        if(productRepository.existsById(id)) {
            return productRepository.findById(id).get();
        }
        return null;
    }
}
