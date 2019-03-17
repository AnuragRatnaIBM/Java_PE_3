package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;

    @Before
    public void setUp() throws Exception {
        removeVowels =new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels =null;
    }

    @Test
    public void toRemove() {
        String expectedValue="[nd, Pkstn, Jpn, S, Rss]";
            String []actualValue={"India", "Pakistan","Japan","USA","Russia"};
        assertEquals("Places without vowels",expectedValue, RemoveVowels.toRemove(actualValue));
    }
    @Test
    public void toNotRemove() {
        String expectedValue="[India, Pakistan,Japan,USA,Russia]";
        String []actualValue={"India", "Pakistan","Japan","USA","Russia"};
        assertNotEquals(expectedValue, RemoveVowels.toRemove(actualValue));
    }
}