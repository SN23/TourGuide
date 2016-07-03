package com.sukhjinder.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sukhjinder on 7/2/16.
 */
public class PointsOfInterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location("Liberty Island", "Statue of Liberty", R.drawable.statue_of_liberty));
        locations.add(new location("5th Ave", "Empire State Building", R.drawable.empire_state));
        locations.add(new location("Manhattan", "Central Park", R.drawable.central_park));
        locations.add(new location("45 Rockefeller Plaza", "Rockefeller Center", R.drawable.rockefeller_center));
        locations.add(new location("Brooklyn <-> Manhattan", "Brooklyn Bridge", R.drawable.brooklyn_bridge));
        locations.add(new location("Broadway and 7th Avenue", "Times Square", R.drawable.times_square));
        locations.add(new location("405 Lexington Avenue", "Chrysler Building", R.drawable.chrystler_building));
        locations.add(new location("Broadway to South Street", "Wall Street", R.drawable.wall_street));


        LocationAdapter Adapter = new LocationAdapter(this, locations, R.color.category_points_of_interest);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                location l = locations.get(position);
            }
        });
    }
}