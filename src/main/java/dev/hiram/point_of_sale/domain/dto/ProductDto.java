package dev.hiram.point_of_sale.domain.dto;

import java.time.LocalDate;

public record ProductDto(
        String category,
        Integer count,
        String description,
        String image,
        Double price,
        String title,
        LocalDate boughtDate) {

}
