package com.padcmyanmar.burpple.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.GuidesVo;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ICE on 05-01-2018.
 */

public class ItemBurppleGuideViewHolder extends RecyclerView.ViewHolder {

   @BindView(R.id.iv_guide_image)
    ImageView ivGuideImage;

   @BindView(R.id.tv_guide_title)
    TextView tvGuideTitle;

   @BindView(R.id.tv_guide_desc)
   TextView tvGuideDesc;


    public ItemBurppleGuideViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setGuides(GuidesVo guides)
    {

        tvGuideTitle.setText(guides.getBurppleGuideTitle());
        tvGuideDesc.setText(guides.getBurppleGuideDesc());

        Glide.with(ivGuideImage.getContext())
                .load(guides.getBurppleGuideImage())
                .into(ivGuideImage);

    }


}
