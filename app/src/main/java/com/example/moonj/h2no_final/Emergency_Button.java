package com.example.moonj.h2no_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Emergency_Button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency__button);
    }
    public void switchActivityEmergency(View view)    {
        Intent intent = new Intent (Emergency_Button.this, Emergency_Button.class);
        startActivity(intent);
    }
    public void switchActivityinformation(View view)    {
        Intent intent = new Intent (Emergency_Button.this, information.class);
        startActivity(intent);
    }
    public void switchActivityMaps(View view)    {
        Intent intent = new Intent (Emergency_Button.this, MapsActivity.class);
        startActivity(intent);
    }
}
