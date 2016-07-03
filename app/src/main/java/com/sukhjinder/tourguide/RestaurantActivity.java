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
public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<location> locations = new ArrayList<location>();
        locations.add(new location("1 Front St, Brooklyn, NY 11201", "Grimaldi's Pizza"));
        locations.add(new location("210 W 118th S", "The Cecil"));
        locations.add(new location("64 W 10th St", "Alta"));
        locations.add(new location("105 Hudson St", "Nobu"));
        locations.add(new location("1486 2nd Ave", "Uva"));
        locations.add(new location("208 1st Avenue", "Balade"));
        locations.add(new location("222 Thompson St", "Cuba"));
        locations.add(new location("343 E 85th St", "Poke"));
        locations.add(new location("1648 2nd Ave", "Heidelberg"));
        locations.add(new location("1378 1st Avenue", "Andaz"));
        locations.add(new location("825 3rd Ave", "Dos Caminos"));

        LocationAdapter Adapter = new LocationAdapter(this, locations, R.color.category_restaurant);
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