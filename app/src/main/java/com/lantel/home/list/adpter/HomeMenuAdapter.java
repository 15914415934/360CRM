package com.lantel.home.list.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.moudletest.R;
import com.lantel.home.list.holder.MenuItemViewHolder;
import com.lantel.home.list.listener.onMenuMoreListener;
import com.lantel.mine.list.model.MenuItemModel;
import com.xiao360.baselibrary.image.GlideUtils;
import com.xiao360.baselibrary.listview.BaseRecyclerViewAdapter;
import com.xiao360.baselibrary.listview.BaseViewHolder;


import java.util.List;

/**
 * Created by 冯支.
 * function:
 * Date: 2019/4/26
 * Time: 14:00
 */
public class HomeMenuAdapter extends BaseRecyclerViewAdapter<MenuItemModel>{
    /**
     * 适配器构造
     *
     * @param context
     * @param datas
     */
    public HomeMenuAdapter(Context context, List datas) {
        super(context, datas);
    }

    /**
     * 点击事件
     */
    private onMenuMoreListener mListener;

    public void setOnMenuClickListener(onMenuMoreListener mListener) {
        this.mListener = mListener;
    }

    @Override
    protected BaseViewHolder CreateViewHolder(LayoutInflater inflater, ViewGroup parent, int viewType) {
        return new MenuItemViewHolder(inflater.inflate(R.layout.home_menu_item,parent,false));
    }

    @Override
    protected void bindViewHolder(BaseViewHolder holder, final MenuItemModel data, int position, int viewType) {
        MenuItemViewHolder itemViewHolder = (MenuItemViewHolder) holder;
        boolean isLast = isLastPosition(position);
        itemViewHolder.title.setText(isLast?getString(R.string.more):data.getTitle());
        GlideUtils.loadImageView(context,isLast?R.mipmap.more:data.getIcon(),itemViewHolder.icon);
        itemViewHolder.itemView.setOnClickListener((View v)-> {
                if(mListener!=null){
                    if(isLast){
                        mListener.onMoreClick();
                    }else {
                        mListener.onItemClick(data.getFlag_action());
                    }
                }
        });
       /* if(isLastPosition(position)){
            itemViewHolder.title.setText(getString(R.string.more));
            GlideUtils.loadImageView(context,R.mipmap.more,itemViewHolder.icon);
            itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListener!=null)
                        mListener.onMoreClick();
                }
            });
        }else {
            itemViewHolder.title.setText(data.getTitle());
            GlideUtils.loadImageView(context,data.getIcon(),itemViewHolder.icon);
            itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListener!=null)
                        mListener.onItemClick(data.getFlag_action());
                }
            });
        }*/
    }

    private boolean isLastPosition(int position) {
        return position == getItemCount()-1;
    }

    @Override
    public int getItemCount() {
        return super.getItemCount()+1;
    }
}
