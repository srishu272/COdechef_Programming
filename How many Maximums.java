/*
How Many Maximums
Problem Code:HOWMANYMAX
Contest Code:START42

From an array A containing N integers, you construct a binary string S of length (N−1) as follows. For all 1≤i<N:

If Ai<Ai+1, then Si=0.
If Ai>Ai+1, then Si=1.
Given the string S, determine the count of indices i (1≤i≤N) such that it is possible for Ai to be the maximum element of the array A.


Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N — the size of the array A.
The second line of each test case contains the binary string S of length (N−1) containing 0s and 1s only.

Output Format
For each test case, output the count of indices i (1≤i≤N) such that it is possible for Ai to be the maximum element of the array A.

Constraints
1≤T≤105
1≤T≤105
2≤N≤105
2≤N≤105
Sum of N over all test cases does not exceed 105105.

Sample Input 1 
3
2
0
7
000111
6
11100

Sample Output 1 
1
1
2
Explanation
Test case 11: Here A1<A2. Therefore clearly only A2 can be the maximum element of A.

Test case 22: Here A1<A2, A2<A3, A3<A4, A4>A5, A5>A6 and A6>A7. Therefore, clearly only A4 can be the maximum element of A.

Test case 33: Here A1>A2, A2>A3, A3>A4, A4<A5 and A5<A6. Therefore A1 and A6 both can be the maximum elements of A.
 */

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
		    int N = scan.nextInt();
		    String S = scan.next();
		    int cnt = 0;
		    for(int i =0;i<N-1;i++)
		    {
		        if(S.charAt(i) == '1')
		        {
		            if((i==0)||(S.charAt(i-1) == '0'))
		            {
		                cnt++;
		            }
		        }
		    }
		    if(S.charAt(S.length()-1) == '0')
		    {
		        cnt++;
		    }
		    System.out.println(cnt);
		}
	}
}