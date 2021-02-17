package com.example.sweeBoot.cookie;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Cookie {

    @Id
    @SequenceGenerator(
            name = "cookie_sequence",
            sequenceName = "cookie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "cookie_sequence"
    )
    Long id;
    String name;
    @ElementCollection(targetClass = String.class)
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
