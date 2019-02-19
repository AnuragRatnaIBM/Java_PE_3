package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    ConsecutiveNumber consecutiveNumber;

    @Before
    public void setUp() throws Exception {
        consecutiveNumber=new ConsecutiveNumber();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumber=null;
    }

    @Test
    public void checkConsecutive() {
        boolean expectedValue=true;
        boolean actualValue=consecutiveNumber.checkConsecutive("54,53,52,51,50,49,48");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkConsecutiveFail() {
        boolean expectedValue=false;
        boolean actualValue=consecutiveNumber.checkConsecutive("54,53,52,51,50,48,48");
        assertEquals(expectedValue,actualValue);
    }
}