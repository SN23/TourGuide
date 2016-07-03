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
public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<location> locations = new ArrayList<location>();

        locations.add(new location("Pier 83 West 42nd Street", "The BEAST Speedboat Ride"));
        locations.add(new location("16 Hudson River Greenway", "Circle Line Downtown"));
        locations.add(new location("6 E River Bikeway, New York, NY 10004", "New York Helicopter Inc"));
        locations.add(new location("1000 5th Ave", "Metropolitan Museum of Art"));
        locations.add(new location("11 W 53rd St", "Museum of Modern Art"));
        locations.add(new location("1220 5th Ave", "Museum of the City of New York"));
        locations.add(new location("Pier 86, W 46th St & 12th Ave", "Intrepid Sea, Air & Space Museum"));
        locations.add(new location("911 Greenwich St", "National September 11 Memorial & Museum"));

        LocationAdapter Adapter = new LocationAdapter(this, locations, R.color.category_activities);
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