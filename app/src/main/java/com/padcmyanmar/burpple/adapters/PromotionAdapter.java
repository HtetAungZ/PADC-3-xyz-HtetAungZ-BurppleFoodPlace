package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.PromotionsVo;
import com.padcmyanmar.burpple.viewholders.ItemPromotionViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ICE on 05-01-2018.
 */

public class PromotionAdapter extends RecyclerView.Adapter<ItemPromotionViewHolder>{

    private List<PromotionsVo> mPromotionList;

    public PromotionAdapter() {
        mPromotionList = new ArrayList<>();
    }




    @Override
    public ItemPromotionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View promotionItemView = inflater.inflate(R.layout.item_promotions, parent, false);
            ItemPromotionViewHolder itemPromotionViewHolder = new ItemPromotionViewHolder(promotionItemView);
        return itemPromotionViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemPromotionViewHolder holder, int position) {

        holder.setPromotions(mPromotionList.get(position));

    }

    @Override
    public int getItemCount() {
        return mPromotionList.size();
    }


    public void setPromotions(List<PromotionsVo> promotionList)
    {
        mPromotionList=promotionList;
        notifyDataSetChanged();

    }

}

