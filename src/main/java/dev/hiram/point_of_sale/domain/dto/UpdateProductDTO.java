package dev.hiram.point_of_sale.domain.dto;

import dev.hiram.point_of_sale.domain.Category;

import java.time.LocalDate;

public record UpdateProductDTO(
        Category category,
        Integer count,
        String description,
        String image,
        Double price,
        String title,
        LocalDate boughtDate
) {
}
