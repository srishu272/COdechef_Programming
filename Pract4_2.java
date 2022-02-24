/* Maximum Weight Difference 
Problem Code: MAXDIFF
Chef has gone shopping with his 5-year old son. They have bought N items so far. The items are numbered from 1 to N, and the item i weighs Wi grams.
Chef's son insists on helping his father in carrying the items. He wants his dad to give him a few items. Chef does not want to burden his son. But he won't stop bothering him unless he is given a few items to carry. So Chef decides to give him some items. Obviously, Chef wants to give the kid less weight to carry.
However, his son is a smart kid. To avoid being given the bare minimum weight to carry, he suggests that the items are split into two groups, and one group contains exactly K items. Then Chef will carry the heavier group, and his son will carry the other group.
Help the Chef in deciding which items should the son take. Your task will be simple. Tell the Chef the maximum possible difference between the weight carried by him and the weight carried by the kid.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. The first line of each test contains two space-separated integers N and K. The next line contains N space-separated integers W1, W2, ..., WN.

Output:
For each test case, output the maximum possible difference between the weights carried by both in grams.

Constraints:
1 ≤ T ≤ 100
1 ≤ K < N ≤ 100
1 ≤ Wi ≤ 100000 (105)

Example:
Input:
2
5 2
8 4 5 2 10
8 3
1 1 1 1 1 1 1 1

Output:
17
2
Explanation:
Case #1: The optimal way is that Chef gives his son K=2 items with weights 2 and 4. Chef carries the rest of the items himself. Thus the difference is: (8+5+10) − (4+2) = 23 − 6 = 17.

Case #2: Chef gives his son 3 items and he carries 5 items himself.
 */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pract4_2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T>0)
        {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int W[] = new int[N];

            for(int i=0;i<N;i++)
            {
                W[i] = scan.nextInt();
            }

            for(int i=0;i<N;i++)
            {
                int temp=0;
                for(int j=0;j<N-i-1;j++)
                {
                    if(W[j]>W[j+1])
                    {
                        temp= W[j];
                        W[j] = W[j+1];
                        W[j+1] = temp;
                    }
                }
            }

            int sum_son=0,sum_chef=0;
            if(K<=(N/2))
            {
                for(int i=0;i<K;i++)
                {
                    sum_son += W[i];
                }
                for(int i=K;i<N;i++)
                {
                    sum_chef += W[i];
                }
            }
            else
            {
                for(int i=N-K;i<N;i++)
                {
                    sum_chef += W[i];
                }
                for(int i=0;i<N-K;i++)
                {
                    sum_son += W[i];
                }
            }

            System.out.println(sum_chef - sum_son);
            T--;
        }
    }
}
