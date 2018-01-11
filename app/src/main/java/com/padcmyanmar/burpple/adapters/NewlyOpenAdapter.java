package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.viewholders.ItemPromotionViewHolder;
import com.padcmyanmar.burpple.viewholders.NewlyOpenViewHolder;

/**
 * Created by ICE on 08-01-2018.
 */

public class NewlyOpenAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View newlyOpenItemView = inflater.inflate(R.layout.item_newly_opened, parent, false);
        NewlyOpenViewHolder newlyOpenViewHolder = new NewlyOpenViewHolder(newlyOpenItemView);
        return newlyOpenViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
