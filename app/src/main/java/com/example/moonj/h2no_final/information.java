package com.example.moonj.h2no_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

    }
    public void switchActivityEmergency(View view)    {
        Intent intent = new Intent (information.this, Emergency_Button.class);
        startActivity(intent);
    }
    public void switchActivityinformation(View view)    {
        Intent intent = new Intent (information.this, information.class);
        startActivity(intent);
    }
    public void switchActivityMaps(View view)    {
        Intent intent = new Intent (information.this, MapsActivity.class);
        startActivity(intent);
    }

}
