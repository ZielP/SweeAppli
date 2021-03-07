package com.example.swee.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.swee.R;
import com.example.swee.service.model.Cookie;

import java.util.List;

public class CookieListAdapter extends RecyclerView.Adapter<CookieListAdapter.MyViewHolder> {

    private final Context context;
    private List<Cookie> cookieList;

    public CookieListAdapter(Context context, List<Cookie> cookieList) {
        this.context = context;
        this.cookieList = cookieList;
    }

    public void SetCookieList(List<Cookie> cookieList) {
        this.cookieList = cookieList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CookieListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CookieListAdapter.MyViewHolder holder, int position) {
        holder.cookieName.setText(this.cookieList.get(position).getName());
        /*
        For images
        Glide.with(context).load(this.cookieList.get(position).getImage())
                .apply(RequestOptions.centerCropTransform())
                .into(holder.imageView);
                */
    }

    @Override
    public int getItemCount() {
        if (cookieList != null) {
            return this.cookieList.size();
        }
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView cookieName;

        public MyViewHolder(View viewItem) {
            super(viewItem);
            cookieName = viewItem.findViewById(R.id.nameView);
        }
    }
}
