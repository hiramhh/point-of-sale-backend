package dev.hiram.point_of_sale.persistence.mapper;

import dev.hiram.point_of_sale.domain.Category;
import org.mapstruct.Named;

public class CategoryMapper {

    @Named("stringToCategory")
    public static Category stringToCategory(String categoria){
        if (categoria == null) return null;

        return switch (categoria.toUpperCase()){

            case "PLUMAS" -> Category.PLUMAS;
            case "SACAPUNTAS" -> Category.SACAPUNTAS;
            case "REGLAS" -> Category.REGLAS;
            case "PLIEGOS" -> Category.PLIEGOS;
            case "METROS" -> Category.METROS;
            case "PLUMONES" -> Category.PLUMONES;
            case "BOLIGRAFOS" -> Category.BOLIGRAFOS;
            case "CUADERNOS" -> Category.CUADERNOS;
            case "CARPETAS" -> Category.CARPETAS;
            case "PAPEL" -> Category.PAPEL;
            case "MARCADORES" -> Category.MARCADORES;
            case "TIJERAS" -> Category.TIJERAS;
            case "PEGAMENTOS" -> Category.PEGAMENTOS;
            case "ESTUCHES" -> Category.ESTUCHES;
            case "ENGRAPADORAS" -> Category.ENGRAPADORAS;
            case "LAPICES" -> Category.LAPICES;
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
            case BOLIGRAFOS -> "BOLIGRAFOS";
            case CUADERNOS -> "CUADERNOS";
            case CARPETAS -> "CARPETAS";
            case PAPEL -> "PAPEL";
            case MARCADORES -> "MARCADORES";
            case TIJERAS -> "TIJERAS";
            case PEGAMENTOS -> "PEGAMENTOS";
            case ESTUCHES -> "ESTUCHES";
            case ENGRAPADORAS -> "ENGRAPADORAS";
            case LAPICES -> "LAPICES";
        };
    }


}
