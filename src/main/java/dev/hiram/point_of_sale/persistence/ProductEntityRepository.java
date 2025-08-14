package dev.hiram.point_of_sale.persistence;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.repository.ProductRepository;
import dev.hiram.point_of_sale.persistence.crud.CrudProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductEntityRepository implements ProductRepository {

    private final CrudProductEntity crudProductEntity;
    private final ProductMapper productMapper;

    public ProductEntityRepository(CrudProductEntity crudProductEntity, ProductMapper productMapper) {
        this.crudProductEntity = crudProductEntity;
        this.productMapper = productMapper;
    }


    @Override
    public List<ProductDto> getAll() {
        return this.productMapper.toDto(this.crudProductEntity.findAll());
    }
}
