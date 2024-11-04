package com.example.employeemanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Set click listener for the Login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    // Show error if fields are empty
                    Toast.makeText(LoginActivity.this, "Please enter both email and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Placeholder: Show toast message for demonstration
                    Toast.makeText(LoginActivity.this, "Logging in...", Toast.LENGTH_SHORT).show();

                    if (authenticateUser(email, password)) {
                        Intent intent = new Intent(LoginActivity.this, EmployeeDashboardActivity.class);
                        startActivity(intent);
                        finish(); // Optional: call finish() if you don't want to return to this activity
                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    // Example method stub for authentication (add real logic if needed)
    private boolean authenticateUser(String email, String password) {
        // Placeholder for authentication logic, such as a database query or API request
        return email.equals("test@example.com") && password.equals("password123");
    }
}
