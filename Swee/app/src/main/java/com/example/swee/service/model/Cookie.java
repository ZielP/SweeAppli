package com.example.swee.service.model;

import java.util.List;

public class Cookie {
    private Long id;
    private String name;
    private List<String> ingredients;
    private String recipe;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getRecipe() {
        return recipe;
    }
}
