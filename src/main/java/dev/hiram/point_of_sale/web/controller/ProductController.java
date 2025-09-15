package dev.hiram.point_of_sale.web.controller;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.dto.UpdateProductDTO;
import dev.hiram.point_of_sale.domain.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "Products", description = "Operation about products")
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
    @Operation(
            summary = "Get a product by id",
            description = "Return one product that matches the ID provided",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Pelicula encontraada"),
                    @ApiResponse(responseCode = "400", description = "Pelicula no encontrada", content = @Content)
            }
    )
    public ResponseEntity<ProductDto> getById(@Parameter(description = "identify product to looking for", example = "9") @PathVariable long id){

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
    public ResponseEntity<ProductDto> update(@PathVariable long id, @RequestBody @Valid UpdateProductDTO updateProductDTO){
        return ResponseEntity.ok(this.productService.update(id, updateProductDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        this.productService.delete(id);
        return ResponseEntity.ok().build();
    }
}
