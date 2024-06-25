package com.example.productcatalogservice.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {

    private Long id;

    private String name;

    private String imageUrl;

    private String description;

    private Double price;

    private CategoryDto categoryDto;
}
