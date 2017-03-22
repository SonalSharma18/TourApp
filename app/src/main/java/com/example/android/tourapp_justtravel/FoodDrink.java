package com.example.android.tourapp_justtravel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * Created by sonal on 22-03-2017.
 */

public class FoodDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Tour> tourItems = new ArrayList<Tour>();
        tourItems.add(new Tour(R.drawable.girlinthecafe, getString(R.string.food_one), getString(R.string.loc_one_food)));
        tourItems.add(new Tour(R.drawable.fcafe, getString(R.string.food_two), getString(R.string.loc_two_food)));
        tourItems.add(new Tour(R.drawable.backroom, getString(R.string.food_three), getString(R.string.loc_three_food)));
        tourItems.add(new Tour(R.drawable.unclejacks, getString(R.string.food_four), getString(R.string.loc_four_food)));
        tourItems.add(new Tour(R.drawable.caked, getString(R.string.food_five), getString(R.string.loc_five_food)));

        TourAdapter adapter = new TourAdapter(this, tourItems);
        ListView listView = (ListView) findViewById(R.id.list_id);
        listView.setAdapter(adapter);
    }
}