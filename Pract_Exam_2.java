/*
Cut the Stick 
Problem Code: SSWK01C
You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations. Note: For each cut operation, you have to recalculate the length of smallest sticks (excluding zero-length sticks).

Input
The first line contains a single integer N.

The next line contains N integers separated by space, where each integer represents the length of the ith stick.

Output
For each operation, print the number of sticks that are cut, on separate lines.

Constraints
1 <= N <= 50000
1 <= stick length <= 1000000
Example
Input:
6
5 4 4 2 2 8

Output:
6
4
2
1
Explanation
sticks-length        length-of-cut   sticks-cut

5 4 4 2 2 8             2               6

3 2 2 _ _ 6             2               4

1 _ _ _ _ 4             1               2

_ _ _ _ _ 3             3               1

_ _ _ _ _ _           DONE            DONE
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pract_Exam_2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long Arr[] = new long[N];
        for(int i=0;i<N;i++)
        {
            Arr[i] = scan.nextLong();
        }

        while(true)
        {
            long small = Integer.MAX_VALUE;
            for(int i=0;i<N;i++)
            {
                if((Arr[i] < small) && (Arr[i] != 0))
                {
                    small = Arr[i];
                }
            }

            int cnt =0;
            for(int i=0;i<N;i++)
            {
                if(Arr[i]>0)
                {
                    long temp = Arr[i];
                    Arr[i] = temp - small;
                    cnt++;
                }
            }
            
            if(cnt>0)
            System.out.println(cnt);
            else
            break;
        }
    }
}


