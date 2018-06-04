package com.example.rodak.tourguidekrakovedition;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsListFragment extends Fragment {

    public ItemsListFragment(){
    }

    ItemsAdapter listItemAdapter;
    ArrayList<LauncherActivity.ListItem> listItems = new ArrayList<>();
    ListView listView;
    String fragmentTitle;

    public ItemsListFragment(ArrayList<LauncherActivity.ListItem> listItems, String fragmentTitle) {
        this.fragmentTitle = fragmentTitle;
        this.listItems = listItems;  }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_listitem, container, false);

        TextView fragmentTitleView = (TextView) rootView.findViewById(R.id.fragment_title_view) ;
        fragmentTitleView.setText(fragmentTitle);

        listItemAdapter = new ItemsAdapter(getContext(), listItems);
        listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(listItemAdapter);

        return rootView;
    }
}
