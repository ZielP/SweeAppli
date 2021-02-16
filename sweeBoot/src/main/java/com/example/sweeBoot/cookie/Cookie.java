package com.example.sweeBoot.cookie;

import java.util.List;

public class Cookie {

    Long id;
    String name;
    List<String> ingredients;
    String recipe;

    public Cookie() {
    }

    public Cookie(Long id,
                  String name,
                  List<String> ingredients,
                  String recipe) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public Cookie(String name,
                  List<String> ingredients,
                  String recipe) {
        this.name = name;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}
