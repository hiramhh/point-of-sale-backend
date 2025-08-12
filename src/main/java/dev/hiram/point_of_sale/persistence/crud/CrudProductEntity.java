package dev.hiram.point_of_sale.persistence.crud;

import dev.hiram.point_of_sale.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudProductEntity extends CrudRepository <ProductEntity, Long>{


}
