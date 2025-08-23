package dev.hiram.point_of_sale.domain.service;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.repository.ProductRepository;
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
}
