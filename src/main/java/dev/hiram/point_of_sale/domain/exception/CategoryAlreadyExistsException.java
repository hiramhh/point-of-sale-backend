package dev.hiram.point_of_sale.domain.exception;

import dev.hiram.point_of_sale.domain.Category;

public class CategoryAlreadyExistsException extends RuntimeException{


    public CategoryAlreadyExistsException(String productCategory) {
        super("La categoria " + productCategory + " ya existe");
    }
}
