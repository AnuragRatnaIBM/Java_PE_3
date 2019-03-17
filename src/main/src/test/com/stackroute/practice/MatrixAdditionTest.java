package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;

    @Before
    public void setUp() throws Exception {
        matrixAddition=new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixAddition=null;
    }

    @Test
    public void addition() {
        int sum[][]={{10,15},{30,40}};
        int matrix1[][]={{5,10},{15,40}};
        int matrix2[][]={{5,5},{15,0}};
        assertArrayEquals(sum,matrixAddition.addition(2,2,matrix1,matrix2));
    }
    @Test
    public void additionFail() {
        int matrix1[][]={{5,10},{15,40}};
        int matrix2[][]={{5,5},{15,0}};
        assertNull("input hasn't been provided",matrixAddition.addition(0,0,matrix1,matrix2));
    }
    @Test
    public void additionFail2() {
        assertNull("input hasn't been provided",matrixAddition.addition(0,0,null,null));
    }
}