package com.example.productcatalogservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category extends BaseModel{

    private String name;

    private String description;

    private List<Product> productList;
}
