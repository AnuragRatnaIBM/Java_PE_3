package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkFirstAndLastDay() {
        String expectedValue="Mon 18/02/2019\n" +
                "Sun 24/02/2019";
        assertEquals(expectedValue,FirstAndLastDay.checkFirstAndLastDay());
    }
    @Test
    public void checkFirstAndLastDayFail() {
        String expectedValue="Mon 18/02/2010\n" +
                "Sun 24/02/2010";
        assertNotEquals(expectedValue,FirstAndLastDay.checkFirstAndLastDay());
    }
}