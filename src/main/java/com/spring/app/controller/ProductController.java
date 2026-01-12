package com.spring.app.controller;

import com.spring.app.model.entity.Product;
import com.spring.app.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity
                .ok(this.productService.getAll());
    }

    @PostMapping
    public ResponseEntity<Product> create(@Valid @RequestBody ProductRequest productRequest){

    }
}
