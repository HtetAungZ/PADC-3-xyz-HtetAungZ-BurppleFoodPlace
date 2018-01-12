package com.padcmyanmar.burpple.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.PromotionsVo;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ICE on 05-01-2018.
 */

public class ItemPromotionViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_food_detail)
    ImageView ivFoodDetail;

    @BindView(R.id.tv_exclusive)
    TextView tvExclusive;

    @BindView(R.id.tv_due_date)
    TextView tvDueDate;

    @BindView(R.id.tv_ingredients)
    TextView tvIngeridents;

    @BindView(R.id.tv_shop_area)
    TextView tvShopArea;

    public ItemPromotionViewHolder(View itemView) {


        super(itemView);

        ButterKnife.bind(this,itemView);
    }

    public void setPromotions(PromotionsVo promotions)
    {

        tvDueDate.setText(promotions.getBurpplePromotionUntil());
        tvIngeridents.setText(promotions.getBurpplePromotionShop().getBurppleShopName());
        tvShopArea.setText(promotions.getBurpplePromotionShop().getBurppleShopArea());

        Glide.with(ivFoodDetail.getContext())
                .load(promotions.getBurpplePromotionImage())
                .into(ivFoodDetail);


    }



}
