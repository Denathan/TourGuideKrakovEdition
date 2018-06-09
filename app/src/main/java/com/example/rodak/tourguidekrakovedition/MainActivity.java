package com.example.rodak.tourguidekrakovedition;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ArrayList<ListItem> culturalList = new ArrayList<>();
    ArrayList<ListItem> restaurantList = new ArrayList<>();
    ArrayList<ListItem> partyList = new ArrayList<>();
    ArrayList<ListItem> hotelList = new ArrayList<>();

    ItemsListFragment itemsListFragment;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        putCulturalList();
        putRestaurantList();
        putPartyList();
        putHotelList();
        fragmentManager = getSupportFragmentManager();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_cultural:
                openListItemFragment(culturalList);
                break;
            case R.id.nav_restaurants:
                openListItemFragment(restaurantList);
                break;
            case R.id.nav_party:
                openListItemFragment(partyList);
                break;
            case R.id.nav_hotels:
                openListItemFragment(hotelList);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void putCulturalList() {
        culturalList.add(new ItemDTO(getString(R.string.cultural_title_1), getString(R.string.cultural_dscrb_1), getString(R.string.cultural_low_price), getString(R.string.rate_five_stars)));
        culturalList.add(new ItemDTO(getString(R.string.cultural_title_2), getString(R.string.cultural_dscrb_2), getString(R.string.cultural_high_price), getString(R.string.rate_four_stars)));
        culturalList.add(new ItemDTO(getString(R.string.cultural_title_3), getString(R.string.cultural_dscrb_3), getString(R.string.cultural_high_price), getString(R.string.rate_five_stars)));
        culturalList.add(new ItemDTO(getString(R.string.cultural_title_4), getString(R.string.cultural_dscrb_4), getString(R.string.cultural_low_price), getString(R.string.rate_three_stars)));
        culturalList.add(new ItemDTO(getString(R.string.cultural_title_5), getString(R.string.cultural_dscrb_5), getString(R.string.cultural_medium_price), getString(R.string.rate_five_stars)));
        culturalList.add(new ItemDTO(getString(R.string.cultural_title_6), getString(R.string.cultural_dscrb_6), getString(R.string.cultural_low_price), getString(R.string.rate_four_stars)));
    }

    public void putRestaurantList() {
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_1), getString(R.string.restaurant_dscrb_1), getString(R.string.restaurant_low_price), getString(R.string.rate_five_stars)));
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_2), getString(R.string.restaurant_dscrb_2), getString(R.string.restaurant_high_price), getString(R.string.rate_four_stars)));
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_3), getString(R.string.restaurant_dscrb_3), getString(R.string.restaurant_high_price), getString(R.string.rate_five_stars)));
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_4), getString(R.string.restaurant_dscrb_4), getString(R.string.restaurant_low_price), getString(R.string.rate_three_stars)));
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_5), getString(R.string.restaurant_dscrb_5), getString(R.string.restaurant_medium_price), getString(R.string.rate_five_stars)));
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_6), getString(R.string.restaurant_dscrb_6), getString(R.string.restaurant_low_price), getString(R.string.rate_four_stars)));
        restaurantList.add(new ItemDTO(getString(R.string.restaurant_title_7), getString(R.string.restaurant_dscrb_7), getString(R.string.restaurant_medium_price), getString(R.string.rate_three_stars)));
    }

    public void putPartyList() {
        partyList.add(new ItemDTO(getString(R.string.party_title_1), getString(R.string.party_dscrb_1), getString(R.string.party_low_price), getString(R.string.rate_five_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_2), getString(R.string.party_dscrb_2), getString(R.string.party_high_price), getString(R.string.rate_four_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_3), getString(R.string.party_dscrb_3), getString(R.string.party_high_price), getString(R.string.rate_five_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_4), getString(R.string.party_dscrb_4), getString(R.string.party_low_price), getString(R.string.rate_three_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_5), getString(R.string.party_dscrb_5), getString(R.string.party_medium_price), getString(R.string.rate_five_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_6), getString(R.string.party_dscrb_6), getString(R.string.party_low_price), getString(R.string.rate_four_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_7), getString(R.string.party_dscrb_7), getString(R.string.party_medium_price), getString(R.string.rate_three_stars)));
        partyList.add(new ItemDTO(getString(R.string.party_title_8), getString(R.string.party_dscrb_8), getString(R.string.party_low_price), getString(R.string.rate_three_stars)));
    }

    public void putHotelList() {
        hotelList.add(new HotelDTO(getString(R.string.hotel_title_1), getString(R.string.hotel_dscrb_1), getString(R.string.hotel_low_price), getString(R.string.rate_five_stars), R.drawable.hotel_kossak));
        hotelList.add(new HotelDTO(getString(R.string.hotel_title_2), getString(R.string.hotel_dscrb_2), getString(R.string.hotel_high_price), getString(R.string.rate_four_stars), R.drawable.hotel_sheeraton));
        hotelList.add(new HotelDTO(getString(R.string.hotel_title_3), getString(R.string.hotel_dscrb_3), getString(R.string.hotel_high_price), getString(R.string.rate_five_stars), R.drawable.hotel_opera));
        hotelList.add(new HotelDTO(getString(R.string.hotel_title_4), getString(R.string.hotel_dscrb_4), getString(R.string.hotel_low_price), getString(R.string.rate_three_stars), R.drawable.hotel_deco));
        hotelList.add(new HotelDTO(getString(R.string.hotel_title_5), getString(R.string.hotel_dscrb_5), getString(R.string.hotel_medium_price), getString(R.string.rate_five_stars), R.drawable.hotel_copernicus));
        hotelList.add(new HotelDTO(getString(R.string.hotel_title_6), getString(R.string.hotel_dscrb_6), getString(R.string.hotel_low_price), getString(R.string.rate_four_stars), R.drawable.hotel_korzkiew));
    }

    private void openListItemFragment(ArrayList<ListItem> items) {
        itemsListFragment = new ItemsListFragment(items);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, itemsListFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
