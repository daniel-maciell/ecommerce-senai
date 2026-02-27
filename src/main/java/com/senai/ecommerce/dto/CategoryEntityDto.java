package com.senai.ecommerce.dto;

import com.senai.ecommerce.entities.ProductEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class CategoryEntityDto {
    @NotNull
    String name;

    @NotNull
    Set<ProductEntityDto> products;
}
