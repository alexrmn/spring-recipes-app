package com.recipies.springrecipeapp.services;

import com.recipies.springrecipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
