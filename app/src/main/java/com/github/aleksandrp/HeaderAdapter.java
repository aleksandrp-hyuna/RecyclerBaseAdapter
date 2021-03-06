package com.github.aleksandrp;

import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.github.aleksandrp.base.BaseAdapter;
import com.github.aleksandrp.base.BaseHolder;

import java.util.List;

/**
 * Created on 18.07.2017
 * Project RecyclerBind
 *
 * @author Aleks Sander
 */

public class HeaderAdapter extends BaseAdapter<BurgerModel> {

    public HeaderAdapter(@Nullable List<BurgerModel> list, @Nullable BaseHolder.OnHolderClickListener<BurgerModel> clickListener) {
        super(list, clickListener);
    }

    @Override
    public BaseHolder<BurgerModel> onCreateContentViewHolder(ViewGroup recyclerView) {
        return new BurgerHolder(recyclerView);
    }

    @Override
    public BaseHolder<BurgerModel> onCreateHeaderViewHolder(ViewGroup recyclerView) {
        return new BurgerHeaderHolder(recyclerView);
    }
}
