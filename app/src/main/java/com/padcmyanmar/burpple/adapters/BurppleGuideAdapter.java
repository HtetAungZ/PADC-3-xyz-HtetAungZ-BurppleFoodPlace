package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.viewholders.ItemBurppleGuideViewHolder;

/**
 * Created by ICE on 05-01-2018.
 */

public class BurppleGuideAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View burppleguideItemView = inflater.inflate(R.layout.item_burpple_guides, parent, false);
        ItemBurppleGuideViewHolder itemBurppleGuideViewHolder = new ItemBurppleGuideViewHolder(burppleguideItemView);
        return itemBurppleGuideViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
