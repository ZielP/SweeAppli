package com.example.swee.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.swee.service.model.Cookie;
import com.example.swee.service.repository.CookieService;
import com.example.swee.service.repository.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CookieListViewModel extends ViewModel {

    private final MutableLiveData<List<Cookie>> cookiesList;

    public CookieListViewModel() {
        this.cookiesList = new MutableLiveData<>();
    }

    public MutableLiveData<List<Cookie>> getCookieObserver(){
        return cookiesList;
    }

    public void makeApiCall(){
        CookieService cookieService = RetrofitInstance.getRetrofit().create(CookieService.class);
        Call<List<Cookie>> call = cookieService.getCookiesList();
        call.enqueue(new Callback<List<Cookie>>() {
            @Override
            public void onResponse(Call<List<Cookie>> call, Response<List<Cookie>> response) {
                cookiesList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Cookie>> call, Throwable t) {
                cookiesList.postValue(null);
            }
        });
    }
}
