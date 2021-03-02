package com.example.swee.view.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swee.R;
import com.example.swee.service.model.Cookie;
import com.example.swee.view.adapter.CookieListAdapter;
import com.example.swee.viewmodel.CookieListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Cookie> cookieList;
    private CookieListAdapter cookieListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        TextView noResultView = findViewById(R.id.noResult);

        LinearLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);

        cookieListAdapter = new CookieListAdapter(this, cookieList);
        recyclerView.setAdapter(cookieListAdapter);

        CookieListViewModel viewModel = ViewModelProviders.of(this).get(CookieListViewModel.class);
        viewModel.getCookieObserver().observe(this, new Observer<List<Cookie>>() {
            @Override
            public void onChanged(List<Cookie> cookies) {
                if (cookies != null) {
                    cookieList = cookies;
                    cookieListAdapter.SetCookieList(cookies);
                    noResultView.setVisibility(View.GONE);
                } else {
                    noResultView.setVisibility(View.VISIBLE);
                }
            }
        });
        viewModel.makeApiCall();
    }
}