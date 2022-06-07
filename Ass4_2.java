/*Can you Swap 
Problem Code: CANSWAP
I'm too tired to write a story, so I'll get to the problem straight away.

Given a string of length N, find if we can make the string sorted by performing at most one swap. A swap involves taking any two characters present in the string and interchanging their positions in the string.

A string is sorted if all letter 'a' appear before all letter 'b', all letter 'b' appear before all letter 'c' and so on.

Input:
First line will contain T, the number of testcases. Then the testcases follow.
Each testcase consists of two lines, the first line containing a single integer N denoting the length of the string, and the second line containing the string.
Output:
For each test case, print "YES" (without quotes) if you can make the string sorted using at most one swap, otherwise print "NO" (without quotes).

Constraints
1≤T≤10
2≤N≤100
The string consists of lowercase english letters only.
Subtasks
28% points : 2≤N≤3
72% points : Original Constraints
Sample Input:
2
4
acbd
4
adbc
Sample Output:
YES
NO
EXPLANATION:
For the first test, we can swap 'c' and 'b' to obtain "abcd" which is a sorted string.
For the second test, we cannot obtain a sorted string using at most one swap.
 */

/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ass4_2
{
    public static void main (String[] args) throws IOException
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T>0)
        {
            int N = scan.nextInt();
            char a[] = new char[N];
            char b[] = new char[N];
            int cnt=0;
            for(int i=0;i<N;i++)
            {
                a[i] = (char)br.read();
                b[i] = a[i];
            }
            
            Arrays.sort(a);
            for(int i=0;i<N;i++)
            {
                if(b[i]!=a[i])
                cnt++;
            }
            if(cnt>2)
            System.out.println("No");
            else
            System.out.println("Yes");
            
            T--;
        }
    }
}






