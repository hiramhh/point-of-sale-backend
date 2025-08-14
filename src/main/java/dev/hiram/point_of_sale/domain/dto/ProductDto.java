package dev.hiram.point_of_sale.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductDto(
        String category,
        Integer count,
        String descripcion,
        String image,
        BigDecimal price,
        String title,
        LocalDate fecha_compra) {

}
