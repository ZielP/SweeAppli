package com.example.sweeBoot.cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CookieService {

    private final CookieRepository cookieRepository;

    @Autowired
    public CookieService(CookieRepository cookieRepository) {
        this.cookieRepository = cookieRepository;
    }


    public List<Cookie> getCookies(){
        return cookieRepository.findAll();
    }

    public void addNewCookie(Cookie cookie) {
        Optional<Cookie> cookieOptional = cookieRepository.findCookieByName(cookie.getName());
        if(cookieOptional.isPresent()) throw new IllegalStateException("Name taken");

        cookieRepository.save(cookie);
    }

    public void deleteCookieById(Long cookieId) {
        boolean existsById = cookieRepository.existsById(cookieId);
        if(!existsById) throw new IllegalStateException("Cookie wit id " + cookieId + "does not exist");

        cookieRepository.deleteById(cookieId);
    }
}
