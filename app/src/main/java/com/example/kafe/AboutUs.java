package com.example.kafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus
        );

        // Retrieve the button by ID
        Button backToProfileButton = findViewById(R.id.backToProfileButton);

        // Set OnClickListener for the button
        backToProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ProfileActivity
                Intent intent = new Intent(AboutUs.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
