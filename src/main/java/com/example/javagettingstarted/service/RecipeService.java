package com.example.javagettingstarted.service;

import com.example.javagettingstarted.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAllRecipes();

    Recipe getRecipeById(Long id);

    Recipe saveRecipe(Recipe recipe);

    void deleteRecipe(Long id);
}
