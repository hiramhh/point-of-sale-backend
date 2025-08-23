package dev.hiram.point_of_sale.domain.repository;

import dev.hiram.point_of_sale.domain.dto.ProductDto;

import java.util.List;

public interface ProductRepository {
    List<ProductDto> getAll();

    ProductDto getById(long id);
}
