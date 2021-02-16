package com.example.sweeBoot.cookie;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookieService {

    public List<Cookie> getCookies() {
        return List.of(new Cookie(
                        1L,
                        "Biscuit",
                        List.of("sugar", "milk"),
                        "Stir them all!"
                )
        );
    }
}
