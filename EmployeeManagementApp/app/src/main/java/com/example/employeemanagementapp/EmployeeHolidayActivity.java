package com.example.employeemanagementapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EmployeeHolidayActivity extends AppCompatActivity {

    // Declare views
    private EditText nameEditText;
    private EditText jobTitleEditText;
    private EditText startDateEditText;
    private EditText endDateEditText;
    private EditText hoursOfPayEditText;
    private EditText reasonHolidayEditText;
    private Button submitRequestButton;
    private Button backButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_holiday); // Make sure to use the correct layout name

        // Initialize views
        nameEditText = findViewById(R.id.name);
        jobTitleEditText = findViewById(R.id.jobTitle);
        startDateEditText = findViewById(R.id.startDate);
        endDateEditText = findViewById(R.id.endDate);
        hoursOfPayEditText = findViewById(R.id.hoursOfPay);
        reasonHolidayEditText = findViewById(R.id.reasonHoliday);
        submitRequestButton = findViewById(R.id.submitRequestButton);
        backButton = findViewById(R.id.backButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Set up button listeners
        setupListeners();
    }

    private void setupListeners() {


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle back button click
                Intent intent = new Intent(EmployeeHolidayActivity.this, EmployeeDashboardActivity.class);
                startActivity(intent);
            }
        });


    }


}
