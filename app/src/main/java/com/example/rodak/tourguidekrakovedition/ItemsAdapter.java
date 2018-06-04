package com.example.rodak.tourguidekrakovedition;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rodak.tourguidekrakovedition.dummy.ListItem;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<ListItem> {

    public ItemsAdapter(Activity context, ArrayList<ListItem> itemsList) {
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
        SongsList songsList = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_title);
        nameTextView.setText(songsList.getSongtitle());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        numberTextView.setText(songsList.getArtistName());
        return listItemView;
    }
}
