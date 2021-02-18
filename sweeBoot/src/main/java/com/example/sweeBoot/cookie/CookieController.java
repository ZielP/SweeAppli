package com.example.sweeBoot.cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/cookie")
public class CookieController {

    private final CookieService cookieService;

    @Autowired
    public CookieController(CookieService cookieService){
        this.cookieService = cookieService;
    }

    @GetMapping
    public List<Cookie> getCookies() {
        return cookieService.getCookies();
    }

    @GetMapping(path = "{cookieId}")
    public List<Cookie> getCookie(@PathVariable Long cookieId){
        return cookieService.getCookieById(cookieId);
    }

    @PostMapping
    public void postNewCookie(@RequestBody Cookie cookie){
        cookieService.addNewCookie(cookie);
    }

    @DeleteMapping(path = "{cookieId}" )
    public void deleteCookie(@PathVariable Long cookieId){
        cookieService.deleteCookieById(cookieId);
    }

}
