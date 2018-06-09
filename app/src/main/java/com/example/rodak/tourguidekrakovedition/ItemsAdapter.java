package com.example.rodak.tourguidekrakovedition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<ListItem> {

    public ItemsAdapter(Context context, ArrayList<ListItem> itemsList) {
        super(context, 0, itemsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        ListItem listItem = getItem(position);
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ImageView photo = (ImageView) listItemView.findViewById(R.id.photo);

        if (listItem.getPhoto() != 0){
            photo.setVisibility(View.VISIBLE);
            photo.setImageResource(listItem.getPhoto());
        } else {
            photo.setVisibility(View.GONE);
        }

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.item_title);
        titleTextView.setText(listItem.getName());
        TextView descrbTextView = (TextView) listItemView.findViewById(R.id.item_dscrb);
        descrbTextView.setText(listItem.getDscrb());
        TextView openingTextView = (TextView) listItemView.findViewById(R.id.item_hours);
        openingTextView.setText(listItem.getOpeningTime());
        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.item_rating);
        ratingTextView.setText(listItem.getRate());
        return listItemView;
    }
}
