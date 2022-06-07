import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] sticks = new int[count];
        int in = 0;
        while(in < count) {
            sticks[in] = input.nextInt();
            in++;
        }
        while(true) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < count; i++) {
                if (sticks[i] < min && sticks[i] != 0) {
                    min = sticks[i];
                }
            }
            // System.out.println("Min is " + min);
            int slices = 0;
            for (int i = 0; i < count; i++)  {
                if (sticks[i] > 0) {
                    int temp = sticks[i];
                    sticks[i] = temp - min;
                    // System.out.println("loc " + i + ": " + temp + " to " + sticks[i]);
                    slices++;
                }

            }
            if (slices > 0) 
                System.out.printf("%d%n", slices);
            else
                break;
        }

    }
}
