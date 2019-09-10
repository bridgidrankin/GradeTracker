package com.bridgidrankin.gradetracker;

import java.text.DecimalFormat;

public class GPACalculator {

    // CS 2080: Programming with UNIX
    // CS 2160: Comp Org & Assembly Language
    // CS 3020: Advanced OO Tech Using C#/.Net
    // CS 3050: Social and Ethical Implications of Computing
    // MATH 2150: Discrete Mathematics

    // A- -> 3.7
    // B+ -> 3.3
    // B -> 3.0
    // B- -> 2.7
    private double mGradePoints;
    private double mCredits;
    private double mGPA;
    private double mGrade1;
    private double mGrade2;
    private double mGrade3;
    private double mGrade4;
    private double mGrade5;
    private double mCredits1;
    private double mCredits2;
    private double mCredits3;
    private double mCredits4;
    private double mCredits5;
    private String mGPAString;

    DecimalFormat mDF = new DecimalFormat("###.###");


    public GPACalculator(double gradePoints, double credits,
                         double grade1, double credits1,
                         double grade2, double credits2,
                         double grade3, double credits3,
                         double grade4, double credits4,
                         double grade5, double credits5) {

        mGradePoints = gradePoints;
        mCredits = credits;
        mGrade1 = grade1;
        mGrade2 = grade2;
        mGrade3 = grade3;
        mGrade4 = grade4;
        mGrade5 = grade5;
        mCredits1 = credits1;
        mCredits2 = credits2;
        mCredits3 = credits3;
        mCredits4 = credits4;
        mCredits5 = credits5;

        mGPA = mGradePoints / mCredits;
    }

    public String calculateGPA() {
        mGPAString = "Welcome to the GPA CALCULATOR!!!!!!!!!?";
        mGPAString += "*******************************************";
        mGPAString += ("\n\nBefore this semester, your GPA was: " + mDF.format(mGPA));

        // Calculate this semester's GPA
        double mSemesterGPA = (mGrade1 * mCredits1) + (mGrade2 * mCredits2)
                + (mGrade3 * mCredits3) + (mGrade4 * mCredits4) + (mGrade5 * mCredits5);
        mSemesterGPA /= mCredits1 + mCredits2 + mCredits3 + mCredits4 + mCredits5;

        mGPAString += ("\n\nYour GPA for this semester is: " + mDF.format(mSemesterGPA));


        // Calculate Cumulative GPA
        mGradePoints += (mGrade1 * mCredits1) + (mGrade2 * mCredits2)
                + (mGrade3 * mCredits3) + (mGrade4 * mCredits4) + (mGrade5 * mCredits5);
        mCredits += mCredits1 + mCredits2 + mCredits3 + mCredits4 + mCredits5;
        mGPA = mGradePoints / mCredits;

        mGPAString += ("\n\nYour cumulative GPA is now: " + mDF.format(mGPA));

        return mGPAString;
    }

}
