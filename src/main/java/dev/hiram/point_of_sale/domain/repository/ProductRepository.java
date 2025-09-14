package dev.hiram.point_of_sale.domain.repository;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.dto.UpdateProductDTO;

import java.util.List;

public interface ProductRepository {
    List<ProductDto> getAll();

    ProductDto getById(long id);

    ProductDto save(ProductDto productDto);

    ProductDto update(long id, UpdateProductDTO updateProductDTO);

    void delete(long id);
}
