package com.padcmyanmar.burpple.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.adapters.BurppleGuideAdapter;
import com.padcmyanmar.burpple.adapters.ImageFeatureAdapter;
import com.padcmyanmar.burpple.adapters.NewlyOpenAdapter;
import com.padcmyanmar.burpple.adapters.PromotionAdapter;
import com.padcmyanmar.burpple.adapters.ThrendingVenuesAdapter;
import com.padcmyanmar.burpple.viewholders.NewlyOpenViewHolder;
import com.padcmyanmar.burpple.viewholders.ThrendingVenuesViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BurppleActivity extends AppCompatActivity {

    @BindView(R.id.vp_images)
    ViewPager backgroundimagefeature;

    @BindView(R.id.rv_promotion)
    RecyclerView rvPromotion;

    @BindView(R.id.rv_burpple_guides)
    RecyclerView rvBurppleGuide;

    @BindView(R.id.rv_newly_open)
    RecyclerView rvNewlyOpen;

    @BindView(R.id.rv_thrending_venues)
    RecyclerView rvThrendingVenues;

    private ImageFeatureAdapter mimageFeatureAdapter;

    private PromotionAdapter mpromotionAdapter;

    private BurppleGuideAdapter mburppleGuideAdapter;

    private NewlyOpenAdapter mnewlyOpenAdapter;

    private ThrendingVenuesAdapter mthrendingVenuesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burpple);
        ButterKnife.bind(this, this);


        mimageFeatureAdapter = new ImageFeatureAdapter();
        backgroundimagefeature.setAdapter(mimageFeatureAdapter);


      mpromotionAdapter= new PromotionAdapter();
        LinearLayoutManager linearLayoutPromotion = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvPromotion.setLayoutManager(linearLayoutPromotion);
        rvPromotion.setAdapter(mpromotionAdapter);


        mburppleGuideAdapter = new BurppleGuideAdapter();
        LinearLayoutManager linearLayoutBurpple = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvBurppleGuide.setLayoutManager(linearLayoutBurpple);
        rvBurppleGuide.setAdapter(mburppleGuideAdapter);


        mnewlyOpenAdapter = new NewlyOpenAdapter();
        LinearLayoutManager linearLayoutNewlyOpen = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvNewlyOpen.setLayoutManager(linearLayoutNewlyOpen);
        rvNewlyOpen.setAdapter(mnewlyOpenAdapter);

        mthrendingVenuesAdapter = new ThrendingVenuesAdapter();
        LinearLayoutManager linearLayoutThrendingVenues = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvThrendingVenues.setLayoutManager(linearLayoutThrendingVenues);
        rvThrendingVenues.setAdapter(mthrendingVenuesAdapter);

    }

}
