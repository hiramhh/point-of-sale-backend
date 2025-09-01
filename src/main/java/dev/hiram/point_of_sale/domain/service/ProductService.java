package dev.hiram.point_of_sale.domain.service;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.dto.UpdateProductDTO;
import dev.hiram.point_of_sale.domain.repository.ProductRepository;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAll(){
        return this.productRepository.getAll();
    }

    public ProductDto getById(long id){
        return this.productRepository.getById(id);
    }

    public ProductDto add(ProductDto productDto){
        return this.productRepository.save(productDto);
    }

    public ProductDto update(long id, UpdateProductDTO updateProductDTO){
        return this.productRepository.update(id, updateProductDTO);
    }
}
