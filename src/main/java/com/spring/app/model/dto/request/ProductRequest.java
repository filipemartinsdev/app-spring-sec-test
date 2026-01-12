package com.spring.app.model.dto.request;

import java.math.BigDecimal;

public record ProductRequest(
        String name,
        BigDecimal price
)
{}
