package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionCheckTest {
    ExceptionCheck exceptionCheck;

    @Before
    public void setUp() throws Exception {
        exceptionCheck=new ExceptionCheck();
    }

    @After
    public void tearDown() throws Exception {
        exceptionCheck=null;
    }

    @Test
    public void exceptionCheck() {
        String expectedValue="ArithmeticException ..!! Number divided by 0. This is Finally Block";
        int invalidInput=0;
        String actualValue=exceptionCheck.ExceptionCheck(invalidInput);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void exceptionCheckFail() {
        String expectedValue="This is Finally Block";
        int invalidInput=100;
        String actualValue=exceptionCheck.ExceptionCheck(invalidInput);
        assertEquals(expectedValue,actualValue);
    }
}