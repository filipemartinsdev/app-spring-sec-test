package com.spring.app.service;

import com.spring.app.mapper.ProductMapper;
import com.spring.app.model.entity.Product;
import com.spring.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import com.spring.app.model.dto.request.ProductRequest;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return (List<Product>) this.productRepository.findAll();
    }

    public Product getById(UUID id){
        return this.productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product getByName(String name){
        return this.productRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product create(ProductRequest productRequest){
        return this.productRepository.save(
                ProductMapper.toEntity(productRequest)
        );
    }

    public Product update(UUID id, ProductRequest productRequest){
        var product = new Product();
        product.setId(id);
        product.setName(productRequest.name());
        product.setPrice(productRequest.price());
        return this.productRepository.save(product);
    }
}
