package dev.hiram.point_of_sale.web.controller;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<ProductDto> getAll(){
        return this.productService.getAll();
    }
}
