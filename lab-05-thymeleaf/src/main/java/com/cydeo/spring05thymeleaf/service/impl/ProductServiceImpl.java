package com.cydeo.spring05thymeleaf.service.impl;


import com.cydeo.spring05thymeleaf.model.Product;
import com.cydeo.spring05thymeleaf.repository.ProductRepository;
import com.cydeo.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public boolean productCreate(Product product){
        // implement method
        product.setId(UUID.randomUUID());
        return productRepository.save(product);
    }

    @Override
    public List<Product> listProduct() {
        // implement method
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(UUID uuid){
        // implement method
        return productRepository.findProductById(uuid);
    }

}
