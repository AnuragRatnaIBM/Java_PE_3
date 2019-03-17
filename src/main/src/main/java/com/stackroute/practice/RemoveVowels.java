/*
4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk
 */

package com.stackroute.practice;

import java.util.Arrays;

public class RemoveVowels {
    public static String toRemove(String places[])
    {
        String temp="";
        String temp2="";
        String str[] = new String[places.length];
        for(int j=0;j<places.length;j++ )
        {
            temp=temp+places[j];
            for(int i=0;i<temp.length();i++)
            {
                if(temp.charAt(i)=='a'|| temp.charAt(i)=='e'|| temp.charAt(i)=='i'||
                        temp.charAt(i)=='o'|| temp.charAt(i)=='u'|| temp.charAt(i)=='A'||
                        temp.charAt(i)=='E'|| temp.charAt(i)=='I'|| temp.charAt(i)=='O'||
                        temp.charAt(i)=='U')
                {
                    temp2+="";
                }
                else
                {
                    temp2=temp2+temp.charAt(i);
                }
            }
            str[j]=temp2;
            temp2="";
            temp="";
        }
        return Arrays.toString(str);
    }
}
