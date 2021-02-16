package com.example.sweeBoot.cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CookieController {

    private final CookieService cookieService;

    @Autowired
    public CookieController(CookieService cookieService){
        this.cookieService = cookieService;
    }

    @RequestMapping(path = "api/cookie")
    public List<Cookie> getCookies() {
        return cookieService.getCookies();
    }

}
