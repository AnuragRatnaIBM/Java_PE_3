/*
6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers
 */
package com.stackroute.practice;

public class ConsecutiveNumber {
    public boolean checkConsecutive(String inputString)
    {
        String [] inputArray=inputString.split(",");
        int  firstNum=Integer.parseInt(inputArray[0]);
        int secondNum=Integer.parseInt(inputArray[1]);
        int num;
        if(firstNum>secondNum)
        {
            for(int i=2;i<inputArray.length;i++)
            {
                num=Integer.parseInt(inputArray[i]);
                if(--secondNum!=num)
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            for(int i=2;i<inputArray.length;i++)
            {
                num=Integer.parseInt(inputArray[i]);
                if(++secondNum!=num)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
