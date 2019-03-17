/*
1. Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message.
 */

package com.stackroute.practice;

public class StudentMarks {
    int HIGHEST_GRADE=100;
    int LOWEST_GRADE=0;

    public String check ( int numOfStudents, int stuGrades[])
    {
        for (int i = 0; i < stuGrades.length; i++)
        {
            if(stuGrades[i]>HIGHEST_GRADE || stuGrades[i]<LOWEST_GRADE)
            {
                return "Grades should be between 0 and 100";
            }
        }
        return "Well done. Grades are between 0 and 100";
    }

}

