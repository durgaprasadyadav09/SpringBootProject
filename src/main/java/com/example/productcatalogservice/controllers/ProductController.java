package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public List<ProductDto> getAllProduct(){

        return new ArrayList<>();
    }

    @GetMapping("{productId}")
    public ProductDto getProductById(@PathVariable Long productId){
        ProductDto productDto = new ProductDto();
        productDto.setId(productId);
        return productDto;
    }

    @PostMapping()
    public ProductDto createProduct(@RequestBody ProductDto productDto){

        return productDto;
    }

    @PutMapping("{id}")
    public ProductDto replaceProduct(@RequestBody ProductDto productDto, @PathVariable("id") Long id){
        if (id == null)
            return null;
        return productDto;
    }
}
