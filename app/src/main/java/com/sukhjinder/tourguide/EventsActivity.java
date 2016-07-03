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
public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location("Madison Square Garden", "Drake + Future Tour"));
        locations.add(new location("Yankee Stadium", "New York Yankees vs Red Sox"));
        locations.add(new location("Barclays Center, Brooklyn, NY", "G-Eazy & Logic: The Endless Summer Tour"));
        locations.add(new location("Yankee Stadium", "New York City FC vs. New York Red Bulls"));
        locations.add(new location("Madison Square Garden", "New york liberty vs. Seattle storm"));
        locations.add(new location("Coney Island Boardwalk", "The Beach Boys"));
        locations.add(new location("Central Park Summerstage", "Blue note Jazz festival"));
        locations.add(new location("Central Park", "Water fight"));
        locations.add(new location("825 3rd Avenue", "Scavenger hunt"));

        LocationAdapter Adapter = new LocationAdapter(this, locations, R.color.category_events);
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