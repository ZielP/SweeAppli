package com.example.swee.service.repository;

import com.example.swee.service.model.Cookie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CookieService {

    @GET("cookie")
    Call<List<Cookie>> getCookiesList();
}
