package handler.springframework.springrecipes.repositories;

import handler.springframework.springrecipes.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Evan on 11/4/2021
 */
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
