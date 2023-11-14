package com.example.javagettingstarted.model;

import jakarta.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ingredients;
    private String instructions;

    // constructors, getters and setters

    // constructors
    public Recipe() {
        //default constructor
    }

    public Recipe(String name, String ingredients, String instructions){
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    // getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getIngredients(){
        return ingredients;
    }

    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }

    public String getInstructions(){
        return instructions;
    }

    public void setInstructions(String instructions){
        this.instructions = instructions;
    }

    //toString method (optional for better logging and debugging)

    @Override
    public String toString(){
        return "Recipe{" +
                "id=" + id +
                ", name=' " + name + '\'' +
                ", ingredients=' " + ingredients + '\'' +
                ", instructions=' " + instructions + '\'' +
                '}';
    }
}
