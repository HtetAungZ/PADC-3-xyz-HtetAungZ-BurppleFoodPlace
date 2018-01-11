package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.viewholders.NewlyOpenViewHolder;
import com.padcmyanmar.burpple.viewholders.ThrendingVenuesViewHolder;

/**
 * Created by ICE on 08-01-2018.
 */

public class ThrendingVenuesAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View threndingVenuesItemView = inflater.inflate(R.layout.item_thrending_venues, parent, false);
        ThrendingVenuesViewHolder threndingVenuesAdapter = new ThrendingVenuesViewHolder(threndingVenuesItemView);
        return threndingVenuesAdapter;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
