/*Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)
*/

package Function_and_Array;

import java.util.Scanner;

public class max_min_duplicate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        int lowerLimit = 0;
        int upperLimit = 100;
        for (int i = 1; i<=a.length; i++) {
            int j = (int) (Math.random() * (upperLimit - lowerLimit) + lowerLimit);
            int x = (int) Math.floor(j);
            a[i-1] = x;
        }

        max_min_duplicate max_min_duplicate1 = new max_min_duplicate();

        System.out.println("Max Value :" + max_min_duplicate1.findMax(a));
        System.out.println("Min Value :" + max_min_duplicate1.findMin(a));

    }

    public void findDuplicate(int[]a)
    {
        for(int i=0; i<a.length; i++)
        {
            for( int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("Found duplicate for "+ a[i]);
                }
            }
        }
    }

    public int findMax(int[]a)
    {
        int max = a[0];
        for(int i =0; i<a.length; i++)
        {
            if(a[i] >= max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public int findMin(int[]a)
    {
        int min = a[0];
        for(int i =0; i<a.length; i++)
        {
            if(a[i] <= min)
            {
                min = a[i];
            }

        }
        return min;
    }

}






