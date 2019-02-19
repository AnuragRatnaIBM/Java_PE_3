package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateExceptionTest {
    GenerateException generateException;

    @Before
    public void setUp() throws Exception {
        generateException=new GenerateException();
    }

    @After
    public void tearDown() throws Exception {
        generateException=null;
    }

    @Test
    public void exceptions1() {
        int row=-1;
        int col=2;
        int arrayInput2[]={10,20,30,40,70};
        String inputString="abc";
        String expectedValue="NegativeArraySizeException";
        String actualValue=generateException.exceptions(row,col,arrayInput2,inputString);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void exceptions2() {
        int row=1;
        int col=2;
        int arrayInput2[]={10,20,30,40};
        String inputString="abc";
        String expectedValue="IndexOutOfBoundsException";
        String actualValue=generateException.exceptions(row,col,arrayInput2,inputString);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void exceptions3() {
        int row=1;
        int col=2;
        int arrayInput2[]={10,20,30,40,70};
        String inputString=null;
        String expectedValue="NullPointerException";
        String actualValue=generateException.exceptions(row,col,arrayInput2,inputString);
        assertEquals(expectedValue,actualValue);
    }
}