/*
5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WWrepresents white color and BB represents Black color.
Output:
My Chess Board
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
 */
package com.stackroute.practice;

public class ChessBoard {
    public  String chess(String fieldArray[][])
    {
        String temp="";
        for (int i = 1; i < fieldArray.length; i++)
        {
            for (int j = 1; j < fieldArray[i].length; j++)
            {
                if ( (i+j )% 2 == 0 )
                {
                    temp+="WW|";
                } else
                {
                    temp+="BB|";
                }
            }
            if(i!=fieldArray.length-1)
            {
                temp+="\n";
            }

        }
        return temp;
    }
}
