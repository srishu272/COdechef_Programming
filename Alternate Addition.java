import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ALTERADD
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
            int i=1;
            while(A<=B)
            {
                if(i%2==0)
                {
                    A += 2;
                }
                else
                {
                    A += 1;    
                }
                i++;
            }
            if(A==B)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
	}
}
