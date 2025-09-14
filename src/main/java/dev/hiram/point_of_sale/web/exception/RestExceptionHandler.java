package dev.hiram.point_of_sale.web.exception;

import dev.hiram.point_of_sale.domain.exception.CategoryAlreadyExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(CategoryAlreadyExistsException.class)
    public ResponseEntity<Error> hadleException(CategoryAlreadyExistsException ex){
        Error error = new Error("category-already-exists", ex.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
