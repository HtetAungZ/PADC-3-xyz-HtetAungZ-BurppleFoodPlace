package com.padcmyanmar.burpple.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.burpple.R;
import com.padcmyanmar.burpple.data.vo.GuidesVo;
import com.padcmyanmar.burpple.viewholders.ItemBurppleGuideViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ICE on 05-01-2018.
 */

public class BurppleGuideAdapter extends RecyclerView.Adapter<ItemBurppleGuideViewHolder>{

  private List<GuidesVo> mGuidesList;

  public BurppleGuideAdapter(){
      mGuidesList= new ArrayList<>();
    }



    @Override
    public ItemBurppleGuideViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View burppleguideItemView = inflater.inflate(R.layout.item_burpple_guides, parent, false);
        ItemBurppleGuideViewHolder itemBurppleGuideViewHolder = new ItemBurppleGuideViewHolder(burppleguideItemView);
        return itemBurppleGuideViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemBurppleGuideViewHolder holder, int position) {

      holder.setGuides(mGuidesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mGuidesList.size();
    }



    public  void setGuides(List<GuidesVo> guidesList)
    {
        mGuidesList= guidesList;
        notifyDataSetChanged();
    }
}
