/* Chef and his little brother are playing with sticks. They have total N sticks. Length of i-th stick is Ai. Chef asks his brother to choose any four sticks and to make a rectangle with those sticks its sides. Chef warns his brother to not to break any of the sticks, he has to use sticks as a whole. Also, he wants that the rectangle formed should have the maximum possible area among all the rectangles that Chef's brother can make.
Chef's little brother takes this challenge up and overcomes it. Can you also do so? That is, you have to tell whether it is even possible to create a rectangle? If yes, then you have to tell the maximum possible area of rectangle.

Input
The first line contains a single integer T denoting the number of test-cases. T test cases follow.
The first line of each test case contains a single integer N denoting the number of sticks.
The second line of each test case contains N space-separated integers A1, A2, ..., AN denoting the lengths of sticks.

Output
For each test case, output a single line containing an integer representing the maximum possible area for rectangle or -1 if it's impossible to form any rectangle using the available sticks.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 103
1 ≤ sum of N's over all test-cases in a single test file ≤ 103
1 ≤ Ai ≤ 103

Example
Input:
2
5
1 2 3 1 2
4
1 2 2 3

Output:
2
-1

Explanation
Example case 1. Chef's brother can choose sticks of lengths 1, 2, 1, 2. He can create a rectangle with area 1 * 2 = 2.

Example case 2. It's impossible to choose 4 sticks so that they form a rectangle.
package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pract4_3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T>0)
        {
            int N = scan.nextInt();
            int a[] = new int[N];
            for(int i=0;i<N;i++)
            {
                a[i] = scan.nextInt();
            }

            for(int i=0;i<N;i++)
            {
                int temp=0;
                for(int j=0;j<N-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp= a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            int cnt=0,area=1;
            for(int i=N-1;i>0;i--)
            {
                if(a[i]==a[i-1])
                {
                    cnt++;
                    area *= a[i];
                    i--;
                }
                if(cnt==2)
                    break;
            }

            if(cnt==2)
            {
                System.out.println(area);
            }
            else
            {
                System.out.println("-1");
            }
            T--;
        }
    }
}