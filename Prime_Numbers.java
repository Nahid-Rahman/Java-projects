//Write a program to print prime numbers from 2 to n

package If_Else_Loop;
import java.util.Scanner;

public class Prime_Numbers
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int y = sc.nextInt();
        int factor = 0;
        int prime = 0;
        int counter= 1;
        for (int i=2; i<=y; i++){
            factor=0;
            for ( counter=1; counter<i; counter++ )
            {
                if (i%counter==0)
                {
                    factor = factor+1;
                }
            }
            if (factor==1)
            {
                prime = prime + 1;
                System.out.println(i);
            }
        }
        System.out.println("These Numbers are Prime Numbers between 2 and " + y);
    }
}
