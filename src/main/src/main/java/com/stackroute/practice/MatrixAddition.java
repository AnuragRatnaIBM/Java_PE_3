/*
2. Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4
Sum of the matrices:-
10 10
10 10
10 10
 */

package com.stackroute.practice;

public class MatrixAddition
{
    public int[][] addition(int row,int col,int matrix1[][],int matrix2[][])
    {
        if(row==0||col==0)
        {
            return null;
        }
        int sum[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return sum;
    }
}
