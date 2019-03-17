package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
        studentMarks=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studentMarks=null;
    }

    @Test
    public void checkGradesFail() {
        int stuGrades[]={1101,39,46,4};
        assertEquals("Grades should be between 0 and 100",studentMarks.check(4,stuGrades));
    }
    @Test
    public void checkGradePass() {
        int stuGrades[]={11,39,46,4};
        assertEquals("Well done. Grades are between 0 and 100",studentMarks.check(4,stuGrades));
    }

}