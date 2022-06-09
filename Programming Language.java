/*
Programming Languages 
Problem Code: PROGLANG
Chef is a software developer, so he has to switch between different languages sometimes. Each programming language has some features, which are represented by integers here.

Currently, Chef has to use a language with two given features A and B. He has two options --- switching to a language with two features A1 and B1, or to a language with two features A2 and B2. All four features of these two languages are pairwise distinct.

Tell Chef whether he can use the first language, the second language or neither of these languages (if no single language has all the required features).

Input Format
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains six space-separated integers A, B, A1, B1, A2, B2.

Output Format
For each test case, print a single line containing the integer 1 if Chef should switch to the first language, or 2 if Chef should switch to the second language, or 0 if Chef cannot switch to either language.

Constraints
1 <= T <= 2881≤T≤288
1 <= A, B, A1, B1, A2, B2 <= 4
A, B are distinct
A1, B1, A2, B2 are pairwise distinct

Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
1 2 2 1 3 4
3 4 2 1 4 3
1 2 1 3 2 4
1
2
0
Explanation:
Example case 1: The first language has the required features --- features 11 and 22.

Example case 2: The second language has the required features --- features 33 and 44.

Example case 3: Neither language has both features 11 and 22.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T-- >0)
		{
		    int A = scan.nextInt();
		    int B = scan.nextInt();
		    int A1 = scan.nextInt();
		    int B1 = scan.nextInt();
		    int A2 = scan.nextInt();
		    int B2 = scan.nextInt();
		    
		    if(A>B)
		    {
                int temp =0;
		        temp = A;
                A = B;
                B = temp;
		    }
		    if(A1>B1)
		    {
		        int temp =0;
		        temp = A1;
                A1 = B1;
                B1 = temp;
		    }
		    if(A2>B2)
		    {
		        int temp =0;
		        temp = A2;
                A2 = B2;
                B2 = temp;
		    }
		    
		    
		    if((A == A1)&&(B == B1))
		    {
		        System.out.println("1");
		    }
		    
		    else if((A == A2)&&(B == B2))
		    {
		        System.out.println("2");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
