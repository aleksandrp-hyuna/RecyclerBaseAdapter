package com.github.aleksandrp;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.aleksandrp.base.BaseHolder;

import java.util.Locale;

/**
 * Created on 24.04.2017
 * Project RecyclerBind
 *
 * @author Aleks Sander
 */

final class BurgerHolder extends BaseHolder<BurgerModel> {

    private TextView burgerName;

    BurgerHolder(ViewGroup parent) {
        super(parent, android.R.layout.simple_list_item_1, null);
        burgerName = (TextView) itemView;
    }

    @Override
    public void bindItem(@NonNull BurgerModel burgerModel) {
        String format = "\n\n%d. %s ($%s)\n\n";
        int position = getAdapterPosition() + 1;
        String price = Double.toString(burgerModel.price);
        String text = String.format(Locale.getDefault(), format, position, burgerModel.name, price);
        burgerName.setText(text);
    }

}
