package dev.hiram.point_of_sale.persistence;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.dto.UpdateProductDTO;
import dev.hiram.point_of_sale.domain.repository.ProductRepository;
import dev.hiram.point_of_sale.persistence.crud.CrudProductEntity;
import dev.hiram.point_of_sale.persistence.entity.ProductEntity;
import dev.hiram.point_of_sale.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
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

    @Override
    public ProductDto getById(long id) {
        ProductEntity productEntity = this.crudProductEntity.findById(id).orElse(null);

        return this.productMapper.toDto(productEntity);
    }

    public ProductDto save(ProductDto productDto){
        ProductEntity productEntity = this.productMapper.toEntity(productDto);
        productEntity.setExistencia(0);

        return this.productMapper.toDto(this.crudProductEntity.save(productEntity));
    }

    @Override
    public ProductDto update(long id, UpdateProductDTO updateProductDTO) {

        ProductEntity productEntity = this.crudProductEntity.findById(id).orElse(null);

        if (productEntity == null) return null;

        this.productMapper.updateEntityFromDto(updateProductDTO, productEntity);

         return this.productMapper.toDto(this.crudProductEntity.save(productEntity));
    }
}
