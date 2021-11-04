package handler.springframework.springrecipes.repositories;

import handler.springframework.springrecipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Evan on 11/3/2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
