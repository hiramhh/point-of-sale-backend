package dev.hiram.point_of_sale.domain.dto;

import dev.hiram.point_of_sale.domain.Category;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record UpdateProductDTO(


        Category category,

        @Min(value = 1, message = "La cantidad no puede ser menor a 1")
        Integer count,

        @NotBlank(message = "La descripcion no debe de ir vacia")
        String description,
        String image,

        @Min(value = 0, message = "El precio no puede ser menor a 0")
        Double price,
        String title,

        @PastOrPresent(message = "La fecha de compra debe ser anterior a la fecha actual")
        LocalDate boughtDate
) {
}
