//Write a program to sum of user input until users input ‘q’ from keyboard

package If_Else_Loop;

import java.util.Scanner;

public class Sum_Till_Key
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        char c;

        do
        {
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            sum+= num;

            System.out.print("If you do not want to continue press q, Else press anything else: ");
            c = sc.next().charAt(0);

        }
        while(c!='q');

        System.out.println("Sum of entered numbers is : " + sum);
    }
}
