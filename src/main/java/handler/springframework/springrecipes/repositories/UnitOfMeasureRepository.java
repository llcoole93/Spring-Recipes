package handler.springframework.springrecipes.repositories;

import handler.springframework.springrecipes.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Evan on 11/3/2021
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
