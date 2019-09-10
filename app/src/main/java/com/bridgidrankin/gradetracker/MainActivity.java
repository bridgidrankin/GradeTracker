package com.bridgidrankin.gradetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Save up to 5 grades in the Grade variables
        // Save up to 5 credit hours in the Credits variables

        // A- -> 3.7
        // B+ -> 3.3
        // B -> 3.0
        // B- -> 2.7

        // Enter 0 for any classes you'd like to leave blank

        GPACalculator newGrades = new GPACalculator(45.9, 12.0,
                4.0, 3.0,
                4.0, 3.0,
                4.0, 3.0,
                4.0, 3.0,
                4.0, 3.0);
        String newGPA = newGrades.calculateGPA();

        displayGPA(newGPA);
    }

    public void displayGPA(String GPAString) {
        TextView GPATextView = (TextView) findViewById(R.id.GPA_text_view);
        GPATextView.setText("" + GPAString);
    }
}
