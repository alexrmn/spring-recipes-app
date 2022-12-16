package com.recipies.springrecipeapp.repositories;

import com.recipies.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
