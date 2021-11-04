package handler.springframework.springrecipes.controllers;

import handler.springframework.springrecipes.domain.Category;
import handler.springframework.springrecipes.domain.UnitOfMeasure;
import handler.springframework.springrecipes.repositories.CategoryRepository;
import handler.springframework.springrecipes.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Evan on 4/9/2021
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/", "/index", ""})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println(categoryOptional.get().getDescription());
        System.out.println(unitOfMeasureOptional.get().getDescription());

        System.out.println("evn");
        return "index";
    }
}
