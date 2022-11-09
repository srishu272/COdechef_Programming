/*
Students, heights and their IQs
Problem Code:
HEIGHTIQ
In the school morning assembly, nn students are standing in a line. You, being the principal of the school know the heights and IQ levels of the students. This information is provided to you by an array hh and iqiq, where h_i, iq_ih 
i
​
 ,iq 
i
​
  denotes the height and the IQ of the ii-th student, respectively.

You want to find the longest subsequence of the students such that their heights are in strictly increasing order, whereas their IQ levels are in strictly decreasing order. Note that a subsequence is gotten by removing some (possibly zero) students from the line from any position.

Find out the length of the longest such subsequence.

Input Format
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains an integer nn.
The second line contains nn space-separated integers h_1, h_2, \dots, h_nh 
1
​
 ,h 
2
​
 ,…,h 
n
​
 .
The third line contains nn space-separated integers iq_1, iq_2, \dots, iq_niq 
1
​
 ,iq 
2
​
 ,…,iq 
n
​
 .
Output Format
For each test case, print a single line containing one integer — the answer to the problem.

Constraints
1 \le T \le 51≤T≤5
1 \le n \le 10^31≤n≤10 
3
 
1 \le h_i, iq_i \le 10^91≤h 
i
​
 ,iq 
i
​
 ≤10 
9
 
Sample 1:
Input
Output
2
3
1 2 3
3 2 1
4
1 3 2 4
5 6 4 4
3
2
Explanation:
Example case 11: You can choose the subsequence \{1, 2, 3\}{1,2,3} of the students. You can see the heights of the students are increasing from left to right, whereas the IQ levels are decreasing.

Example case 22: You can choose the subsequence \{2, 4\}{2,4} of students. You can see the height of 44-th student is 44, which is greater than the height of 22-nd student which is 33. The IQ level of 44-th student which is 44 is less than the 22-nd student which is 66. Hence, the answer is 22. */


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class height_IQ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine())
		{
		    int T = scan.nextInt();
		    
		    while(T-- > 0)
		    {
		        int n = scan.nextInt();
		        int ans=0;
		        int[] h = new int[n];
		        int[] iq = new int[n];
		        int[] dp = new int[n];
		        for(int i=0;i<n;i++)
		        {
		            h[i] = scan.nextInt();
		        }
		        for(int i=0;i<n;i++)
		        {
		            iq[i] = scan.nextInt();
		        }
		        
		        
		        for(int i=1;i<n;i++)
		        {
		            for(int j=i-1;j>=0;j--)
		            {
		                if(h[i]>h[j] && iq[i] <iq[j])
		                {
		                    dp[i] = (int)(Math.max(dp[i],dp[j]+1));
		                }
		            }
		            ans = (int)(Math.max(ans,dp[i]));
		        }
		        System.out.println(ans+1);
		    }
		}
	}
}
