package dev.hiram.point_of_sale.web.controller;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.dto.UpdateProductDTO;
import dev.hiram.point_of_sale.domain.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){

        return ResponseEntity.ok(this.productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable long id){

        ProductDto productDto = this.productService.getById(id);

        if (productDto == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(productDto);
    }

    @PostMapping
    public ResponseEntity<ProductDto> add(@RequestBody ProductDto productDto){
        ProductDto productDtoResponse = this.productService.add(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDtoResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable long id, @RequestBody UpdateProductDTO updateProductDTO){
        return ResponseEntity.ok(this.productService.update(id, updateProductDTO));
    }
}
