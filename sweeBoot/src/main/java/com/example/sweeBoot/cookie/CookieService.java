package com.example.sweeBoot.cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CookieService {

    private final CookieRepository cookieRepository;

    @Autowired
    public CookieService(CookieRepository cookieRepository) {
        this.cookieRepository = cookieRepository;
    }


    public List<Cookie> getCookies() {
        return cookieRepository.findAll();
    }

    public List<Cookie> getCookieById(Long cookieId) {
        return cookieRepository.findAllById(Collections.singleton(cookieId));
    }

    public void addNewCookie(Cookie cookie) {
        Optional<Cookie> cookieOptional = cookieRepository.findCookieByName(cookie.getName());
        if (cookieOptional.isPresent()) throw new IllegalStateException("Name taken");

        cookieRepository.save(cookie);
    }

    public void deleteCookieById(Long cookieId) {
        boolean existsById = cookieRepository.existsById(cookieId);
        if (!existsById) throw new IllegalStateException("Cookie with id " + cookieId + " does not exist");

        cookieRepository.deleteById(cookieId);
    }

    @Transactional
    public void updateCookie(Long cookieId, String name, List<String> ingredients, String recipe) {
        Cookie cookie = cookieRepository.findById(cookieId).orElseThrow(() -> new IllegalStateException("Cookie with id " + cookieId + " does not exist"));

//        Couldn't use !Object.equals(cookie.getName(), name)
        String nameOfCookie = cookie.getName();
        boolean areNameEquals = nameOfCookie.equals(name);
        if (name != null && name.trim().length() > 0 && !areNameEquals) {
            Optional<Cookie> cookieOptional = cookieRepository.findCookieByName(name);
            if (cookieOptional.isPresent()) throw new IllegalStateException("Name taken");

            cookie.setName(name);
        }

        if (!ingredients.isEmpty()) {
            List<String> ingredientsWithoutEmptyStrings = ingredients.stream()
                    .filter(x -> !x.matches(""))
                    .collect(Collectors.toList());

            List<String> ingredientsOfCookie = cookie.getIngredients();
            Collections.sort(ingredientsOfCookie);
            Collections.sort(ingredientsWithoutEmptyStrings);

            if (ingredientsOfCookie.containsAll(ingredientsWithoutEmptyStrings))
                throw new IllegalStateException("The ingredients are the same as before");

            cookie.setIngredients(ingredientsWithoutEmptyStrings);
        }

        String recipeOfCookie = cookie.getRecipe();
        boolean areRecipesEquals = recipeOfCookie.equals(recipe);
        if (recipe != null && recipe.trim().length() > 0 && !areRecipesEquals) {
            cookie.setRecipe(recipe);
        }
    }
}
