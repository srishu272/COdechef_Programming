/* Students and Fighting
Problem Code: STUFIGHT

Chef is a class teacher. He has n students in his class.

Chef recently conducted an exam. The scores of all the n students is given to you. His students are very competitive and will start fighting if there is more than one student who topped the exam. It is your job to figure out whether his students will start fighting or not, so that Chef can go prepared to the class.

Input
The first line of each test case contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains an integer n, denoting the number of students.
The next line contains n space-separated integers, i-th of which will be scorei denoting the score of the i-th student.
Output
For each test case, output in a new line, "fight:(" if there is more than one topper, otherwise output "peace:)" (without quotes).

Constraints
1≤T≤10
1≤n≤105
1≤scorei≤109
Subtasks
For 30% of the score: 1≤n≤100
Remaining 70%: No extra constraints.
Sample Input
3
3
1 2 3
3
2 1 2
4
3 2 4 2
Sample Output
peace:)
fight:(
peace:)
Explanation
In the first case, there is only one topper, the third student.
In the second case, there are two toppers, the first and third student.
In the third case, only one guy got a score of 4 (the highest score), and so there is only one topper: the third student.
 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Assign4_1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while(T>0)
        {
            int n = scan.nextInt();
            long scores[] = new long[n];
            long big = 0,temp =0;
            int cnt =0;
            for(int i=0;i<n;i++)
            {
                scores[i] = scan.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(scores[j]<scores[j+1])
                    {
                        temp = scores[j];
                        scores[j] = scores[j+1];
                        scores[j+1] = temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(scores[i]);                
            }
            big = scores[0];
            System.out.println(big);
            for(int i=1;i<n;i++)
            {
               if(big == scores[i])
                 {
                   cnt++;
                 }
            }

            System.out.println("COunt:"+cnt);
            if(cnt>0)
                 System.out.println("fight:(");
            else
                System.out.println("peace:)");
            T--;
        }
    }
}
