package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherDetailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDetailsTextView = (TextView)findViewById(R.id.tv_weather_details);

        Intent intentFrom = getIntent();

        if(intentFrom != null){
            // COMPLETED (2) Display the weather forecast that was passed from MainActivity
            if(intentFrom.hasExtra(Intent.EXTRA_TEXT)){
                mWeatherDetailsTextView.setText(intentFrom.getStringExtra(Intent.EXTRA_TEXT));
            }
        }

    }
}