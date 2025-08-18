package dev.hiram.point_of_sale.persistence.mapper;

import dev.hiram.point_of_sale.domain.Category;
import org.mapstruct.Named;

public class CategoryMapper {

    @Named("stringToCategory")
    public static Category stringToCategory(String category){
        if (category == null) return null;

        return switch (category.toUpperCase()){

            case "PLUMAS" -> Category.PLUMAS;
            case "SACAPUNTAS" -> Category.SACAPUNTAS;
            case "REGLAS" -> Category.REGLAS;
            case  "PLIEGOS" -> Category.PLIEGOS;
            case "METROS" -> Category.METROS;
            case "PLUMONES" -> Category.PLUMONES;
            default -> null;
        };
    }

    @Named("categoryToString")
    public static String categoryToString(Category category){
        if (category == null) return null;

        return switch (category){
            case PLUMAS -> "PLUMAS";
            case SACAPUNTAS -> "SACAPUNTAS";
            case REGLAS -> "REGLAS";
            case PLIEGOS -> "PLIEGOS";
            case METROS -> "METROS";
            case PLUMONES -> "PLUMONES";

        };
    }


}
