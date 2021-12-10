package com.bananacompany.checkpoint_integrador.service;

//import com.bananacompany.checkpoint_integrador.dto.ProductsDto;
import com.bananacompany.checkpoint_integrador.exception.BadRequestException;
import com.bananacompany.checkpoint_integrador.persistence.entity.Product;
import com.bananacompany.checkpoint_integrador.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> selectAll() {
//        List<Product> productList = productRepository.findAll();
//        List<ProductsDto> productsDtoList = new ArrayList<>();
//
//        productList.forEach(product -> {
//            productsDtoList.add(new ProductsDto(product.getId(),
//                    product.getTitle(),
//                    product.getPrice(),
//                    product.getCategory(),
//                    product.getDescription(),
//                    product.getImage(),
//                    product.hasGluten(),
//                    product.hasLactose(),
//                    product.hasEgg()));
//        });
//        return productsDtoList;
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