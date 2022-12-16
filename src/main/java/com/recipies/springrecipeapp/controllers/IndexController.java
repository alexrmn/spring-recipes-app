package com.recipies.springrecipeapp.controllers;

import com.recipies.springrecipeapp.domain.Category;
import com.recipies.springrecipeapp.domain.UnitOfMeasure;
import com.recipies.springrecipeapp.repositories.CategoryRepository;
import com.recipies.springrecipeapp.repositories.RecipeRepository;
import com.recipies.springrecipeapp.repositories.UnitOfMeasureRepository;
import com.recipies.springrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
public class IndexController {
    
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}

