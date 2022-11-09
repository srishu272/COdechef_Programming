/*Prime Subsequences of a String
Problem Code:
SUBPRIME
Chef loves prime numbers a lot. Today, he found a string ss consisting of characters from '1' to '9'. He likes to play with subsequences of this string. A subsequence of ss is obtained by dropping some (potentially not dropping any also) of the characters. He likes a subsequence if the number corresponding to it is a prime number.

Consider an example: Let s =s= ''123''. The subsequences of ss will be "1", "2", "3", "12", "13", "23" and "123". Out of these subsequences, the prime ones are "2", "3", "13", "23". Hence, the number of subsequences Chef likes is 4.

Given the string ss, tell the number of subsequences that Chef likes.

Input
The only line of the input contains a string ss.
Output
Output a single line containing an integer corresponding to the answer of the problem.

Constraints
1 \le \text{number of digits in } s \leq 91≤number of digits in s≤9
The string ss contains the characters from '1' to '9'.
Subtasks
For 30% of the score: 1 \le \text{number of digits in } s \le 41≤number of digits in s≤4
Remaining 70%: No extra constraints.
Sample Input 1
123
Sample Output 1
4
Explanation 1
This case is already explained in the problem statement.

Sample Input 2
292
Sample Output 2
3
Explanation 2
The various subsequences are "2", "9", "2", "29", "22", "92", "292". Among these the prime numbers are "2", "2", and "29". Thus the answer is 3. Note that because "2" is two different subsequences, it is counted twice. */


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime_subsequence
{
    static List<String> str_array = new ArrayList<>();
    
    static void printSubSeqRec(String str, int n, int index,
                               String curr)
    {
        // base case
        if (index == n) {
            return;
        }
        if (curr != null && !curr.trim().isEmpty()) {
            str_array.add(curr);
        }
        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            printSubSeqRec(str, n, i, curr);
 
            // backtracking
            curr = curr.substring(0, curr.length() - 1);
        }
    }
 
    static void printSubSeq(String str)
    {
        int index = -1;
        String curr = "";
 
        printSubSeqRec(str, str.length(), index, curr);
    }

    static int is_prime(int num)
    {
        if(num == 0||num ==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        }
        return 1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine())
        {
            String s = scan.next();
            int cnt=0;
            printSubSeq(s);
            List<Integer> int_array = new ArrayList<Integer>(str_array.size()) ;
            for (String myInt : str_array) 
            { 
              int_array.add(Integer.valueOf(myInt)); 
            }
        System.out.println(int_array);    
        for(int i=0;i<int_array.size();i++)
        {
            int element = int_array.get(i);
            if(is_prime(element) == 1)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
        }
            
        
        
        
		
	}
}
