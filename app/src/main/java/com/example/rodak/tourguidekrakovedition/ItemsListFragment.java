package com.example.rodak.tourguidekrakovedition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ItemsListFragment extends Fragment {

    public ItemsListFragment(){
    }

    ItemsAdapter listItemAdapter;
    ArrayList<ListItem> listItems = new ArrayList<>();
    ListView listView;

    public ItemsListFragment(ArrayList<ListItem> listItems) {
        this.listItems = listItems;  }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_list, container, false);

        listItemAdapter = new ItemsAdapter(getContext(), listItems);
        listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(listItemAdapter);

        return rootView;
    }
}
