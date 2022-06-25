/*
Complementary Strand in a DNA 
Problem Code: DNASTRAND

You are given the sequence of Nucleotides of one strand of DNA through a string SS of length NN. SS contains the character A,T,C,A,T,C, and GG only.

Chef knows that:

AA is complementary to TT.
TT is complementary to AA.
CC is complementary to GG.
GG is complementary to CC.
Using the string SS, determine the sequence of the complementary strand of the DNA.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
First line of each test case contains an integer NN - denoting the length of string SS.
Second line contains NN characters denoting the string SS.
Output Format
For each test case, output the string containing NN characters - sequence of nucleotides of the complementary strand.

Constraints
1≤T≤1001≤T≤100
1≤N≤1001≤N≤100
SS contains A, T, C, and G only
Sample Input 1 
4
4
ATCG
4
GTCC
5
AAAAA
3
TAC
Sample Output 1 
TAGC
CAGG
TTTTT
ATG
Explanation
Test case 11: Based on the rules, the complements of A, T, C, and G are T, A, G, and C respectively. Thus, the complementary string of the given string ATCG is TAGC.

Test case 22: Based on the rules, the complements of G, T, and C are C, A, and G respectively. Thus, the complementary string of the given string GTCC is CAGG.

Test case 33: Based on the rules, the complement of A is T. Thus, the complementary string of the given string AAAAA is TTTTT.

Test case 44: Based on the rules, the complements of T, A, and C are A, T, and G respectively. Thus, the complementary string of the given string TAC is ATG.
 */

import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DNASTRAND

{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while(T-- >0)
        {
            int N = scan.nextInt();
            String str1 = scan.next();
            String str2 = "";
            for(int i=0;i<N;i++)
            {
                char ch1 = str1.charAt(i);
                char ch2 = ' ';
                if(ch1 == 'A')
                ch2 = 'T';

                if(ch1 == 'T')
                ch2 = 'A';

                if(ch1 == 'C')
                ch2 = 'G';

                if(ch1 == 'G')
                ch2 = 'C';

                str2 = str2 + ch2;
            }
            System.out.println(str2);
        }
        scan.close();
    }
}