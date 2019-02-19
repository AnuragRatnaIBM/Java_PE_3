package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() throws Exception {
        chessBoard =new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard=null;
    }

    @Test
    public void chesscheck(){
        String expectedValue="WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|\n" +
                "BB|WW|BB|WW|BB|WW|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|";
        String str[][]=new String[8][8];
        String actualValue=chessBoard.chess(str);
        assertEquals(expectedValue,actualValue);
    }
}