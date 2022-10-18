/*Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers
using these functions: average(), countEvenNumbers(), countOddNumbers()
 */

package Function_and_Array;
import java.util.Arrays;
import java.util.Scanner;

public class even_odd_avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []a= new int[5];
        for(int i = 1; i<=a.length; i++)
        {
            System.out.println("Enter your number "+ i +":");
            a[i-1] = sc.nextInt();
        }

        even_odd_avg even_odd_avg1 = new even_odd_avg();
        even_odd_avg1.countEvenNumbers(a);
        even_odd_avg1.countOddNumbers(a);
        even_odd_avg1.average(a);

    }

    public void countEvenNumbers(int[]a)
    {
        int evenCounter = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2 == 0)
            {
                evenCounter++;
            }
        }
        System.out.println("Total Number of Even numbers are: "+ evenCounter);
    }

    public void countOddNumbers(int[]a)
    {
        int oddCounter = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2 != 0)
            {
                oddCounter++;
            }
        }
        System.out.println("Total Number of Even numbers are: "+ oddCounter);
    }

    public void average(int[]a)
    {
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum+= a[i];
        }
        double avg = sum/a.length;
        System.out.println("Average is: "+ avg);
    }

}
