package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.FeaturedVo;
import com.padcmyanmar.burpple.viewitems.ImageFeatureViewItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ICE on 05-01-2018.
 */

public class ImageFeatureAdapter extends PagerAdapter {

    private List<FeaturedVo> mFeaturedList;

    public ImageFeatureAdapter() {

        mFeaturedList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return mFeaturedList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = container.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ImageFeatureViewItem view = (ImageFeatureViewItem) layoutInflater.inflate(R.layout.item_feature_image, container, false);
        view.setImage(mFeaturedList.get(position).getBurppleFeaturedImage());
        view.setMainTitle(mFeaturedList.get(position).getBurppleFeaturedTitle());
        view.setSubTitle(mFeaturedList.get(position).getBurppleFeaturedDesc());
        view.setTag(mFeaturedList.get(position).getBurppleFeaturedTag());
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);


    }

    public void setFeatured(List<FeaturedVo> featuredList) {
        mFeaturedList = featuredList;
        notifyDataSetChanged();

    }


}
