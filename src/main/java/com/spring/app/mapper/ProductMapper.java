package com.spring.app.mapper;

import com.spring.app.model.dto.request.ProductRequest;
import com.spring.app.model.entity.Product;

public abstract class ProductMapper {
    public static Product toEntity(ProductRequest productRequest){
        var product = new Product();
        product.setName(productRequest.name());
        product.setPrice(productRequest.price());
        return product;
    }
}
