package com.example.kafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        auth = FirebaseAuth.getInstance();
        profileText = findViewById(R.id.textView);

        user = auth.getCurrentUser();
        profileText.setText(user.getEmail());

        // Retrieve the button by ID
        Button aboutUsButton = findViewById(R.id.aboutUsButton);
        Button cafeButton = findViewById(R.id.cafeButton);
        Button reviewButton = findViewById(R.id.reviewButton);

        // Set OnClickListener for the button
        aboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the AboutUs activity
                Intent intent = new Intent(ProfileActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });

        cafeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the CafeRecommendation activity
                Intent cafeIntent = new Intent(ProfileActivity.this, CafeRecommend.class);
                startActivity(cafeIntent);
            }
        });

        // Set OnClickListener for the "Your Review" button
        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Review activity
                Intent reviewIntent = new Intent(ProfileActivity.this, ReviewActivity.class);
                startActivity(reviewIntent);
            }
        });
    }
    public void signout(View v) {
        auth.signOut();
        finish();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
