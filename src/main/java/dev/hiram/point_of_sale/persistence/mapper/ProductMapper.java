package dev.hiram.point_of_sale.persistence.mapper;

import dev.hiram.point_of_sale.domain.dto.ProductDto;
import dev.hiram.point_of_sale.domain.dto.UpdateProductDTO;
import dev.hiram.point_of_sale.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
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


    @InheritInverseConfiguration
    @Mapping(source = "category", target = "categoria", qualifiedByName = "categoryToString")
    ProductEntity toEntity(ProductDto productDto);


    @Mapping(target = "categoria", source="category", qualifiedByName = "categoryToString")
    @Mapping(target = "existencia",source = "count")
    @Mapping(target = "descripcion",source = "description")
    @Mapping(target = "imagen",source = "image")
    @Mapping(target = "precio",source = "price")
    @Mapping(target = "titulo",source = "title")
    @Mapping(target = "fechaCompra",source = "boughtDate")
    void updateEntityFromDto(UpdateProductDTO updateProductDTO, @MappingTarget ProductEntity productEntity);
}
