package dev.hiram.point_of_sale.persistence.mapper;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.persistence.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {


    @Mapping(source = "categoria", target="category", qualifiedByName = "stringToCategory")
    @Mapping(source = "existencia",target = "count")
    @Mapping(source = "descripcion",target = "description")
    @Mapping(source = "imagen",target = "image")
    @Mapping(source = "precio",target = "price")
    @Mapping(source = "titulo",target = "title")
    @Mapping(source = "fechaCompra",target = "boughtDate")
    ProductDto toDto(ProductEntity entity);
    List<ProductDto> toDto(Iterable<ProductEntity> entities);

}
