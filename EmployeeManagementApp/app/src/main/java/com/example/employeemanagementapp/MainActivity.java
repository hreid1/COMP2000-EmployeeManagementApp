package com.example.employeemanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        loginButton = findViewById(R.id.loginButton);
        signupButton = findViewById(R.id.signupButton);

        // Set click listeners for the buttons
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login button click
                Toast.makeText(MainActivity.this, "Login button clicked", Toast.LENGTH_SHORT).show();

                // Example: Navigate to a LoginActivity
                 Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                 startActivity(intent);
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sign up button click
                Toast.makeText(MainActivity.this, "Sign Up button clicked", Toast.LENGTH_SHORT).show();

                // Example: Navigate to a SignupActivity
                // Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                // startActivity(intent);
            }
        });
    }
}
