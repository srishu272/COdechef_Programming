/*
Contest Code:JUNE222D 
Problem Code:FIT
Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is XX km away from his home.

If his office is open on 55 days in a week, find the number of kilometers Chef travels through office trips in a week.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line consisting of single integer XX.
Output Format
For each test case, output the number of kilometers Chef travels through office trips in a week.

Constraints
1≤T≤101≤T≤10
1≤X≤101≤X≤10
Sample Input 1 
4
1
3
7
10
Sample Output 1 
10
30
70
100
Explanation
Test case 11: The office is 11 km away. Thus, to go to the office and come back home, Chef has to walk 22 kms in a day. In a week with 55 working days, Chef has to travel 2⋅5=102⋅5=10 kms in total.

Test case 22: The office is 33 kms away. Thus, to go to the office and come back home, Chef has to walk 66 kms in a day. In a week with 55 working days, Chef has to travel 6⋅5=306⋅5=30 kms in total.

Test case 33: The office is 77 kms away. Thus, to go to the office and come back home, Chef has to walk 1414 kms in a day. In a week with 55 working days, Chef has to travel 14⋅5=7014⋅5=70 kms in total.

Test case 44: The office is 1010 kms away. Thus, to go to the office and come back home, Chef has to walk 2020 kms in a day. In a week with 55 working days, Chef has to travel 20⋅5=10020⋅5=100 kms in total.*/

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fitness
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- >0)
        {
            int X = scan.nextInt();
            System.out.println(2*X*5);
        }
        scan.close();
	}
}