/*
8. Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.
 */

package com.stackroute.practice;

public class GenerateException {
    public String exceptions(int row,int col,int arrayInput2[],String inputString)  {
        try
        {
            int inputArray[][]=new int[row][col];
            int input=arrayInput2[4];
            if(inputString.equals("abc"))
            {

            }
        }
        catch (NegativeArraySizeException e)
        {
            return "NegativeArraySizeException";
        }
        catch (IndexOutOfBoundsException e)
        {
            return "IndexOutOfBoundsException";
        }
        catch (NullPointerException e)
        {
            return "NullPointerException";
        }
        return "error";
    }
}
