package com.sukhjinder.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView activities = (TextView) findViewById(R.id.activities);
        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivitiesActivity.class);
                startActivity(i);
            }
        });

        TextView events = (TextView) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(i);
            }
        });

        TextView pointsOfInterest = (TextView) findViewById(R.id.pointsOfInterest);
        pointsOfInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PointsOfInterestActivity.class);
                startActivity(i);
            }
        });

        TextView restaurant = (TextView) findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(i);
            }
        });
    }
}
