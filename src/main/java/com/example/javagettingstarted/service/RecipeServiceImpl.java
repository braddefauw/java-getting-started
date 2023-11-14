package com.example.javagettingstarted.service;

import com.example.javagettingstarted.model.Recipe;
import com.example.javagettingstarted.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }

    @Override
    public Recipe getRecipeById(Long id){
        return recipeRepository.findById(id).orElse(null);
    }

    @Override
    public Recipe saveRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    @Override
    public void deleteRecipe(Long id){
        recipeRepository.deleteById(id);
    }
}
