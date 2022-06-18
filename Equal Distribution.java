/*
Equal Distribution
Problem Code: EQUALDIST
Contest Code: START42 

Problem
Alice and Bob are very good friends and they always distribute all the eatables equally among themselves.

Alice has A chocolates and Bob has B chocolates. Determine whether Alice and Bob can distribute all the chocolates equally among themselves.

Note that:
It is not allowed to break a chocolate into more than one piece.
No chocolate shall be left in the distribution.

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two space-separated integers AA and BB, the number of chocolates that Alice and Bob have, respectively.

Output Format
For each test case, output on a new line YES if Alice and Bob can distribute all the chocolates equally, else output NO. The output is case insensitive, i.e, yes, YeS, yES will all be accepted as correct answers when Alice and Bob can distribute the chocolates equally.

Constraints
1≤T≤1000
1≤A,B≤10^5
 
Sample 1:
Input
4
1 1
1 3
1 2
1 4

Output
YES
YES
NO
NO
Explanation:
Test case 1: Both Alice and Bob already have equal number of chocolates, hence it is possible to distribute the chocolates equally among Alice and Bob.

Test case 2: If Bob gives one of his chocolates to Alice, then both of them will have equal number of chocolates, i.e. 22. So, it is possible to distribute the chocolates equally among Alice and Bob.

Test case 3: There are total 3 chocolates. These chocolates cannot be divided equally among Alice and Bob.

Test case 4: Alice and Bob cannot have equal number of chocolates, no matter how they distribute the chocolates.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EQUALDIST
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
            int num = A+B;
            
            if(num%2==0)
            System.out.println("Yes");

            else
            System.out.println("No");
        }
	}
}