package com.bridgidrankin.gradetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // CS 2080: Programming with UNIX
    // CS 2160: Comp Org & Assembly Language
    // CS 3020: Advanced OO Tech Using C#/.Net
    // CS 3050: Social and Ethical Implications of Computing
    // MATH 2150: Discrete Mathematics
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create a GPA Calculator with the following:




        // Total Grade Points : 45.9
        // Credits : 12.0
        // GPA : 3.825

        // (grade1*credits1) + (grade2*credits2) / (credits1+credits2)
        // TGP += sum of (grade*credits)
        // Credits += credits
        // GPA =

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
