package dev.hiram.point_of_sale.persistence;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "category",target = "category")
    @Mapping(source = "count",target = "count")
    @Mapping(source = "description",target = "description")
    @Mapping(source = "image",target = "image")
    @Mapping(source = "price",target = "price")
    @Mapping(source = "title",target = "title")
    @Mapping(source = "fecha_compra",target = "fecha_compra")
    ProductDto toDto(ProductEntity entity);
    List<ProductDto> toDto(Iterable<ProductEntity> entities);
}
