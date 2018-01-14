package com.padcmyanmar.burpple.viewitems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.FeaturedVo;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ICE on 05-01-2018.
 */

public class ImageFeatureViewItem extends FrameLayout {

    @BindView(R.id.iv_feature_background)
    ImageView ivFeaturedBackground;

    @BindView(R.id.tv_type_main_title)
    TextView tvmainTitle;

    @BindView(R.id.tv_type_sub_title)
    TextView tvSubTitle;

    @BindView(R.id.tv_type)
    TextView tvFeatured;

    public ImageFeatureViewItem(@NonNull Context context) {
        super(context);
    }

    public ImageFeatureViewItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageFeatureViewItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this,this);

    }

    public void setImage(String image)
    {

        Glide.with(ivFeaturedBackground.getContext())
                .load(image)
                .into(ivFeaturedBackground);

    }

    public void setMainTitle(String maintitle)
    {
        tvmainTitle.setText(maintitle);
    }

    public void setSubTitle(String subtitle)
    {
        tvSubTitle.setText(subtitle);
    }

    public void setTag(String tag)
    {
        tvFeatured.setText(tag);
    }



}
